package services;
import food.Jelly;

import java.util.Scanner;

public class JellyService {
    public Jelly createJelly() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter brand of jelly:");
        String name = s.next();

        System.out.println("Enter the price of jelly:");
        double price = s.nextDouble();

        System.out.println("Enter calories in 100g:");
        int calories = s.nextInt();

        System.out.println("Enter percentage of sugar:");
        double percentageOfSugar = s.nextDouble();

        System.out.println("Color:");
        String color = s.next();

        Jelly jelly = new Jelly(name, price, calories);
        jelly.setPercentageOfSugar(percentageOfSugar);
        jelly.setColor(color);
        return jelly;
    }

    //1. Print all pink and calories more than 350 jellies
    public void printAllPinkCaloriesMoreThan350(Jelly[] jellies){
        boolean b = false;
        for (Jelly jelly : jellies) {
            if(jelly.getColor().equals("pink") && jelly.getCalories() > 350) {
                jelly.printInfo();
                b = true;
            }
        }
        if (!b){
            System.out.println("There is no such jelly.");
        }
    }

    //2. Return the cheapest jelly from array
    public Jelly cheapestJelly(Jelly[] jellies) {
        Jelly minPrice = jellies[0];
        for(int i = 0; i < jellies.length; i++) {
            if(jellies[i].getPrice() < minPrice.getPrice()){
                minPrice = jellies[i];
            }
        }
        return minPrice;
    }

    //3. Print Jellies in descending form order by calories
    public void printInDescOrderByCalories(Jelly[] jellies) {
        boolean isActive = true;
        int count = 0;
        while(isActive){
            isActive = false;
            for (int i = 0; i < jellies.length - 1 - count; i++) {
                if (jellies[i].getCalories() < jellies[i + 1].getCalories()) {
                    Jelly temp = jellies[i];
                    jellies[i] = jellies[i + 1];
                    jellies[i + 1] = temp;
                    isActive = true;
                }
            }
            ++count;
        }
        for(Jelly jelly : jellies){
            jelly.printInfo();
        }
    }

}
