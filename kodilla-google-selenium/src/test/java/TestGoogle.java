package pages;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogle {

    WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
        driver.findElement(By.id("L2AGLb")).click();
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
    }

    @Test
    public void testGoogleResult() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        GoogleRandomResult googleRandomResult = new GoogleRandomResult();
        googleSearch.searchResults();
        googleRandomResult.googleResult(googleSearch.getGoogleResults());
    }
}