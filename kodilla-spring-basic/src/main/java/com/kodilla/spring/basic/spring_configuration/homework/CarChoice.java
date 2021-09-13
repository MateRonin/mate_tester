package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class CarChoice {

    private Car car;

    @Bean
    public Car chooseCar() {
        if (LocalDate.now().getMonthValue() >=1 || LocalDate.now().getMonthValue() <=3) {
            car = new SUV();

        } else if (LocalDate.now().getMonthValue() >=7 || LocalDate.now().getMonthValue() <=9) {
            car = new Cabrio();

        } else {
            car = new Sedan();
        }
        return car;
    }
}








