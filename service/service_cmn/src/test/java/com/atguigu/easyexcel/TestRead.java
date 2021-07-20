package com.atguigu.easyexcel;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

public class TestRead {
    public static void main(String[] args){

        String filename="E:\\excel\\01.xlsx";

        List<UserData> list = new ArrayList();
        EasyExcel.read(filename,UserData.class,
                new ExcelListener()).sheet().doRead();

    }
}
