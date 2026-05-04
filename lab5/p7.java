class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class p7 {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not Eligible");
        } else {
            System.out.println("You're Eligible");
        }
    }

    public static void main(String[] args) {
        int age = 19;

        try {
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}