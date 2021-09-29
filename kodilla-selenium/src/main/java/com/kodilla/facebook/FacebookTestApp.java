package com.kodilla.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\Chrome\\chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        WebElement inputField2 = driver.findElement(By.xpath("//button[2]"));
        inputField2.click();

    }
}
