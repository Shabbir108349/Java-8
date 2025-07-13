import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class first {
    public static void main(String[] args) {
        List<Integer> l = new java.util.ArrayList<>(List.of(53, 6, 78, 4, 6));
        l.sort((a, b) -> b - a);
        System.out.println(l);
    }
}
