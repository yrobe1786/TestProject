package org.example;

public class ComplexN {
    private double x, y;

    ComplexN(double x, double y){
        this.x=x;
        this.y=y;
    }
    ComplexN(){
        x=5;
        y=3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComplexN complex = (ComplexN) o;

        if (Double.compare(x, complex.x) != 0) return false;
        return Double.compare(y, complex.y) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
