package com.em.employmentmanagements.controller;

import com.em.employmentmanagements.po.EmploymentInformationPo;
import com.em.employmentmanagements.service.EmploymentInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmploymentInformationController {

    @Autowired
    private EmploymentInformationService employmentInformationService;

    /**
     * 添加就业信息
     * @param employmentInformationPo
     * @return
     */
    @GetMapping("addEmploymentInformation")
    public int addEmploymentInformation(EmploymentInformationPo employmentInformationPo){
        return employmentInformationService.addEmploymentInformation(employmentInformationPo);
    }

}
