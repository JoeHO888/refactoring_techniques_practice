package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
    void printOwing(String name, List<Order> orders) {
        Iterator<Order> elements = orders.iterator();
        double outstanding = 0.0;

        // print banner
        printBanner();

        // print owings
        outstanding+=addOutstanding(elements);

        // print details
        printDetails(name,outstanding);
    }
    void printDetails(String name,double outstanding) {
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }

    void printBanner() {
        System.out.println ("*****************************");
        System.out.println ("****** Customer totals ******");
        System.out.println ("*****************************");
    }
    private double addOutstanding(Iterator<Order> elements){
        double increment = 0.0;
        while (elements.hasNext()) {
            Order each = (Order) elements.next();
            increment += each.getAmount();
        }
        return increment;
    }
}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
