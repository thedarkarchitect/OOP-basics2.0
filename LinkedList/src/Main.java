import java.util.LinkedList;

public class Main {
    record Place (String town, int distance ){
        //make the record display a certain way

        @Override
        public String toString() {
            return String.format("%s (%d)", town, distance);
        }
    }

    public static void main(String[] args) {
        LinkedList<Place> locations = new LinkedList<>();
        Place adelaide = new Place("Adelaide", 1374);
        addPlace(locations, adelaide);
        System.out.println(locations);

//        location.add(new PLace("Adelaide", 1374));
//        location.add(new PLace("Alice Springs", 2771));
//        location.add(new PLace("Brisbane", 917));
//        location.add(new PLace("Darwin", 3972));
//        location.add(new PLace("Melbourne", 877));
//        location.add(new PLace("Perth", 3923));
////        program(location);
//        Iterator<PLace> show = location.iterator();
//
//        System.out.println(show.next());
//        System.out.println(show.pre);

    }

    private static void addPlace(LinkedList<Place> list, Place place){

    }


}
