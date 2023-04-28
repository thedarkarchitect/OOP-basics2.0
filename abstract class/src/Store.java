import java.util.ArrayList;
public class Store{

    private static ArrayList<ProductForSale> productList = new ArrayList<>();
    public static void main(String[] args) {

    }

    public void addItemToOrder(OrderItem item){
        productList.add(item.product());
    }

    public void printOrder(){
        System.out.println(productList);
    }

}
