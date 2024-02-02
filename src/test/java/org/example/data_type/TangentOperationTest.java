package org.example.data_type;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TangentOperationTest {

    public static double DELTA = 0.00005;

    TangentOperation tangentOperation = new TangentOperation();

    @Test
    public void testApply() {
        assertEquals(tangentOperation.apply(1), 1.5574, DELTA);
        assertEquals(tangentOperation.apply(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(tangentOperation.apply(Double.POSITIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(tangentOperation.apply(Double.NaN), Double.NaN, DELTA);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(tangentOperation.applyTriple(100), -0.785, DELTA);
        assertEquals(tangentOperation.applyTriple(Double.NaN), Double.NaN, DELTA);
        assertEquals(tangentOperation.applyTriple(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(tangentOperation.applyTriple(Double.POSITIVE_INFINITY), Double.NaN, DELTA);
    }
}