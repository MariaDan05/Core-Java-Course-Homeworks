import java.util.Scanner;

public class HomeworkLesson5 {
    public static void main(String[] args) {
        System.out.println("Task: Examples of using constructors and methods of String class:");
        String s = new String();//the default constructor creates an empty String, will create an instance of String with no characters in it.

        char[] chars = {'h', 'o', 'm', 'e'};
        String s1 = new String(chars);
        System.out.println(s1);
        //or
        String s11 = "home";
        System.out.println("The length of " + s11 +" is " + s11.length());

        char[] chars1 = { 'g', 'o', 'o', 'd', 'g', 'o' };
        String s2 = new String(chars1, 0, 4);
        System.out.println(s2);

        char[] c = {'F', 'r', 'n', 'a'};
        String s3 = new String(c);
        String s4 = new String(s3);
        System.out.println(s3);
        System.out.println(s4);

        //s.length() and s.charAt(index);
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(i + 1 + " character of the word is " + str.charAt(i));//+ includes the automatic creation of new String instances
        }

        int value = 100;
        String ss = String.valueOf(value);
        System.out.println(ss + 20);//concat. with 20

        String str1 = "ABCDEFG";
        System.out.println(str1.toLowerCase());

        String str2 = "efghijk";
        System.out.println(str2.toUpperCase());

        if(!str1.isEmpty()) {
            System.out.println(str1);
        }

        char[] chars3 = str1.toCharArray();
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(chars3[i] + " ");
        }
        System.out.println();

        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("planet"));

        System.out.println(str.equals(str1) ? "Yes" : "No");
        System.out.println(str1.equalsIgnoreCase(str) ? "Yes" : "No");
        System.out.println(str1.replace('A', 'S'));
        System.out.println(str1.replace("ABCD", "efj"));
        System.out.println(str2.startsWith("ef") ? "Yes" : "No");
    }
}
