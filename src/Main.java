import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        CountedSet<Object> set = new CountedSet<>();
        for (Object item : randomStringArrayGenerator()) {
            set.insert(item.toString());
        }
        for (Object item : randomIntegerArrayGenerator()) {
            set.insert(item.toString());
        }
        for (Object item:set.data) {
            System.out.println(String.format("%s - %d", item.toString(), set.count(item)));
        }
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
            byte[] array = new byte[(int) (Math.random() * (Math.random() * 10000))];
            new Random().nextBytes(array);
            int randomReps = (int) (Math.random() * 5);
            for (int j = 0; j < randomReps; ++j) {
                integers.add((int) (Math.random() * 10));
            }
        }
        Collections.shuffle(integers);
        return integers;
    }
}
