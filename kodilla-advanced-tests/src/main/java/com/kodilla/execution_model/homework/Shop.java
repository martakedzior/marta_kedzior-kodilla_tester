package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Shop {
    private Set<Order> orders = new HashSet<>();

    // dodanie nowego zamówienia
    public void addOrder(Order order){
        orders.add(order);
    }

    // zwrócenie listy zamówień z zakresu dwóch dat
    public Set<Order> getOrdersInDateRange(LocalDate fromDate, LocalDate toDate) {
        return orders.stream()
                .filter(d -> d.getOrderDate().isAfter(fromDate) && d.getOrderDate().isBefore(toDate))
                .collect(Collectors.toSet());
    }

    // pobranie zamówień na podstawie przekazanego zakresu (najmniejsza i największa wartość zamówienia)
    public Set<Order> getMinMaxOrder(double minOrderValue, double maxOrderValue) {
        Set<Order> ordersInMinMaxRange = orders.stream()
                .filter(m -> m.getOrderValue() >= minOrderValue && m.getOrderValue() <= maxOrderValue)
                .collect(Collectors.toSet());
        return ordersInMinMaxRange;
    }

    //zwrócenie liczby zamówień
    public int orderNumber() {
        return orders.size();
    }

    //zsumowanie wartości wszystkich zamówień
    public double orderValue() {
        double orderValue = orders.stream()
                .map(u -> u.getOrderValue())
                .mapToDouble(u -> u)
                .sum();
        return orderValue;
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        Order order1 = new Order(45, LocalDate.of(2021, 06, 02), "Adam");
        Order order2 = new Order(100, LocalDate.of(2021, 05, 27),"Maria");
        Order order3 = new Order(150, LocalDate.of(2021, 05, 30),"Anna");
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        System.out.println(shop.orderValue());
        System.out.println(shop.orderNumber());

        System.out.println(shop.getOrdersInDateRange(LocalDate.of(2021, 05, 31), LocalDate.of(2021, 06, 20)));
        System.out.println(shop.getMinMaxOrder(50, 200));
    }
}
