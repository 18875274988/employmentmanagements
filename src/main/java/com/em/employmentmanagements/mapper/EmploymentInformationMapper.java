package com.em.employmentmanagements.mapper;

import com.em.employmentmanagements.po.EmploymentInformationPo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmploymentInformationMapper {
    /**
     * 添加就业信息
     * @param employmentInformationPo
     * @return
     */
    int addEmploymentInformation(EmploymentInformationPo employmentInformationPo);

}
