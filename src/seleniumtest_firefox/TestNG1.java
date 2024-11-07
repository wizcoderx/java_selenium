package seleniumtest_firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class TestNG1 {
    public String baseUrl = "https://www.google.com/";
    String driverPath = "D:\\Anamay\\Projects\\2024\\java_selenium\\firefox_gecko_driver\\geckodriver.exe";
    public WebDriver driver;

    @Test
    public void f() throws InterruptedException {
        System.out.println("Launching Firefox browser");
        System.setProperty("webdriver.gecko.driver", driverPath);
        
        // Set Firefox binary path if needed
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");

        driver = new FirefoxDriver(options);
        driver.get(baseUrl);
        
        // Perform a search on Google
        driver.findElement(By.name("q")).sendKeys("DES NMITD", Keys.ENTER);
        Thread.sleep(2000);

        // Close the browser
        driver.quit();
    }
}
