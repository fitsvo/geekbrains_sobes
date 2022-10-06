import java.util.Collection;
import java.util.List;

public class ArrayList {
    List<Object> array = new java.util.ArrayList<>();

    public ArrayList() {
        this.array = new java.util.ArrayList<>();
    }

    public ArrayList(Collection<Object> array) {
        this.array = (List<Object>) array;
    }

    public List<Object> add(Object o) {
        Object[] newArray = new Object[(int) (this.array.size() + 1)];
        newArray[this.array.size() + 1] = o;
        return List.of(newArray);
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
        if (index > this.array.size() - 1) throw new IndexOutOfBoundsException("Индекс больше размера списка");
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
