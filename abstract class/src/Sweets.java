public class Sweets extends ProductForSale{
    public Sweets(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    void showDetails() {
        System.out.println("This "+type+" is a real treat.");
        System.out.printf("The price a piece is $%6.2f %n", price);
        System.out.println(description);
    }
}
