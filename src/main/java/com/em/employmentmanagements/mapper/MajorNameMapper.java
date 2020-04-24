package com.em.employmentmanagements.mapper;

import com.em.employmentmanagements.po.MajorNamePo;
import lombok.Data;
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
}
