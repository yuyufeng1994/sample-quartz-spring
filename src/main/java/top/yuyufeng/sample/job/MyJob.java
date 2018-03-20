package top.yuyufeng.sample.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

/**
 * @author yuyufeng
 * @date 2018/3/19
 */

public class MyJob extends QuartzJobBean{

    public MyJob() {
//        System.out.println("MyJob.MyJob");
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
//        App.addResult();
        System.out.println("Hello World!  MyJob is executing." + new Date());
    }

}
