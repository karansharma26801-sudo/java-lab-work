class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Subclass
class Patient extends Person {
    String disease;
    String doctorAssigned;

    Patient(String name, int age, String disease, String doctorAssigned) {
        super(name, age); // initialize parent data
        this.disease = disease;
        this.doctorAssigned = doctorAssigned;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
        System.out.println("Doctor Assigned: " + doctorAssigned);
    }
}

public class p6 {
    public static void main(String[] args) {
        Patient p = new Patient("Ravi", 30, "Fever", "Dr. Sharma");
        p.display();
    }
}
