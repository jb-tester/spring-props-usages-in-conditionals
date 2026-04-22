package com.mytests.spring.springpropsusagesinconditionals;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by Irina on 3/31/2026.</p>
 * *
 */
@Component
@ConditionalOnProperty(name = {"my.props.prop7", "my.props.prop8"}, havingValue = "true")
class ConditionalOnFewPropertiesComponent {

}
