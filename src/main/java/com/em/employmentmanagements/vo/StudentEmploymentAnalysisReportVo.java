package com.em.employmentmanagements.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 描述：就业分析报告
 *
 * @author PuYinsheng
 * @date 2020/4/25
 **/
@Data
public class StudentEmploymentAnalysisReportVo {
    /**
     * 公司名称
     */
    private String companyName;
    /**
     * 招收人数
     */
    private String countPeople;
    /**
     * 就业指数
     */
    private BigDecimal EmploymentIndex;
}
