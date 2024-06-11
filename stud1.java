import student.StudentInfo;
import student.StudentPer;

public class stud1 {
    public static void main(String[] args) {
        // Sample data
        int rollNo = 1;
        String name = "Ram sharma";
        String studentClass = "Tybcs";
        int marks1 = 90;
        int marks2 = 85;
        int marks3 = 92;

        double percentage = StudentPer.calculatePercentage( marks1, marks2, marks3);

        StudentInfo student = new StudentInfo(rollNo, name, studentClass, percentage);
        student.displayInfo();
    }
}
