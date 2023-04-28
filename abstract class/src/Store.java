import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product){};
public class Store{
    private static ArrayList<ProductForSale> productList = new ArrayList<>();
    public static void main(String[] args) {
        productList.add(new Food("grapes", 24, "A healthy breakfast addition"));
        productList.add(new Food("screw driver", 12, "handy to have around the house"));
        listProducts();

        System.out.println("\nOrder1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 4);
        printOrder(order1);

    }

    public static void listProducts(){
        for(var item : productList){
            System.out.println("-".repeat(50));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty){
        var products = productList.get(orderIndex);
        productList.add(new OrderItem(qty, products));
    }

    public static void printOrder(ArrayList<OrderItem> order){//a list of the records
        double salesTotal = 0;//this will keep track of sales by the order
        for(var item : order){
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }
}
