import java.util.ArrayList;

public class CountedSet<K, E> {

    private ArrayList<E> data;
    private ArrayList<K> keys;

    public CountedSet(int size) {
        data = new ArrayList<>(size);
        keys = new ArrayList<>(size);
    }

    public CountedSet() {
        data = new ArrayList<>();
        keys = new ArrayList<>();
    }

    public void insert(K key, E item) {
        if (keys.contains(key)) {
            keys.set(keys.indexOf(key), key);
            data.set(keys.indexOf(key), item);
        } else {
            keys.add(key);
            data.add(item);
        }
    }

    public void remove(K key) {
        if (keys.contains(key)) {
            int index = keys.indexOf(key);
            keys.remove(index);
            data.remove(index);
        }
    }


    public E get(K key) {
        if (keys.contains(key))
            return data.get(keys.indexOf(key));
        return null;
    }

    public int count(E value) {
        int count = 0;
        for (E element : data) {
            if (element.equals(value))
                count++;
        }
        return count;
    }

    public int size() {
        return keys.size();
    }

    public void clear() {
        keys.clear();
        data.clear();
    }


}
