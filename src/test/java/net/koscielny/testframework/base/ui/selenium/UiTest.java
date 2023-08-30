package net.koscielny.testframework.base.ui.selenium;

import net.koscielny.testframework.base.TestInterface;
import net.koscielny.testframework.configuration.ui.selenium.WebDriverWaitConfig;
import net.koscielny.testframework.helpers.ui.selenium.BasePage;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class UiTest extends AbstractTestNGSpringContextTests implements TestInterface {

    @Value("${gui.base.url}")
    protected String baseUri;

    @Autowired
    BasePage basePage;

//    @Autowired
//    protected WebDriverWaitConfig webDriverWaitConfig;
//
//    @Autowired
//    private WebDriver driver;

    @Override
    @AfterClass
    public void afterClass() {

    }

//    private void closeDriver() {
//        if (driver == null) {
//            return;
//        }
//        driver.quit();
//        driver = null;
//    }

    private WebDriver getDriver() {
        return basePage.getDriver();
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
        System.out.println("driver id: '" + getDriver().hashCode() + "'.");
    }

    @AfterMethod
    @Override
    public void afterMethod(Method method) {
        System.out.println("After UI method");
        System.out.println("driver id: '" + getDriver().hashCode() + "'.");
//        closeDriver();

    }
}
