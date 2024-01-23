package org.example.data_type;

public class Point {
    final double x, y, z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return java.lang.Math.sqrt(x * x + y * y + z * z);
    }
}
