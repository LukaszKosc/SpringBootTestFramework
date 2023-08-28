package net.koscielny.testframework.base;

//import net.koscielny.testframework.configuration.SpringBootTest;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.*;

import java.lang.reflect.Method;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApiTest extends AbstractTestNGSpringContextTests implements TestInterface {

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
