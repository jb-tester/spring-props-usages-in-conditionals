package com.mytests.spring.springpropsusagesinconditionals;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBooleanProperty;
import org.springframework.stereotype.Component;


@Component
@ConditionalOnBooleanProperty("my.yaml.props.prop0")
public class ConditionalOnBooleanPropertyYamlComponent {


}
