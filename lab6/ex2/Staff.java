package oop_hus.lab6.ex2;

public class Staff extends Person {
    // School and pay of the staff
    private String school;
    private double pay;

    // constructor
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    // Getter and Setter

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    // toString
    @Override
    public String toString() {
        return "Staff[" + super.toString()
                + ",school=" + school
                + ",pay=" + pay + "]";
    }
}
