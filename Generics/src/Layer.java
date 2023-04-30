import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Layer <T extends Mappable>{
    private List<T> layerElements;

    public Layer(Park[] layerElements) {
        this.layerElements =new ArrayList<T>((Collection<? extends T>) List.of(layerElements));
    }

    public void addElements(T... elements){
        layerElements.addAll(List.of(elements));
    }

    public void renderLayer(){
        for(T element : layerElements){
            element.render();//this method is from interface that he layer class type T extends
        }
    }
}
