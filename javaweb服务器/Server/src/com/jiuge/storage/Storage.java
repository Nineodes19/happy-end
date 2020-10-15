package com.jiuge.storage;



import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program:Server
 * @author:Nine_odes
 * @description:
 * @create:2020-10-15 20:17
 **/
public class Storage {
    private static final ConcurrentHashMap<String, CycleQueue<ReportData>> map = new ConcurrentHashMap<>();

    //把文件放入档案室
    public static void put(String hostname,long timestamp,double percent){
        //1.把文件按照格式归档
        ReportData data = new ReportData(hostname,timestamp,percent);
        //2.获取hostname对应的抽屉
        CycleQueue<ReportData> queue = map.computeIfAbsent(hostname,k-> new CycleQueue<>(60));
        //3.把归档的文件放入抽屉中
        queue.push(data);
    }

    public static List<String> listHostname() {
        List<String> list = new ArrayList<>();
        Enumeration<String> keys = map.keys();
        while(keys.hasMoreElements()){
            String hostname = keys.nextElement();
            list.add(hostname);//
        }
        return list;
    }
}
