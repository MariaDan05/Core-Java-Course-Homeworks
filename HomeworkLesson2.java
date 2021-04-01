//Task: Create primitive types, print their values + use operators, If/else statements.

public class HomeworkLesson2 {
    public static void main(String[] args) {
        System.out.println("The Arithmetic Operators(+,-,*,/,%,++,--): ");
        int x1 = 100, x2 = 400;
        System.out.println("x1 = " + x1 + ", " + "x2 = " + x2);
        System.out.println("x1 + x2 = " + (x1 + x2));
        int sub = x1 - x2;
        System.out.println("x1 - x2 = " + sub);
        System.out.println("x1 * x2 = " + (x1 * x2));
        int div = x2 / x1;
        System.out.println("x2 / x1 = " + div);
        System.out.println("x1 % x2 = " + (x1 % x2));//if x1 < x2, x1 % x2 = x1, if x2 < x1 than x1 % x2 = x2
        System.out.println("x2 % x1 = " + (x2 % x1));
        int i = 19;
        int j = -5;
        System.out.println("i = " + i + ", j = " + j + "\n" + "i % j = " + (i % j));//if the first operand of the modulus operator is positive, the remainder is also positive.

        i = -17;
        j = 3;
        System.out.println("i = " + i + ", j = " + j + "\n" + "i % j = " + (i % j));//if the first operand or both operands of the modulus operator are negative, the remainder is also negative.

        int a = 3;
        int b = a++ + ++a;//a = 5, b = 3 + 5 = 8
        System.out.println("a = " + a + ", b = " + b);
        int c = a-- * --b;//c = 5 * 7 = 35, a = 4, b = 7
        System.out.println("c = " + c + ", a = " + a + ", b = " + b);
        System.out.println(a++ - b++);// 4 - 7 = -3, a = 5, b = 8
        System.out.println(++a + a++);// 6 + 6 = 12, a = 7
        a++;// a = 8
        a++;// a = 9
        ++a;// a = 10
        int d = a++;// d = 10, a = 11
        System.out.println("d = " + d + ", a = " + a);
        System.out.println();

        System.out.println("The Relational Operators(>,>=,<,<=,==,!=) + If/else statement: ");
        if(a < b){
            System.out.println("a = " + a + " is less than b = " + b);
        }
        else{
            System.out.println("a = " + a + " is greater than or equal to b = " + b);
        }
        System.out.println(x2 > x1 ? ("x1 = " + x1 + " is greater than x2 = " + x2) : "x1 = " + x1 + " is less than or equal to x2 = " + x2);

        boolean bb = i != j;

        if(bb){
            System.out.println("i = " + i + " is not equal to j = " + j);
        }
        else{
            System.out.println("i = " + i + " is equal to j = " + j);
        }

        System.out.println(div == sub ? ("div = " + div + " is equal to sub = " + sub) : "div = " + div + " is not equal to sub = " + sub);

        if(d <= a){
            System.out.println("d = " + d +" is less than or equal to a = " + a);
        }
        else{
            System.out.println("d = " + d +" is greater than a = " + a);
        }
        System.out.println();

        System.out.println("The Logical Operators(&&,||,!(st)): ");
        if(bb && x2 > x1){
            System.out.println("Both conditions are true");
        }
        else{
            System.out.println("At least one of the conditions is false");
        }
        System.out.println((a < b || !bb) ? "At least one of the conditions is true" : "Both conditions are false");
        System.out.println(!bb ? ("i = " + i+ " is equal to j = " + j) : "i = " + i+ " is not equal to j = " + j);
        System.out.println();

        System.out.println("The Bitwise Operators(&,|,^,>>,<<,~,>>>): ");
        a = 11;// 1011
        b = 8;// 1000
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a & b = " + (a & b));// 1000 -> 8
        System.out.println("a | b = " + (a | b));// 1011 -> 11
        System.out.println("a ^ b = " + (a ^ b));// 0011 -> 3
        System.out.println("a >> 2 = " + (a >> 2));// 00001011 -> 00000010 -> 2
        b = 15;//1111
        System.out.println("b = " + b);
        System.out.println("b << 3 = " + (b << 3));// 00001111 -> 01111000 -> 120
        b = 5;// 0101
        System.out.println("b = " + b);
        System.out.println("~b = " + ~b);// ~0101 -> 1010, the result will give 2's complement of 1010 = -6
        int value = -12;
        System.out.println("value = " + value);
        System.out.println("value >>> 2 = " + (value >>> 2));
        value = 12;
        System.out.println("value = " + value);
        System.out.println("value >>> 2 = " + (value >>> 2));
    }
}
