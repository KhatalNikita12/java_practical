package student;

public class StudentInfo {
    private int rollNo;
    private String name;
    private String studentClass;
    private double percentage;

    public StudentInfo(int rollNo, String name, String studentClass, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.studentClass = studentClass;
        this.percentage = percentage;
    }

    public void displayInfo() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Class: " + studentClass);
        System.out.println("Percentage: " + percentage + "%");
    }
}
