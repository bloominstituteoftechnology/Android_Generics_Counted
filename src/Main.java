import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        CountedSet<String, String> set = new CountedSet<>();
        System.out.println(set.get("Hi"));
        set.insert("1", "1");
        set.insert("2", "1");
        set.insert("3", "1");
        set.insert("4", "1");
        set.insert("5", "1");
        System.out.println(set.count("1"));
        set.remove("4");
        set.remove("5");
        System.out.println(set.count("1"));
        System.out.println(set.get("2"));
        System.out.println(set.get("4"));
    }
}
