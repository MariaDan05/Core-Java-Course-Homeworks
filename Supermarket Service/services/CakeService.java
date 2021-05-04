package services;
import food.Cake;

import java.util.Scanner;

public class CakeService {
    public Cake createCake() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter name of cake:");
        String name = s.next();

        System.out.println("Enter the price of cake:");
        double price = s.nextDouble();

        System.out.println("Enter calories in 100g:");
        int calories = s.nextInt();

        System.out.println("Is chocolate cake?: y/n");
        boolean isChocolateCake = s.next().charAt(0) == 'y';

        Cake cake = new Cake(name, price, calories);
        cake.setChocolateCake(isChocolateCake);
        return cake;
    }

    //1. Print all chocolate and price less than 20$ cakes
    public void printAllChocolatePriceLessThan20$(Cake[] cakes){
        boolean b = false;
        for (Cake cake : cakes) {
            if(cake.isChocolateCake() && cake.getPrice() < 20) {
                cake.printInfo();
                b = true;
            }
        }
        if (!b){
            System.out.println("There is no such cake.");
        }
    }

    //2. Return the cake with less calories
    public Cake lessCaloriesCake(Cake[] cakes) {
        Cake minCalories = cakes[0];
        for(int i = 0; i < cakes.length; i++) {
            if(cakes[i].getCalories() < minCalories.getCalories()){
                minCalories = cakes[i];
            }
        }
        return minCalories;
    }

    //3. Print chocolate Cakes in asc form order by calories
    public void printInAscOrderByCalories(Cake[] cakes) {
        boolean isActive = true;
        int count = 0;
        while(isActive){
            isActive = false;
            for (int i = 0; i < cakes.length - 1 - count; i++) {
                if (cakes[i].getCalories() > cakes[i + 1].getCalories()) {
                    Cake temp = cakes[i];
                    cakes[i] = cakes[i + 1];
                    cakes[i + 1] = temp;
                    isActive = true;
                }
            }
            ++count;
        }
        for(Cake cake : cakes){
            if(cake.isChocolateCake())
                cake.printInfo();
        }
    }
}
