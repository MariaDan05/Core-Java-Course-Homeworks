package food;

public class Jelly extends Sweets{
    private String color;

    public Jelly(String name, double price, int calories) {
        super(name, price, calories);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Color: %s\n", color);
    }
}
