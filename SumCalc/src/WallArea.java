public class WallArea {
    private Double height;
    private Double width;

    public WallArea(){

    }
    public WallArea(Double width, Double height) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "WallArea{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public Double getArea(){
        return this.height * this.width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        if(height < 0){
            height = 0.0;
        }
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        if (width < 0){
            width = 0.0;
        }
        this.width = width;
    }
}
