package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Zrobić pranie", LocalDate.of(2021, 05, 20), LocalDate.of(2021, 05, 25)));
        tasks.add(new Task("Zatankować samochód", LocalDate.of(2021, 05, 20), LocalDate.of(2021, 05, 26)));
        tasks.add(new Task("Zapłacić rachunki", LocalDate.of(2021, 05, 01), LocalDate.of(2021, 05, 10)));
        return tasks;
    }
}
