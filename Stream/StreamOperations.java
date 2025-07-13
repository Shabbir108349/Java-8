import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,3,4,5,67,5,3,4,5,3,34,5);
        List<Integer> filteredEvenList = list.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(filteredEvenList);
        List<Integer> multiplyFilteredList = filteredEvenList.stream().map(x -> x * 2).toList();
        System.out.println(multiplyFilteredList);

        List<Integer> limit = Stream.iterate(0, x -> x + 1)
                .skip(1)
                .limit(101)
                .peek(x-> System.out.println(x))
                .toList();

    }
}
