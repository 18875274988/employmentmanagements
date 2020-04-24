package com.em.employmentmanagements.po;

import lombok.Data;

/**
 * 描述：就业信息
 *
 * @author PuYinsheng
 * @date 2020/4/25
 **/
@Data
public class EmploymentInformationPo {
    /**
     * id
     */
    private Long id;
    /**
     * 学生姓名
     */
    private String studentName;
    /**
     * 学号
     */
    private String studentNo;
    /**
     * 专业
     */
    private String studentSpecialty;
    /**
     * 性格
     */
    private String studentCharacter;
    /**
     * 公司名称
     */
    private String companyName;
    /**
     * 职务
     */
    private String  duty;
    /**
     * 班级
     */
    private String studentClass;
    /**
     * 辅导员
     */
    private String studentTeacher;
}
