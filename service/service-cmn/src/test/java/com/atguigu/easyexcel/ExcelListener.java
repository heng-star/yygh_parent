package com.atguigu.easyexcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.Map;

public class ExcelListener extends AnalysisEventListener<UserData> {

    @Override
    public void invoke(UserData userData, AnalysisContext analysisContext){

        System.out.println(userData);
    }

    @Override
    public void invokeHeadMap(Map<Integer,String>headerMap,AnalysisContext analysisContext){

        System.out.println("表头："+ headerMap);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext){


    }



}
