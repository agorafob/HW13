import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MainTests {

    Pair test = new Pair("one", "ONE");

    @Test
    public void avgTest() {
        Assertions.assertEquals(39.833333333333336, Main.avg(List.of(10, 15, 25, 100, 86, 3)));
    }

    @Test
    public void lstToPairTest() {
        Assertions.assertEquals(List.of(test).toString(), Main.lstToPair(List.of("one")).toString());
    }

    @Test
    public void lstFilterTest() {
        Assertions.assertEquals(List.of("thre", "five"), Main.lstFilter(List.of("one", "Two", "thre", "FOUR", "five")));
    }

}
