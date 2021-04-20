package main;
import model.Taxi;
import service.TaxiService;

import java.util.Scanner;

public class TaxiTest {
    public static void main(String[] args) {
        TaxiService service = new TaxiService();
        Taxi taxi = service.create();
        Taxi taxi1 = service.create();
        Taxi taxi2 = service.create();

        Scanner s = new Scanner(System.in);

        System.out.println("Enter count of Taxis in array:");
        int n = s.nextInt();
        System.out.println("Enter information to array of Taxis:");

        Taxi[] taxis = new Taxi[n];
        for (int i = 0; i < taxis.length; i++) {
            taxis[i] = service.create();
        }

        boolean isMenuActive = true;
        while(isMenuActive) {
            System.out.println("Enter command number:");
            System.out.println("1. Print cost and topSpeed if the taxi is sport otherwise print model and country");
            System.out.println("2. Return the Taxi which one is newer (if they have the same age return first one).");
            System.out.println("3. Print country of the Taxi with smallest seats count (if they have the same - print first).");
            System.out.println("4. Print all not sport Taxis.");
            System.out.println("5. Print all sport Taxis which were road more than 50000 km (mileage).");
            System.out.println("6. Return the Taxi with minimal weight (if there are some of them return last one).");
            System.out.println("7. Return the Taxi with minimal cost from all sport Taxis (if there are some of them return first one).");
            System.out.println("8. Print Taxi in ascending form order by year");
            System.out.println("9. Exit");

            int num = s.nextInt();
            switch (num) {
                case 1:
                    service.printSportCostTopSpeed(taxi);
                    break;
                case 2:
                    Taxi t = service.newerTaxi(taxi, taxi1);
                    t.printInfo();
                    break;
                case 3:
                    service.printCountryOfSmallestSeatsNumber(taxi, taxi1, taxi2);
                    break;
                case 4:
                    service.printAllNotSport(taxis);
                    break;
                case 5:
                    service.printAllSportRoadMoreThan50000(taxis);
                    break;
                case 6:
                    Taxi t1 = service.withMinWeight(taxis);
                    t1.printInfo();
                    break;
                case 7:
                    Taxi t2 = service.withMinCostFromAllSport(taxis);
                    t2.printInfo();
                    break;
                case 8:
                    service.printInAscOrderByYear(taxis);
                    break;
                case 9:
                    isMenuActive = false;
                    break;
                default:
                    System.out.println("Invalid command number.");
            }
            System.out.println();
        }
    }
}
