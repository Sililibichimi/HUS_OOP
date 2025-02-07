package oop_hus.lab5.Ex1;

public class TestMyComplex {

    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(1.0, 2.32);
        MyComplex c2 = new MyComplex(3.321, -4.324);
        MyComplex c3 = new MyComplex();
        System.out.println(c1.getReal());
        System.out.println(c2.getImag());
        c1.setImag(1.3);
        c2.setReal(3.0);
        c3.setValue(1.43, 3.54);
        System.out.println(c1);
        System.out.println("is real? " + c1.isReal());
        System.out.println("is imaginary? " + c2.isImaginary());
        System.out.println(c3.equals(1.3, 3.54));
        System.out.println(c3.equals(c1));
        System.out.println(c3.argument());
        System.out.println(c3.magnitude());
        System.out.println(c1.add(c2));
        System.out.println(c1.subtract(c2));
        System.out.println(c1.multiply(c2));
        System.out.println(c1.divide(c2));
        System.out.println(c1.conjugate());
    }

}
