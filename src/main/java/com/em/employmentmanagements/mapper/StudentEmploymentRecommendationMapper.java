package com.em.employmentmanagements.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 描述：学生就业推荐
 *
 * @author PuYinsheng
 * @date 2020/4/25
 **/
@Repository
public interface StudentEmploymentRecommendationMapper {
    /**
     * 查询所有企业名(学生就业信息表)
     * @return
     */
    List<String> findAllEmploymentInformation();

    /**
     * 根据公司名称查看招收专业
     * @return
     */
    List<String> findstuSpecialtyByCompanyName(String companyName);

    /**
     * 根据公司名查询总人数
     * @param companyName
     * @return
     */
    Long countPeople(String companyName);
}
