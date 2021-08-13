package com.atguigu.yygh.oss.config;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class OssTest {

    public static void main(String[] args) throws IOException {
        OssTest ossTest = new OssTest();

    }

    public OssTest() throws IOException {

        GetAliyunDataSercret getAliyunDataSercret = new GetAliyunDataSercret();
        String endpoint = getAliyunDataSercret.Endpoint;
        String accessKeyId = getAliyunDataSercret.AccessKeyID;
        String accessKeySecret = getAliyunDataSercret.AccessKeySecret;
        String bucketName = getAliyunDataSercret.AliyunOssBucket;

        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        // <yourObjectName>上传文件到OSS时需要指定包含文件后缀在内的完整路径，例如abc/efg/123.jpg。
        String objectName = "yygh-test/1.txt";

        // 上传文件到指定的存储空间（bucketName）并将其保存为指定的文件名称（objectName）。
        String content = "Hello OSS";
        ossClient.putObject(bucketName, objectName, new ByteArrayInputStream(content.getBytes()));

        // 关闭OSSClient。
        ossClient.shutdown();
    }
}
