import java.util.ArrayList;

public class CountedSet<K> {
    private ArrayList<K> keys;
    private ArrayList<String> amount;
    private int state;  // 0 to get count, 1 to add, 2 to remove;

    public CountedSet() {
        keys = new ArrayList<>();
        amount = new ArrayList<>();
        state = 0;
    }

    public int count(K key) {
        state = 0;
        return SearchSet(key);
    }

    public void insert(K key) {
        state = 1;
        SearchSet(key);
    }

    public void remove(K key) {
        state = 2;
        SearchSet(key);
    }

    public int SearchSet(K key) {
        int counter = 0;

        for (int i = 0; i < keys.size(); ++i) {
            if (key.equals(keys.get(i))) {
                switch (state) {
                    case 0:
                        return Integer.parseInt(amount.get(i));
                    case 1:
                        int temp = Integer.parseInt(amount.get(i)) + 1;
                        amount.set(i, String.valueOf(temp));
                        return -1;
                    case 2:
                        temp = Integer.parseInt(amount.get(i)) - 1;
                        amount.set(i, String.valueOf(temp));
                        return -1;
                }
            }
        }
        if(state == 1){
            amount.add("1");
            keys.add(key);
        }
        return counter;
    }


}
