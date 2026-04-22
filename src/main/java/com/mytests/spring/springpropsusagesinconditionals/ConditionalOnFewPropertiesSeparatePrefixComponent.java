package com.mytests.spring.springpropsusagesinconditionals;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by Irina on 3/31/2026.</p>
 * *
 */
@Component
@ConditionalOnProperty(prefix = "my.props", name = {"prop10", "prop9"}, havingValue = "true")
class ConditionalOnFewPropertiesSeparatePrefixComponent {

}
