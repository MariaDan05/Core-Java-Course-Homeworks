package food;

public class Sweets extends FoodProducts{
    private double percentageOfSugar;

    public Sweets(String name, double price, int calories) {
        super(name, price, calories);
    }

    public double getPercentageOfSugar() {
        return percentageOfSugar;
    }

    public void setPercentageOfSugar(double percentageOfSugar) {
        this.percentageOfSugar = percentageOfSugar;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf(", Percentage of sugar: %.1f\n", percentageOfSugar);
    }
}
