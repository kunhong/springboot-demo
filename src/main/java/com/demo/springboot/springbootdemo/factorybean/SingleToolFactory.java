package com.demo.springboot.springbootdemo.factorybean;

import lombok.Data;
import org.springframework.beans.factory.config.AbstractFactoryBean;

@Data
public class SingleToolFactory extends AbstractFactoryBean<Tool> {
    private int factoryId;
    private int toolId;

//    <property name="factoryId"value="3001"/>
//    <property name="toolId"value="1"/>

    @Override
    public Class<?> getObjectType() {
        return Tool.class;
    }

    @Override
    protected Tool createInstance() throws Exception {
        return new Tool(toolId);
    }
}
