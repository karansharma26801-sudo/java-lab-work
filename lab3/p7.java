// Parent class
class Student {
    String name;
    int marks;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Result extends Student {
    char grade;

    // Constructor using super()
    Result(String name, int marks) {
        super(name, marks); // initialize parent data
    }

    void calculateGrade() {
        if (marks >= 90)
            grade = 'A';
        else if (marks >= 75)
            grade = 'B';
        else if (marks >= 60)
            grade = 'C';
        else if (marks >= 50)
            grade = 'D';
        else
            grade = 'F';
    }

    void display() {
        calculateGrade();
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}

public class p7 {
    public static void main(String[] args) {
        Result r = new Result("Karan", 82);
        r.display();
    }
}