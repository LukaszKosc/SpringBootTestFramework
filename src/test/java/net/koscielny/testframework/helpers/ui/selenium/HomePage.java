package net.koscielny.testframework.helpers.ui.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;
import org.testng.Assert;

@Component
public class HomePage extends BasePage {
    @FindBy(how = How.ID, using = "L2AGLb")
    public WebElement searchField;

    public void gadajacaMetoda() {
        System.out.println("running method from HomePage");
    }

    public HomePage loadBasePage(String url) {
        getDriver().get(url);
        waitElement(searchField);
        String expectedTitle = "Google";
        String actualTitle = getDriver().getTitle();
        System.out.println("Title: '" + actualTitle + "'.");
        Assert.assertEquals(actualTitle, expectedTitle, "Actual '"+ actualTitle + "' is not equal to expected '" + expectedTitle + "'.");
        return this;
    }
}
