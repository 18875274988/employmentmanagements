package com.em.employmentmanagements.controller;

import com.em.employmentmanagements.po.EmploymentInformationPo;
import com.em.employmentmanagements.service.EmploymentInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    /**
     * 根据id查询就业信息
     * @param id
     * @return
     */
    @GetMapping("getEmploymentInformationById")
    public EmploymentInformationPo getEmploymentInformationById(Integer id){
        return employmentInformationService.getEmploymentInformationById(id);
    }

    /**
     * 根据id修改就业信息
     * @param id
     * @param employmentInformationPo
     * @return
     */
    @GetMapping("updateEmploymentInformationById")
    public int updateEmploymentInformationById(Integer id,EmploymentInformationPo employmentInformationPo){
        return employmentInformationService.updateEmploymentInformationById(id,employmentInformationPo);
    }

    /**
     * 查询全部
     * @return
     */
    @GetMapping("selectAll")
    public List<EmploymentInformationPo> selectAll(){
        return employmentInformationService.selectAll();
    }

    /**
     * 根据id删除
     * @return
     */
    @GetMapping("deleteById")
    public int deleteById(Integer id){
        return employmentInformationService.deleteById(id);
    }

}
