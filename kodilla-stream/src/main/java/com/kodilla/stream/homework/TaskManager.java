package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> tasknames = TaskRepository.getTasks()
                .stream()
                .filter(t -> t.getDeadline().isAfter(LocalDate.now()))
                .map(TaskManager::getTaskDeadline)
                .collect(Collectors.toList());
        System.out.println("Tasks deadlines ->>> " + tasknames);

    }

    public static String getTaskName(Task task) {
        return task.getName();
    }

    public static LocalDate getTaskDeadline(Task task) {
        return task.getDeadline();
    }
}
