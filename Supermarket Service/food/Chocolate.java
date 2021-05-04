package food;

public class Chocolate extends Sweets{
    private boolean isDarkChocolate;

    public Chocolate(String name, double price, int calories) {
        super(name, price, calories);
    }

    public boolean isDarkChocolate() {
        return isDarkChocolate;
    }

    public void setDarkChocolate(boolean darkChocolate) {
        isDarkChocolate = darkChocolate;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Is Dark Chocolate: %s\n", isDarkChocolate ? "Yes" : "No");
    }
}
