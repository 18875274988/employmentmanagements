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
    @RequestMapping("findaAllPerson")
    public List<PersonalityTypePo> findaAllPerson(){
        return  majorNameService.findaAllPerson();
    }
}
