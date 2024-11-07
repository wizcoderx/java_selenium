package seleniumtest_firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HandleFrames {
    public static void main(String[] args) {
        // Set up Firefox driver
        System.setProperty("webdriver.gecko.driver", "D:\\Anamay\\Projects\\2024\\java_selenium\\firefox_gecko_driver\\geckodriver.exe");
        
        // Set Firefox binary path
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        
        WebDriver driver = new FirefoxDriver(options);

        // Open the specified URL
        driver.get("http://demo.guru99.com/test/guru99home/");
        
        // Maximize the browser window
        driver.manage().window().maximize();

        try {
            // Switch to the iframe with name or ID "a077aa5e"
            driver.switchTo().frame("a077aa5e");
            System.out.println("Switched to the iframe with ID 'a077aa5e'");

            // Locate and click the image inside the iframe
            WebElement iframeElement = driver.findElement(By.xpath("/html/body/a/img"));
            iframeElement.click(); // Perform the click action
            System.out.println("*We are done*");

            // Optionally, switch back to main content if further interactions are needed
            driver.switchTo().defaultContent();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
