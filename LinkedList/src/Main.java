import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    record Place (String town, int distance ){
        //make the record display a certain way.
        @Override
        public String toString() {
            return String.format("%s (%d)", town, distance);
        }
    }

    public static void main(String[] args) {
        LinkedList<Place> locations = new LinkedList<>();
        Place adelaide = new Place("Adelaide", 1374);
        addPlace(locations, new Place("adelaide", 1374));
        addPlace(locations, new Place("Brisbane", 917));
        addPlace(locations, new Place("Perth", 3923));
        addPlace(locations, new Place("Alice Springs", 2771));
        addPlace(locations, new Place("Darwin", 3972));
        addPlace(locations, new Place("Melbourne", 877));
        locations.addFirst(new Place("Sydney", 0));
        System.out.println(locations);

        var iterator = locations.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        boolean forward = true;

        printMenu();
        while(!flag){
            if (!iterator.hasPrevious()){
                System.out.println("Organizing : "+iterator.next());
                forward = true;
            }

            if (!iterator.hasNext()){
                System.out.println("Final : "+iterator.previous());
                forward = true;
            }
            System.out.println("Enter Value");
            String selector = scanner.nextLine().toUpperCase().substring(0,1);

            switch(selector){
                case "F":
                    System.out.println("User want to go forward");
                    if(!forward){
                        forward = true;
                    }
                    if(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                case "M":
                    printMenu();
                    break;
                case "B":
                    System.out.println("User wants to go backwards");
                    if(iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "L":
                    System.out.println(locations);
                    break;
                default:
                    flag = true;
                    break;
            }


        }
    }

    private static void addPlace(LinkedList<Place> list, Place place){

        if(list.contains(place)){//this checks if there is already a similar record
            System.out.println("Found duplicate: "+ place);//show the item
            return;
        }

        for(Place p : list){//for the record in the list
            if(p.town().equalsIgnoreCase(place.town())){//checks if the record p is equal to the a record with a similar name ignore the cases
                System.out.println("Found duplicate: "+place);//show the record
                return;
            }
        }

        int matchedIndex = 0;
        for(var listPlace: list){
            if(place.distance() < listPlace.distance()){
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }

    private static void printMenu(){
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit
                """);
    }



}
