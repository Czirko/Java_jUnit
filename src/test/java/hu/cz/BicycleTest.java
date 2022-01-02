package hu.cz;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicycleTest {
    Bicycle bike;


    void init(){
        bike= new Bicycle();
    }

    @Test
    void sum() {
        init();
        assertEquals(3,bike.sum(1,1,1));
    }
}