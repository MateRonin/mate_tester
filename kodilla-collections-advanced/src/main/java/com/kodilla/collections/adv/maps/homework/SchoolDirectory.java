package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> headmaster = new HashMap<>();

        Principal dumbledore = new Principal("Albus Dumbledore");
        Principal xavier = new Principal("Charles Francis Xavier");
        Principal vesemir = new Principal("Vesemir");

        School hogwart = new School("Hogwarts School of Witchcraft and Wizardry", 10, 20, 15, 20);
        School gifted = new School("Xavier's School for Gifted Youngsters", 12, 15, 30, 7, 5);
        School kaer = new School("Kaer Morhen Witchers School of Wolf Style", 14, 12, 30, 8, 23);



        headmaster.put(dumbledore, hogwart);
        headmaster.put(xavier, gifted);
        headmaster.put(vesemir, kaer);


        for (Map.Entry<Principal, School> headmasterEntry : headmaster.entrySet())
            System.out.println(headmasterEntry.getKey().getPrincipalName() + ", is principal of " +
                    headmasterEntry.getValue().getSchoolName() + ". Number of principals school students is: " + headmasterEntry.getValue().sumOfStudents());
    }
}
