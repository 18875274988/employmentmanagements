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
    /**
     * 根据id删除专业名
     * @param id
     * @return
     */
    int deletMajorName(Integer id);
    /**
     * 根据id删除性格类型
     * @param id
     * @return
     */
    int deletePersonalityType(Integer id);
    /**
     * 新增专业名
     * @param majorNamePo
     * @return
     */
    int addMajorName(MajorNamePo majorNamePo);
    /**
     * 新增性格类型
     * @param personalityTypePo
     * @return
     */
    int addPersonalityType(PersonalityTypePo personalityTypePo);
}
