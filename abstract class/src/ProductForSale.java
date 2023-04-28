abstract class ProductForSale {
    public String type;
    public double price;
    public String description;

    public void printPricedItem(int qty){};
    public double getSalesPrice(int qty){
        return 0.0;
    };

    abstract void showDetails();

}
