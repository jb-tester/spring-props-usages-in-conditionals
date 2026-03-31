package com.mytests.spring.springpropsusagesinconditionals;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBooleanProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
class ConditionalBeanConfig {

    @Bean
    @ConditionalOnProperty("my.props.prop0")
    public Bean1 bean10() {
        return new Bean1();
    }
    @Bean
    @ConditionalOnProperty(name = "my.props.prop1", havingValue = "true")
    public Bean1 bean11() {
        return new Bean1();
    }
    @Bean
    @ConditionalOnProperty(prefix = "my.props", name = "prop2", havingValue = "true")
    public Bean1 bean12() {
        return new Bean1();
    }
    @Bean
    @ConditionalOnProperties({
            @ConditionalOnProperty(prefix = "my.props", name = "prop3", havingValue = "true"),
            @ConditionalOnProperty(value = "my.props.prop4", havingValue = "true")
    })
    public Bean1 bean13() {
        return new Bean1();
    }
    @Bean
    @ConditionalOnBooleanProperty(name = "my.props.prop5")
    public Bean1 bean14() {
        return new Bean1();
    }
    @Bean
    @ConditionalOnBooleanProperty(prefix = "my.props", name = "prop6")
    public Bean1 bean15() {
        return new Bean1();
    }
}
