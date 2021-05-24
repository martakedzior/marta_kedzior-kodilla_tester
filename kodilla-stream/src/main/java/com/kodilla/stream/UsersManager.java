package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(u -> u.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());                        // [2]
        System.out.println(usernames);
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}
