import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> streamInt = List.of(10, 15, 25, 100, 86, 3);
        double avg = avg(streamInt);
        System.out.println(avg);

        List<String> streamStr = List.of("one");
        List<Pair> str = lstToPair(streamStr);
        System.out.println(str);

        List<String> streamFilter = List.of("one", "Two", "thre", "FOUR", "five");
        List<String> result = lstFilter(streamFilter);
        System.out.println(result);

    }

    public static double avg(List<Integer> lst) {
        return lst.stream().mapToDouble(i -> i).average().getAsDouble();
    }


    public static List<Pair> lstToPair(List<String> lst) {
        return lst.stream().map(s -> new Pair(s, s.toUpperCase())).collect(Collectors.toList());
    }

    public static List<String> lstFilter(List<String> lst) {
        return lst.stream().filter(x -> x.length() == 4 && !x.equals(x.toUpperCase())).collect(Collectors.toList());
    }
}

