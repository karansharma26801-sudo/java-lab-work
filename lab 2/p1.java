class Student {
    String name;
    int rollNo;

    
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}


public class p1 {
    public static void main(String[] args) {
        Student s1 = new Student("Karan", 101);
        s1.display();
    }
}