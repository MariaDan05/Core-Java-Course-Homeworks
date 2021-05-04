package services;
import convertor.CustomerConvertor;
import customer.Customer;
import order.Order;
import food.*;

import java.util.Scanner;

public class OrderService {
    public Order createOrder() {
        Scanner s = new Scanner(System.in);

        String[] strings1 = FileService.readLines("project\\\\java\\\\OOP\\chocolates.txt");
        Chocolate[] chocolates = ChocolateConvertor.chocolateConvertor(strings1);
        String[] strings2 = FileService.readLines("project\\\\java\\\\OOP\\jellies.txt");
        Jelly[] jellies = JellyConvertor.jellyConvertor(strings2);
        String[] strings3 = FileService.readLines("project\\\\java\\\\OOP\\cakes.txt");
        Cake[] cakes = CakeConvertor.cakeConvertor(strings3);
        String[] strings4 = FileService.readLines("project\\\\java\\\\OOP\\breads.txt");
        Bread[] breads = BreadConvertor.breadConvertor(strings4);

        System.out.println("Enter number of costumer 1-5:");
        int num = s.nextInt();
        String[] strings = FileService.readLines("project\\java\\OOP\\customers.txt");
        Customer[] customers = CustomerConvertor.customerConvertor(strings);
        Customer customer = customers[num];

        System.out.println("Enter order number(100-10000):");
        int orderNumber = s.nextInt();

        System.out.println("Enter number of food products you want to order:");
        int numberOfPurchasedProducts = s.nextInt();

        FoodProducts[] foodProducts = new FoodProducts[numberOfPurchasedProducts];
        for (int i = 0; i < foodProducts.length; i++) {
            System.out.println("Choose the category you want to order from(Chocolate/Jelly/Cake/Bread)");
            String ss = s.next();
            switch (ss) {
                case "Chocolate": {
                    System.out.println("All chocolates:");
                    System.out.println(FileService.read("project\\\\java\\\\OOP\\\\chocolates.txt"));
                    System.out.println("Enter the number of chocolate you want to order:");
                    int n = s.nextInt();
                    foodProducts[i] = chocolates[n];
                    break;
                }
                case "Jelly": {
                    System.out.println("All jellies:");
                    System.out.println(FileService.read("project\\\\java\\\\OOP\\\\jellies.txt"));
                    System.out.println("Enter the number of jelly you want to order:");
                    int n = s.nextInt();
                    foodProducts[i] = jellies[n];
                    break;
                }
                case "Cake": {
                    System.out.println("All cakes:");
                    System.out.println(FileService.read("project\\\\java\\\\OOP\\\\cakes.txt"));
                    System.out.println("Enter the number of cake you want to order:");
                    int n = s.nextInt();
                    foodProducts[i] = cakes[n];
                    break;
                }
                case "Bread": {
                    System.out.println("All breads:");
                    System.out.println(FileService.read("project\\\\java\\\\OOP\\\\breads.txt"));
                    System.out.println("Enter the number of bread you want to order:");
                    int n = s.nextInt();
                    foodProducts[i] = breads[n];
                    break;
                }
                case "Exit": {
                    break;
                }
                default:
                    System.out.println("Invalid category");
                    break;
            }
        }

        return new Order(customer, orderNumber, numberOfPurchasedProducts, foodProducts);
    }
}
