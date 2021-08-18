package com.kodilla.optional.homework;

import java.util.Objects;

public class Teacher {
    private String name;

    public String getTeacherName() {
        return name;
    }

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
