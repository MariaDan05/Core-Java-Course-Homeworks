package customer;

public class  Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber = "+374";

    public Customer(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        if(phoneNumber.substring(0,4).equals("+374")){
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Invalid phone number");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.substring(0,4).equals("+374")){
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Invalid phone number");
        }
    }

    public void printInfo() {
        System.out.printf("First name: %s, ", firstName);
        System.out.printf("Last name: %s, ", lastName);
        System.out.printf("Email: %s, ", email);
        System.out.printf("Phone number: %s\n", phoneNumber);
    }

}
