package com.kodilla.selenium.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\Chrome\\chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");


        WebElement inputField = driver.findElement(By.id("L2AGLb"));
        WebElement inputField2 = driver.findElement(By.name("q"));

        inputField.click();
        inputField2.sendKeys("Kodilla");
        inputField2.submit();
    }
}