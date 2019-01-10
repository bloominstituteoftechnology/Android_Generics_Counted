package Generic;

import java.util.ArrayList;

public class CountedSet <E> {

    private ArrayList<E> keylist;
    public CountedSet(){
        this.keylist = new ArrayList<E>();
    }

    public void insert(E element){
        this.keylist.add(element);
    }

    public void remove(E element){
        this.keylist.remove(element);
    }

    public int count(E element){
        if (!this.keylist.contains(element))
            return 0;

        int count = 0;

        for (int i = 0; i < this.keylist.size(); i++){
            if(element.equals(this.keylist.get(i)))
                count++;
        }
        return count;

    }
}
