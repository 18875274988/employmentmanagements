package com.em.employmentmanagements.serviceImpl;

import com.em.employmentmanagements.mapper.MajorNameMapper;
import com.em.employmentmanagements.mapper.PersonalityTypeMapper;
import com.em.employmentmanagements.po.MajorNamePo;
import com.em.employmentmanagements.po.PersonalityTypePo;
import com.em.employmentmanagements.service.MajorNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述：专业名管理
 *
 * @author PuYinsheng
 * @date 2020/4/24
 **/
@Service
public  class MajorNameServiceImpl implements MajorNameService {
    @Autowired
    private  MajorNameMapper majorNameMapper;
    @Autowired
    private PersonalityTypeMapper personalityTypeMapper;

    /**
     * 查询所有专业名
     * @return
     */
    @Override
    public List<MajorNamePo> findAllMajorName() {
        return majorNameMapper.findAllMajorName();
    }

    /**
     * 查询所有性格类型
     *
     * @return
     */
    @Override
    public List<PersonalityTypePo> findaAllPerson() {
        return personalityTypeMapper.findaAllPerson();
    }
}
