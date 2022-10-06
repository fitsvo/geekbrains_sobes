import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LinkedList {

    List<Object> array = new ArrayList<>();

    public LinkedList() {
    }

    public LinkedList(Collection<Object> c) {
        this.array = List.of(c.toArray());
    }



    public boolean contains(Object o) {
        Object[] newArray = this.array.toArray();
        for (Object value : newArray) {
            if (value.equals(o))
                return true;
        }
        return false;
    }

    public Object get(int index) {
        Object[] newArray = this.array.toArray();
        return newArray[index];
    }

    public int indexOf(Object o) {
        Object[] newArray = this.array.toArray();
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i].equals(o))
                return i;
        }
        return -1;
    }

    public int size() {
        return this.array.toArray().length;
    }
}
