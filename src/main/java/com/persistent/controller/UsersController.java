package com.persistent.controller;

import com.persistent.pojo.IUsers;
import com.persistent.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: BookManagement
 * @BelongsPackage: com.persistent.controller
 * @Author: runll
 * @CreateTime: 2019-06-05 19:28
 * @Description: ${Description}
 */
@Controller
public class UsersController {

    @Autowired
    public IUsersService usersService;

    public HttpServletRequest request;
    public HttpServletResponse response;
    public HttpSession session;
    public  RedirectAttributes redirectAttributes;
    public ServletContext application;

    /**
     * 选择账号
     *
     * @param users
     * @return
     */
    @RequestMapping("/selectList")
    public String selectAll(IUsers users) {
        boolean dron = usersService.selectOne(users);
        if (dron) {
            request.setAttribute("ulist", usersService.selectAll());
            return "index";
        }
        request.setAttribute("error", "账号或密码错误");

        return "login";

    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * 注册账号
     *
     * @param user
     * @param result
     * @param map
     * @return
     */
    @RequestMapping("/register")
    public String register(@Valid IUsers user, BindingResult result, Map<String, Object> map) {
        //判断输入是否合法
        if (result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            String error = "输入不合法";
            for (ObjectError e : list) {
                error += e.getDefaultMessage() + "<br/>";
            }
            map.put("error", error);
            return "register";
        }
        List<IUsers> user_find_res = usersService.findUserByStudentId(user);
        for (IUsers u :
                user_find_res) {
            System.out.println(u.toString());
        }
        if (!user_find_res.isEmpty()) {
            map.put("error", "该学号已注册");
            return "register";
        }
        else {
            usersService.insertNewUser(user);
        }
        return "login";
    }

    /**
     * 验证账号
     *
     * @param user
     * @param map
     * @return
     */

    @RequestMapping(value = "/forgetPsw")
    public String forgetPassword(@Valid IUsers user, Map<String, Object> map) {
        System.out.println("@valid"+user.toString());
        List<IUsers> users = usersService.
                findUserByStudentIdAndUsername(user);
        for (IUsers u :
                users) {
            System.out.println("forgetPsw"+u.toString());
        }
        if (users.isEmpty()) {
            map.put("error", "未找到该学号或用户名");
            return "forgetPsw";
        }else{
            map.put("success","验证成功");
            //session.setAttribute("user",users.get(0));
        }
        
        return "findpassword";
    }

    /**
     * 修改密码
     *
     * @param user
     * @param map
     * @return
     */

    @RequestMapping("/findpassword")
    public String findPassword(@Valid IUsers user , Map<String, Object> map) {
        System.out.println("@valid1"+user.toString());
        boolean reset = usersService.resetPassword(user);
        if (reset) {
            map.put("success", "修改成功");
            return "success";
        }
        map.put("error", "未知错误");
        return "forgetPsw";
    }

    /**
     * 修改成功
     *
     * @return
     */
    @RequestMapping("/success")
    public String success() {
        return "success";
    }
}
