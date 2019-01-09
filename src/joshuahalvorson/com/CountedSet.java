package joshuahalvorson.com;

import java.util.ArrayList;

public class CountedSet<T> {
    private ArrayList<T> data;
    private int count;

    public CountedSet() {
        this.count = 0;
        this.data = new ArrayList<>();
    }

    public void insert(T item){
        data.add(item);
    }

    public void remove(T item){
        int occurrences = count(item);
        while(occurrences != 0){
            for(int i = data.size() - 1; i >= 0; i--){
                if(data.get(i).equals(item)){
                    data.remove(item);
                    occurrences--;
                }
            }
        }

    }

    public int count(T item){
        count = 0;
        for(T object : data){
            if(object.equals(item)){
                count++;
            }
        }
        return count;
    }

}
