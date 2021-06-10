package model;

public class Taxi {
    private String model;
    private String country;
    private int year = 1999;
    private int mileage = 250000;
    private int weight = 2100;
    private int topSpeed = 200;
    private int seats = 2;
    private double cost = 30000;
    private boolean sport;

    public Taxi(String model, String country, int year, int mileage) {
        if(!model.equals("")) {
            this.model = model;
        }
        else {
            System.out.println("Invalid model");
        }
        if(!country.equals("")) {
            this.country = country;
        }
        else{
            System.out.println("Invalid country");
        }
        if(year >= 1903 && year <= 2020) {
            this.year = year;
        }
        else {
            System.out.println("Invalid year");
        }
        if(mileage >= 0 && mileage <= 999999) {
            this.mileage = mileage;
        }
        else{
            System.out.println("Invalid mileage");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(!country.equals("")) {
            this.model = model;
        }
        else {
            System.out.println("Invalid model");
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(!country.equals("")) {
            this.country = country;
        }
        else {
            System.out.println("Invalid country");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >= 1903 && year <= 2020) {
            this.year = year;
        }
        else {
            System.out.println("Invalid year");
        }
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        if(mileage >= 0 && mileage <= 999999) {
            this.mileage = mileage;
        }
        else{
            System.out.println("Invalid mileage");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight >= 1000 && weight <= 3000) {
            this.weight = weight;
        }
        else{
            System.out.println("Invalid weight");
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if(topSpeed >= 0 && topSpeed <= 220) {
            this.topSpeed = topSpeed;
        }
        else {
            System.out.println("Invalid topSpeed");
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if(seats >= 0) {
            this.seats = seats;
        }
        else {
            System.out.println("Invalid number of seats");
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if(cost >= 0) {
            this.cost = cost;
        }
        else{
            System.out.println("Invalid cost");
        }
    }

    public boolean isSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }

    public void printInfo() {
        System.out.printf("Model %s, ", model);
        System.out.printf("Country %s, ", country);
        System.out.printf("Year %d, ", year);
        System.out.printf("Mileage %d, ", mileage);
        System.out.printf("Weight %d, ", weight);
        System.out.printf("Top Speed %d, ", topSpeed);
        System.out.printf("Seats %d, ", seats);
        System.out.printf("Cost in $ %.1f, ", cost);
        System.out.printf("Is sport? %s\n", sport ? "Yes" : "No");
    }

}
