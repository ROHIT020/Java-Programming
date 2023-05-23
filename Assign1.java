package com.company;
import java.util.Scanner;
public class Assign1 {
        public Assign1() {
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name:");
            String name = sc.nextLine();
            System.out.println("Enter your age:");
            int age = sc.nextInt();
            System.out.println("Enter your Blood Group:");
            char bldgrp = sc.next().charAt(0);
            System.out.println("Enter your group:");
            char group = sc.next().charAt(0);
            if (age >= 20) {
                System.out.println("Belongs to RED Group" + group);
            } else if (15 > age && age > 20) {
                if (10 > age && age > 15) {
                    System.out.println("Invalid Group");
                } else {
                    System.out.println("Belongs to YELLOW Group" + group);
                }
            } else {
                System.out.println("Belongs to BLUE Group" + group);
            }

            System.out.println("STUDENT IDCARD:" + name + age + bldgrp + group);
        }
    }
