import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("1", 1);
        map.put("1", 2);
        System.out.println(map.toString());
    }
}
