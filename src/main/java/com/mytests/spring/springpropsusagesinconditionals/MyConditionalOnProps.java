package com.mytests.spring.springpropsusagesinconditionals;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * *
 * <p>Created by Irina on 3/31/2026.</p>
 * *
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ConditionalOnProperty
public @interface MyConditionalOnProps {
    @AliasFor(annotation = ConditionalOnProperty.class, attribute = "name")
    String[] value();

    @AliasFor(annotation = ConditionalOnProperty.class, attribute = "havingValue")
    String havingValue();
}
