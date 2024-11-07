package seleniumtest_firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FacebookLoginAutomation {
    public static void main(String[] args) {
        // Set up Firefox driver
        System.setProperty("webdriver.gecko.driver", "D:\\Anamay\\Projects\\2024\\java_selenium\\firefox_gecko_driver\\geckodriver.exe");
        
        // Set Firefox binary path
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        
        WebDriver driver = new FirefoxDriver(options);

        // Maximize the browser window
        driver.manage().window().maximize();

        try {
            // Navigate to Facebook login page
            driver.get("https://www.facebook.com/");
            System.out.println("Facebook login page opened");

            // Find the email input field by ID and enter the email
            WebElement emailField = driver.findElement(By.id("email"));
            emailField.sendKeys("test_user@gmail.com");
            System.out.println("Email entered");

            // Find the password input field by ID and enter the password
            WebElement passwordField = driver.findElement(By.id("pass"));
            passwordField.sendKeys("test_password_12345");
            System.out.println("Password entered");

            // Find the login button by name and click it
            WebElement loginButton = driver.findElement(By.name("login"));
            loginButton.click();
            System.out.println("Login button clicked");

            // Optionally, wait for a few seconds to observe the login action (or use WebDriverWait for explicit waits)
            try {
                Thread.sleep(5000); // Wait for 5 seconds (replace with WebDriverWait in production)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
