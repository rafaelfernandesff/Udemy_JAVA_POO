package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {


    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

    private Date moment;
    private OrderStatus status;

    private Client client;

    private List<OrderItem> itens = new ArrayList<>();


    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    
    public void addItem(OrderItem item) {
        itens.add(item);
    }
    
    public void removeItem(OrderItem item) {
        itens.remove(item);
    }
    
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double total() {
        double sum = 0;
        for (OrderItem i : itens) {
            sum += i.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order Status: " + status + "\n");
        sb.append("Client: ");
        sb.append(client.getName() + " (" + sdf2.format(client.getBirthDate()) + ")" + " - " + client.getEmail() + "\n");
        sb.append("Order itens: \n");

        for (OrderItem i : itens) {
            sb.append(i.getProduct().getName() + ", $");
            sb.append(String.format("%.2f", i.getPrice()) + ", Quantity: ");
            sb.append(i.getQuantity() + ", Subtotal: $");
            sb.append(i.subTotal() + "\n");
        }

        sb.append("Total price : $");
        sb.append(total());

        return sb.toString();

    }

}

