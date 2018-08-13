package com.demo.springboot.springbootdemo.factorybean;

import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.FactoryBean;

// https://www.baeldung.com/spring-factorybean
@Data
@Builder
public class ToolFactory implements FactoryBean<Tool> {
    private int factoryId;
    private int toolId;

    @Override
    public Tool getObject() throws Exception {
        return new Tool(toolId);
    }

    @Override
    public Class<?> getObjectType() {
        return Tool.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
