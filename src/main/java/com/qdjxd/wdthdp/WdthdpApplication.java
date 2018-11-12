package com.qdjxd.wdthdp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

//添加注解,对应项目中mapper（dao）的包路径
@MapperScan("com.qdjxd.wdthdp.dao")
public class WdthdpApplication {

	public static void main(String[] args) {
		SpringApplication.run(WdthdpApplication.class, args);
	}
}
