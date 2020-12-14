package be.zelda.samples.sealed.interfaces;

public non-sealed class Rectangle implements Shape {

    private final int length;
    private final int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public long area() {
        return length * width;
    }
}