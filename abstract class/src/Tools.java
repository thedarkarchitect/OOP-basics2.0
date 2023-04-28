public class Tools extends ProductForSale{

    public Tools(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    void showDetails() {
        System.out.println("This "+type+" is a genuine tool.");
        System.out.printf("The price of the piece is $%6.2f %n", price);
        System.out.println(description);
    }
}
