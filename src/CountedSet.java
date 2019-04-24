import java.util.ArrayList;

public class CountedSet<K, E> {

    private ArrayList<E> data;
    private ArrayList<K> keys;
    private int length;

    public CountedSet(int size) {
        data = new ArrayList<>(size);
        keys = new ArrayList<>(size);
        length = size;
    }

    public CountedSet() {
        data = new ArrayList<>();
        keys = new ArrayList<>();
    }

    /* public void insert(K key, E item) {
        boolean containsElement = false;
        for (int i = 0; i < keys.size(); i++) {
            if (keys.contains(key)) {
                containsElement = true;
                keys.set(i, key);
                data.set(i, item);
                break;
            }
        }
        if (!containsElement) {
            data.add(item);
            keys.add(key);
        }
    } */

    public void insert(K key, E item) {
        if (keys.contains(key)) {
            keys.set(keys.indexOf(key), key);
            data.set(keys.indexOf(key), item);
        } else {
            keys.add(key);
            data.add(item);
        }
    }


    public void get(K key) {
        
    }


}
