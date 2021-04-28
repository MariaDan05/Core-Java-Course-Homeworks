import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        FileService.createFolder("homework8\\java");
        FileService.createFile("homework8\\java", "students.txt");
        FileService.write("homework8\\java\\students.txt", "Hayk,Arabyan,1998,m,77.5");
        FileService.write("homework8\\java\\students.txt", "\nAni,Babayan,1980,f,47.5");
        FileService.write("homework8\\java\\students.txt", "\nKarine,Vancyan,2000,f,87.5");
        FileService.write("homework8\\java\\students.txt", "\nVahe,Soghomonyan,1993,m,40.8");
        //System.out.println(FileService.read("homework8\\java\\students.txt"));

        String[] strings = FileService.readLines("homework8\\java\\students.txt");

        Student[] students = StudentConvertor.convertor(strings);

        Scanner s = new Scanner(System.in);
        boolean isMenuActive = true;
        while(isMenuActive) {
            System.out.println("Enter command number:");
            System.out.println("1. Print full names of students");
            System.out.println("2. Print all male students");
            System.out.println("3. Print all female students who has mark greater than 50.4");
            System.out.println("4. Print student information having the minimal mark");
            System.out.println("5. Print biggest male student information");
            System.out.println("6. Print students sorted by mark");
            System.out.println("7. Print female students sorted by year");
            System.out.println("8. Exit");

            int num = s.nextInt();
            switch (num) {
                case 1:
                    StudentService.printFullName(students);
                    break;
                case 2:
                    StudentService.printAllMale(students);
                    break;
                case 3:
                    StudentService.printAllFemaleMarkGreaterThan(students);
                    break;
                case 4:
                    StudentService.printStudentWithMinMark(students);
                    break;
                case 5:
                    StudentService.printBiggestMale(students);
                    break;
                case 6:
                    StudentService.printSortedByMark(students);
                    break;
                case 7:
                    StudentService.printFemaleSortedByYear(students);
                    break;
                case 8:
                    isMenuActive = false;
                    break;
                default:
                    System.out.println("Invalid command number.");
            }
            System.out.println();
        }
    }
}
