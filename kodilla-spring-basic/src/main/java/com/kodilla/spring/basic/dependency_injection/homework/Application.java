package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();
        NotificationService notificationService = new NotificationService();

        ShippingCenter delivery = new ShippingCenter(deliveryService, notificationService);

//        ShippingCenter shippingCenter = new ShippingCenter();
        delivery.sendPackage("Hill Street 11, New York", 18.2);
    }
}
