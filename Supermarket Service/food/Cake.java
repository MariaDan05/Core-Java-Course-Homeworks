package food;

public class Cake extends Bakery{
    private boolean isChocolateCake;

    public Cake(String name, double price, int calories) {
        super(name, price, calories);
    }

    public boolean isChocolateCake() {
        return isChocolateCake;
    }

    public void setChocolateCake(boolean chocolateCake) {
        isChocolateCake = chocolateCake;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("is Chocolate Cake?: %s\n", isChocolateCake ? "Yes" : "No");
    }
}
