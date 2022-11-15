import java.util.HashMap;

public class Map {
    public static String getKey(HashMap<String, String> map, String find) {
        for(String key: map.keySet()) {
            if(map.get(key).equals(find))
                return key;
        }

        return "";
    }
    public static void main(String[] args) {
        HashMap<String, String> yoel = new HashMap<String, String>();
        yoel.put("Nama Depan", "Yoel");
        yoel.put("Nama Belakang", "Sitorus");
        yoel.put("Universitas", "Institut Teknologi Sepuluh Nopember");
        System.out.println(yoel.get("Nama Depan"));
        System.out.println(yoel.get("Universitas"));
        System.out.println(getKey(yoel, "Sitorus"));
        System.out.println(yoel.containsKey("Nama Depan"));
        System.out.println(yoel.containsValue("Sitorus"));
    }
}
