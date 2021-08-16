package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        LocalDate myDate = LocalDate.of(2021, 8, 15);
        LocalDate myDate2 = LocalDate.of(2021, 8, 17);
        LocalDate myDate3 = LocalDate.of(2021, 8, 18);
        LocalDate myDate4 = LocalDate.of(2021, 8, 19);
        tasks.add(new Task("feed Eren", myDate, myDate));
        tasks.add(new Task("feed Majka", myDate2, myDate2));
        tasks.add(new Task("play The Ascent", myDate3, myDate3));
        tasks.add(new Task("play Nier", myDate4, myDate4));
        return tasks;
    }


}
