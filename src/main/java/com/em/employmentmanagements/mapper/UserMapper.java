package com.em.employmentmanagements.mapper;

import com.em.employmentmanagements.vo.UserVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 描述：
 *
 * @author PuYinsheng
 * @date 2020/4/24
 **/
@Repository
public interface UserMapper {

    /**
     * 注册
     * @param userVo
     * @return
     */
    int addUser(UserVo userVo);

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    String login(@Param("username")String username,@Param("password")String password);

}
