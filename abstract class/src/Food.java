public class Food extends ProductForSale{
    public Food(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    void showDetails() {
        System.out.println("These "+type+" is a Fresh organic harvest.");
        System.out.printf("The price a piece is $%6.2f %n", price);
        System.out.println(description);
    }
}
