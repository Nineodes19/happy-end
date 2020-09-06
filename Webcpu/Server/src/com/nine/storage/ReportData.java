package com.nine.storage;

public class ReportData {
    public String hostname;
    public long timestamp;
    public double percent;

    public ReportData(String hostname, long timestamp, double percent) {
        this.hostname = hostname;
        this.timestamp = timestamp;
        this.percent = percent;
    }
}
