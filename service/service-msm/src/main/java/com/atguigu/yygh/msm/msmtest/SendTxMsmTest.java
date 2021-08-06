package com.atguigu.yygh.msm.msmtest;

import java.io.IOException;

public class SendTxMsmTest {
    public static void main(String[] args) throws IOException{
        GetData dataGet = new GetData();
        String secretId=dataGet.secretId;
        String secretKey=dataGet.secretKey;
        System.out.println(secretKey);
        System.out.println(secretId);
    }
}
