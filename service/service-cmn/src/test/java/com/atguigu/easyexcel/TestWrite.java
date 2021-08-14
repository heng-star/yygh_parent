package com.atguigu.easyexcel;
import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

public class TestWrite {
    public static void main(String[] args){

        String filename="E:\\excel\\01.xlsx";

        List<UserData> list = new ArrayList();

        for (int i=1;i<5;i++){
            UserData data= new UserData();

            data.setId(i);
            data.setName("ZZ"+i);
            list.add(data);
        }

        EasyExcel.write(filename,UserData.class).
                sheet("01").doWrite(list);



    }
}
