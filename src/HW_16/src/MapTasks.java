/**
 * Created by Yushko Aliaksei on 02.05.2026
 */
import java.util.HashMap;
import java.util.Map;

public class MapTasks {
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String s : strings) {
            // Если ключ уже есть в карте, значит встретили строку повторно -> true
            if (map.containsKey(s)) {
                map.put(s, true);
            } else {
                // Если видим строку впервые -> false
                map.put(s, false);
            }
        }
        return map;
    }

    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            // Берем первый символ как строку
            String first = String.valueOf(s.charAt(0));
            // Берем последний символ как строку
            String last = String.valueOf(s.charAt(s.length() - 1));

            // Если ключ совпадет, HashMap просто перезапишет старое значение новым
            map.put(first, last);
        }
        return map;
    }
}

