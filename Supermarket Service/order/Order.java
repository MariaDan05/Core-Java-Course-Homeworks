package order;
import customer.Customer;
import food.FoodProducts;

public class Order {
    private Customer customer;
    private int orderNumber = 111;
    private int numberOfPurchasedProducts = 1;
    private FoodProducts[] purchasedProducts;

    public Order(Customer user, int orderNumber, int numberOfPurchasedProducts, FoodProducts[] purchasedProducts) {
        this.customer = user;
        if(orderNumber >= 100 && orderNumber <= 10000) {
            this.orderNumber = orderNumber;
        } else {
            System.out.println("Invalid order number");
        }
        if(numberOfPurchasedProducts > 0) {
            this.numberOfPurchasedProducts = numberOfPurchasedProducts;
        } else {
            System.out.println("Invalid number of purchased products");
        }
        this.purchasedProducts = purchasedProducts;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String toEmail() {
        return "Dear "+ customer.getFirstName() + " " + customer.getLastName() + " thank you for placing order. " +
                "Your order number is " + orderNumber + "." +
                " The purchase price is " + calculateTotalCost() + "$.";
    }

    private double calculateTotalCost() {
        double cost = 0.0D;

        for (FoodProducts foodProducts : purchasedProducts) {
            cost += foodProducts.getPrice();
        }
        return cost;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        if(orderNumber >= 100 && orderNumber <= 10000) {
            this.orderNumber = orderNumber;
        } else {
            System.out.println("Invalid order number");
        }
    }

    public int getNumberOfPurchasedProducts() {
        return numberOfPurchasedProducts;
    }

    public void setNumberOfPurchasedProducts(int numberOfPurchasedProducts) {
        if(numberOfPurchasedProducts > 0) {
            this.numberOfPurchasedProducts = numberOfPurchasedProducts;
        } else {
            System.out.println("Invalid number of purchased products");
        }
    }

    public FoodProducts[] getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(FoodProducts[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }
}
