package com.mytests.spring.springpropsusagesinconditionals;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;



@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ConditionalOnProperty("my.props.prop13")
public @interface MyConditionalOnPropsWithPresetCondtionNoPrefix {

}
