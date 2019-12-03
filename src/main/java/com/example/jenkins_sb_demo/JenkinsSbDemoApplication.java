package com.example.jenkins_sb_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JenkinsSbDemoApplication extends SpringBootServletInitializer {
    /**
     * 需要把web项目打成war包部署到外部tomcat运行时需要改变启动方式
     *springboot项目打成war包部署到tomcat时需要改变启动方式，否则运行tomcat时war包只会解压，但是加载不
     *
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(JenkinsSbDemoApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinsSbDemoApplication.class, args);
    }

}
