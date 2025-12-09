package aplication;

import java.util.Locale;
import java.util.Scanner;
import emtitis.Triangulo;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Enter the measures of triangle x:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        
        System.out.println("Enter the measures of triangle y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Triangle x area: %.4f\n", areaX);
        System.out.printf("Triangle y area: %.4f\n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area: x");
        }
        else {
            System.out.println("Larger area: y");
        }

        sc.close();
    }

}
