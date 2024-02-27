package org.example;

public class Main {
    public static void main(String[] args) {
        ComplexN a = new ComplexN(1,1);
        ComplexN b = new ComplexN(1,1);
        Service cs = new Service();
        System.out.println("a: " + cs.str(a));
        System.out.println("b: " + cs.str(b));
        System.out.println("Sum: " + cs.str(cs.add(a,b)));
        System.out.println("Del: " + cs.str(cs.sub(a,b)));
        System.out.println("Mul: " + cs.str(cs.mul(a,b)));
        System.out.println("Частное: " + cs.str(cs.div(a,b)));
        System.out.println("Модуль a: " + cs.mod(a));
        System.out.println("Модуль b: " + cs.mod(b));
        System.out.println("Сравнение a и перегруженного конструктора: " + cs.equal(a, new ComplexN()));
        System.out.println("Сравнение a и b: " + cs.equal(a,b));
    }
}