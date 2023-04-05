public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public double getArea(){
        return this.width * this.length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0){
            width = 0;
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<0){
            length = 0;
        }
        this.length = length;
    }
}
