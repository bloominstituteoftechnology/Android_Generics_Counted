public class Tester {
    public static void main(String[] args) {
        final CountedSet<String> countedSet = new CountedSet<>();

        countedSet.insert("test");
        countedSet.insert("test");
        countedSet.insert("test");
        countedSet.insert("test");
        System.out.println(countedSet.count("test"));
        countedSet.remove("test");
        System.out.println(countedSet.count("test"));
        countedSet.removeAll("test");
        System.out.println(countedSet.count("test"));


    }
}
