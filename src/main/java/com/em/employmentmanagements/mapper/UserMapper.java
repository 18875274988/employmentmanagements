package com.em.employmentmanagements.mapper;

import com.em.employmentmanagements.po.UserPo;
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

    /**
     * 根据用户姓名修改密码
     * @param userVo
     * @return
     */
    int updatePasswordByname(UserVo userVo);

    /**
     * 根据用户名查询专业性格
     * @param username
     * @return
     */
    UserPo selectById(String username);

}
