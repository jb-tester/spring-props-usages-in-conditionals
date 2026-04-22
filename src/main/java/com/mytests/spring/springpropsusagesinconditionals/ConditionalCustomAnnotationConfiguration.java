package com.mytests.spring.springpropsusagesinconditionals;

import org.springframework.context.annotation.Configuration;

/**
 * *
 * <p>Created by Irina on 3/31/2026.</p>
 * *
 */
@Configuration
@MyConditionalOnProps(value = {"my.props.prop11", "my.props.prop12"}, havingValue = "true")
class ConditionalCustomAnnotationConfiguration {

}
