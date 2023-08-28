package net.koscielny.testframework.base;

import net.koscielny.testframework.helpers.ui.selenium.configuration.WebDriverWaitConfig;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.*;

import java.lang.reflect.Method;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UiTest extends AbstractTestNGSpringContextTests implements TestInterface {

    @Value("${gui.base.url}")
    protected String baseUri;

    @Autowired
    protected WebDriverWaitConfig webDriverWaitConfig;

    @Autowired
    private WebDriver driver;

    @Override
    @AfterClass
    public void afterClass() {
        if (driver != null)
            driver.quit();
    }

    protected WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    @Override
    public void beforeClass() {

    }

    @BeforeTest
    @Override
    public void beforeTest() {
        System.out.println("Before UI test");
    }

    @AfterTest
    @Override
    public void afterTest() {
        System.out.println("After UI test");
    }

    @BeforeMethod
    @Override
    public void beforeMethod(Method method) {
        System.out.println("Before UI method");
    }

    @AfterMethod
    @Override
    public void afterMethod(Method method) {
        System.out.println("After UI method");
    }
}
