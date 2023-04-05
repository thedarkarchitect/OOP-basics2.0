public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if (radius < 0){
            radius = 0;
        }
        this.radius = radius;
    }
}
