package joshuahalvorson.com;

public class Main {

    public static void main(String[] args) {
        CountedSet<String> set = new CountedSet<>();
        set.insert("test");
        set.insert("test");
        set.insert("test");
        set.insert("test");
        set.insert("test");
        set.insert("test");
        set.insert("test");
        set.insert("test");
        set.insert("test2");
        set.insert("test2");
        System.out.println("test count: " + set.count("test"));
        set.remove("test");
        set.remove("test");
        System.out.println("test count: " + set.count("test"));
        System.out.println("test2 count: " + set.count("test2"));

        CountedSet<Integer> intSet = new CountedSet<>();
        intSet.insert(101);
        intSet.insert(101);
        intSet.insert(101);
        intSet.insert(101);
        intSet.insert(101);
        intSet.insert(101);
        intSet.insert(101);
        intSet.insert(101);
        intSet.insert(101);
        intSet.insert(101);
        intSet.insert(101);
        intSet.insert(101);
        intSet.insert(101);
        intSet.insert(101);
        intSet.insert(101);
        intSet.insert(101);
        intSet.insert(101);
        intSet.insert(11234);
        intSet.insert(11234);
        intSet.insert(11234);
        System.out.println("101 count: " + intSet.count(101));
        intSet.remove(11234);
        intSet.remove(11234);
        intSet.remove(11234);
        System.out.println("101 count: " + intSet.count(101));
        System.out.println("no item count: " + intSet.count(101313));
        System.out.println("11234 count: " + intSet.count(11234));


    }
}
