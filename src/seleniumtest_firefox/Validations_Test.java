package seleniumtest_firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validations_Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Anamay\\Projects\\2024\\java_selenium\\firefox_gecko_driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.google.com/");
        
        // Validate the title of the page
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        
        // Validate the current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        
        // Check if the search box is visible using the updated XPath
        boolean status = driver.findElement(By.xpath("//textarea[@name='q']")).isDisplayed();
        if (status) {
            System.out.println("Search box is visible");
        } else {
            System.out.println("Search box is not visible");
        }

        // Close the browser
        driver.quit();
    }
}
