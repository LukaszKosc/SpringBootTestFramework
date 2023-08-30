package net.koscielny.testframework.base;

import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.*;

import java.lang.reflect.Method;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public interface TestInterface {

    @BeforeClass
    void beforeClass();

    @AfterClass
    void afterClass();

    @BeforeTest
    void beforeTest();

    @AfterTest
    void afterTest();

    @BeforeMethod
    void beforeMethod(Method method);

    @AfterMethod
    void afterMethod(Method method);
}
