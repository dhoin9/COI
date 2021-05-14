package com.example.demo.coi;

import org.junit.Test;

import static org.junit.Assert.*;

public class NineTest {
    @Test
    public void check() {
        assertEquals(true, Nine.check("RADa", "dara"));

    }

    @Test
    public void check2() {
        assertEquals(false, Nine.check("RADam", "dara"));
    }

    @Test
    public void check3() {
        assertEquals(true, Nine.check("rada", "dara"));
    }

}