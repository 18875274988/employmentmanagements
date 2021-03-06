package com.em.employmentmanagements.po;

import lombok.Data;

/**
 * 描述：
 *
 * @author PuYinsheng
 * @date 2020/4/24
 **/
@Data
public class UserPo {
    /**
     * 用户类型
     */
    private String username;    //用户名
    private String password;    //密码
    private String specialty;   //专业
    private String characterState;   //性格

}
