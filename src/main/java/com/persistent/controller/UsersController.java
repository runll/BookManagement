package com.persistent.controller;

import com.persistent.pojo.IUsers;
import com.persistent.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
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



    /**
     * 选择账号
     *
     * @param users
     * @return
     */
    @RequestMapping("/selectList")
    public String selectAll(HttpServletRequest request,IUsers users) {
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
     * @param 
     * @return
     */

    @RequestMapping(value = "/forgetPsw",method = RequestMethod.POST)
    public String forgetPassword(IUsers user,HttpServletRequest request) {

        List<IUsers> users = usersService.
                findUserByStudentIdAndUsername(user);
        if (users.isEmpty()) {
            return "forgetPsw";

        }else{
            HttpSession session = request.getSession(true);
            session.setAttribute("checked",users.get(0));
        }
        return "findpassword";
    }

    /**
     * 修改密码
     * user：{student_id = 0,username = null,password = 试图修改的密码}
     * session:携带了/forgetPsw里存储的验证后的IUsers实例，带有student_id,username,password
     * 可以结合联系此两个，new一个新的IUsers实例
     * @param user
     * @param
     * @return                                               e
     */

    @RequestMapping(value = "/findpassword",method = RequestMethod.POST)
    public String findPassword(IUsers user ,ModelAndView mav,HttpServletRequest request) {

        HttpSession session = request.getSession();
        IUsers valid_user = (IUsers)session.getAttribute("checked");
        if(user == null || request.getSession().isNew()){
            return "forgetPsw";
        }
        IUsers reset_user = new IUsers();
        reset_user.setStudent_id(valid_user.getStudent_id());
        reset_user.setUsername(valid_user.getUsername());
        reset_user.setPassword(user.getPassword());

        System.out.println("mav:"   +mav.getViewName());
        boolean reset = usersService.resetPassword(reset_user);
        if (reset) {
            session.invalidate();
            return "success";
        }
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

    @RequestMapping("/find_error")
    public String findError() {
        return "find_error";
    }
    


}
