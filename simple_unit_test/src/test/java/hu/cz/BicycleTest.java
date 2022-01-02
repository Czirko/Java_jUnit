package hu.cz;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class BicycleTest {
    Bicycle bike;

    DbConnection dbconn = Mockito.mock(DbConnection.class);

    @BeforeEach
    void init() {
        bike = new Bicycle(dbconn);
    }

    @Test
    void sum() {
        when(dbconn.checkUserPass("Gyula", "pass")).thenReturn(true);
        Integer exp = 3;
        assertEquals(exp, bike.sum("Gyula", "pass", 1, 1, 1));
        verify(dbconn).checkUserPass("Gyula","pass");

    }
}