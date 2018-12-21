package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.example.demo.dao")
@SpringBootApplication
public class DemoApplication {

    //Invalid bound statement (not found)
    //按以下步骤一一执行：
    //
    //1：检查xml文件所在的package名称是否和interface对应的package名称一一对应
    //
    //2：检查xml文件的namespace是否和xml文件的package名称一一对应
    //
    //3：检查函数名称能否对应上
    //
    //4：去掉xml文件中的中文注释
    //
    //5：随意在xml文件中加一个空格或者空行然后保存





    //http://localhost:8080/JobManager.html
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
