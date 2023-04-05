public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea() * this.height;
    }


}
