package net.koscielny.testframework.configuration.ui.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.koscielny.testframework.configuration.ui.selenium.annotations.LazyConfiguration;
//import net.koscielny.testframework.helpers.ui.selenium.configuration.annotations.WebdriverScopeBean;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;


@LazyConfiguration
public class WebDriverConfig {

    @Value("${headless:true}")
    private Boolean headless;

    @Bean
//    @WebdriverScopeBean
//    @ConditionalOnMissingBean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    @Primary
    public WebDriver firefoxDriver() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        Proxy proxy = new Proxy();
        proxy.setAutodetect(false);
        proxy.setNoProxy("no_proxy-var");
        firefoxOptions.setCapability("proxy", proxy);
        return new FirefoxDriver(firefoxOptions);
    }
    @Bean
//    @WebdriverScopeBean
//    @ConditionalOnMissingBean
    @ConditionalOnProperty(name = "browser", havingValue = "edge")
    @Primary
    public WebDriver edgeDriver() {
        return new EdgeDriver();
    }

    @Bean
//    @WebdriverScopeBean
//    @ConditionalOnMissingBean
    @ConditionalOnProperty(name = "browser", havingValue = "chrome", matchIfMissing=true)
    @Primary
    public WebDriver chromeDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        if (headless) {
            chromeOptions.addArguments("--headless=new");
        }
        return new ChromeDriver(chromeOptions);
    }
}
