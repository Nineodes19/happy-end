package laboratory;

import com.sun.management.OperatingSystemMXBean;

import java.lang.management.ManagementFactory;
import java.util.concurrent.TimeUnit;


/**
 * @program:Agent
 * @author:Nine_odes
 * @description:
 * @create:2020-09-29 00:17
 **/
public class CaptureCPUPercent {
    public static void main(String[] args) throws InterruptedException {
        OperatingSystemMXBean platformMXBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
        while(true){
            double percent = platformMXBean.getSystemCpuLoad();
            System.out.println(percent);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
