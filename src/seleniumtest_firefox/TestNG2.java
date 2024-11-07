package seleniumtest_firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class TestNG2 {
    String driverPath = "D:\\Anamay\\Projects\\2024\\java_selenium\\firefox_gecko_driver\\geckodriver.exe";

    @Test
    public void TestGoogle() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", driverPath);
        
        // Set Firefox binary path if needed
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");

        WebDriver driver = new FirefoxDriver(options);
        driver.get("https://www.google.com/");
        
        // Perform a search on Google
        driver.findElement(By.name("q")).sendKeys("DES's NMITD", Keys.ENTER);
        Thread.sleep(2000);
        
        // Close the browser
        driver.quit();
    }

    @Test
    public void TestFacebook() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", driverPath);
        
        // Set Firefox binary path if needed
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");

        WebDriver driver = new FirefoxDriver(options);
        driver.get("https://www.facebook.com/");
        
        // Enter text in the Facebook email field
        driver.findElement(By.name("email")).sendKeys("DES's NMITD", Keys.ENTER);
        Thread.sleep(2000);
        
        // Close the browser
        driver.quit();
    }
}
