package top.yuyufeng.sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yuyufeng
 * @date 2018/3/20
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring-quartz.xml"});
        context.start();
        System.out.println("Spring启动成功！");
    }
}
