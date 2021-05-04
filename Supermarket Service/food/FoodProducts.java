package food;

public class FoodProducts {
    private String name;
    private double price;
    private int calories;

    public FoodProducts(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void printInfo() {
        System.out.printf("Name: %s, ", name);
        System.out.printf("Price: %.1f, ", price);
        System.out.printf("Calories: %d", calories);
    }
}
