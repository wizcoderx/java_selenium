package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLaunch {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\Anamay\\Projects\\2024\\java_selenium\\chrome_driver\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Launch the opposite
        driver.get("https://nmitd.edu.in/");

        // Close the browser
        driver.quit();
    }
}
