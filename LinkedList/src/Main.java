import java.util.LinkedList;

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
        System.out.println(locations);

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


}
