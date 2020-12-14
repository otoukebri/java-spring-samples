package be.zelda.samples.sealed.interfaces;

public sealed interface Shape permits Circle, Rectangle {
    long area();
}
