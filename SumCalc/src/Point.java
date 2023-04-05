public class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(){

    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Double distance(){
        Double dist =  Math.sqrt((this.x)*(this.x) + (this.y)*(this.y));
        return dist;
    }
    public Double distance(int xB, int yB){
        Double dist =  Math.sqrt((this.x - xB)*(this.x - xB) + (this.y - yB)*(this.y - yB));
        return dist;
    }

    public Double distance(Point another){
        double dist = Math.sqrt((another.x - this.x)*(another.x - this.x) + (another.y - this.y) * (another.y - this.y));
        return dist;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
