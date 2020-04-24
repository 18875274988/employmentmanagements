package com.em.employmentmanagements.service;

import com.em.employmentmanagements.vo.StudentEmploymentAnalysisReportVo;
import com.em.employmentmanagements.vo.StudentEmploymentVo;
import org.hibernate.validator.constraints.EAN;

import java.util.List;

/**
 * 描述：学生就业推荐
 *
 * @author PuYinsheng
 * @date 2020/4/25
 **/
public interface StudentEmploymentRecommendationService {
    /**
     * 查询所有就业信息(公司名+招收的所有专业)
     * @return
     */
    List<StudentEmploymentVo> finAllEmploymenInfo();

    /**
     * 生成就业分析报告
     * @return
     */
    List<StudentEmploymentAnalysisReportVo> findAllfinAllEmploymentIndex(String SpecialtyOrCharacter);
}
