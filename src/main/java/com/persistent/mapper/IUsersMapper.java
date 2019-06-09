package com.persistent.mapper;

import com.persistent.pojo.IUsers;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @BelongsProject: BookManagement
 * @BelongsPackage: com.persistent.mapper
 * @Author: runll
 * @CreateTime: 2019-06-05 18:48
 * @Description: ${Description}
 */
@Repository
public interface IUsersMapper {
    List<IUsers> selectAll();

    boolean selectOne(IUsers users);

    boolean insertNewUser(IUsers users);

    List<IUsers> findUserByStudentId(IUsers users);

    List<IUsers> findUserByStudentIdAndUsername(IUsers users);

    boolean resetPassword(IUsers user);
}
