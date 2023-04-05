public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "height=" + height +
                '}';
    }

    public double getVolume(){
        return getArea() * height;
    }

    public double getHeight() {
        if (height < 0){
            height = 0;
        }
        return height;
    }



}
