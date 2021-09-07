package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrderByDate(LocalDate startDate, LocalDate endDate) {
        List<Order> results = orders.stream().filter(p -> p.getDateOfOrder().isBefore(endDate) && p.getDateOfOrder().isAfter(startDate)).collect(Collectors.toList());
        return results;
    }

    public List<Order> filterOrders(int minPrice, int maxPrice){
        List<Order> results = orders.stream().filter(p -> p.getValueOfOrder() >= minPrice && p.getValueOfOrder() <= maxPrice).collect(Collectors.toList());
        return results;
    }

    public int getOrderSize() {
        return orders.size();
    }

    public int sumOfOrders() {
        int sum = orders.stream()
                .mapToInt(i -> i.getValueOfOrder())
                .sum();
        return sum;
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addOrder(new Order(100, LocalDate.of(2021, 8, 31), "john6"));
        shop.addOrder(new Order(150, LocalDate.of(2021, 8, 28), "jen59"));
        shop.addOrder(new Order(40, LocalDate.of(2021, 7, 1), "jen59"));
        shop.addOrder(new Order(1000, LocalDate.of(2021, 6, 6), "john6"));
        shop.addOrder(new Order(200, LocalDate.of(2021, 8, 1), "pixisu7"));
        shop.addOrder(new Order(80, LocalDate.of(2021, 5, 3), "eren5"));
        System.out.println(shop.getOrderSize());
        System.out.println(shop.sumOfOrders());
        System.out.println(shop.filterOrders(40, 150));
        System.out.println(shop.getOrderByDate(LocalDate.of(2021, 6, 1), LocalDate.of(2021, 9, 1)));

    }


}
