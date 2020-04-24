package com.em.employmentmanagements;

import com.em.employmentmanagements.mapper.PersonalityTypeMapper;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmploymentmanagementsApplicationTests {
    @Autowired
    private PersonalityTypeMapper personalityTypeMapper;
    @Test
    void contextLoads() {
        System.out.println( personalityTypeMapper.findaAllPerson());
    }

}
