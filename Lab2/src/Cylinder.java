// Name: Thong Minh Tran
// ID: 40072745
// Lab 2 (Section J-X - 23 September, 2020)

public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double r, double h) {
        this.radius = r;
        this.height = h;
    }

    public Cylinder(Cylinder cylinder) {
        this.radius = cylinder.radius;
        this.height = cylinder.height;
    }

    public static double getTotalArea(Cylinder[] cylinders) {
        double sum = 0.0;
        for (int i = 0; i < cylinders.length; i++) {
            sum += cylinders[i].getArea();
        }
        return sum;
    }

    public boolean Equals(Cylinder cylinder) {
        if (this.height == cylinder.height && this.radius == cylinder.radius)
            return true;
        return false;
    }

    public double getArea() {
        double area = 2 * radius * radius * Math.PI + 2 * radius * height * Math.PI;
        return area;
    }

    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                ", area=" + getArea() +
                '}';
    }

    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


}
