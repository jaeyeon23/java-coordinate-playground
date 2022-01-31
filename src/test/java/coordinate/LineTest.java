package coordinate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class LineTest {
    private Line line;

    @BeforeEach
    void setUp() {
        line = new Line(Arrays.asList(new Point(1, 1), new Point(2, 2)));
    }

    @Test
    void calc() {
        double result = line.calc();
        assertThat(result).isEqualTo(1.414, offset(0.0009));
    }
}
