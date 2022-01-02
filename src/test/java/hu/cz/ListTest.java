package hu.cz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {
    private List tList = new List();
    @BeforeEach
    void init(){
        tList.add("Gyuszi");
        tList.add("Gizi");
        tList.add("Nyuszika");
    }

    @Test
    void add() {
        tList.add("Gyuszika");
        assertEquals(4,tList.getSize());
    }

    @Test
    void remove() {
        assertThrows(NoSuchElementException.class,()->{tList.remove("Ádika");});
    }

    @Test
    void isEmpty() {
        assertFalse(tList.isEmpty());
    }

    @Test
    void removeAll() {
        tList.removeAll();
        assertTrue(tList.isEmpty());
    }

    @Test
    void getSize() {
        assertEquals(3,tList.getSize(),"Méretteszt");
    }
    @AfterEach
    void destroy(){
        tList.removeAll();
    }
}