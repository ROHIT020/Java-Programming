package com.company;
import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args)
    {
        String Yourgroup = "group";

        System.out.println("Enter Name: ");
        Scanner name = new Scanner(System.in);
        String urname = name.nextLine();

        System.out.println("Age: ");
        Scanner Age = new Scanner(System.in);
        int urage = Integer.parseInt(Age.nextLine());

        if(  urage >= 20)
        {
            Yourgroup = "RED";
        }
        else if (urage>=15 && urage<20)
        {
            Yourgroup = "BLUE";
        }

        else if (urage>=10 && urage<15)
        {
            Yourgroup = "YELLOW";
        }

        System.out.println("Blood groop: ");
        Scanner Bloodgroup = new Scanner(System.in);
        String urBloodgroup = Bloodgroup.nextLine();

        System.out.println();

        System.out.println("----------------------");
        System.out.println("Name: " + urname);
        System.out.println("Age: " + urage);
        System.out.println("Blood group: " + urBloodgroup);
        System.out.println("----------------------");
        System.out.println("Your group: " + Yourgroup);
        System.out.println("----------------------");





    }
}