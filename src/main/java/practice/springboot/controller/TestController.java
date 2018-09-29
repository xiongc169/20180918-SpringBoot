package practice.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import practice.springboot.domain.dto.User;
import practice.springboot.domain.test.Department;
import practice.springboot.domain.yoong.Account;
import practice.springboot.service.test.DepartmentService;
import practice.springboot.service.yoong.AccountService;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private DepartmentService deptService;

    @Autowired
    private AccountService accountService;

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
     * 多数据源测试：http://127.0.0.1:8080/test/addDept
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/addDept")
    public void addDept() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmssSSSS");
        Department department = new Department();
        department.setDeptName("部门11");
        department.setNote("Note 11");
        Long id = deptService.addDepartment(department);
        System.out.println(id);

        Account account = new Account();
        account.setAccountId(dateFormat.format(new Date()));
        account.setContactName("子账号11");
        account.setCreateTime(new Date());
        account.setModifyTime(new Date());
        account.setIsDelete(0);
        accountService.addAccount(account);
        System.out.println(id);
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
            userRedisTemplate.opsForValue().set(superMan.getUsername(), superMan);
            userRedisTemplate.opsForValue().set(batMan.getUsername(), batMan);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "Success";
    }
}
