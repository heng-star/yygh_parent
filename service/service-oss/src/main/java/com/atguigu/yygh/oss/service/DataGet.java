package com.atguigu.yygh.oss.service;

import com.atguigu.yygh.oss.config.GetAliyunDataSercret;
import lombok.SneakyThrows;

public class DataGet {

    @SneakyThrows
    public static void main(String[] args){
        GetAliyunDataSercret getAliyunDataSercret=new GetAliyunDataSercret();
        System.out.println(getAliyunDataSercret.toString());
        System.out.println(getAliyunDataSercret.AccessKeyID);
    }
}
