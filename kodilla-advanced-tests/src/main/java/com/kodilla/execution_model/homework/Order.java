package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private double orderValue;
    private LocalDate orderDate;
    private String personOrder;

    public Order(double orderValue, LocalDate orderDate, String personOrder) {
        this.orderValue = orderValue;
        this.orderDate = orderDate;
        this.personOrder = personOrder;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
    public String getPersonOrder() {
        return personOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.orderValue, orderValue) == 0 && Objects.equals(orderDate, order.orderDate) && Objects.equals(personOrder, order.personOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderValue, orderDate, personOrder);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderValue=" + orderValue +
                ", orderDate=" + orderDate +
                ", personOrder='" + personOrder + '\'' +
                '}';
    }
}
