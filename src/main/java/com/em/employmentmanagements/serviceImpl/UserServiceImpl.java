package com.em.employmentmanagements.serviceImpl;

import com.em.employmentmanagements.mapper.UserMapper;
import com.em.employmentmanagements.service.UserService;
import com.em.employmentmanagements.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：
 *
 * @author PuYinsheng
 * @date 2020/4/24
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 注册
     * @param userVo
     * @return
     */
    @Override
    public int register(UserVo userVo) {
        int a = userMapper.addUser(userVo);
        return a;
    }

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    @Override
    public int login(String username, String password) {
        String a = userMapper.login(username,password);
        if(a==null){
            return 3;
        }else {
            return Integer.valueOf(a);
        }
    }

    /**
     * 根据用户名修改密码
     * @param userVo
     * @return
     */
    @Override
    public int updatePasswordByname(UserVo userVo) {
        return userMapper.updatePasswordByname(userVo);
    }
}
