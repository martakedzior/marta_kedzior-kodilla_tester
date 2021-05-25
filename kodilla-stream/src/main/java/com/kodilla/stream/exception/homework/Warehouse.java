package com.kodilla.stream.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Order> orderList  = new ArrayList<>();

    public List<Order> addOrder(Order order) {
        orderList.add(order);
        return orderList;
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return orderList
                .stream()
                .filter(o -> o.getNumber().equals(number))
                .findFirst()
                .orElseThrow(OrderDoesntExistException::new);
    }
}
