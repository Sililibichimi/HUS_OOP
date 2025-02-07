package oop_hus.lab10.adapter;

public class RoundHole {
    int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    int getRadius() {
        return this.radius;
    }

    boolean fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }
}
