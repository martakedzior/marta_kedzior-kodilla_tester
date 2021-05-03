package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void testAtmBalance() {
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine.add(1000);
        cashMachine2.add(-100);



        Bank bank = new Bank();
        double allAtmBalance = bank.AtmBalance();
        assertEquals(0, allAtmBalance);
    }
}
