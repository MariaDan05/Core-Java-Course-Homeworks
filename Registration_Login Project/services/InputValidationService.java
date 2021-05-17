package services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidationService {

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
        if(!InputValidationService.validatePassword(password)) {
            return false;
        }
        String[] strings = FileService.readLines("project\\\\java\\\\logReg\\\\database.txt");
        boolean b = false;
        for(int i = 0; i < strings.length; i++) {
            if(strings[i].contains(MD5_Service.MD5(password))){
                b = true;
                break;
            }
        }
        return b;
    }

}
