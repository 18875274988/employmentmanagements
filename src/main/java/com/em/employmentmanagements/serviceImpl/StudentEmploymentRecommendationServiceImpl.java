package com.em.employmentmanagements.serviceImpl;

import com.em.employmentmanagements.mapper.StudentEmploymentRecommendationMapper;
import com.em.employmentmanagements.service.StudentEmploymentRecommendationService;
import com.em.employmentmanagements.vo.StudentEmploymentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * 描述：
 *
 * @author PuYinsheng
 * @date 2020/4/25
 **/
@Service
public class StudentEmploymentRecommendationServiceImpl implements StudentEmploymentRecommendationService {
    @Autowired
    private StudentEmploymentRecommendationMapper studentEmploymentRecommendationMapper;
    /**
     * 查询所有就业信息(公司名+招收的所有专业)
     * @return
     */
    @Override
    public List<StudentEmploymentVo> finAllEmploymenInfo() {
        LinkedList<StudentEmploymentVo> studentEmploymentVos = new LinkedList<>();
        //查询所有公司
        List<String> allEmploymentInformation = studentEmploymentRecommendationMapper.findAllEmploymentInformation();
        //根据公司名查询招收专业
            for (String conpanyName : allEmploymentInformation) {
                StudentEmploymentVo studentEmploymentVo = new StudentEmploymentVo();
                studentEmploymentVo.setCompanyName(conpanyName);
                List<String> specialtyList = studentEmploymentRecommendationMapper.findstuSpecialtyByCompanyName(conpanyName);
                String specialtyLists = new String();
                for (int i = 0; i < specialtyList.size(); i++) {
                    specialtyLists+=specialtyList.get(i)+",";
                }
                Long countPeople = studentEmploymentRecommendationMapper.countPeople(conpanyName);
                studentEmploymentVo.setCountPeople(countPeople+"人");
                studentEmploymentVo.setSpecialtyList(specialtyLists);
                studentEmploymentVos.add(studentEmploymentVo);
            }
        return studentEmploymentVos;
    }
}
