import java.util.ArrayList;

public class List {
    public static void print(ArrayList<String> array){
        for(String s: array)
            System.out.println(s);
    }

    public static void main(String args[]) {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("Yoel");
        nama.add("Mountanus");
        nama.add("Sitorus");
        nama.add("Pane");
        print(nama);
        System.out.println(nama.contains("Pane")? "Yeah":"Nope");
        nama.remove("Yoel");
        nama.add(3, "Nama Baru");
        print(nama);
    }
}
