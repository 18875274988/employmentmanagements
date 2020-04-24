package com.em.employmentmanagements.controller;

import com.em.employmentmanagements.po.MajorNamePo;
import com.em.employmentmanagements.po.PersonalityTypePo;
import com.em.employmentmanagements.service.MajorNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述：专业名管理
 *
 * @author PuYinsheng
 * @date 2020/4/24
 **/
@RestController
public class MajorNameController {
    @Autowired
    private MajorNameService majorNameService;

    /**
     * 查询所有专业
     * @return
     */
    @RequestMapping("/findAllMajorName")
    public List<MajorNamePo> findAllMajorName(){
        return majorNameService.findAllMajorName();
    }

    /**
     * 查询所有性格
     * @return
     */
    @RequestMapping("/findaAllPerson")
    public List<PersonalityTypePo> findaAllPerson(){
        return  majorNameService.findaAllPerson();
    }

    /**
     * 根据id修改专业
     * @param id
     * @return
     */
    @RequestMapping("/updateMajorName")
    public int updateMajorName(Integer id,String majorName){
        return majorNameService.updateMajorName(id,majorName);
    }

    /**
     * 根据id修改性格
     * @param id
     * @return
     */
    @RequestMapping("/updatePerson")
    public int updatePerson(Integer id,String personalityType){
        return majorNameService.updatePerson(id,personalityType);
    }

}
