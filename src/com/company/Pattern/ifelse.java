package com.company.Pattern;
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        System.out.println("Enter Your Age:\n");
        int age;
        Scanner sc=new Scanner(System.in);
         age=sc.nextInt();
        if(age>18){
            System.out.println("You are an adult and you can vote!");
        }
        else if(age==18){
            System.out.println("You are supposed to be eligible for voting");
        }
        else{
            System.out.println("You are not eligible for voting");
        }
    }
}
