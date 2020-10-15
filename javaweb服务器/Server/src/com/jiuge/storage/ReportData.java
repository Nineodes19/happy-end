package com.jiuge.storage;

/**
 * @program:Server
 * @author:Nine_odes
 * @description:
 * @create:2020-10-15 20:21
 **/
public class ReportData {
    public String hostname;
    public long timestamp;
    public double percent;
    public ReportData(String hostname,long timestamp,double percent){
        this.hostname = hostname;
        this.timestamp = timestamp;
        this.percent = percent;
    }
}
