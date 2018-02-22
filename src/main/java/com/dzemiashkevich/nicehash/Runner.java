package com.dzemiashkevich.nicehash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.dzemiashkevich.nicehash")
@Configuration
@SpringBootApplication
public class Runner extends SpringBootServletInitializer{

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return builder.sources(Runner.class);
  }

  public static void main(String[] args) {
    SpringApplication.run(Runner.class, args);
  }

}
