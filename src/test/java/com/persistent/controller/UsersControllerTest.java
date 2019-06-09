package com.persistent.controller;


import com.persistent.mapper.IUsersMapper;
import com.persistent.pojo.IUsers;
import com.persistent.service.IUsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

/**
 * @BelongsProject: BookManagement
 * @BelongsPackage: com.persistent.controller
 * @Author: runll
 * @CreateTime: 2019-06-09 16:23
 * @Description: ${Description}
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-mvc.xml","classpath:spring/spring-mybatis.xml"})
public class UsersControllerTest {
    @Autowired
    private IUsersService usersService;
    @Autowired
    private IUsers user;
    
    @Test
    @RequestMapping("/register")
    public void register() {
        List<IUsers> user_find_res = usersService.findUserByStudentId(user);
        for (IUsers u:
             user_find_res) {
                 System.out.println(u.toString());
        }

    }
}
