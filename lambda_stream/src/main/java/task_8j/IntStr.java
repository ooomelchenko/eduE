package task_8j;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStr {

    private int[] intArray = {3, 2, 7, 5, 0, -5, 8, 9, 6, 0};

    private IntStream getValuesStream() {
        return Arrays.stream(intArray);
    }
    private Stream<Pair<Integer, Integer>> getKeyValueStream() {
        List<Pair<Integer, Integer>> pairs = new LinkedList<>();
        IntStream.range(0, intArray.length).forEach(x -> pairs.add(new Pair<>(x, intArray[x])));
        return pairs.stream();
    }

    public double displaysAverage() {
        return getValuesStream().average().getAsDouble();
    }

    public Pair<Integer, Integer> getMinimumElementValueAndIndex() {
        return getKeyValueStream().
                reduce((p1, p2) -> p1.getValue() > p2.getValue() ? p2 : p1).get();
    }

    public long getNumberOfZeroElements() {
        return getValuesStream().
                filter(x -> x==0).count();
    }

    public long getNumberOfPositiveElements() {
        return getValuesStream().
                filter(x -> x > 0).count();
    }

    public IntStream multipleElements(int mult) {
        return getValuesStream().
                map(x -> x * mult);
    }

    public static void main(String[] args) {
        IntStr intStream = new IntStr();
        System.out.println(intStream.displaysAverage());
        System.out.println(intStream.getMinimumElementValueAndIndex());
        System.out.println(intStream.getNumberOfZeroElements());
        System.out.println(intStream.getNumberOfPositiveElements());
        System.out.println(Arrays.toString(intStream.multipleElements(3).toArray()));
    }

}
