package com.sumeeth.webapp.sms;

import com.sumeeth.webapp.sms.service.GreetService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:si-config.xml"})
public class SmsOocUiServiceApplication {

    public static void main(String[] args) throws InterruptedException {

        ApplicationContext appCtx = SpringApplication.run
                (SmsOocUiServiceApplication.class, args);
        Thread.sleep(1000);
        appCtx.getBean("greetServiceImpl", GreetService.class).greet(
                "Welcome to Spring integration!"
        );


    }
}
