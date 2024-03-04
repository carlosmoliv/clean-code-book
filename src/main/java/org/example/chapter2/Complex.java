package org.example.chapter2;

class Complex {
    private double real;
    private double imaginary;

    // Private constructor
    private Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Static factory method with a descriptive name
    public static Complex fromRealNumber(double real) {
        return new Complex(real, 0);
    }

    // Another static factory method, perhaps creating a complex number from polar coordinates
    public static Complex fromPolarCoordinates(double radius, double angle) {
        // Implementation here
        // Example: Convert polar coordinates to rectangular coordinates
        double realPart = radius * Math.cos(angle);
        double imagPart = radius * Math.sin(angle);
        return new Complex(realPart, imagPart);
    }
}