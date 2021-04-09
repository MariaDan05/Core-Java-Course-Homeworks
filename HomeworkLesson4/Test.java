package main;
import model.House;
import model.Market;
import model.Student;

//Task: Create Logical Structures (As big as possible) from your life and print them in main function.

public class Test {
    public static void main(String[] args) {
        //Students
        Student s1 = new Student();
        s1.setStudentFirstName("Jack");
        s1.setStudentSecondName("Paterson");
        s1.setLevelOfStudies("Undergraduate");
        s1.setGpa(3.0);
        s1.setGender('M');
        s1.setExcellentStudent(s1.getGpa() >= 3.5);

        System.out.println("Students:");
        System.out.println(s1.getStudentFirstName() + " " + s1.getStudentSecondName() + "\n" +
                         s1.getLevelOfStudies() + "\n" + s1.getGpa() + "\n" + s1.getGender() + "\n" + s1.isExcellentStudent() + "\n");

        Student s2 = new Student();
        s2.setStudentFirstName("Olivia");
        s2.setStudentSecondName("Mayer");
        s2.setLevelOfStudies("Summer exchange");
        s2.setGpa(3.55);
        s2.setGender('f');
        s2.setExcellentStudent(s2.getGpa() >= 3.5);

        System.out.println(s2.getStudentFirstName() + " " + s2.getStudentSecondName() + "\n" +
                         s2.getLevelOfStudies() + "\n" + s2.getGpa() + "\n" + s2.getGender() + "\n" + s2.isExcellentStudent() + "\n");

        System.out.println(s1.getGpa() > s2.getGpa() ? (s1.getStudentFirstName()) : (s2.getStudentFirstName()));
        System.out.println();

        //Houses
        House h1 = new House();
        h1.setStreet("Baker Street");
        h1.setBuilding("221B");
        h1.setOwnerName("Mrs. Hudson");
        h1.setCountOfRooms(6);
        h1.setComfortRate('B');
        h1.setHouse(true);

        System.out.println("Houses:");
        System.out.println(h1.getStreet() + "\n" + h1.getBuilding() + "\n" + h1.getCountOfRooms() + "\n" +
                           h1.getOwnerName() + "\n" + h1.getComfortRate() + "\n" + h1.isHouse() + "\n");

        House h2 = new House();
        h2.setStreet("Martiros Saryan Street");
        h2.setBuilding("26");
        h2.setOwnerName("X");
        h2.setCountOfRooms(3);
        h2.setComfortRate('A');
        h2.setHouse(false);

        System.out.println(h2.getStreet() + "\n" + h2.getBuilding() + "\n" + h2.getCountOfRooms() + "\n" +
                h2.getOwnerName() + "\n" + h2.getComfortRate() + "\n" + h2.isHouse() + "\n");

        System.out.println(h2.getCountOfRooms() > h1.getCountOfRooms() ? "Yes" : "No");
        System.out.println();

        //Markets
        Market m1 = new Market();
        m1.setMarket(true);
        m1.setMarketName("SAS");
        m1.setAddress("Komitas Street");
        m1.setCountOfBranches(12);
        m1.setMarketBranchRate(5.0);

        System.out.println("Markets:");
        System.out.println(m1.getAddress() + "\n" + m1.getMarketName() + "\n" + m1.getMarketBranchRate() + "\n" +
                           m1.getCountOfBranches() + "\n" + m1.isMarket() + "\n");

        Market m2 = new Market();
        m2.setMarket(true);
        m2.setMarketName("Yerevan City");
        m2.setAddress("Komitas Street");
        m2.setCountOfBranches(24);
        m2.setMarketBranchRate(4.32);

        System.out.println(m2.getAddress() + "\n" + m2.getMarketName() + "\n" + m2.getMarketBranchRate() + "\n" +
                m2.getCountOfBranches() + "\n" + m2.isMarket() + "\n");

        System.out.println(m2.getCountOfBranches() > m1.getCountOfBranches() ? (m2.getMarketBranchRate() +
                           m1.getMarketBranchRate()) : (m1.getMarketBranchRate() - m2.getMarketBranchRate()));
    }
}
