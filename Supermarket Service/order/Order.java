package order;
import supermarket.customer.Customer;
import supermarket.food.FoodProducts;

public class Order {
    private Customer customer;
    private int orderNumber;
    private int numberOfPurchasedProducts;
    private FoodProducts[] purchasedProducts;

    public Order(Customer user, int orderNumber, int numberOfPurchasedProducts, FoodProducts[] purchasedProducts) {
        this.customer = user;
        this.orderNumber = orderNumber;
        this.numberOfPurchasedProducts = numberOfPurchasedProducts;
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
        this.orderNumber = orderNumber;
    }

    public int getNumberOfPurchasedProducts() {
        return numberOfPurchasedProducts;
    }

    public void setNumberOfPurchasedProducts(int numberOfPurchasedProducts) {
        this.numberOfPurchasedProducts = numberOfPurchasedProducts;
    }

    public FoodProducts[] getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(FoodProducts[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }
}
