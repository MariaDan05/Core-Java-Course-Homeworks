public class StudentConvertor {

    public static Student[] convertor(String[] strings){
        Student[] students = new Student[strings.length];
        for(int i = 0; i < students.length; ++i) {
            int index = strings[i].indexOf(',');
            int index1 = strings[i].indexOf(',', index + 1);
            int index2 = strings[i].indexOf(',', index1 + 1);
            int index3 = strings[i].indexOf(',', index2 + 1);
            Student student = new Student();
            student.setFirstName(strings[i].substring(0, index));
            student.setLastName(strings[i].substring(index + 1, index1));
            student.setYear(Integer.parseInt(strings[i].substring(index1 + 1, index2)));
            student.setGender(strings[i].substring(index2 + 1, index3).charAt(0));
            student.setMark(Double.parseDouble(strings[i].substring(index3 + 1)));
            students[i] = student;
        }
        return students;
    }
    
    public static Student[] convertor1(String[] strings){
        Student[] students = new Student[strings.length];
        for(int i = 0; i < students.length; ++i) {

            String[] parts = strings[i].split(",");

            Student student = new Student();

            student.setFirstName(parts[0]);
            student.setLastName(parts[1]);
            student.setYear(Integer.parseInt(parts[2]));
            student.setGender(parts[3].charAt(0));
            student.setMark(Double.parseDouble(parts[4]));
            students[i] = student;
        }
        return students;
    }
}
