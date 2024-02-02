package org.example.data_type;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SqrtOperationTest {

    public static double DELTA = 0.00005;

    SqrtOperation sqrtOperation = new SqrtOperation();

    @Test
    public void testApply() {
        assertEquals(sqrtOperation.apply(1), 1, DELTA);
        assertEquals(sqrtOperation.apply(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(sqrtOperation.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(sqrtOperation.apply(Double.NaN), Double.NaN, DELTA);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(sqrtOperation.applyTriple(100), 1.77827, DELTA);
        assertEquals(sqrtOperation.applyTriple(Double.NaN), Double.NaN, DELTA);
        assertEquals(sqrtOperation.applyTriple(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(sqrtOperation.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
    }
}