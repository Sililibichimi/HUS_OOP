package oop_hus.lab6.ex2;

public class TestPerson {

    public static void main(String[] args) {
        // Test Student
        // create a student with name, address, program, year and fee
        Student student = new Student("Duc Si", "18 Nam Dinh", "Mathematics and Computer Science", 2020, 69432);
        System.out.println(student);
        System.out.println("Student name: " + student.getName()
                + " , address: " + student.getAddress()
                + " , program: " + student.getProgram()
                + " , year: " + student.getYear()
                + " , fee: " + student.getFee());
        // Test Staff
        // create a staff with name, address, school and pay
        Staff staff = new Staff("God", "Thien dang", "HaNoi university of sciences", 5000);
        System.out.println(staff);
        System.out.println("Staff name: " + staff.getName()
                + " , address: " + staff.getAddress()
                + " , school: " + staff.getSchool()
                + " , pay: " + staff.getPay());
        // Test Person
        // create a person with name and address
        Student student1 = new Student("Duc Si", "18 Nam Dinh", "Mathematics and Computer Science", 2020, 69432);
        System.out.println(student1);
        System.out.println("Person name: " + student1.getName()
                + " , address: " + student1.getAddress());
        if (student1 instanceof Student) {
            System.out.println(student1);
        } else {
            System.out.println("Person is not an instance of Person");
        }
    }
}
