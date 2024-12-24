package lesson3;

public class Employee {

    String name;
    String jobTitle;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public void info() {
        System.out.println("name: " + name + "\n" + " jobTitle: " + jobTitle + "\n" + " email: " + email + "\n"
                + " phoneNumber: " + phoneNumber + "\n" + " salary: " + salary + "\n" + " age: " + age);
    }

    public Employee(String name, String jobTitle, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
}
