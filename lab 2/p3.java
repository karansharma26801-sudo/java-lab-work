class Employee {
    String name;
    String designation;
    double salary;

    
    Employee(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

 
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

public class p3{
    public static void main(String[] args) {
        Employee e1 = new Employee("Karan", "Manager", 50000);
        e1.display();
    }
}