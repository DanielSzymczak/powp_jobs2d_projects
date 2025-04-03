package edu.kis.powp.jobs2d.transformations;

public class rotateTransformation implements Transformation {
    private final double cos, sin;

    public rotateTransformation(double degrees) {
        double radians = Math.toRadians(degrees);
        this.cos = Math.cos(radians);
        this.sin = Math.sin(radians);
    }

    @Override
    public int[] apply(int x, int y) {
        return new int[] {
                (int) Math.round(x * cos - y * sin),
                (int) Math.round(x * sin + y * cos)
        };
    }
}