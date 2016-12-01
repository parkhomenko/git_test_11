package collections;

import org.junit.Test;

import java.util.function.BiFunction;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ListExampleTest {

    @Test
    public void testLambda() {
        SomeClass someClass = new SomeClass();
        int result = someClass.apply(5, 3);

        assertThat(result, is(8));
    }
}

class SomeClass implements BiFunction<Integer, Integer, Integer> {

    @Override
    public Integer apply(Integer i1, Integer i2) {
        return i1 + i2;
    }
}
