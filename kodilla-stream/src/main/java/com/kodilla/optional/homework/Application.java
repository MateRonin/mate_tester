package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Teacher teacher1 = new Teacher("Severus");
        Teacher teacher2 = new Teacher("Remus");
        Teacher teacherNull = null;
        Student student1 = new Student("Harry", teacher1);
        Student student2 = new Student("Ronald", teacher2);
        Student student3 = new Student("Hermiona", null);
        Student student4 = new Student("Draco", null);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        for (Student student: students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            Teacher isNull = optionalTeacher.orElse(new Teacher("<unidentified>"));
            System.out.println("Student: " + student.getName() + " Teacher: " + isNull.getTeacherName());
        }

    }
}
