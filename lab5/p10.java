import java.util.Scanner;

class Student {
     String name;
     int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void processResult() throws Exception {
        if (marks < 0 || marks > 100) {
            throw new Exception("Invalid Marks! Must be between 0 and 100.");
        } else if (marks >= 60) {
            System.out.println(name + " has passed.");
        } else {
            System.out.println(name + " has failed.");
        }
    }
}

public class p10 {
    public static void calculateAvg(int s, int l) throws Exception {
        if (l <= 0) {
            throw new Exception("Length must be greater than zero.");
        }
            double avg = s/l;
            System.out.println("Average Marks: " + avg);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter the number of students : ");
            int n = sc.nextInt();
            sc.nextLine();
            int count = 0;
            while (count < n) {
                System.out.print("Enter name of student : ");
                String i = sc.nextLine();
                System.out.println("Enter marks for 5 subjects");
                System.out.print("Enter marks for physics : ");
                int phy = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter marks for maths : ");
                int mth = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter marks for biology : ");
                int bio = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter marks for cs : ");
                int cs = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter marks for english : ");
                int eng = sc.nextInt();
                sc.nextLine();
                int marks = phy + mth + bio + cs + eng;
                int total = marks;
                Student[] students = new Student[n];
                students[count] = new Student(i, marks);
                
                try {
                    students[count].processResult();
                    calculateAvg(total,5);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                count++;
        }
    }
}