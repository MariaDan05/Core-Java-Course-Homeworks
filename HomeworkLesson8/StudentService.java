public class StudentService {

    //Task 1: Print full names of students
    public static void printFullName(Student[] students) {
        for(Student s : students) {
            System.out.println(s.getFirstName() + " " + s.getLastName());
        }
    }

    //Task 2: Print all male students
    public static void printAllMale(Student[] students) {
        for(Student s : students) {
            if(s.getGender() == 'm') {
                s.printInfo();
            }
        }
    }

    //Task 3: Print all female students who has mark greater than 50.4
    public static void printAllFemaleMarkGreaterThan(Student[] students) {
        for(Student s : students) {
            if(s.getGender() == 'f' && s.getMark() > 50.4) {
                s.printInfo();
            }
        }
    }

    //Task 4: Print student information having the minimal mark
    public static void printStudentWithMinMark(Student[] students) {
        Student min = students[0];
        for (int i = 1; i < students.length; i++) {
            if(students[i].getMark() < min.getMark()) {
                min = students[i];
            }
        }
        min.printInfo();
    }

    //Task 5: Print biggest male student information
    public static void printBiggestMale(Student[] students) {
        Student max = null;
        int index = 0;
        for (int i = 0; i < students.length; i++) {  //find first male Student
            if (students[i].getGender() == 'm') {
                max = students[i];
                index = i;
                break;
            }
        }

        for (int i = ++index; i < students.length; ++i) {
            if (students[i].getGender() == 'm' && students[i].getYear() < max.getYear()) {
                max = students[i];
            }
        }
        max.printInfo();
    }

    //Task 6: Print students sorted by mark
    public static void printSortedByMark(Student[] students) {
        boolean isActive = true;
        int count = 0;
        while(isActive){
            isActive = false;
            for (int i = 0; i < students.length - 1 - count; i++) {
                if (students[i].getMark() > students[i + 1].getMark()) {
                    Student temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                    isActive = true;
                }
            }
            ++count;
        }
        for(Student student : students){
            student.printInfo();
        }
    }

    //Task 7: Print female students sorted by year
    public static void printFemaleSortedByYear(Student[] students) {
        boolean isActive = true;
        int count = 0;
        while(isActive){
            isActive = false;
            for (int i = 0; i < students.length - 1 - count; i++) {
                if (students[i].getYear() > students[i + 1].getYear()) {
                    Student temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                    isActive = true;
                }
            }
            ++count;
        }
        for(Student student : students){
            if(student.getGender() == 'f') {
                student.printInfo();
            }
        }
    }
}
