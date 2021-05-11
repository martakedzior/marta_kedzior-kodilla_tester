package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<String> students = new ArrayList<>();

    public School(String schoolName, String... students) {
        this.schoolName = schoolName;
        for (String student : students)
            this.students.add(student);
    }

    public int getNumber(){
        return students.size();
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
