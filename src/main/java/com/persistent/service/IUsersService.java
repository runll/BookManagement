package com.persistent.service;

import java.util.List;

import com.persistent.pojo.IUsers;
import com.sun.org.apache.bcel.internal.generic.IUSHR;


/**
 * @BelongsProject: BookManagement
 * @BelongsPackage: com.persistent.service
 * @Author: runll
 * @CreateTime: 2019-06-05 18:53
 * @Description: ${Description}
 */
public interface IUsersService {
     List<IUsers> selectAll();
     boolean selectOne(IUsers users);
    boolean insertNewUser(IUsers users);

    List<IUsers> findUserByStudentId(IUsers users);

    List<IUsers> findUserByStudentIdAndUsername(IUsers users);

    boolean resetPassword(IUsers user);
}
