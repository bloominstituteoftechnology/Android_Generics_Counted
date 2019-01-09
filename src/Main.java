public class Main {

    public static void main(String[] args) {
        CountedSet<Object> set = new CountedSet<>();
        set.insert("test4");
        set.insert("test");
        set.insert("test");
        set.insert("test3");
        set.insert("test3");
        set.insert("test3");
        set.insert("test");
        set.insert("test");
        set.insert("test2");
        set.insert("test2");
        set.insert("false");

        set.insert(6);
        set.insert(6);
        set.insert(6);
        set.insert(3.4f);
        set.insert(3.4f);
        set.insert(3.4f);
        set.insert(3.4f);
        set.insert(3.4f);
        set.insert('a');
        set.insert(true);
        set.insert(false);
        set.insert(false);


        System.out.println("test count: " + set.count("test"));
        System.out.println("test1 count: " + set.count("test1"));
        System.out.println("test2 count: " + set.count("test2"));
        System.out.println("test3 count: " + set.count("test4"));
        System.out.println("false(string) count: " + set.count("false"));
        System.out.println("Integer count (no primitives): " + set.count(6));
        System.out.println("Float 3.4f count: " + set.count(3.4f));
        System.out.println("Float 3.0f count: " + set.count(3.0f));
        System.out.println("Char count: " + set.count('a'));
        System.out.println("Char count: " + set.count('b'));
        System.out.println("Boolean true count: " + set.count(true));
        System.out.println("Boolean false count: " + set.count(false));


        System.out.println("\n=================================\nRemoving 1 false boolean");
        set.remove(false);
        System.out.println("Boolean count: " + set.count(false));
        System.out.println("\n=================================\nRemoving 1 3.4f");
        set.remove(3.4f);
        System.out.println("Float count: " + set.count(3.4f));
    }

    /*
    test count: 4
    test1 count: 0
    test2 count: 2
    test3 count: 1
    false(string) count: 1
    Integer count (no primitives): 3
    Float 3.4f count: 5
    Float 3.0f count: 0
    Char count: 1
    Char count: 0
    Boolean true count: 1
    Boolean false count: 2

    =================================
    Removing 1 false boolean
    Boolean count: 1

    =================================
    Removing 1 3.4f
    Float count: 4
    */
}
