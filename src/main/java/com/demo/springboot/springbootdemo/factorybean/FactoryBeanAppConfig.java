package com.demo.springboot.springbootdemo.factorybean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanAppConfig {

    @Bean(name = "tool")
    public ToolFactory toolFactory() {
        return ToolFactory.builder()
                .toolId(2)
                .factoryId(7070)
                .build();
    }

    @Bean
    public Tool tool() throws Exception {
        return toolFactory().getObject();
    }
}
