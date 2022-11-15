import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<String> nama = new HashSet<String>();
        nama.add("Yoel");
        nama.add("Mountanus");
        nama.add("Sitorus");
        nama.add("Pane");
        System.out.println(nama.isEmpty()? "Kosong" : "Berisi");
        System.out.println(nama.contains("Sitorus")? "Ada" : "Tidak Ada");
        nama.clear();
        System.out.println(nama.isEmpty()? "Kosong" : "Berisi");

    }
}
