package com.atguigu.yygh.msm.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetData {

    public String secretId;
    public String secretKey;
    public String sdkAppId;
    public String templateId;
    public String signName;
    public String phoneNumberSet;
    public String templateParamSet;

    public GetData() throws IOException {
        Properties prop = new Properties();
        //需要外部属性配置文件的路径
        FileInputStream inputStream = null;
        inputStream = new FileInputStream("C:/JAVA/TencentYunMsmSdkIdAndKey.properties");
        prop.load(inputStream);
        secretId = prop.getProperty("secretId");
        secretKey = prop.getProperty("secretKey");
        sdkAppId = prop.getProperty("sdkAppId");
        signName = prop.getProperty("signName");//值为中文，输出为乱码
        templateId= prop.getProperty("templateId");
        phoneNumberSet= prop.getProperty("phoneNumberSet");
        templateParamSet= prop.getProperty("templateParamSet");
    }
}

//        System.out.println(SecretId);
//        System.out.println(secretKey);
//        System.out.println(sdkAppId);
//        //System.out.println(signName);
//        System.out.println(templateId);
//        System.out.println(phoneNumberSet);
//        System.out.println(templateParamSet);
