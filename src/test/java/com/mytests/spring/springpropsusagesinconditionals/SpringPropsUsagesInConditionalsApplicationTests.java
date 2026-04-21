package com.mytests.spring.springpropsusagesinconditionals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
@TestPropertySource(properties = {"test.props.prop1=value1", "test.props.prop2=value2"})
class SpringPropsUsagesInConditionalsApplicationTests {


    @Autowired(required = false)
    private Bean2 bean21;
    @Autowired(required = false)
    private Bean2 bean22;

    @Test
    void testBeansWithConditionalOnPropertySetInTest() {
        assertNotNull(bean21);
        assertNotNull(bean22);
    }

}
