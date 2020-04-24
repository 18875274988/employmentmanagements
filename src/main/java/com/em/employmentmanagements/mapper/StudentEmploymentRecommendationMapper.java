package com.em.employmentmanagements.mapper;

import org.apache.ibatis.annotations.Param;
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

    /**
     * 根据专业或性格查询公司名称
     * @param SpecialtyOrCharacter
     * @return
     */
    List<String> findCompanyNameBySpecialtyOrCharacter(String SpecialtyOrCharacter);

    /**
     * 根据专业或性格查询总招收人数
     * @param SpecialtyOrCharacter
     * @return
     */
    Long countPeopleBySpecialtyOrCharacters(String SpecialtyOrCharacter);
    /**
     * 根据专业或性格查询公司总招收人数
     * @param SpecialtyOrCharacter
     * @return
     */
    Long countPeopleBySpecialtyOrCharacter(@Param("SpecialtyOrCharacter") String SpecialtyOrCharacter,@Param("companyName") String companyName);

}
