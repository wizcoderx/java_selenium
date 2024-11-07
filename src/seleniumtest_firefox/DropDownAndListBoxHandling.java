package seleniumtest_firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownAndListBoxHandling {
    public static void main(String[] args) {
        // Setup Firefox WebDriver
        System.setProperty("webdriver.gecko.driver", "D:\\Anamay\\Projects\\2024\\java_selenium\\firefox_gecko_driver\\geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        WebDriver driver = new FirefoxDriver(options);

        try {
            // Task 1: Navigate to Facebook registration page and handle dropdown and list box
            driver.get("https://www.facebook.com/r.php?r=101");

            // 1. Dropdown Handling (Selecting a month from dropdown)
            Select month = new Select(driver.findElement(By.id("month")));
            month.selectByVisibleText("Apr"); // Select October
            Thread.sleep(3000); // Wait for 3 seconds to read the selection

            // 2. List Box Handling (Selecting Gender options)
            List<WebElement> gender = driver.findElements(By.name("sex"));
            int cnt = gender.size();
            System.out.println("Number of Gender options: " + cnt);

            // Loop through and click each gender option
            for (int i = 0; i < cnt; i++) {
                String text = gender.get(i).getAttribute("value");
                System.out.println("Gender option: " + text);
                gender.get(i).click();
                Thread.sleep(2000); // Wait for 2 seconds before clicking the next option
            }

            // Task 2: Navigate to Google and get the title
            driver.get("https://www.google.com/");
            String title = driver.getTitle();
            System.out.println("Title is: " + title); // Print the title of Google
            System.out.println(driver.getTitle());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
