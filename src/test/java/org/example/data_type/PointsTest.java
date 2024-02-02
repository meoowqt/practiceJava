package org.example.data_type;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointsTest {
    public static double DELTA = 0.00005;

    private boolean equalsApproximately(double x, double y) {
        return Math.abs(x - y) <= DELTA;
    }

    private boolean equalsApproximately(Point p1, Point p2) {
        return (Math.abs(p1.x - p2.x) <= DELTA) & (Math.abs(p1.y - p2.y) <= DELTA);
    }

    @Test
    public void testsSum() {
        assertTrue(equalsApproximately(Points.sum(new Point(1., -2., 3.), new Point(2., -4., -1.)), new Point(3., -6., 2.)));
        assertTrue(equalsApproximately(Points.sum(new Point(0., 0.5, -4.5), new Point(-1., -0.5, 5)), new Point(-1., 0., 0.5)));
    }

    @Test
    public void testSubtract() {
        assertTrue(equalsApproximately(Points.subtract(new Point(-1., 3., 5.), new Point(1., 1., 1.)), new Point(-2., 2., 4)));
        assertTrue(equalsApproximately(Points.subtract(new Point(-3., 1.5, 6.), new Point(-1., 1., 2.)), new Point(-2., 0.5, 4)));
    }

    @Test
    public void testMultiply() {
        assertTrue(equalsApproximately(Points.multiply(new Point(1, 4, 3), new Point(2, 3, 0)), new Point(2, 12, 0)));
        assertTrue(equalsApproximately(Points.multiply(new Point(-2, 0.5, -2), new Point(1, 2, -1)), new Point(-2, 1, 2)));
    }

    @Test
    public void testDivide() {
        assertTrue(equalsApproximately(Points.divide(new Point(4, 6, -8), new Point(2, -3, -4)), new Point(2, -2, 2)));
        assertTrue(equalsApproximately(Points.divide(new Point(9, -8, 1.5), new Point(-3, 4, 3)), new Point(-3, -2, 0.5)));
    }

    @Test
    public void testEnlarge() {
        assertTrue(equalsApproximately(Points.enlarge(new Point(4, 6, -8), 1), new Point(4, 6, -8)));
        assertTrue(equalsApproximately(Points.enlarge(new Point(9, -8, 1.5), 2), new Point(18, -16, 3)));
    }

    @Test
    public void testInverse() {
        assertTrue(equalsApproximately(Points.inverse(new Point(4, 5, -2)), new Point(0.25, 0.2, -0.5)));
    }

    @Test
    public void testLength() {
        assertEquals(Points.length(new Point(4, 6, -8)), 10.77032, DELTA);
        assertEquals((Points.length(new Point(1, -2, 0))), Math.sqrt(5), DELTA);
    }

    @Test
    public void testOpposite() {
        assertTrue(equalsApproximately(Points.opposite(new Point(4, 6, -8)), new Point(-4, -6, 8)));
        assertTrue(equalsApproximately(Points.opposite(new Point(0, -1, 0.5)), new Point(0, 1, -0.5)));
    }

    @Test
    public void testVectorProduct() {
        assertTrue(equalsApproximately(Points.vectorProduct(new Point(3.0, 2.0, 1.0), new Point(-1.0, 4.0, 5.0)), new Point(6.0, -16.0, 14.0)));
        assertTrue(equalsApproximately(Points.vectorProduct(new Point(0.0, 7.0, 1.5), new Point(1.5, 2., -3.)), new Point(-24.0, 2.25, -10.5)));
    }

    @Test
    public void testsScalarProduct() {
        assertEquals(Points.scalarProduct(new Point(1., -1., 0.5), new Point(2., 4., 6.)), 1., DELTA);
        assertEquals(Points.scalarProduct(new Point(5., 2., 0.), new Point(0.2, 4., 1.)), 9., DELTA);
    }
}