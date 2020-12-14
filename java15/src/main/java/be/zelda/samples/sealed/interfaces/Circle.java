package be.zelda.samples.sealed.interfaces;

public final class Circle implements Shape {

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public long area() {
        return Math.round(3.14 * radius * radius);
    }
}
