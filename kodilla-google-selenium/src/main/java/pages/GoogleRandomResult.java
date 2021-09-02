package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class GoogleRandomResult {
    WebElement googleRandomResult;

    public void drawResult(GoogleResults googleResults) {
        Random rand = new Random();
        int randomInt = rand.nextInt(googleResults.getResults().size()-1);
        googleRandomResult = googleResults.getResults().get(randomInt);
        googleRandomResult.findElement(By.tagName("a")).click();
        System.out.println("I clicked result no " + randomInt);
    }

    public WebElement getGoogleRandomResult() {
        return googleRandomResult;
    }
}
