package com.persistent.service.impl;

import com.persistent.pojo.IUsers;
import com.persistent.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.persistent.mapper.IUsersMapper;
/**
 * @BelongsProject: BookManagement
 * @BelongsPackage: com.persistent.service.impl
 * @Author: runll
 * @CreateTime: 2019-06-05 18:59
 * @Description: ${Description}
 */
@Service
@Transactional
public class UsersServiceImpl implements IUsersService {

    @Autowired
    private IUsersMapper usersMapper;
    
    public List<IUsers> selectAll() {
        return usersMapper.selectAll();
    }

    public boolean selectOne(IUsers users) {
        return usersMapper.selectOne(users);
    }

    public boolean insertNewUser(IUsers users){return usersMapper.insertNewUser(users);}

    public List<IUsers> findUserByStudentId(IUsers users) {
        return usersMapper.findUserByStudentId(users);
    }

    public List<IUsers> findUserByStudentIdAndUsername(IUsers users) {
        return usersMapper.findUserByStudentIdAndUsername(users);
    }
    public boolean resetPassword(IUsers user){
        return usersMapper.resetPassword(user);
    };


}
