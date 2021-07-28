package com.atguigu.yygh.test.wrapper;

import com.atguigu.yygh.model.hosp.HospitalSet;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Service;

//@MapperScans(value = "com.atguigu.yygh.test.wrapper")
@Service
public interface HospitalSetTestWrapper extends BaseMapper<HospitalSet> {
//    @Override
//    public HospitalSet selectById(Serializable id);
}
