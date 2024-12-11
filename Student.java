public class Student {

    // Constructor for the Student class
    public Student() {
        System.out.println("Creating student object");
    }

    // Method to say hello
    public void sayHello() {
        System.out.println("Hi, I am student");
    }

    public static void main(String[] args) {
        // Creating an object of the Student class
        Student student = new Student();
        student.sayHello();
    }
}
