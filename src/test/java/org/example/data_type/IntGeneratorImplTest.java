package org.example.data_type;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntGeneratorImplTest {

    @Test
    public void testNextInt() {
        IntGenerator intGenerator = new IntGeneratorImpl();
        assertEquals(intGenerator.nextInt(),0);
        assertEquals(intGenerator.nextInt(),1);
        assertEquals(intGenerator.nextInt(),2);
        assertEquals(intGenerator.nextInt(),3);
    }
}