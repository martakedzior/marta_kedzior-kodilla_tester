package com.kodilla.bank.homework;

public class Bank {
    CashMachine[] bankCashMachines;

    public Bank(CashMachine[] bankCashMachines){
        this.bankCashMachines = bankCashMachines;
    }

    public double getBalanceBank() {

        double sum = 0;
        for (int i = 0; i < this.bankCashMachines.length; i++){
            sum += this.bankCashMachines[i].getBalance();
        }
        return sum;
    }

    public int getDepositNumberForAllATM() {

        int number = 0;
        for (int i = 0; i < this.bankCashMachines.length; i++){
            number += this.bankCashMachines[i].getDepositNumber();
        }
        return number;
    }

    public int getWithdrawalNumberForAllATM(){
        int number = 0;
        for (int i = 0; i < this.bankCashMachines.length; i++){
            number += this.bankCashMachines[i].getWithdrawalNumber();
        }
        return number;
    }

    public double getAverageWithdrawal() {
        double sum = 0;
        int number = 0;
        for (int i = 0; i < this.bankCashMachines.length; i++) {
            number += this.bankCashMachines[i].getWithdrawalNumber();
            sum += this.bankCashMachines[i].getWithdrawalSum();
        }
        if(number == 0)
            return 0;
        return sum / number;
    }

    public double getAverageDeposit() {
        double sum = 0;
        int number = 0;
        for (int i = 0; i < this.bankCashMachines.length; i++) {
            number += this.bankCashMachines[i].getDepositNumber();
            sum += this.bankCashMachines[i].getDepositSum();
        }
        if(number == 0)
            return 0;
        return sum / number;
    }

    public static void main(String[] args) {
        CashMachine[] bankCashMachines = new CashMachine[3];
        bankCashMachines[0] = new CashMachine(new double[] {1000, 0.99});
        bankCashMachines[1] = new CashMachine(new double[] {1000, -2500});
        bankCashMachines[2] = new CashMachine(new double[] {1000, 450, -34});

        Bank bank = new Bank(bankCashMachines);

        System.out.println("Ca??kowity bilans transakcji ze wszystkich bankomat??w: " + bank.getBalanceBank());
        System.out.println("Liczba transakcji zwi??zanych z wyp??at?? pieni??dzy: " + bank.getWithdrawalNumberForAllATM());
        System.out.println("Liczba transakcji zwi??zanych z wp??at?? pieni??dzy: " + bank.getDepositNumberForAllATM());
        System.out.println("Srednia warto???? wyp??aty: " + bank.getAverageWithdrawal());
        System.out.println("Srednia warto???? wp??aty: " + bank.getAverageDeposit());
    }
}