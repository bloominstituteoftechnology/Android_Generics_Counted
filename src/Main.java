import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        CountedSet<Object> set = new CountedSet<>();
        //Add some random strings
        for (Object item : randomStringArrayGenerator()) {
            set.insert(item.toString());
        }
        //Add some random integers
        for (Object item : randomIntegerArrayGenerator()) {
            set.insert(item.toString());
        }
        //Add a few null items.
        for (int i = 0; i < Math.random() * 10; ++i) {
            set.insert(null);
        }
        //Shuffle everything
        Collections.shuffle(set.data);
        //Print out the name of each distinct item and the number of times it occurs.
        for (Object item : set.data.stream().distinct().collect(Collectors.toList())) {
            System.out.println(String.format("%s - %d", item == null ? "null" : item.toString(), set.count(item)));
        }
        //Pick a random item in the set, print out the name and count, remove the item, print out the name and count again.
        removeRandom(set);
    }


    public static ArrayList<String> randomStringArrayGenerator() {
        ArrayList<String> strings = new ArrayList<>();
        int randomLength = (int) (Math.random() * 10);
        int leftLimit = 33;
        int rightLimit = 126;
        Random random = new Random();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < randomLength; ++i) {
            for (int j = 0; j < randomLength; j++) {
                int randomLimitedInt = leftLimit + (int)
                        (random.nextFloat() * (rightLimit - leftLimit + 1));
                builder.append((char) randomLimitedInt);
            }
            int randomReps = (int) (Math.random() * 5);
            for (int j = 0; j < randomReps; ++j) {
                strings.add(builder.toString());
            }
        }
        Collections.shuffle(strings);
        return strings;
    }

    public static ArrayList<Integer> randomIntegerArrayGenerator() {
        ArrayList<Integer> integers = new ArrayList<>();
        int randomLength = (int) (Math.random() * 10);
        for (int i = 0; i < randomLength; ++i) {
            int randomElement = (int) (Math.random() * 10000);
            int randomReps = (int) (Math.random() * 5);
            for (int j = 0; j < randomReps; ++j) {
                integers.add(randomElement);
            }
        }
        Collections.shuffle(integers);
        return integers;
    }

    public static CountedSet<Object> removeRandom(CountedSet<Object> set) {
        int randomIndex = (int) (Math.random() * set.data.size());
        Object randomItem = set.data.get(randomIndex);
        System.out.println(String.format("%s - %d (Before Removal)", randomItem == null ? "null" : randomItem.toString(), set.count(randomItem)));
        set.remove(randomItem);
        System.out.println(String.format("%s - %d (After Removal)", randomItem == null ? "null" : randomItem.toString(), set.count(randomItem)));
        return set;
    }
}
