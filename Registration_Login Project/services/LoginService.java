package services;

import java.util.Scanner;

public class LoginService {
    public static void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter user name:");
        String userName1 = scanner.next();
        System.out.println("Enter password:");
        String password1 = scanner.next();
        if(InputValidationService.findUserName(userName1) && InputValidationService.findPassword(password1)){
            System.out.println("Login completed successfully!");
        } else {
            System.out.println("Invalid input data, try again.");
        }
    }
}
