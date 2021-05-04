package services;
import customer.Customer;

import java.util.Scanner;

public class CustomerService {

    public Customer createCustomer() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter first name of customer:");
        String firstName = s.next();

        System.out.println("Enter last name of customer:");
        String lastName = s.next();

        System.out.println("Enter email:");
        String email = s.next();

        System.out.println("Enter phone number:");
        String phoneNumber = s.next();

        return new Customer(firstName, lastName, email, phoneNumber);
    }

    //1. Print the all customers with first name "Anna"
    public void printAllAnnas(Customer[] customers) {
        boolean b = false;
        for(Customer customer : customers) {
            if(customer.getFirstName().equals("Anna")){
                customer.printInfo();
                b = true;
            }
        }
        if(!b) {
            System.out.println("There is no such customer.");
        }
    }

    //2. Print all customers in asc form order by length of last name
    public void printInAscOrderByLastName(Customer[] customers) {
        boolean isActive = true;
        int count = 0;
        while(isActive){
            isActive = false;
            for (int i = 0; i < customers.length - 1 - count; i++) {
                if (customers[i].getLastName().length() > customers[i + 1].getLastName().length()) {
                    Customer temp = customers[i];
                    customers[i] = customers[i + 1];
                    customers[i + 1] = temp;
                    isActive = true;
                }
            }
            ++count;
        }
        for(Customer customer : customers){
            customer.printInfo();
        }
    }

}
