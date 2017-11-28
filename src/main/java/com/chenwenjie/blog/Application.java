package com.chenwenjie.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * SpringBoot 启动入口
 * 
 * @author chenwenjie
 * @since 2017-07-07
 */
@ComponentScan(Application.BASE_PACKAGE)
@SpringBootApplication
public class Application {

	protected static final String BASE_PACKAGE = "com.chenwenjie.blog";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
