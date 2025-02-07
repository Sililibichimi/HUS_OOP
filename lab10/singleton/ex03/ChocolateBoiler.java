package oop_hus.lab10.singleton.ex03;

public class ChocolateBoiler {
    private static ChocolateBoiler uniqueInstance;

    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void setBoiled(boolean boiled) {
        this.boiled = boiled;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Create unique instance of Chocolate Boiler");
            uniqueInstance = new ChocolateBoiler();
        } else System.out.println("Return unique instance of Chocolate Boiler");
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    @Override
    public String toString() {
        return "ChocolateBoiler{" +
                "empty=" + empty +
                ", boiled=" + boiled +
                '}';
    }
}
