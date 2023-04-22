import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();
        Scanner myObj = new Scanner(System.in);

        boolean flag = true;
        while(flag){
            switch (Integer.parseInt(action())) {
                case 0 -> {
                    groceryList.sort(Comparator.naturalOrder());//this should sort the arraylist into alphabetical order
                    System.out.println(groceryList);
                    flag = false;
                }
                case 1 -> {
                    System.out.println(",");
                    String item = myObj.nextLine();
                    if (groceryList.contains(item)) {
                        System.out.println("item already in grocery list");
                    } else {
                        groceryList.add(item);
                    }
                }
                case 2 -> {
                    System.out.println(",");
                    String items = myObj.nextLine();
                    groceryList.remove(items);
                }
                default -> System.out.println("invalid input");
            }

        }

    }

    public static String action(){
        System.out.println("Available actions: ");
        System.out.println("0 - to shutdown");
        System.out.println("1 - to add items(s) to list (comma delimited list)");
        System.out.println("2 - to remove any items (comma delimited list)");
        Scanner myObj = new Scanner(System.in);
        return myObj.nextLine();
    }
}
