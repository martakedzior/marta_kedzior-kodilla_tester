package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });
        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });
        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance", 170, wallet.getBalance());
        });



        When("I request $200", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 200);
        });

        Then("$200 should be dispensed", () -> {
            Assert.assertEquals(200, cashSlot.getContents());
        });
        Then("the balance of my wallet should be $0", () -> {
            Assert.assertEquals("Incorrect wallet balance", 0, wallet.getBalance());
        });



        When("I request $300", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 300);
        });

        Then("$0 should be dispensed", () -> {
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });
        Then("the balance of my wallet should be $200", () -> {
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });


        Given("there is $100 in my wallet", () -> {
            wallet.deposit(100);
        });
        When("I withdraw $200", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 200);
        });
        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(100, wallet.getBalance());
        });
        Then("I should be told that I don't have enough money in my wallet", () -> {
            wallet.debit(200);
        });


        When("I check the balance of my wallet", () -> {
            wallet.getBalance();
            System.out.println("Wallet balance is: " + wallet.getBalance());
        });
        Then("I should see that the balance is $100", () -> {
            Assert.assertEquals(100, wallet.getBalance());
        });
    }
}