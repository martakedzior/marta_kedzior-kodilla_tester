package com.kodilla.stream.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WarehouseTest {

    @Test
    public void testDoesOrderExist() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        warehouse.addOrder(new Order("45"));
        //then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("59"), "Sorry, order number does not exist");
    }

}