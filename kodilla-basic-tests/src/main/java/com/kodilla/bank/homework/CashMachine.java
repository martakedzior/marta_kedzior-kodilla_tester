package com.kodilla.bank.homework;
import java.util.Arrays;

public class CashMachine {
    double[] transactions;
    private double balance;
    private int size;

    public CashMachine(double[] transactions) {
        this.transactions = transactions;
    }

    public void add(int value) {
        this.size++;
        double[] newTab = new double[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = value;
        this.transactions = newTab;
    }

    public int getNumberOfTransactions() {
        return transactions.length;
    }

    public double[] getTransactions(){
        return transactions;
    }

    public double getBalance(){
        return balance = Arrays.stream(transactions).sum();
    }

    public int getWithdrawalNumber() {
        int number = 0;
        for (int i = 0; i < this.getNumberOfTransactions(); i++) {
            if (this.transactions[i] < 0) {
                number++;
            }
        }
        return number;
    }

    public double getDepositNumber() {
        int number = 0;
        for (int i = 0; i < this.getNumberOfTransactions(); i++) {
            if (this.transactions[i] > 0) {
                number++;
            }
        }
        return number;
    }

    public double getWithdrawalSum() {
        double sum = 0;
        for (int i = 0; i < this.getNumberOfTransactions(); i++) {
            if (this.transactions[i] < 0) {
                sum += this.transactions[i];
            }
        }
        return sum;
    }

    public double getDepositSum() {
        double sum = 0;
        for (int i = 0; i < this.getNumberOfTransactions(); i++) {
            if (this.transactions[i] > 0) {
                sum += this.transactions[i];
            }
        }
        return sum;
    }
}