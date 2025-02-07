package oop_hus.lab11.decorator.ex2;

public class Test {
    public static void main(String[] args) {
        IceCream iceCream01 = new VanillaIceCream();
        System.out.println(iceCream01.getDescription());

        IceCream iceCream02 = new StrawberryIceCream();
        System.out.println(iceCream02.getDescription());

        IceCream iceCream03 = new ChocolateIceCream();
        System.out.println(iceCream03.getDescription());

        ToppingDecorator iceCream01Topping = new HoneyToppingDecorator(iceCream01);
        System.out.println(iceCream01Topping.getDescription());

        ToppingDecorator iceCream02Topping = new NutsToppingDecorator(iceCream02);
        System.out.println(iceCream02Topping.getDescription());

        ToppingDecorator iceCream01DoubleTopping = new NutsToppingDecorator(iceCream01Topping);
        System.out.println(iceCream01DoubleTopping.getDescription());
    }
}