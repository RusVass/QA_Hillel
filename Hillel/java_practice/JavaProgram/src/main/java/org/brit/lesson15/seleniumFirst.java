package org.brit.lesson15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class seleniumFirst {
    public static void main(String[] args) throws InterruptedException {
//         System.setProperty("webdriver.chrome.driver",
//             new File("drivers/chromedriver").getAbsolutePath());

       WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(3000);
        driver.quit();
    }
}

