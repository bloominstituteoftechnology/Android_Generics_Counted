import java.util.ArrayList;

public class CountedSet<T> {
    ArrayList<T> data = new ArrayList<>();

    public CountedSet() {
        this.data = data;
    }

    public void insert(T item) {
        data.add(item);
    }

    public void remove(T item) {
        data.remove(item);
    }

    public int count(T item) {
        int numOfItem = 0;
        for (T element : data) {
            if (element.equals(item)) {
                ++numOfItem;
            }
        }
        return numOfItem;
    }
}
