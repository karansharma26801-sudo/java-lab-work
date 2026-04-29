class Student {
    String name;
    int marks;

    
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    
    void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}


public class p8 {
    public static void main(String[] args) {

        
        Student[] students = new Student[3];

        students[0] = new Student("Karan", 85);
        students[1] = new Student("Rahul", 90);
        students[2] = new Student("Aman", 78);

        
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}