package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ShippingCenterTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    ShippingCenter shippingCenterBean = context.getBean(ShippingCenter.class);

    @Test
    public void shouldDeliverWhenPackagesWeightIsUnderOrEqual30kg() {
        String delivered = shippingCenterBean.sendPackage("Krakow", 29);
        assertEquals("Package delivered to: Krakow", delivered);
    }

    @Test
    public void shouldNotDeliverWhenPackagesWeightIsAbove30kg() {
        String delivered = shippingCenterBean.sendPackage("Warszawa", 31);
        assertEquals("Package not delivered to: Warszawa", delivered);
    }

}