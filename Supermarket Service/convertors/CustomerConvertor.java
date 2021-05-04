package convertors;
import customer.Customer;

public class CustomerConvertor {
    public static Customer[] customerConvertor(String[] strings){
        Customer[] customers = new Customer[strings.length];
        for(int i = 0; i < customers.length; ++i) {

            String[] parts = strings[i].split(",");

            Customer customer = new Customer(parts[0], parts[1], parts[2], parts[3]);

            customers[i] = customer;
        }
        return customers;
    }
}
