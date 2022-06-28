import java.util.ArrayList;

public class ObjectList<String> extends ArrayList<String> {

        public boolean add(T value){
                return super.add(value);
        }

        public T get(int index){
                return super.get(index);
        }
}
