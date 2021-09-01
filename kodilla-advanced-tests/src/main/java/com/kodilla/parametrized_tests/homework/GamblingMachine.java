package com.kodilla.parametrized_tests.homework;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GamblingMachine {

    public int howManyWins(Set<Integer> userNumbers) throws InvalidNumbersException {
        validateNumbers(userNumbers);
        Set<Integer> computerNumbers = generateComputerNumbers();
        int count = 0;
        for (Integer number : userNumbers) {
            if (computerNumbers.contains(number)) {
                count++;
            }
        }
        return count;
    }

    private void validateNumbers(Set<Integer> numbers) throws InvalidNumbersException {
        if (numbers.size() != 6) {
            throw new InvalidNumbersException();
        }

        if (numbers.stream().anyMatch(number -> number < 1 || number > 49)) {
            throw new InvalidNumbersException();
        }
    }

    private Set<Integer> generateComputerNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random generator = new Random();
        while(numbers.size() < 6) {
            numbers.add(generator.nextInt(49) + 1);
        }
        return numbers;
    }

    public static void main(String[] args) throws InvalidNumbersException {
        Set<Integer> userNumbers = new HashSet<>();
        GamblingMachine machine = new GamblingMachine();
        userNumbers.add(1);
        userNumbers.add(2);
        userNumbers.add(3);
        userNumbers.add(4);
        userNumbers.add(5);
        userNumbers.add(6);
        System.out.println(machine.howManyWins(userNumbers));
    }

}