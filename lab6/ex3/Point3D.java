package oop_hus.lab6.ex3;

public class Point3D extends Point2D {
    // z coordinate of the point
    private float z;

    // Constructor
    public Point3D() {
        super();
        z = 0.0f;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    // Getter and Setter

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", " + z;
    }
}
