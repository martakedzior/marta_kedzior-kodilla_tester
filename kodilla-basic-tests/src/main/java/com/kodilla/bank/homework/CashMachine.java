package com.kodilla.bank.homework;

import java.util.Arrays;

public class CashMachine {
    private double[] transactions;
    private double balance;
    private int size;

    public CashMachine() {
        this.balance = 0;
        this.size = 0;
        this.transactions = new double[0];
    }

    public void add(int value) {
        this.size++;
        double[] newTab = new double[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = value;
        this.transactions = newTab;
    }

    public double[] getTransactions(){
        return transactions;
    }

    public double getBalance(){
        return balance = Arrays.stream(transactions).sum();
    }

    public int getNumberOfTransactions(){
        return transactions.length;
    }

    public double getAverage() {
        double sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum/this.transactions.length;
    }
}
