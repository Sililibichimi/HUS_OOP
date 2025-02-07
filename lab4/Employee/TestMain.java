package oop_hus.lab4.Employee;

public class TestMain {
    public static void main(String[] args) {
        // Test constructor and toString()
        Employee employee1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(employee1);  // toString()

        // Test setters and getters
        employee1.setSalary(999);
        System.out.println(employee1);  // toString()
        System.out.println("id is: " + employee1.getID());
        System.out.println("firstName is: " + employee1.getFirstName());
        System.out.println("lastName is: " + employee1.getLastName());
        System.out.println("salary is: " + employee1.getSalary());

        System.out.println("name is: " + employee1.getName());
        System.out.println("annual salary is: " + employee1.getAnnualSalary()); // Test method

        // Test raiseSalary()
        System.out.println(employee1.raiseSalary(10));
        System.out.println(employee1);

    }
}
