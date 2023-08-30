package net.koscielny.testframework.tests.ui;

import net.koscielny.testframework.base.ui.selenium.UiTest;
import net.koscielny.testframework.helpers.ui.selenium.HomePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;


@Test
public class UiTest1 extends UiTest {

    @Autowired
    HomePage homePage;

    public void test_1(){
        homePage.gadajacaMetoda();
        System.out.println("example test1 from testng");
        System.out.println("baseUri: " + baseUri);
        homePage.loadBasePage(baseUri);
//        System.out.println("driver id: '" + getDriver().hashCode() + "'." );
//        getDriver().get(baseUri);

//        webDriverWaitConfig.webDriverWait(getDriver())
//                .pollingEvery(Duration.ofMillis(100))
//                .ignoring(NoSuchElementException.class)
//                .withTimeout(Duration.ofSeconds(3))
//                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='L2AGLb']")));
//        getDriver().findElement(By.xpath("//button[@id='L2AGLb']")).click();
//        getDriver().findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("cats");
//        getDriver().findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
//        webDriverWaitConfig.webDriverWait(getDriver())
//                .pollingEvery(Duration.ofMillis(100))
//                .ignoring(NoSuchElementException.class)
//                .withTimeout(Duration.ofSeconds(10))
//                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='result-stats']")));
//        Assert.assertTrue(getDriver().findElement(By.xpath("//div[@id='result-stats']")).isDisplayed());
    }

    public void test_2(){
        System.out.println("example test2 from testng");
        System.out.println("baseUri: " + baseUri);
//        System.out.println("driver id: '" + getDriver().hashCode() + "'." );
//        System.out.println("currentURL: " + getDriver().getCurrentUrl());
//        getDriver().get(baseUri);
//        webDriverWaitConfig.webDriverWait(getDriver())
//                .pollingEvery(Duration.ofMillis(100))
//                .ignoring(NoSuchElementException.class)
//                .withTimeout(Duration.ofSeconds(10))
//                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='L2AGLb']")));
//        getDriver().findElement(By.xpath("//button[@id='L2AGLb']")).click();
//        getDriver().findElement(By.xpath("//textarea[@id='APjFqb']")).clear();
//        getDriver().findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("dogs");
//        getDriver().findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ESCAPE);
//
//        getDriver().findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
//        webDriverWaitConfig.webDriverWait(getDriver())
//                .pollingEvery(Duration.ofMillis(100))
//                .ignoring(NoSuchElementException.class)
//                .withTimeout(Duration.ofSeconds(10))
//                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='result-stats']")));
//        Assert.assertTrue(getDriver().findElement(By.xpath("//div[@id='result-stats']")).isDisplayed());
    }

    public void test_3(){
        System.out.println("example test3 from testng");
        System.out.println("baseUri: " + baseUri);
    }
}
