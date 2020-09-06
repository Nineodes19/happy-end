package com.nine.storage;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 逻辑上想象成档案室
 * 保证一定是线程安全的（使用 Storage 的代码，需要再去考虑线程安全的问题）
 */
public class Storage {
    private static final ConcurrentHashMap<String, CycleQueue<ReportData>> map = new ConcurrentHashMap<>();

    // 把文件放入档案室
    public static void put(String hostname, long timestamp, double percent) {
        // 1. 把文件按照格式归档
        ReportData data = new ReportData(hostname, timestamp, percent);
        // 2. 获取 hostname 对应的抽屉
        CycleQueue<ReportData> queue = map.computeIfAbsent(hostname, k -> new CycleQueue<>(60));
        // 3. 把归档后的文件放入抽屉中
        queue.push(data);
    }

    public static List<String> listHostname() {
        List<String> list = new ArrayList<>();
        Enumeration<String> keys = map.keys();
        while (keys.hasMoreElements()) {
            String hostname = keys.nextElement();
            list.add(hostname); // 头插 or 尾插
        }

        return list;
    }

    public static ReportData getNewestReportData(String hostname) {
        return map.get(hostname).pop();
    }
}
