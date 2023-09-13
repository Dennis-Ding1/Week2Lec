package uoft.csc207.week2;

public class Student extends Person {
    // String studentid;
    private final String studentid; // final表示无法更改
    public Student(String[] name, String utorid, String studentid) {
        super(name, utorid); // call the parent class
        this.studentid = studentid;
    }
}
