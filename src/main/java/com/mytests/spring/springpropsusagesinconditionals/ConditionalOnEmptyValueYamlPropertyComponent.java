package com.mytests.spring.springpropsusagesinconditionals;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;


@Component
@ConditionalOnProperty(name = {"my.yaml.props.prop17", "my.yaml.props.prop16"}, havingValue = "true")
public class ConditionalOnEmptyValueYamlPropertyComponent {


}
