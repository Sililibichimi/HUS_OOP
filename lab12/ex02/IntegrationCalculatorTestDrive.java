package oop_hus.lab12.ex02;

public class IntegrationCalculatorTestDrive {
    public static void main(String[] args) {

        testArrayPolynomial();
        testListPolynomial();
        testIntegrationCalculator();
    }

    public static void testArrayPolynomial() {
        System.out.println("Array Polynomial:");

        ArrayPolynomial poly1 = new ArrayPolynomial();
        poly1.append(9);
        poly1.append(6);
        poly1.append(6.9);
        poly1.set(6.9, 2);
        poly1.append(2);
        System.out.println("First poly:");
        System.out.println(poly1);

        ArrayPolynomial poly2 = new ArrayPolynomial();
        poly2.append(6);
        poly2.append(9);
        poly2.append(3.1);
        poly2.set(2.2, 1);
        System.out.println("Second poly:");
        System.out.println(poly2);

        System.out.println("Add 2 polys:");
        System.out.println(poly1.plus(poly2).toString());

        System.out.println("Minus 2 polys:");
        System.out.println(poly1.minus(poly2).toString());

        System.out.println("Multiply 2 polys:");
        System.out.println(poly1.multiply(poly2).toString());

        System.out.println("Value of first poly with x = 2:");
        System.out.println(poly1.evaluate(2));

        System.out.println("Value of second poly with x = 2:");
        System.out.println(poly2.evaluate(2));
        System.out.println();
    }

    public static void testListPolynomial() {
        System.out.println("List Polynomial:");

        ListPolynomial poly1 = new ListPolynomial();
        poly1.append(6.9);
        poly1.append(9.6);
        poly1.append(69);
        poly1.set(696, 2);
        poly1.append(888);
        System.out.println("First poly:");
        System.out.println(poly1);

        ListPolynomial poly2 = new ListPolynomial();
        poly2.append(10);
        poly2.append(32);
        poly2.append(33);
        poly2.set(21, 1);
        System.out.println("Second poly:");
        System.out.println(poly2);

        System.out.println("Add 2 polys:");
        System.out.println(poly1.plus(poly2).toString());

        System.out.println("Minus 2 polys:");
        System.out.println(poly1.minus(poly2).toString());

        System.out.println("Multiply 2 polys:");
        System.out.println(poly1.multiply(poly2).toString());

        System.out.println("Value of first poly with x = 2:");
        System.out.println(poly1.evaluate(2));

        System.out.println("Value of second poly with x = 2:");
        System.out.println(poly2.evaluate(2));
        System.out.println();
    }

    public static void testIntegrationCalculator() {
        Polynomial poly = new ListPolynomial();
        ListPolynomial poly1 = (ListPolynomial) poly;
        poly1.append(1);
        poly1.append(5);
        poly1.append(3);
        poly1.set(2, 1);
        System.out.println("Polynomial:");
        System.out.println(poly1);

        SimpsonRule simpsonRule = new SimpsonRule(0.1, 699);
        MidpointRule midpointRule = new MidpointRule(0.1, 699);
        TrapezoidRule trapezoidRule = new TrapezoidRule(0.1, 699);

        IntegrationCalculator simpson = new IntegrationCalculator(simpsonRule, poly1);
        IntegrationCalculator midpoint = new IntegrationCalculator(midpointRule, poly1);
        IntegrationCalculator trapezoid = new IntegrationCalculator(trapezoidRule, poly1);

        String result = "";
        result += "SimpsonRule: " + simpson.integrate(-6, 9) + "\n";
        result += "MidpointRule: " + midpoint.integrate(6, 9) + "\n";
        result += "TrapezoidRule: " + trapezoid.integrate(-10, 10) + "\n";

        System.out.print(result);
    }
}
