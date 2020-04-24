package com.em.employmentmanagements.service;

import com.em.employmentmanagements.mapper.PersonalityTypeMapper;
import com.em.employmentmanagements.po.MajorNamePo;
import com.em.employmentmanagements.po.PersonalityTypePo;

import java.util.List;

/**
 * 描述：
 *
 * @author PuYinsheng
 * @date 2020/4/24
 **/
public interface MajorNameService {
    /**
     * 查询所有专业名
     * @return
     */
    List<MajorNamePo> findAllMajorName();
    /**
     * 查询所有性格类型
     * @return
     */
    List<PersonalityTypePo> findaAllPerson();

    /**
     * 根据id修改专业
     * @param id
     * @param majorName
     * @return
     */
    int updateMajorName(Integer id,String majorName);

    /**
     * 根据id修改性格
     * @param id
     * @param personalityType
     * @return
     */
    int updatePerson(Integer id,String personalityType);
}
