package laboratory;

import java.lang.management.ManagementFactory;

import java.util.concurrent.TimeUnit;
import com.sun.management.OperatingSystemMXBean;

/**
 * @program:Agent
 * @author:Nine_odes
 * @description:
 * @create:2020-07-30 20:14
 **/
public class CaptureCPUPercent {
    public static void main(String[] args) throws InterruptedException {
        OperatingSystemMXBean platformMxBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
        while(true){
            double percent = platformMxBean.getSystemCpuLoad();
            System.out.println(percent);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
