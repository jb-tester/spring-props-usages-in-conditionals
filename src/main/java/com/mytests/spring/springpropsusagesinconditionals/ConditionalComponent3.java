package com.mytests.spring.springpropsusagesinconditionals;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by Irina on 3/31/2026.</p>
 * *
 */
@Component
@ConditionalOnProperty(value = {"my.yaml.props.prop1", "my.yaml.props.prop2"}, havingValue = "true")
class ConditionalComponent3 {

}
