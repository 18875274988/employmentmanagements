package com.em.employmentmanagements.mapper;

import com.em.employmentmanagements.po.PersonalityTypePo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 描述：性格管理
 *
 * @author PuYinsheng
 * @date 2020/4/24
 **/
@Repository
public interface PersonalityTypeMapper {
    /**
     * 查询所有性格类型
     * @return
     */
    List<PersonalityTypePo> findaAllPerson();

    /**
     * 根据id修改性格
     * @param personalityType
     * @param id
     * @return
     */
    int updatePersonalityType(@Param("personalityType")String personalityType, @Param("id")Integer id);
}
