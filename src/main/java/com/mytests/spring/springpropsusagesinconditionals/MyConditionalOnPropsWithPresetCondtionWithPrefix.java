package com.mytests.spring.springpropsusagesinconditionals;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import java.lang.annotation.*;


@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ConditionalOnProperty(prefix = "my.props", name = "prop14")
public @interface MyConditionalOnPropsWithPresetCondtionWithPrefix {

}
