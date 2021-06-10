package com.kodilla.mockito;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WeatherService {

    private HashMap<Client, Set<Location>> subscribersInLocation = new HashMap<>();


    public void addSubscriber(Client client, Location location) {
        subscribersInLocation.computeIfAbsent(client, k -> new HashSet<>()).add(location);
    }

    public void sendNotificationToAll(WeatherNotification weatherNotification) {
        subscribersInLocation.entrySet()
                .stream()
                .forEach(entry -> entry.getKey().receive(weatherNotification));
    }

    public void sentNotificationToLocation(WeatherNotification weatherNotification, Location location) {
        subscribersInLocation.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(location))
                .forEach(entry -> entry.getKey().receive(weatherNotification));
    }

    public void removeSubscriptionFromLocation(Client client, Location location) {
        this.subscribersInLocation.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equals(client))
                .forEach(entry -> entry.getValue().remove(location));
    }

    public void removeAllSubscriptions(Client client) {
        this.subscribersInLocation.entrySet()
                .removeIf(entry -> (client.equals(entry.getKey())));
    }

    public void removeLocation(Location location) {
        this.subscribersInLocation.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(location))
                .forEach(entry -> entry.getValue().remove(location));
    }
}
