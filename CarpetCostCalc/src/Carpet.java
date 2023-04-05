public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "cost=" + cost +
                '}';
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost < 0){
            cost = 0;
        }
        this.cost = cost;
    }
}
