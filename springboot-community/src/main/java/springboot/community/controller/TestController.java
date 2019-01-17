package springboot.community.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot.community.domain.business.AttachmentInfo;
import springboot.community.domain.rehearsal.Department;
import springboot.community.domain.rehearsal.User;
import springboot.community.domain.wong.Account;
import springboot.community.service.business.AttachmentService;
import springboot.community.service.rehearsal.DepartmentService;
import springboot.community.service.wong.AccountService;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/test")
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private AccountService accountService;

    @Autowired
    private AttachmentService attachmentService;

    @Autowired
    private DepartmentService deptService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String, User> userRedisTemplate;

    /**
     * 页面测试：http://127.0.0.1:8080/test/welcome
     *
     * @return
     */
    @RequestMapping("/welcome")
    public String welcome() {
        logger.debug("2018年9月30日10:28:48");
        System.out.println("enter welcome");
        return "welcome";
    }

    /**
     * 传参测试：http://127.0.0.1:8080/test/login
     *
     * @param name
     * @param password
     * @return
     */
    @ResponseBody
    @RequestMapping("/login")
    public String login(String name, String password) {
        if (name != null && name.equals("sa") && password != null && password.equals("123456")) {
            return "Login Success";
        }
        return "Login Failure";
    }

    /**
     * 多数据源测试：http://127.0.0.1:8080/test/multDataSource
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/multDataSource")
    public void addDept() {
        try {
            //添加子账号
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmssSSSS");
            Account account = new Account();
            account.setAccountId(dateFormat.format(new Date()));
            account.setContactName("子账号11");
            account.setCreateTime(new Date());
            account.setModifyTime(new Date());
            account.setIsDelete(0);
            accountService.addAccount(account);
            System.out.println("AccountId: " + account.getId());
            //添加附件
            AttachmentInfo attachment = new AttachmentInfo();
            attachment.setFileName("git stash.png");
            attachment = attachmentService.addAttachment(attachment);
            System.out.println("AttachmentId: " + attachment.getId());
            //添加部门
            Department department = new Department();
            department.setDeptName("部门11");
            department.setNote("Note 11");
            department = deptService.addDepartment(department);
            System.out.println("DepartmentId: " + department.getId());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Redis测试：http://127.0.0.1:8080/test/add2Redis
     *
     * @param name
     * @param password
     * @return
     */
    @ResponseBody
    @RequestMapping("/add2Redis")
    public String redis(String name, String password) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmssSSSS");
        String currentDate = dateFormat.format(new Date());
        System.out.println(currentDate);
        try {
            stringRedisTemplate.opsForValue().set("name", currentDate);

            User superMan = new User("SuperMan", 100);
            User batMan = new User("BatMan", 50);
            userRedisTemplate.opsForValue().set(superMan.getName(), superMan);
            userRedisTemplate.opsForValue().set(batMan.getName(), batMan);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "Success";
    }

    //访问Actuator
    //http://127.0.0.1:8080/actuator/health

}