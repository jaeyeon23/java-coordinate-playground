package coordinate;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PointTest {
    @Test
    void create() {
        Point point = new Point(23, 22);
        assertThat(point).isEqualTo(new Point(23, 22));
    }

    @Test
    void valid() {
        assertThatThrownBy(() -> {
            new Point(25, 1);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
