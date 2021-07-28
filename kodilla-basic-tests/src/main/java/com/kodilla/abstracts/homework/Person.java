package com.kodilla.abstracts.homework;

public class Person {
    private String name;
    private int age;
    private Job job;

    public Person(String name, int age, Job job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {
        Job tester = new Tester();
        Job lawyer = new Lawyer();
        Job doctor = new Doctor();

        Person person1 = new Person("Janusz's", 40, doctor);
        Person person2 = new Person("Paulina's", 28,tester);
        Person person3 = new Person("George's", 32, lawyer);
        System.out.println(person1.name + " job responsibilities are: " + doctor.getResponsibilities());
        System.out.println(person2.name + " job responsibilities are: " + tester.getResponsibilities());
        System.out.println(person3.name + " job responsibilities are: " + lawyer.getResponsibilities());

        }

    }


