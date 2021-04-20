package service;
import model.Taxi;
import java.util.Scanner;

public class TaxiService {

    public Taxi create() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter model of the car:");
        String model = s.next();

        System.out.println("Enter country the car belongs to:");
        String country = s.next();

        System.out.println("Enter year of publishing (from 1903 to 2020):");
        int year = s.nextInt();

        System.out.println("Enter mileage (from 0 to 999999):");
        int mileage = s.nextInt();

        System.out.println("Enter weight of car (from 1000 KG to 3000 KG):");
        int weight = s.nextInt();

        System.out.println("Enter maximal speed per hour (220 km/h):");
        int topSpeed = s.nextInt();

        System.out.println("Enter number of seats:");
        int seats = s.nextInt();

        System.out.println("Enter cost of the car in $:");
        double cost = s.nextDouble();

        System.out.println("Is sport y/n:");
        boolean sport = s.next().charAt(0) == 'y';
        System.out.println();

        //create Taxi object
        Taxi taxi = new Taxi(model, country, year, mileage);
        taxi.setWeight(weight);
        taxi.setTopSpeed(topSpeed);
        taxi.setSeats(seats);
        taxi.setCost(cost);
        taxi.setSport(sport);
        return taxi;
    }

    //1. Parameter one Taxi
    // Result: print cost and topSpeed if the taxi is sport otherwise print model and country
    public void printSportCostTopSpeed(Taxi taxi) {
        System.out.println(taxi.isSport() ? (taxi.getCost() + " " + taxi.getTopSpeed()) :
                                            (taxi.getModel() + " " + taxi.getCountry()));
    }

    //2. Parameter two Taxis
    //Result: return the Taxi which one is newer (if they have the same age return first one).
    public Taxi newerTaxi(Taxi taxi1, Taxi taxi2) {
        return taxi1.getYear() >= taxi2.getYear() ? taxi1 : taxi2;
    }

    //3.Parameter three Taxis
    //Result: print country of the Taxi with smallest seats count (if they have the same - print first).
    public void printCountryOfSmallestSeatsNumber(Taxi taxi1, Taxi taxi2, Taxi taxi3) {
        Taxi t = taxi1.getSeats() <= taxi2.getSeats() ? taxi1 : taxi2;
        System.out.println(t.getSeats() <= taxi3.getSeats() ? t.getCountry() : taxi3.getCountry());
    }

    //4. Parameter array of Taxis
    //Result: print all not sport Taxis.
    public void printAllNotSport(Taxi[] taxis) {
        for(Taxi taxi : taxis) {
            if(!taxi.isSport()) {
                taxi.printInfo();
            }
        }
    }

    //5. Parameter array of Taxis
    //Result: print all sport Taxis which were road more than 50000 km (mileage).
    public void printAllSportRoadMoreThan50000(Taxi[] taxis) {
        for(Taxi taxi : taxis) {
            if (taxi.isSport() && taxi.getMileage() > 50000) {
                taxi.printInfo();
            }
        }
    }

    //6. Parameter array of Taxis
    //Result: return the Taxi with minimal weight (if there are some of them return last one).
    public Taxi withMinWeight(Taxi[] taxis) {
        Taxi min = taxis[0];
        for (int i = 1; i < taxis.length; i++) {
            if(taxis[i].getWeight() < min.getWeight()) {
                min = taxis[i];
            }
            if(taxis[i].getWeight() == min.getWeight()){
                min = taxis[i];
            }
        }
        return min;
    }

    //7. Parameter array of Taxis
    //Result: return the Taxi with minimal cost from all sport Taxis (if there are some of them return first one).
    public Taxi withMinCostFromAllSport(Taxi[] taxis) {
        Taxi min = null;
        int index = 0;
        for (int i = 0; i < taxis.length; i++) {  //find first sport Taxi
            if (taxis[i].isSport()) {
                min = taxis[i];
                index = i;
                break;
            }
        }

        for (int i = ++index; i < taxis.length; ++i) {
            if (taxis[i].isSport() && taxis[i].getCost() < min.getCost()) {
                min = taxis[i];
            }
        }
        return min;
    }

    //8. Parameter array of Taxis
    //Result: print Taxi in ascending form order by year
    public void printInAscOrderByYear(Taxi[] taxis) {
        boolean isActive = true;
        int count = 0;
        while(isActive){
            isActive = false;
            for (int i = 0; i < taxis.length - 1 - count; i++) {
                if (taxis[i].getYear() > taxis[i + 1].getYear()) {
                    Taxi temp = taxis[i];
                    taxis[i] = taxis[i + 1];
                    taxis[i + 1] = temp;
                    isActive = true;
                }
            }
            ++count;
        }
        for(Taxi taxi : taxis){
            taxi.printInfo();
        }
    }

}
