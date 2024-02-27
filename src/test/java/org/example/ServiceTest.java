package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexServiceTest {

    ComplexN c1;
    ComplexN c2;
    @BeforeEach
    void init() {
        c1 = new ComplexN(1,2);
        c2 = new ComplexN(3,4);
    }
    @Test
    void str() {
        Service comServ = new Service();
        assertEquals("1.0+2.0i", comServ.str(c1));
        assertEquals("3.0+4.0i", comServ.str(c2));
    }

    @Test
    void add() {
        Service comServ = new Service();
        assertEquals(new ComplexN(4,6), comServ.add(c1,c2));
    }

    @Test
    void sub() {
        Service comServ = new Service();
        assertEquals(new ComplexN(-2,-2), comServ.sub(c1,c2));
    }

    @Test
    void mul() {
        Service comServ = new Service();
        assertEquals(new ComplexN(-5,10), comServ.mul(c1,c2));
    }

    @Test
    void div() {
        Service comServ = new Service();
        assertEquals(new ComplexN(0.44,0.08), comServ.div(c1,c2));
    }

    @Test
    void equal() {
        Service comServ = new Service();
        assertEquals(false, comServ.equal(c1,c2));
        assertEquals(true, comServ.equal(new ComplexN(),new ComplexN()));
    }

    @Test
    void mod() {
        Double n = 2.23606797749979;
        Double n1 = 5.0;
        Service comServ = new Service();
        assertEquals(n, comServ.mod(c1));
        assertEquals(n1, comServ.mod(c2));
    }
}