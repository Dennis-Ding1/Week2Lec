package uoft.csc207.week2;

public class Main {

    public static void main(String[] args) {
        String[] name = {"First", "Middle", "Last"};
	    Person p = new Person(name, "moogah");
        Person s = new Student(name, "Dennis", "1234567");
        System.out.println(p);
    }
}
