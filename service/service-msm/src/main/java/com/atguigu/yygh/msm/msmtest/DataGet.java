package com.atguigu.yygh.msm.msmtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataGet {

    public String secretId;
    public String secretKey;
    public String sdkAppId;
    public String templateId;
    public String phoneNumberSet;
    public String templateParamSet;

    public  void get(){
        Properties prop = new Properties();
            //需要外部属性配置文件的路径
            FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream("C:/JAVA/TencentYunMsmSdkIdAndKey.properties");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                prop.load(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }

        this.secretId = prop.getProperty("secretId");
        this.secretKey = prop.getProperty("secretKey");
        this.sdkAppId = prop.getProperty("sdkAppId");
        //String signName = prop.getProperty("signName");//值为中文，输出为乱码
        this.templateId= prop.getProperty("templateId");
        this.phoneNumberSet= prop.getProperty("phoneNumberSet");
        this.templateParamSet= prop.getProperty("templateParamSet");

        System.out.println(secretId);
        System.out.println(secretKey);
        System.out.println(sdkAppId);
        //System.out.println(signName);
        System.out.println(templateId);
        System.out.println(phoneNumberSet);
        System.out.println(templateParamSet);
    }
}
