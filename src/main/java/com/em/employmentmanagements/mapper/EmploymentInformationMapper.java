package com.em.employmentmanagements.mapper;

import com.em.employmentmanagements.po.EmploymentInformationPo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmploymentInformationMapper {
    /**
     * 添加就业信息
     * @param employmentInformationPo
     * @return
     */
    int addEmploymentInformation(EmploymentInformationPo employmentInformationPo);

    /**
     * 根据id查询就业信息
     * @param id
     * @return
     */
    EmploymentInformationPo getEmploymentInformationById(Integer id);

    /**
     * 根据id修改就业信息
     * @param employmentInformationPo
     * @param id
     * @return
     */
    int updateEmploymentInformationById(@Param("employmentInformationPo") EmploymentInformationPo employmentInformationPo,@Param("id") Integer id);

    /**
     * 查询全部
     * @return
     */
    List<EmploymentInformationPo> selectAll();

    /**
     * 根据id删除
     * @param id
     * @return
     */
    int deleteById(Integer id);

}
