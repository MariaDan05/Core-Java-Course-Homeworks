package test;

import services.*;

import java.util.Scanner;

//Task: Create project: Registration and login using menu.
//Registration:
//Input: full name (format: name surname), username, email, password
//Validation:  full name, email(correct email address format), password(length>8 && 2 uppercase letters && 3 numbers),
//username(length > 10 && not duplicate)
//Export database.txt file:  columns – Full Name , Username, Email , MD5(password)

//Login:
//Input: username, password
//Result: Login success or invalid input data

public class Test {
    public static void main(String[] args) {
        //FileService.createFolder("project\\java\\logReg");
        //FileService.createFile("project\\java\\logReg", "database.txt");
        //FileService.write("project\\java\\logReg\\database.txt", "Maria Danielyan,maria_danielyan,mariadanielyan60@gmail.com,a585483dd6c83deee72e3e19fa407c98");
        //FileService.write("project\\java\\logReg\\database.txt", "\nAnna Hovannisyan,anna2345hov,annahovannisyan@gmail.com,9766e1e1a4c62502a06f783ac592a512");

        //System.out.println(MD5("MA2020riad"));
        //System.out.println(MD5("FDD2222ROEnfjj"));

        Scanner scanner = new Scanner(System.in);
        boolean isMenuActive = true;
        while(isMenuActive) {
            System.out.println("Enter the number of the action you are interested in:");
            System.out.println("1. Registration.");
            System.out.println("2. Login.");
            System.out.println("3. Exit.");

            int num = scanner.nextInt();
            scanner.nextLine();
            switch (num) {
                case 1:
                    RegistrationService.registration();
                    break;
                case 2:
                    LoginService.login();
                    break;
                case 3:
                    isMenuActive = false;
                    break;
                default:
                    System.out.println("Invalid command number.");
            }
            System.out.println();
        }
    }
}
