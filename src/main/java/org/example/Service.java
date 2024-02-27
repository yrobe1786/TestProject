package org.example;

public class Service {
    public String str(ComplexN a){
        return a.getY()<0 ? Double.toString(a.getX())+a.getY() +"i" :
                a.getX()+"+"+a.getY() +"i";
    }
    public ComplexN add(ComplexN a, ComplexN b) {
        return new ComplexN(a.getX() + b.getX(), a.getY() + b.getY());
    }

    public ComplexN sub(ComplexN a, ComplexN b) {
        return new ComplexN(a.getX() - b.getX(), a.getY() - b.getY());
    }

    public ComplexN mul(ComplexN a, ComplexN b) {
        return new ComplexN(a.getX() * b.getX() - a.getY() * b.getY(), a.getX() * b.getY() + b.getX() * a.getY());
    }

    public ComplexN div(ComplexN a, ComplexN b) {
        double x = a.getX();
        double x1 = b.getX();
        double y = a.getY();
        double y1 = b.getY();
        double denom = Math.pow(x1, 2) + Math.pow(y1, 2);
        double real = (x * x1 + y * y1) / denom;
        double imaginary = (x1 * y - x * y1) / denom;
        return new ComplexN(real, imaginary);
    }

    public boolean equal(ComplexN a, ComplexN b) {
        return (a.getX() == b.getX()) && (a.getY() == b.getY());
    }

    public double mod(ComplexN a) {
        return Math.sqrt(Math.pow(a.getX(), 2) + Math.pow(a.getY(), 2));
    }
}
