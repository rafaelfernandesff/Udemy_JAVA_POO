package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String clientBirth = sc.nextLine();
        System.out.println();

        Client c = new Client(clientName, clientEmail, sdf.parse(clientBirth));

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String orderStatus = sc.nextLine();
        System.out.print("How many items to this order?  ");
        Integer n =  sc.nextInt();

        Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus), c);

        for (int i=1;i<=n;i++) {

            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();

            Product p = new Product(productName, productPrice);
            OrderItem oi = new OrderItem(productQuantity, p.getPrice(), p);
            order.addItem(oi);

        } 


        System.out.println();
        System.out.println(order);
        


        sc.close();
    }



}
