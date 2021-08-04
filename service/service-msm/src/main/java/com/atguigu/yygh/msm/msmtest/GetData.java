package com.atguigu.yygh.msm.msmtest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetData {

    public String secretId;
    public String secretKey;
    public String sdkAppId;
    public String templateId;
    public String phoneNumberSet;
    public String templateParamSet;

    public static void main(String[] args) throws IOException {

        GetData dataGet = new GetData();
        dataGet.DataGet();

    }



    public  void DataGet() throws IOException {

        Properties prop = new Properties();
        //需要外部属性配置文件的路径
        FileInputStream inputStream = null;
//        try {
            inputStream = new FileInputStream("C:/JAVA/TencentYunMsmSdkIdAndKey.properties");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        try {
            prop.load(inputStream);
            secretId = prop.getProperty("secretId");
            secretKey = prop.getProperty("secretKey");
            sdkAppId = prop.getProperty("sdkAppId");
            //String signName = prop.getProperty("signName");//值为中文，输出为乱码
            templateId= prop.getProperty("templateId");
            phoneNumberSet= prop.getProperty("phoneNumberSet");
            templateParamSet= prop.getProperty("templateParamSet");

//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        System.out.println(secretId);
        System.out.println(secretKey);
        System.out.println(sdkAppId);
        //System.out.println(signName);
        System.out.println(templateId);
        System.out.println(phoneNumberSet);
        System.out.println(templateParamSet);



    }
//
//
    public String getSecretId() {
        return secretId;
    }

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }
//
//    public String getSecretKey() {
//        return secretKey;
//    }
//
//    public void setSecretKey(String secretKey) {
//        this.secretKey = secretKey;
//    }
//
//    public String getSdkAppId() {
//        return sdkAppId;
//    }
//
//    public void setSdkAppId(String sdkAppId) {
//        this.sdkAppId = sdkAppId;
//    }
//
//    public String getTemplateId() {
//        return templateId;
//    }
//
//    public void setTemplateId(String templateId) {
//        this.templateId = templateId;
//    }
//
//    public String getPhoneNumberSet() {
//        return phoneNumberSet;
//    }
//
//    public void setPhoneNumberSet(String phoneNumberSet) {
//        this.phoneNumberSet = phoneNumberSet;
//    }
//
//    public String getTemplateParamSet() {
//        return templateParamSet;
//    }
//
//    public void setTemplateParamSet(String templateParamSet) {
//        this.templateParamSet = templateParamSet;
//    }


}
