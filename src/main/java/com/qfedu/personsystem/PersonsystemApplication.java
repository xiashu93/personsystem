package com.qfedu.personsystem;

import com.github.pagehelper.PageHelper;
import com.sun.org.apache.xml.internal.security.Init;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.omg.PortableInterceptor.Interceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Properties;

@SpringBootApplication
@EnableSwagger2
@MapperScan("com.qfedu.personsystem.dao")
public class PersonsystemApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PersonsystemApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){


        return builder.sources(PersonsystemApplication.class);
    }




}