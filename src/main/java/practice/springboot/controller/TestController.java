package practice.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

    /**
     * http://127.0.0.1:8080/test/welcome
     *
     * @return
     */
    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @ResponseBody
    @RequestMapping("/login")
    public String login(String name, String password) {
        if (name != null && name.equals("sa") && password != null && password.equals("123456")) {
            return "Login Success";
        }
        return "Login Failure";
    }

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
}
