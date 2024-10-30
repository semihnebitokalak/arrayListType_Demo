import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        // sehirler.add(1); hata alırız.
        sehirler.add("İstanbul");
        sehirler.add("Sakarya");
        for (String s : sehirler) {
            System.out.println(s);
        }
    }
}