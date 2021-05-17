import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
                    System.out.println("Enter your full name (format: name surname):");
                    String fullName = scanner.nextLine();
                    System.out.println("Enter username(length should be more than 10):");
                    String userName = scanner.next();
                    System.out.println("Enter your email:");
                    String email = scanner.next();
                    System.out.println("Enter your password(length should be more than 8, at least 2 uppercase letters and 3 numbers):");
                    String password = scanner.next();
                    if(validateFullName(fullName) && validateUserName(userName) && validateEmail(email) && validatePassword(password)) {
                        String text = "\n" + fullName + "," + userName + "," + email + "," + MD5(password);
                        FileService.write("project\\java\\logReg\\database.txt", text);
                        System.out.println("Registration completed successfully!");
                    } else {
                        System.out.println("Invalid input data, try again.");
                    }
                    break;
                case 2:
                    System.out.println("Enter user name:");
                    String userName1 = scanner.next();
                    System.out.println("Enter password:");
                    String password1 = scanner.next();
                    if(findUserName(userName1) && findPassword(password1)){
                        System.out.println("Login completed successfully!");
                    } else {
                        System.out.println("Invalid input data, try again.");
                    }
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

    public static boolean validateFullName(String fullName) {
        String regx = "(\\b[A-Z]{1}[a-z]+)( )([A-Z]{1}[a-z]+\\b)";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(fullName);
        return matcher.find();
    }

    public static boolean validateUserName(String userName) {
        if(userName.length() <= 10) {
            return false;
        }
        String[] strings = FileService.readLines("project\\\\java\\\\logReg\\\\database.txt");
        boolean b = true;
        for(int i = 0; i < strings.length; i++) {
            if(strings[i].contains(userName)){
                b = false;
                break;
            }
        }
        return b;
    }

    public static boolean validateEmail(String email) {
        String regx ="(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\" +
                "x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]" +
                "*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]" +
                "|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\" +
                "[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    public static boolean validatePassword(String password) {
        if(password.length() <= 8){
            return false;
        }
        String regx = "([^A-Z0-9]*[A-Z][^A-Z0-9]*[A-Z][^A-Z0-9]*[0-9][^A-Z0-9]*[0-9][^A-Z0-9]*[0-9][^A-Z0-9]*|[^A-Z0-9]*" +
                "[A-Z][^A-Z0-9]*[0-9][^A-Z0-9]*[A-Z][^A-Z0-9]*[0-9][^A-Z0-9]*[0-9][^A-Z0-9]*|[^A-Z0-9]*[A-Z][^A-Z0-9]*[0-9]" +
                "[^A-Z0-9]*[0-9][^A-Z0-9]*[A-Z][^A-Z0-9]*[0-9][^A-Z0-9]*|[^A-Z0-9]*[A-Z][^A-Z0-9]*[0-9][^A-Z0-9]*[0-9][^A-Z0-9]" +
                "*[0-9][^A-Z0-9]*[A-Z][^A-Z0-9]*|[^A-Z0-9]*[0-9][^A-Z0-9]*[A-Z][^A-Z0-9]*[A-Z][^A-Z0-9]*[0-9][^A-Z0-9]*[0-9]" +
                "[^A-Z0-9]*|[^A-Z0-9]*[0-9][^A-Z0-9]*[A-Z][^A-Z0-9]*[0-9][^A-Z0-9]*[A-Z][^A-Z0-9]*[0-9][^A-Z0-9]*|[^A-Z0-9]" +
                "*[0-9][^A-Z0-9]*[A-Z][^A-Z0-9]*[0-9][^A-Z0-9]*[0-9][^A-Z0-9]*[A-Z][^A-Z0-9]*|[^A-Z0-9]*[0-9][^A-Z0-9]*" +
                "[0-9][^A-Z0-9]*[A-Z][^A-Z0-9]*[A-Z][^A-Z0-9]*[0-9][^A-Z0-9]*|[^A-Z0-9]*[0-9][^A-Z0-9]*[0-9][^A-Z0-9]*[A-Z]" +
                "[^A-Z0-9]*[0-9][^A-Z0-9]*[A-Z][^A-Z0-9]*|[^A-Z0-9]*[0-9][^A-Z0-9]*[0-9][^A-Z0-9]*[0-9][^A-Z0-9]*[A-Z][^A-Z0-9]" +
                "*[A-Z][^A-Z0-9]*)";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

    public static boolean findUserName(String userName){
        if(userName.length() <= 10) {
            return false;
        }
        String[] strings = FileService.readLines("project\\\\java\\\\logReg\\\\database.txt");
        boolean b = false;
        for(int i = 0; i < strings.length; i++) {
            if(strings[i].contains(userName)){
                b = true;
                break;
            }
        }
        return b;
    }

    public static boolean findPassword(String password){
        if(!validatePassword(password)) {
            return false;
        }
        String[] strings = FileService.readLines("project\\\\java\\\\logReg\\\\database.txt");
        boolean b = false;
        for(int i = 0; i < strings.length; i++) {
            if(strings[i].contains(MD5(password))){
                b = true;
                break;
            }
        }
        return b;
    }


    public static String MD5(String md5) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        return null;
    }

}
