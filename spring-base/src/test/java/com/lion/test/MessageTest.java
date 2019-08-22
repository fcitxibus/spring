package com.lion.test;

import com.lion.service.IMessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageTest {
    public static void main(String[] args) {
        //进行配置文件的加载，利用此配置文件启动Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-base.xml");
        IMessageService service = context.getBean("messageService",IMessageService.class);
        System.out.println(service.echo("你好，萧余"));
    }
}
