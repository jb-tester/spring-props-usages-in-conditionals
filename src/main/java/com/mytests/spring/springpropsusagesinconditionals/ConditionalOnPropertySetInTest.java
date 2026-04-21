package com.mytests.spring.springpropsusagesinconditionals;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConditionalOnPropertySetInTest {

    @Bean
    @ConditionalOnProperty(prefix = "test.props", name = "prop1", havingValue = "value1")
    public Bean2 bean21() {
        return new Bean2();
    }

    @Bean
    @ConditionalOnProperty(name = "test.props.prop2", havingValue = "value2")
    public Bean2 bean22() {
        return new Bean2();
    }
}
