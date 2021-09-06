package homework;

import io.cucumber.java8.En;
import org.junit.Assert;

public class isItDivisibleSteps implements En {
    private int number;
    private String answer;

    public isItDivisibleSteps() {
        Given("Given number is 3", () -> {
            this.number = 3;
        });

        Given("Given number is 5", () -> {
            this.number = 5;
        });

        Given("Given number is 15", () -> {
            this.number = 15;
        });

        Given("Given number is 19", () -> {
            this.number = 19;
        });

        Given("Given number is 22", () -> {
            this.number = 22;
        });

        Given("Given number is 26", () -> {
            this.number = 26;
        });

        When("I ask is it divisible by 3 0r 5 or both", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkIfDivisible(this.number);
        });

        Then("I should get {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });

    }

}