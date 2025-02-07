package oop_hus.lab11.decorator.ex2;

public class NutsToppingDecorator extends ToppingDecorator {
    private IceCream iceCream;

    public NutsToppingDecorator(IceCream iceCream) {
        super();
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " with " + this.addTopping();
    }

    @Override
    public String addTopping() {
        return "Nuts topping";
    }
}