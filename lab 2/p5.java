class Student {
    int[] marks;

    
    Student(int[] marks) {
        this.marks = marks;
    }

    
    void displayAverage() {
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        double avg = sum / (double) marks.length;

        System.out.println("Average Marks: " + avg);
    }
}


public class p5 {
    public static void main(String[] args) {
        int[] marks = {80, 75, 90, 85, 70};

        Student s1 = new Student(marks);
        s1.displayAverage();
    }
}