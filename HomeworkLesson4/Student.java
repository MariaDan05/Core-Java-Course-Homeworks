package model;

//JavaBean
public class Student {
    private String studentFirstName;
    private String studentSecondName;
    private String levelOfStudies;
    private double gpa;
    private char gender;
    private boolean isExcellentStudent;

    public String getStudentFirstName() {
        return studentFirstName;
    }
    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentSecondName() {
        return studentSecondName;
    }

    public void setStudentSecondName(String studentSecondName) {
        this.studentSecondName = studentSecondName;
    }

    public String getLevelOfStudies() {
        return levelOfStudies;
    }

    public void setLevelOfStudies(String levelOfStudies){
        if(levelOfStudies.equals("Undergraduate") || levelOfStudies.equals("Graduate")) {
            this.levelOfStudies = levelOfStudies;
        }
        else {
            System.out.println("Invalid level of studies");
        }
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if(gpa >= 0.0 && gpa <=4.0) {
            this.gpa = gpa;
        }
        else {
            System.out.println("invalid GPA");
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender == 'M' || gender == 'F' || gender == 'm' || gender == 'f') {
            this.gender = gender;
        }
        else {
            System.out.println("Invalid gender");
        }
    }

    public boolean isExcellentStudent() {
        return isExcellentStudent;
    }

    public void setExcellentStudent(boolean excellentStudent) {
        isExcellentStudent = excellentStudent;
    }

}
