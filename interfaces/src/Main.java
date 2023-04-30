import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Kampala Town Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Kampala National Theatre", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Namboole Stadium", UsageType.SPORTS));

        mappables.add(new UtilityLine("Simba Cable", UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("National Water", UtilityType.WATER));
        for(var m: mappables){
            Mappable.mapIt(m);
        }
    }
}
