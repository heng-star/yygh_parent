package com.atguigu.yygh.test;

import com.atguigu.yygh.test.service.HospitalSetTestService;
import org.springframework.beans.factory.annotation.Autowired;

//@SpringBootTest
public class Wrappertest {

    @Autowired
    HospitalSetTestService hospitalSetTestService;

//    @Test
//    public void SelectTest (){
//        List<HospitalSet> list01 = hospitalSetTestService.list();
//        System.out.println(list01);
//        //return Result.ok(list);
//    }

}
