package main;
import convertor.*;
import customer.Customer;
import food.Bread;
import food.Cake;
import food.Chocolate;
import food.Jelly;
import order.Order;
import services.*;

import java.util.Scanner;

public class SupermarketTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //FileService.createFolder("project\\java\\OOP");
        //FileService.createFile("project\\java\\OOP", "customers.txt");
        //FileService.write("project\\java\\OOP\\customers.txt", "0.Hayk,Arabyan,hayk.arabyan@gmail.com,+37491811122");
        //FileService.write("project\\java\\OOP\\customers.txt", "\n1.Sevak,Nalbandyan,sevak.nalbandyan@gmail.com,+37491898122");
        //FileService.write("project\\java\\OOP\\customers.txt", "\n2.Anna,Davtyan,anna.davtyan@gmail.com,+37434811452");
        //FileService.write("project\\java\\OOP\\customers.txt", "\n3.Nana,Hakobyan,nana.hakobyan@gmail.com,+37423845122");
        //FileService.write("project\\java\\OOP\\customers.txt", "\n4.Kim,C,kim.c@gmail.com,+37498819822");
        //System.out.println();

        String[] strings = FileService.readLines("project\\java\\OOP\\customers.txt");
        Customer[] customers = CustomerConvertor.customerConvertor(strings);


        //FileService.createFile("project\\java\\OOP", "chocolates.txt");
        //FileService.write("project\\java\\OOP\\chocolates.txt", "0.RitterSport,5.6,289,true");
        //FileService.write("project\\java\\OOP\\chocolates.txt", "\n1.AlpenGold,3.4,200,false");
        //FileService.write("project\\java\\OOP\\chocolates.txt", "\n2.Milka,2.0,134,false");
        //FileService.write("project\\java\\OOP\\chocolates.txt", "\n3.Toblerone,6.8,210,true");

        String[] strings1 = FileService.readLines("project\\\\java\\\\OOP\\chocolates.txt");
        Chocolate[] chocolates = ChocolateConvertor.chocolateConvertor(strings1);


        //FileService.createFile("project\\java\\OOP", "jellies.txt");
        //FileService.write("project\\java\\OOP\\jellies.txt", "0.TuttiFrutti,1.2,50,yellow");
        //FileService.write("project\\java\\OOP\\jellies.txt", "\n1.Mamba,1.0,26,red");
        //FileService.write("project\\java\\OOP\\jellies.txt", "\n2.Mj,2.2,21,blue");
        //FileService.write("project\\java\\OOP\\jellies.txt", "\n3.ASA,7.0,12,purple");

        String[] strings2 = FileService.readLines("project\\\\java\\\\OOP\\jellies.txt");
        Jelly[] jellies = JellyConvertor.jellyConvertor(strings2);


        //FileService.createFile("project\\java\\OOP", "cakes.txt");
        //FileService.write("project\\java\\OOP\\cakes.txt", "0.ChocolateCake,10.5,300,true");
        //FileService.write("project\\java\\OOP\\cakes.txt", "\n1.CheeseCake,20.7,360,false");
        //FileService.write("project\\java\\OOP\\cakes.txt", "\n2.StrawberryCake,22.2,400,false");
        //FileService.write("project\\java\\OOP\\cakes.txt", "\n3.AppleChocolateCake,17.4,430,true");

        String[] strings3 = FileService.readLines("project\\\\java\\\\OOP\\cakes.txt");
        Cake[] cakes = CakeConvertor.cakeConvertor(strings3);


        //FileService.createFile("project\\java\\OOP", "breads.txt");
        //FileService.write("project\\java\\OOP\\breads.txt", "0.YerevanFactory,0.5,12,white");
        //FileService.write("project\\java\\OOP\\breads.txt", "\n1.GyumriFactory,1.3,30,black");
        //FileService.write("project\\java\\OOP\\breads.txt", "\n2.LoriFactory,0.7,20,lavash");
        //FileService.write("project\\java\\OOP\\breads.txt", "\n3.AshtarakFactory,2.0,21,black");

        String[] strings4 = FileService.readLines("project\\\\java\\\\OOP\\breads.txt");
        Bread[] breads = BreadConvertor.breadConvertor(strings4);


        //Creating order and notifying customer with email
        boolean bool = true;
        outerloop:
        while (bool) {
            System.out.println("All customers: ");
            System.out.println(FileService.read("project\\\\java\\\\OOP\\\\customers.txt"));
            System.out.println();

            System.out.println("Enter number of costumer 0-4:");
            int num = s.nextInt();
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
                        bool  = false;
                        break outerloop;
                    }
                    default:
                        System.out.println("Invalid category");
                        break;
                }
            }

            Order order = new Order(customer,orderNumber,numberOfPurchasedProducts,foodProducts);
            System.out.println(order.toEmail());
            System.out.println();
        }


        System.out.println();
        System.out.println("Information about customers:");
        boolean isMenuActive1 = true;
        while(isMenuActive1) {
            System.out.println("Enter command number:");
            System.out.println("1. Print the all customers with first name \"Anna\"");
            System.out.println("2. Print all customers in asc form order by length of last name");
            System.out.println("3. Exit");
            CustomerService customerService = new CustomerService();
            int num = s.nextInt();
            switch (num) {
                case 1:
                    customerService.printAllAnnas(customers);
                    break;
                case 2:
                    customerService.printInAscOrderByLastName(customers);
                    break;
                case 3:
                    isMenuActive1 = false;
                    break;
                default:
                    System.out.println("Invalid command number.");
            }
            System.out.println();
        }


        boolean isMenuActive = true;
        while (isMenuActive) {
            System.out.println("Choose the category of the product you want to find out more info:(Sweets/Bakery)");
            String category = s.next();
            if (category.equals("Sweets")) {
                System.out.println("Enter category of Sweets you want to find out more info (Chocolate/Jelly)");
                String category1 = s.next();
                if (category1.equals("Chocolate")) {
                    ChocolateService chocolateService = new ChocolateService();
                    boolean b = true;
                    while (b) {
                        System.out.println("Enter command number:");
                        System.out.println("1. Print all not dark and price more than 6$ chocolates");
                        System.out.println("2. Return chocolate with the most calories from array");
                        System.out.println("3. Print Chocolates in ascending form order by price");
                        System.out.println("4. Exit");
                        int num = s.nextInt();
                        switch (num) {
                            case 1:
                                chocolateService.printAllNotDarkPriceMoreThan6$(chocolates);
                                break;
                            case 2:
                                Chocolate chocolate = chocolateService.withMostCalories(chocolates);
                                chocolate.printInfo();
                                break;
                            case 3:
                                chocolateService.printInAscOrderByPrice(chocolates);
                                break;
                            case 4:
                                b = false;
                                break;
                            default:
                                System.out.println("Invalid command number.");
                        }
                        System.out.println();
                    }
                } else if (category1.equals("Jelly")) {
                    JellyService jellyService = new JellyService();
                    boolean b1 = true;
                    while(b1) {
                        System.out.println("Enter command number:");
                        System.out.println("1. Print all pink and calories more than 350 jellies");
                        System.out.println("2. Return the cheapest jelly from array");
                        System.out.println("3. Print Jellies in descending form order by calories");
                        System.out.println("4. Exit");
                        int num = s.nextInt();
                        switch (num) {
                            case 1:
                                jellyService.printAllPinkCaloriesMoreThan350(jellies);
                                break;
                            case 2:
                                Jelly jelly = jellyService.cheapestJelly(jellies);
                                jelly.printInfo();
                                break;
                            case 3:
                                jellyService.printInDescOrderByCalories(jellies);
                                break;
                            case 4:
                                b1 = false;
                                break;
                            default:
                                System.out.println("Invalid command number.");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Invalid category");
                }
            } else if (category.equals("Bakery")) {
                System.out.println("Enter category of Bakery you want to find out more info (Cake/Bread)");
                String category1 = s.next();
                if (category1.equals("Cake")) {
                    CakeService cakeService = new CakeService();
                    boolean b2 = true;
                    while (b2) {
                        System.out.println("Enter command number:");
                        System.out.println("1. Print all chocolate and price less than 20$ cakes");
                        System.out.println("2. Return the cake with less calories");
                        System.out.println("3. Print chocolate Cakes in asc form order by calories");
                        System.out.println("4. Exit");
                        int num = s.nextInt();
                        switch (num) {
                            case 1:
                                cakeService.printAllChocolatePriceLessThan20$(cakes);
                                break;
                            case 2:
                                Cake cake = cakeService.lessCaloriesCake(cakes);
                                cake.printInfo();
                                break;
                            case 3:
                                cakeService.printInAscOrderByCalories(cakes);
                                break;
                            case 4:
                                b2 = false;
                                break;
                            default:
                                System.out.println("Invalid command number.");
                        }
                        System.out.println();
                    }
                } else if (category1.equals("Bread")) {
                    BreadService breadService = new BreadService();
                    boolean b3 = true;
                    while (b3) {
                        System.out.println("Enter command number:");
                        System.out.println("1. Print all breads with type lavash and price more than 3$");
                        System.out.println("2. Return the bread with most calories");
                        System.out.println("3. Print white Breads in desc form order by price");
                        System.out.println("4. Exit");
                        int num = s.nextInt();
                        switch (num) {
                            case 1:
                                breadService.printLvashPriceMoreThan3$(breads);
                                break;
                            case 2:
                                Bread bread = breadService.mostCaloriesBread(breads);
                                bread.printInfo();
                                break;
                            case 3:
                                breadService.printInDescOrderByCalories(breads);
                                break;
                            case 4:
                                b3 = false;
                                break;
                            default:
                                System.out.println("Invalid command number.");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Invalid category");
                }
            } else {
                System.out.println("Invalid category");
                isMenuActive = false;
                break;
            }
        }
    }
}
