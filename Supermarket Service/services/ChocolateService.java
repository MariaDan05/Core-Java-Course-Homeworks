package services;
import food.Chocolate;

import java.util.Scanner;

public class ChocolateService {
    public Chocolate createChocolate() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter brand of chocolate:");
        String name = s.next();

        System.out.println("Enter the price of chocolate:");
        double price = s.nextDouble();

        System.out.println("Enter calories in 100g:");
        int calories = s.nextInt();

        System.out.println("Enter percentage of sugar:");
        double percentageOfSugar = s.nextDouble();

        System.out.println("Is chocolate dark?: y/n");
        boolean isDarkChocolate = s.next().charAt(0) == 'y';

        Chocolate chocolate = new Chocolate(name, price, calories);
        chocolate.setPercentageOfSugar(percentageOfSugar);
        chocolate.setDarkChocolate(isDarkChocolate);
        return chocolate;
    }

    //1. Print all not dark and price more than 6$ chocolates
    public void printAllNotDarkPriceMoreThan6$(Chocolate[] chocolates){
        boolean b = false;
        for (Chocolate chocolate : chocolates) {
            if(!chocolate.isDarkChocolate() && chocolate.getPrice() > 6) {
                chocolate.printInfo();
                b = true;
            }
        }
        if (!b){
            System.out.println("There is no such chocolate.");
        }
    }

    //2. Return chocolate with the most calories from array
    public Chocolate withMostCalories(Chocolate[] chocolates) {
        Chocolate maxCalories = chocolates[0];
        for (int i = 0; i < chocolates.length; i++) {
            if(chocolates[i].getCalories() > maxCalories.getCalories()){
                maxCalories = chocolates[i];
            }
        }
        return maxCalories;
    }

    //3. Print Chocolates in ascending form order by price
    public void printInAscOrderByPrice(Chocolate[] chocolates) {
        boolean isActive = true;
        int count = 0;
        while(isActive){
            isActive = false;
            for (int i = 0; i < chocolates.length - 1 - count; i++) {
                if (chocolates[i].getPrice() > chocolates[i + 1].getPrice()) {
                    Chocolate temp = chocolates[i];
                    chocolates[i] = chocolates[i + 1];
                    chocolates[i + 1] = temp;
                    isActive = true;
                }
            }
            ++count;
        }
        for(Chocolate chocolate : chocolates){
            chocolate.printInfo();
        }
    }
}
