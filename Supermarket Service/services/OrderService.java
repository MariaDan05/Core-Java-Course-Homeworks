package services;
import convertor.CustomerConvertor;
import customer.Customer;
import order.Order;
import food.*;

import java.util.Scanner;

public class OrderService {
    public Order createOrder() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of costumer 1-5:");
        int num = s.nextInt();
        String[] strings = FileService.readLines("project\\java\\OOP\\customers.txt");
        Customer[] customers = CustomerConvertor.customerConvertor(strings);
        Customer customer = customers[num];

        System.out.println("Enter order number:");
        int orderNumber = s.nextInt();

        System.out.println("Enter number of purchased food products");
        int numberOfPurchasedProducts = s.nextInt();

        System.out.println("Enter the ordered food products:");
        FoodProducts[] foodProducts = new FoodProducts[numberOfPurchasedProducts];
        for (int i = 0; i < foodProducts.length; i++) {
            System.out.println("Enter the product you purchased(Sweets/Bakery):");
            String category = s.next();
            if(category.equals("Sweets")) {
                System.out.println("Enter category of Sweets(Chocolate/Jelly)");
                String category1 = s.next();
                if(category1.equals("Chocolate")) {
                    ChocolateService chocolateService = new ChocolateService();
                    foodProducts[i] = chocolateService.createChocolate();
                } else if(category1.equals("Jelly")){
                    JellyService jellyService = new JellyService();
                    foodProducts[i] = jellyService.createJelly();
                }
            } else if(category.equals("Bakery")){
                System.out.println("Enter category of Bakery(Cake/Bread)");
                String category1 = s.next();
                if(category1.equals("Cake")){
                    CakeService cakeService = new CakeService();
                    foodProducts[i] = cakeService.createCake();
                } else if(category1.equals("Bread")) {
                    BreadService breadService = new BreadService();
                    foodProducts[i] = breadService.createBread();
                }
            }
        }

        return new Order(customer, orderNumber, numberOfPurchasedProducts, foodProducts);
    }
}
