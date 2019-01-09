import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        CountedSet<Object> set = new CountedSet<>();
        System.out.println(set.count("test")); // 0
        set.insert("test");
        set.insert("test");
        System.out.println(set.count("test")); // 2
        set.remove("test");
        set.remove("test");
        System.out.println(set.count("test")); //0
    }
}
