import java.util.HashMap;

class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("apple", "red");
        map.put("orange", "yellow");
        map.put("a", "b");

        String value = map.get("apple");

        map.remove("apple");

        for(String key: map.keySet()) {
            String value2 = map.get(key);
            System.out.println(key + "=" + value2);
        }
        
        System.out.println(map);
        System.out.println(value);

    }
}