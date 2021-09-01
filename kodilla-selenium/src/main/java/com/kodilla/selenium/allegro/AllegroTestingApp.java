package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

        WebElement alertAccept = driver.findElement(By.xpath("//button[@data-role='accept-consent']"));
        alertAccept.click();
        WebElement linkElectronics = driver.findElement(By.xpath("//div[@data-group-id='departments_Elektronika']/a"));
        linkElectronics.click();

        WebElement inputField = driver.findElement(By.xpath("//div[@data-box-name='allegro.metrumHeader.search']/div/form/input"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();
        driver.quit();
    }
}
