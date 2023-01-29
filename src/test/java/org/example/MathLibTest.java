package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathLibTest extends MainTest {

    @Test
    public void sumTest(){
        assertEquals(3, MathLib.makeSum(1,2));
    }


}
