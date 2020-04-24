package com.em.employmentmanagements.mapper;

import com.em.employmentmanagements.po.MajorNamePo;
import lombok.Data;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 描述：查询专业名集合
 *
 * @author PuYinsheng
 * @date 2020/4/24
 **/
@Repository
public interface MajorNameMapper {
    /**
     * 查询所有专业名
     * @return
     */
    List<MajorNamePo> findAllMajorName();

    /**
     * 根据id修改专业
     * @param majorName
     * @param id
     * @return
     */
    int updateMajorName(@Param("majorName")String majorName,@Param("id")Integer id);

    /**
     * 根据id删除专业名
     * @param id
     * @return
     */
    int deletMajorName(Integer id);

    /**
     * 新增专业名
     * @param majorNamePo
     * @return
     */
    int addMajorName(MajorNamePo majorNamePo);
}
