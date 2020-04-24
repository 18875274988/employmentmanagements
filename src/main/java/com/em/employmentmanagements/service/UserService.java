package com.em.employmentmanagements.service;

import com.em.employmentmanagements.vo.UserVo;

/**
 * 描述：
 *
 * @author PuYinsheng
 * @date 2020/4/24
 **/
public interface UserService {

    int register(UserVo userVo);

    int login(String username,String password);

}
