package com.kodilla.bank.homework;

public class Bank {

    private CashMachine balanceOfAllATMs;
    private int withdrawTransactionsNr;
    private CashMachine depositTransactionsNr;
    private CashMachine averageWithdraw;
    private double averageDeposit;

    public Bank(){
        this.balanceOfAllATMs = new CashMachine();
        this.withdrawTransactionsNr = withdrawTransactionsNr;
        this.depositTransactionsNr = new CashMachine();
        this.averageWithdraw = new CashMachine();
        this.averageDeposit = averageDeposit;
    }


    public double getAverageTransaction() {
        return this.averageWithdraw.getAverage();
    }
}
