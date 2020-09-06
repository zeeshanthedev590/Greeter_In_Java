package com.company;
import java.util.Scanner;

public class practise3 {
    public static void main(String[] args) {
        String name;
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        name = sc.next();
        sc.close();
        System.out.println("Hello "+name+" Have A Good Day!!!");
    }
}
