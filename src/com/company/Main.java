package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("enter yor length");
        int length = sc.nextInt();
        System.out.println("enter your breadth");
        int breadth = sc.nextInt();

        int userArea = area(length,breadth);
        System.out.println(userArea);
    }
    public static int area(int length, int breadth){
        int total = length*breadth;
        return total;
    }
}
