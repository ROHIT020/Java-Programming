package com.company;
import java.util.Scanner;
public class Assign2 {
    public Assign2() {
    }

    static void calculateTax(String name, long income) {
        float x;
        long tax;
        if (income >= 300000L) {
            x = 0.2F * (float) income;
            tax = (long) x;
            System.out.println(name + " : Rs " + tax);
        } else if (income < 300000L && income >= 100000L) {
            x = 0.1F * (float) income;
            tax = (long) x;
            System.out.println(name + " : Rs " + tax);
        } else if (income >= 0L && income < 100000L) {
            System.out.println(name + " : Rs 0");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tax Calculator App\n----- WELCOME ------");
        System.out.print("Enter total person count: ");
        int count = Integer.parseInt(sc.nextLine());
        String[] names = new String[count];
        Long[] income = new Long[count];
        int num = 1;

        int i;
        for (i = 0; i < names.length; ++i) {
            System.out.printf(" Enter name %d : ", num++);
            names[i] = sc.nextLine();
            System.out.printf(" Enter %s's income :  ", names[i]);
            income[i] = sc.nextLong();
            sc.nextLine();
        }

        System.out.println(" ");
        System.out.println("Names with liable taxes\n—————————————");

        for (i = 0; i < names.length; ++i) {
            calculateTax(names[i], income[i]);
        }

    }
}
