package seleniumtest_firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launch_browser {
    public static void main(String[] args) {
        // Set the path to geckodriver executable
        System.setProperty("webdriver.gecko.driver", "D:\\Anamay\\Projects\\2024\\java_selenium\\firefox_gecko_driver\\geckodriver.exe");

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Launch the website
        driver.get("https://nmitd.edu.in/");

        // Optionally, you can add a wait here
        try {
            Thread.sleep(5000); // Wait for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
