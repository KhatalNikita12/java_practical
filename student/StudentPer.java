package student;

public class StudentPer {
    public static double calculatePercentage( int marks1, int marks2, int marks3) {
        int totalMarks = marks1 + marks2 + marks3;
        double percentage = totalMarks / 3.0; 
        return percentage;
    }
}
