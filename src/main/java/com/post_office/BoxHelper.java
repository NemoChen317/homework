package com.post_office;

import java.util.Scanner;

public class BoxHelper {
    public static void main(String[] args) {
        System.out.print("Please enter object's length: ");
        Scanner scanner = new Scanner(System.in);
        float length = scanner.nextFloat();
        System.out.print("Please enter object's width: ");
        float width = scanner.nextFloat();
        System.out.println("Please enter object's height: ");
        int height = scanner.nextInt();

        if(new NO3Box().validate(length , width , height))
            System.out.println("BOX3");
        else if (new NO5Box().validate(length , width , height))
            System.out.println("BOX5");
        else
            System.out.println("None");
    }
}
