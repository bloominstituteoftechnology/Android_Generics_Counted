public class Main {

    public static void main(String[] args) {
        CountedSet<Object> set = new CountedSet<>();

        //test tests
        set.insert("test");
        set.insert("test");
        set.insert("test");
        set.insert("test");
        set.insert("test");
        //5
        System.out.println(set.count("test"));
        set.remove("test");
        set.remove("test");
        //3
        System.out.println(set.count("test"));

        set.insert("");
        set.insert("");
        set.insert("");
        set.insert("");
        //4
        System.out.println(set.count(""));

        set.insert(true);
        set.insert(true);
        set.insert(false);
        //2 1
        System.out.println(set.count(true)+" "+ set.count(false));

    }
}
