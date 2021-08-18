package com.manasni.appflowtracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "classpath:config/application.yml")
public class AppFlowTrackerApplication {

  public static void main(String[] args) {
    SpringApplication.run(AppFlowTrackerApplication.class, args);
  }

}
