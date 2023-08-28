package net.koscielny.testframework.base;

import org.testng.annotations.*;

import java.lang.reflect.Method;

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
