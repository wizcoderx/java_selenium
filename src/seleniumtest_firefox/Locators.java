package seleniumtest_firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Locators {
    public static void main(String[] args) {
        // Set up Firefox driver
        System.setProperty("webdriver.gecko.driver", "D:\\Anamay\\Projects\\2024\\java_selenium\\firefox_gecko_driver\\geckodriver.exe");
        
        // Set Firefox binary path (if required)
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        
        // Initialize WebDriver
        WebDriver driver = new FirefoxDriver(options);
        
        // Open Facebook
        driver.get("https://www.facebook.com/");
        
        try {
            // 1. Get the title and current URL
            String title = driver.getTitle();
            System.out.println("Title is: " + title);
            System.out.println("Current URL is: " + driver.getCurrentUrl());
            Thread.sleep(3000); // Wait for 3 seconds

            // 2. Locate element by ID
            WebElement emailField = driver.findElement(By.id("email"));
            System.out.println("Email Field (ID): " + emailField.getTagName()); // HTML tag name of the element
            Thread.sleep(3000); // Wait for 3 seconds

            // 3. Locate element by CSS Selector
            WebElement emailFieldByCss = driver.findElement(By.cssSelector("input[name='email']"));
            System.out.println("Email Field (CSS Selector): " + emailFieldByCss.getTagName()); // HTML tag name of the element
            Thread.sleep(3000); // Wait for 3 seconds

            // 4. Locate element by XPath
            WebElement emailFieldByXpath = driver.findElement(By.xpath("//*[@id='email']"));
            System.out.println("Email Field (XPath): " + emailFieldByXpath.getTagName()); // HTML tag name of the element
            Thread.sleep(3000); // Wait for 3 seconds

            // 5. Check if the element is displayed, enabled, and selected
            System.out.println("Is the Email Field Displayed: " + emailField.isDisplayed());
            System.out.println("Is the Email Field Enabled: " + emailField.isEnabled());
            System.out.println("Is the Email Field Selected: " + emailField.isSelected());
            Thread.sleep(3000); // Wait for 3 seconds

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
