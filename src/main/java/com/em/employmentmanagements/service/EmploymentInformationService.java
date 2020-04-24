package com.em.employmentmanagements.service;

import com.em.employmentmanagements.po.EmploymentInformationPo;

import java.util.List;

public interface EmploymentInformationService {

    int addEmploymentInformation(EmploymentInformationPo employmentInformationPo);

    EmploymentInformationPo getEmploymentInformationById(Integer id);

    int updateEmploymentInformationById(Integer id,EmploymentInformationPo employmentInformationPo);

    List<EmploymentInformationPo> selectAll();

    int deleteById(Integer id);

}
