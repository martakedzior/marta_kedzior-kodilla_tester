package com.kodilla.bank.homework;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldHaveZeroBalanceAndDepositAndWithdrawal() {
        CashMachine[] cashMachines = new CashMachine[2];
        cashMachines[0] = new CashMachine(new double[] {});
        cashMachines[1] = new CashMachine(new double[] {});
        Bank bank = new Bank(cashMachines);
        assertEquals(0, bank.getBalanceBank());
        assertEquals(0, bank.getAverageDeposit());
        assertEquals(0, bank.getAverageWithdrawal());
    }

    @Test
    public void shouldCalculateTransactionsFromMultipleCashMachines() {
        CashMachine[] cashMachines = new CashMachine[5];
        cashMachines[0] = new CashMachine(new double[] {1});
        cashMachines[1] = new CashMachine(new double[] {35.00, -11.99});
        cashMachines[2] = new CashMachine(new double[] {1, 29.99});
        cashMachines[3] = new CashMachine(new double[] {1500, 29.99, -11.99});
        cashMachines[4] = new CashMachine(new double[] {0, 29.99, -11.99});
        assertEquals(5, cashMachines.length);
    }

    @Test
    public void shouldHaveOneWithdrawalTransactionsForAllATMs() {
        CashMachine[] cashMachines = new CashMachine[2];
        cashMachines[0] = new CashMachine(new double[] {1});
        cashMachines[1] = new CashMachine(new double[] {1, 29.99, -11.99});
        Bank bank = new Bank(cashMachines);
        assertEquals(1, bank.getWithdrawalNumberForAllATM());
    }

    @Test
    public void shouldHaveTwoWithdrawalTransactionsForAllATMs() {
        CashMachine[] cashMachines = new CashMachine[2];
        cashMachines[0] = new CashMachine(new double[] {1, -50});
        cashMachines[1] = new CashMachine(new double[] {1, 29.99, -11.99});
        Bank bank = new Bank(cashMachines);
        assertEquals(2, cashMachines.length);
        assertEquals(2, bank.getWithdrawalNumberForAllATM());
    }

    @Test
    public void shouldHaveOneDepositTransactionsForAllATMs() {
        CashMachine[] cashMachines = new CashMachine[2];
        cashMachines[0] = new CashMachine(new double[] {1});
        cashMachines[1] = new CashMachine(new double[] {-11.99});
        Bank bank = new Bank(cashMachines);
        assertEquals(1, bank.getDepositNumberForAllATM());
    }

    @Test
    public void shouldHaveTwoDepositTransactionsForAllATMs() {
        CashMachine[] cashMachines = new CashMachine[2];
        cashMachines[0] = new CashMachine(new double[] {100, -50});
        cashMachines[1] = new CashMachine(new double[] {-1, 89.99, -11.99});
        Bank bank = new Bank(cashMachines);
        assertEquals(2, cashMachines.length);
        assertEquals(2, bank.getDepositNumberForAllATM());
    }

    @Test
    public void shouldHaveZeroWithdrawalAverage() {
        CashMachine[] cashMachines = new CashMachine[2];
        cashMachines[0] = new CashMachine(new double[] {});
        cashMachines[1] = new CashMachine(new double[] {});
        Bank bank = new Bank(cashMachines);
        assertEquals(0, bank.getAverageWithdrawal());
    }

    @Test
    public void shouldCalculateWithdrawalAverage() {
        CashMachine[] cashMachines = new CashMachine[2];
        cashMachines[0] = new CashMachine(new double[] {10.67, -45, 10});
        cashMachines[1] = new CashMachine(new double[] {-1067, 10, 45.99});
        Bank bank = new Bank(cashMachines);
        assertEquals(-556.0, bank.getAverageWithdrawal(), 0.01);
    }

    @Test
    public void shouldHaveZeroDepositAverage() {
        CashMachine[] cashMachines = new CashMachine[2];
        cashMachines[0] = new CashMachine(new double[] {});
        cashMachines[1] = new CashMachine(new double[] {});
        Bank bank = new Bank(cashMachines);
        assertEquals(0, bank.getAverageDeposit());
    }

    @Test
    public void shouldCalculateDepositAverage() {
        CashMachine[] cashMachines = new CashMachine[2];
        cashMachines[0] = new CashMachine(new double[] {10.67, -45, 10});
        cashMachines[1] = new CashMachine(new double[] {1067, 10, 45.99});
        Bank bank = new Bank(cashMachines);
        assertEquals(228.73, bank.getAverageDeposit(), 0.01);
    }
}