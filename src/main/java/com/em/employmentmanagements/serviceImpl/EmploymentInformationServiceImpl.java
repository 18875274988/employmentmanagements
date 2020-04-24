package com.em.employmentmanagements.serviceImpl;

import com.em.employmentmanagements.mapper.EmploymentInformationMapper;
import com.em.employmentmanagements.po.EmploymentInformationPo;
import com.em.employmentmanagements.service.EmploymentInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmploymentInformationServiceImpl implements EmploymentInformationService {

    @Autowired
    private EmploymentInformationMapper employmentInformationMapper;

    /**
     * 添加就业信息
     * @param employmentInformationPo
     * @return
     */
    @Override
    public int addEmploymentInformation(EmploymentInformationPo employmentInformationPo) {
        int a = employmentInformationMapper.addEmploymentInformation(employmentInformationPo);
        if (a==0){
            return 3;
        }else {
         return a;
        }
    }

    /**
     * 根据id查询就业信息
     * @param id
     * @return
     */
    @Override
    public EmploymentInformationPo getEmploymentInformationById(Integer id) {
        EmploymentInformationPo ep = employmentInformationMapper.getEmploymentInformationById(id);
        return ep;
    }

    /**
     * 根据id修改就业信息
     * @param id
     * @param employmentInformationPo
     * @return
     */
    @Override
    public int updateEmploymentInformationById(Integer id, EmploymentInformationPo employmentInformationPo) {
        int a = employmentInformationMapper.updateEmploymentInformationById(employmentInformationPo,id);
        if(a==0){
            return 3;
        }else{
            return a;
        }
    }

    /**
     * 查询全部
     * @return
     */
    @Override
    public List<EmploymentInformationPo> selectAll() {
        return employmentInformationMapper.selectAll();
    }

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @Override
    public int deleteById(Integer id) {
        int a = employmentInformationMapper.deleteById(id);
        if(a==0){
            return 3;
        }else {
            return a;
        }
    }
}
