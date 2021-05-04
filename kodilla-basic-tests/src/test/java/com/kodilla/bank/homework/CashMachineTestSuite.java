package com.kodilla.bank.homework;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine(new double[] {});
        double[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine(new double[] {});
        cashMachine.add(1000);
        cashMachine.add(-100);

        double[] transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(1000, transactions[0]);
        assertEquals(-100, transactions[1]);
    }

    @Test
    public void testGettingZeroBalance() {
        CashMachine cashMachine = new CashMachine(new double[] {});
        double balance = cashMachine.getBalance();
        assertEquals(0, balance);
    }

    @Test
    public void testGettingBalanceForTwoTransactions() {
        CashMachine cashMachine = new CashMachine(new double[] {});
        cashMachine.add(1000);
        cashMachine.add(-100);

        double[] transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.length);

        double balance = cashMachine.getBalance();
        assertEquals(900, balance);
    }

    @Test
    public void testGettingNumberOfTransactions() {
        CashMachine cashMachine = new CashMachine(new double[]{});
        cashMachine.add(-89);
        cashMachine.add(-600);
        cashMachine.add(1000);

        int numberOfTransactions = cashMachine.getNumberOfTransactions();
        assertEquals(3, numberOfTransactions);

    }

    @Test
    public void testGettingNumberOfWithdrawals() {
        CashMachine cashMachine = new CashMachine(new double[]{});
        cashMachine.add(-89);
        cashMachine.add(-600);
        cashMachine.add(1000);

        assertEquals(2, cashMachine.getWithdrawalNumber());
    }

    @Test
    public void testGettingNumberOfDeposits() {
        CashMachine cashMachine = new CashMachine(new double[]{});
        cashMachine.add(-89);
        cashMachine.add(-600);
        cashMachine.add(1000);

        assertEquals(1, cashMachine.getDepositNumber());
    }

    @Test
    public void testGettingWithdrawalSum() {
        CashMachine cashMachine = new CashMachine(new double[]{});
        cashMachine.add(-89);
        cashMachine.add(-600);
        cashMachine.add(1000);

        assertEquals(-689.0, cashMachine.getWithdrawalSum());
    }

    @Test
    public void testGettingDepositSum() {
        CashMachine cashMachine = new CashMachine(new double[]{});
        cashMachine.add(-89);
        cashMachine.add(-600);
        cashMachine.add(1000);

        assertEquals(1000.00, cashMachine.getDepositSum());
    }
}