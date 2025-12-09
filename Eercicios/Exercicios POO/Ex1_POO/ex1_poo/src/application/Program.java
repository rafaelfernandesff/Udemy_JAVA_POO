package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

    public static void main(String[] args) {
     
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();


        System.out.println("Enter rectangle widht and height:");
        rect.width = sc .nextDouble();
        rect.height = sc.nextDouble();

        System.out.println(rect);
        
        sc.close();
    }
}
