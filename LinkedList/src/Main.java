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
        addPlace(locations, new Place("adelaide", 1374));//we using this to test duplicate elements action from the addPlace method
        addPlace(locations, new Place("Brisbane", 917));
        addPlace(locations, new Place("Perth", 3923));
        addPlace(locations, new Place("Alice Springs", 2771));
        addPlace(locations, new Place("Darwin", 3972));
        addPlace(locations, new Place("Melbourne", 877));
        locations.addFirst(new Place("Sydney", 0));//this makes this record the first in the linked list
        System.out.println(locations);

        var iterator = locations.listIterator();//this will set cursors so we can move forward and back without affecting the list index
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        boolean forward = true;//this flag with be used to move forward or back in the linked list

        printMenu();
        while(!flag){
            if (!iterator.hasPrevious()){//this checks if you not at he back
                System.out.println("Organizing : "+iterator.next());//this will print the first element
                forward = true;
            }

            if (!iterator.hasNext()){//if you not at the front
                System.out.println("Final : "+iterator.previous());
                forward = true;
            }
            System.out.println("Enter Value");
            String selector = scanner.nextLine().toUpperCase().substring(0,1);//this gets the first letter in the string

            switch(selector){
                case "F":
                    System.out.println("User want to go forward");
                    if(!forward){ //REversing the direction og the cusor
                        forward = true;
                        if(iterator.hasNext()){
                            iterator.next();//Adjust position to move forward
                        }
                    }
                    if(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                case "M":
                    printMenu(); //reprints the module if it's needed
                    break;
                case "B":
                    System.out.println("User wants to go backwards");
                    if(forward){ //reverse direction
                        forward = false;
                        if(iterator.hasPrevious()){
                            iterator.previous();//adjust position to move backwards
                        }
                    }

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

        if(list.contains(place)){//this checks if there is already a similar record using the listiterator method contains.
            System.out.println("Found duplicate: "+ place);//show the duplicate item
            return;
        }

        for(Place p : list){//for the record in the list that is similar to the towns in the Place record
            if(p.town().equalsIgnoreCase(place.town())){//checks if the record p is equal to the a record with a similar name ignore the cases
                //p.town() name of town in the list
                //place.town() name in the record being inserted
                System.out.println("Found duplicate: "+place);//show the record
                return;
            }
        }

        int matchedIndex = 0;
        for(var listPlace: list){//this organise the list from the start point to the furthest point in terms of distance
            if(place.distance() < listPlace.distance()){
                list.add(matchedIndex, place); //we shall add the record entered in the index after the listplace is less than place entered
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
