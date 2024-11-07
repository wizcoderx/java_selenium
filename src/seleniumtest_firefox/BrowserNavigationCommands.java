package seleniumtest_firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserNavigationCommands {
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
            // Open Google
            driver.get("https://www.google.com");
            System.out.println("Opened Google homepage");

            // Navigate to another website, for example, OpenAI
            driver.navigate().to("https://www.openai.com");
            System.out.println("Navigated to OpenAI");

            // Go back to Google
            driver.navigate().back();
            System.out.println("Navigated back to Google");

            // Go forward to OpenAI
            driver.navigate().forward();
            System.out.println("Navigated forward to OpenAI");

            // Refresh the page
            driver.navigate().refresh();
            System.out.println("Page refreshed");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
