import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static boolean isUnique(Map<String, String> map) {
        Set<String> values = new HashSet<>();
        for (String value : map.values()) {
            if (values.contains(value)) {
                return false;
            }
            values.add(value);
        }
        return true;

    }
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Kem","opa");
        map.put("Kev","ops");
        map.put("Kej","opo");
        map.put("Kek","opp");
        System.out.println(isUnique(map));
    }
}