package com.kodilla.stream.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("2323"));

        try {
            warehouse.getOrder("4");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order doesn't exist.");
        }

    }
}
