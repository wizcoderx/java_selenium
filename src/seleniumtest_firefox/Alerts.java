package seleniumtest_firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Alerts {
    public static void main(String[] args) {
        // Setup Firefox WebDriver
        System.setProperty("webdriver.gecko.driver", "D:\\Anamay\\Projects\\2024\\java_selenium\\firefox_gecko_driver\\geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        WebDriver driver = new FirefoxDriver(options);

        try {
            // Test Alert
            driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
            driver.switchTo().frame("iframeResult");
            WebElement alertButton = driver.findElement(By.cssSelector("html>body>button"));
            alertButton.click();
            System.out.println("Alert Message: " + driver.switchTo().alert().getText());
            Thread.sleep(3000); // Wait for 3 seconds to read the alert
            driver.switchTo().alert().accept(); // Accept the alert

            // Test Confirm (Accept)
            driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
            driver.switchTo().frame("iframeResult");
            WebElement confirmButton = driver.findElement(By.cssSelector("html>body>button"));
            confirmButton.click();
            System.out.println("Confirm Message after OK: " + driver.switchTo().alert().getText());
            Thread.sleep(3000); // Wait for 3 seconds to read the confirm message
            driver.switchTo().alert().accept(); // Accept the confirm

            // Test Confirm (Dismiss)
            driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
            driver.switchTo().frame("iframeResult");
            confirmButton.click();
            System.out.println("Confirm Message after Cancel: " + driver.switchTo().alert().getText());
            Thread.sleep(3000); // Wait for 3 seconds to read the confirm message
            driver.switchTo().alert().dismiss(); // Dismiss the confirm

            // Test Prompt
            driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
            driver.switchTo().frame("iframeResult");
            WebElement promptButton = driver.findElement(By.cssSelector("html>body>button"));
            promptButton.click();
            driver.switchTo().alert().sendKeys("Test User");
            driver.switchTo().alert().accept(); // Accept the prompt
            System.out.println("Prompt Message: " + driver.findElement(By.id("demo")).getText());
            Thread.sleep(3000); // Wait for 3 seconds to read the prompt message

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
