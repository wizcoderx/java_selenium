package seleniumtest_firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG3 {
    String actualTitle, expectedTitle;
    WebDriver driver;

    @BeforeTest
    public void launchBrowser() {
        System.out.println("Launching Firefox browser");
        System.setProperty("webdriver.gecko.driver", "D:\\Anamay\\Projects\\2024\\java_selenium\\firefox_gecko_driver\\geckodriver.exe");
        
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        
        driver = new FirefoxDriver(options);
        driver.get("https://demo.guru99.com/test/newtours/");
    }

    @Test
    public void verifyHomepageTitle() {
        expectedTitle = "Welcome: Mercury Tours";
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterTest
    public void terminateBrowser() {
        driver.close();
    }
}
