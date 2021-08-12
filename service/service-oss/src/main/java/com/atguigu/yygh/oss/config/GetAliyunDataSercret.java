package com.atguigu.yygh.oss.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetAliyunDataSercret {

    public String AccessKeyID;
    public String AccessKeySecret;
    public String Endpoint;
    public String AliyunOssBucket;

    public GetAliyunDataSercret() throws IOException {
        Properties prop = new Properties();
        //需要外部属性配置文件的路径
        FileInputStream inputStream = null;
        inputStream = new FileInputStream("C:/JAVA/aliyunosssercret.properties");
        prop.load(inputStream);
        AccessKeyID = prop.getProperty("AccessKeyID");
        AccessKeySecret = prop.getProperty("AccessKeySecret");
        Endpoint = prop.getProperty("Endpoint");
        AliyunOssBucket = prop.getProperty("AliyunOssBucket");
    }

    @Override
    public String toString() {
        return "GetAliyunDataSercret{" +
                "AccessKeyID='" + AccessKeyID + '\'' +
                ", AccessKeySecret='" + AccessKeySecret + '\'' +
                ", Endpoint='" + Endpoint + '\'' +
                ", AliyunOssBucket='" + AliyunOssBucket + '\'' +
                '}';
    }
}
