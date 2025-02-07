package oop_hus.lab10.strategy.ex03;

public class Host {
    private Sort strategy;

    public Host() {

    }

    public void setStrategy(Sort algorithm) {
        strategy = algorithm;
    }

    public int[] sort(int[] a) {
        return strategy.sort(a);
    }
}
