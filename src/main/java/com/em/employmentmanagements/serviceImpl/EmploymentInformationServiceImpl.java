package com.em.employmentmanagements.serviceImpl;

import com.em.employmentmanagements.mapper.EmploymentInformationMapper;
import com.em.employmentmanagements.po.EmploymentInformationPo;
import com.em.employmentmanagements.service.EmploymentInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
