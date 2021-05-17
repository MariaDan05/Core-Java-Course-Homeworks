package services;

import java.util.Scanner;

public class RegistrationService {

    public static void registration(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name (format: name surname):");
        String fullName = scanner.nextLine();
        System.out.println("Enter username(length should be more than 10):");
        String userName = scanner.next();
        System.out.println("Enter your email:");
        String email = scanner.next();
        System.out.println("Enter your password(length should be more than 8, at least 2 uppercase letters and 3 numbers):");
        String password = scanner.next();
        if(InputValidationService.validateFullName(fullName) && InputValidationService.validateUserName(userName)
                && InputValidationService.validateEmail(email) && InputValidationService.validatePassword(password)) {
            String text = "\n" + fullName + "," + userName + "," + email + "," + MD5_Service.MD5(password);
            FileService.write("project\\java\\logReg\\database.txt", text);
            System.out.println("Registration completed successfully!");
        } else {
            System.out.println("Invalid input data, try again.");
        }
    }
}
