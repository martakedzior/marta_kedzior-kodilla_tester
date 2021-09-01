package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AllegroTestingAppCSS {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

        WebElement alertAccept = driver.findElement(By.xpath("//button[@data-role='accept-consent']"));
        alertAccept.click();

        WebElement category = driver.findElement(By.cssSelector("div > select"));

        Select categorySelect = new Select(category);
        categorySelect.selectByIndex(3);

        WebElement inputField = driver.findElement(By.cssSelector("div > form > input"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("h2 > a")));

        List<WebElement> webElementsList = driver.findElements(By.cssSelector("article"));

        System.out.println("Number of found items: " + webElementsList.size());
        System.out.println(webElementsList.get(1).getText());

        for (int i = 0; i < webElementsList.size(); i++) {
            System.out.println("product info: " + webElementsList.get(i).getText());
        }
    }
}
