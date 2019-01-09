import java.util.ArrayList;

public class CountedSet<T> {
    ArrayList<T> data;

    public CountedSet() {
        this.data = new ArrayList<>();
    }

    public void insert(T item) {
        data.add(item);
    }

    public void remove(T item) {
        data.remove(item);
    }

    public int count(T item) {
        int amount = 0;

        for(T object : data) {
            if(object.equals(item)) {
                amount++;
            }
        }
        return amount;
    }
}
