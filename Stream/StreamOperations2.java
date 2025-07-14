import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamOperations2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(11,2,3,4,5,64,5,4,2,44,23,98);
        List<Integer> list1 = list.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(list1);
        List<Integer> list2 = list1.stream().distinct().toList();
        System.out.println(list2);
        List<Integer> list3 = list2.stream().skip(2).toList();
        System.out.println(list3);
        Optional<Integer> max = list3.stream().max((a, b) -> a-b);
        System.out.println(max.get());

        long count = list3.stream().count();
        System.out.println(count);

        Optional<Integer> any = list3.stream().findFirst();
        System.out.println(any);

        boolean b = list3.stream().anyMatch(x -> x == 64);
        System.out.println(b);

        int [] a = {1,1,1,1};
        boolean b1 = Arrays.stream(a).allMatch(x -> x == 1);
        System.out.println(b1);


    }
}

