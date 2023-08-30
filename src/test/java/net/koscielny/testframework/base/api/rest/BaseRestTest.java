package net.koscielny.testframework.base.api.rest;

//import net.koscielny.testframework.configuration.SpringBootTest;
import net.koscielny.testframework.base.TestInterface;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class BaseRestTest extends AbstractTestNGSpringContextTests implements TestInterface {

    @BeforeClass
    @Override
    public void beforeClass() {
        System.out.println("Before class in " + getClass().getSimpleName());
    }

    @AfterClass
    @Override
    public void afterClass() {
        System.out.println("After class");
    }

    @BeforeTest
    @Override
    public void beforeTest() {
        System.out.println("Before test");
    }

    @AfterTest
    @Override
    public void afterTest() {
        System.out.println("After test");
    }

    @BeforeMethod
    @Override
    public void beforeMethod(Method method) {
        System.out.println("Before method: '" + method.getName() + "'.");
    }

    @AfterMethod
    @Override
    public void afterMethod(Method method) {
        System.out.println("After method: '" + method.getName() + "'.");
    }
}
