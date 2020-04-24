package com.em.employmentmanagements.controller;

import com.em.employmentmanagements.service.StudentEmploymentRecommendationService;
import com.em.employmentmanagements.vo.StudentEmploymentAnalysisReportVo;
import com.em.employmentmanagements.vo.StudentEmploymentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述：学生就业推荐查询
 *
 * @author PuYinsheng
 * @date 2020/4/25
 **/
@RestController
public class StudentEmploymentRecommendationController {
    @Autowired
    private StudentEmploymentRecommendationService studentEmploymentRecommendationService;

    /**
     * 查询所有就业信息(公司名+招收的所有专业)
     *
     * @return
     */
    @RequestMapping("finAllEmploymenInfo")
    public List<StudentEmploymentVo> finAllEmploymenInfo() {
      return   studentEmploymentRecommendationService.finAllEmploymenInfo();
    }
    @RequestMapping("findAllfinAllEmploymentIndex")
    public List<StudentEmploymentAnalysisReportVo> findAllfinAllEmploymentIndex(String  SpecialtyOrCharacter){
        return studentEmploymentRecommendationService.findAllfinAllEmploymentIndex(SpecialtyOrCharacter);
    }
}