public class Car {
    private boolean engine;
    private int cylinder;
    private String name;
    private int wheels;

    public Car(int cylinder, String name) {
        this.wheels =4;
        this.engine = true;
        this.cylinder = cylinder;
        this.name = name;
    }

    public String startEngine(){
        return getClass().getSimpleName()+" -> startEngine()";
    }

    public String accelerate(){
        return getClass().getSimpleName()+" -> accelerate()";
    }

    public String brake(){
        return getClass().getSimpleName()+" -> brake()";
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }
}
