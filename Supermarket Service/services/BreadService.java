package services;
import food.Bread;

import java.util.Scanner;

public class BreadService {
    public Bread createBread() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter brand of bread:");
        String name = s.next();

        System.out.println("Enter the price of bread:");
        double price = s.nextDouble();

        System.out.println("Enter calories in 100g:");
        int calories = s.nextInt();

        System.out.println("Type of bread: (white/black/lavash)");
        String type = s.next();

        Bread bread = new Bread(name, price, calories);
        bread.setType(type);
        return bread;
    }

    //1. Print all breads with type lavash and price more than 3$
    public void printLvashPriceMoreThan3$(Bread[] breads){
        boolean b = false;
        for (Bread bread : breads) {
            if(bread.getType().equals("lavash") && bread.getPrice() > 3) {
                bread.printInfo();
                b = true;
            }
        }
        if(!b){
            System.out.println("There is no such bread.");
        }
    }

    //2. Return the bread with most calories
    public Bread mostCaloriesBread(Bread[] breads) {
        Bread maxCalories = breads[0];
        for(int i = 0; i < breads.length; i++) {
            if(breads[i].getCalories() > maxCalories.getCalories()){
                maxCalories = breads[i];
            }
        }
        return maxCalories;
    }

    //3. Print white Breads in desc form order by price
    public void printInDescOrderByCalories(Bread[] breads) {
        boolean isActive = true;
        int count = 0;
        while(isActive){
            isActive = false;
            for (int i = 0; i < breads.length - 1 - count; i++) {
                if (breads[i].getCalories() < breads[i + 1].getCalories()) {
                    Bread temp = breads[i];
                    breads[i] = breads[i + 1];
                    breads[i + 1] = temp;
                    isActive = true;
                }
            }
            ++count;
        }
        for(Bread bread : breads){
            if(bread.getType().equals("white"))
                bread.printInfo();
        }
    }
}
