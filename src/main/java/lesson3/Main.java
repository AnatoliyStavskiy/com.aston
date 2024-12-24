package lesson3;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Arnold", "Fireman", "Arnold@mail.ru", "+375-29-222-47-32", 1500, 25);
        employee.info();

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Alan", "Actor", "Alan@gmail.com", "+375-44-111-11-11", 2000, 35);
        employeeArray[1] = new Employee("Helen", "Teacher", "Helen@yandex.ru", "+375-33-666-66-66", 1800, 27);
        employeeArray[2] = new Employee("Bob", "Cook", "Bob@mail.ru", "+375-29-333-33-33", 1200, 22);
        employeeArray[3] = new Employee("Jessica", "Lawyer", "Jessica@yahoo.com", "+375-44-777-77-77", 2350, 41);
        employeeArray[4] = new Employee("John", "Doctor", "John@gmail.com", "+375-33-222-22-22", 2123, 39);

        Park cityPark = new Park();
        Park.Attraction attraction1 = cityPark.new Attraction("Mini-Jet", "08:00-20:00", 15);
        Park.Attraction attraction2 = cityPark.new Attraction("Ferris Wheel", "13:00-23:00", 20);
        Park.Attraction attraction3 = new Park().new Attraction("Сarousel", "08:00-15:00", 5);
    }
}
