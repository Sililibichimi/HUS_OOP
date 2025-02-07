package oop_hus.lab11.decorator.ex2;

public class HoneyToppingDecorator extends ToppingDecorator {
    private IceCream iceCream;

    public HoneyToppingDecorator(IceCream iceCream) {
        super();
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " with " + this.addTopping();
    }

    @Override
    public String addTopping() {
        return "Honey topping";
    }
}