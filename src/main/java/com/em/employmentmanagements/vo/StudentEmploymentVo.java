package com.em.employmentmanagements.vo;

import lombok.Data;

/**
 * 描述：
 *
 * @author PuYinsheng
 * @date 2020/4/25
 **/
@Data
public class StudentEmploymentVo {
    /**
     * 公司名称
     */
    private String companyName;
    /**
     * 所招收专业
     */
    private String specialtyList;
    /**
     * 总人数
     */
    private String countPeople;
}
