package laboratory;

import com.sun.management.OperatingSystemMXBean;

import java.lang.management.ManagementFactory;
import java.util.concurrent.TimeUnit;

public class CaptureCPUPercent {
    public static void main(String[] args) throws InterruptedException {
        OperatingSystemMXBean platformMXBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
        while (true) {
            double percent = platformMXBean.getSystemCpuLoad();
            System.out.println(percent);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
