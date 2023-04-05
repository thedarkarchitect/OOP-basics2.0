public class Main3 {
    public static void main(String[] args) {
        WallArea wall = new WallArea(5.0, 4.0);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
