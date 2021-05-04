package food;

public class Bread extends Bakery{
    private String type;

    public Bread(String name, double price, int calories) {
        super(name, price, calories);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(type.equals("black") || type.equals("white") || type.equals("lavash"))
            this.type = type;
        else {
            System.out.println("Invalid type of bread");
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Type of bread: %s\n", type);
    }
}
