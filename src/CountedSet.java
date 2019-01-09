import java.util.ArrayList;

public class CountedSet<T> {

    private ArrayList<T> data;


    public CountedSet() {
        this.data = new ArrayList<>();

    }


    public void insert(T item) {
        data.add(item);
    }

    public void remove(T item) {
        for( T compare : data) {
            if(compare.equals(item)) {
                data.remove(compare);
                break;
            }
        }
    }

    public int count(T item) {
        int total = 0;

        for(T compare : data) {
            if(compare.equals(item)) {
                total++;
            }
        }

        return total;
    }

}
