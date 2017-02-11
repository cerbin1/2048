package game;

import org.junit.Test;

import static game.Direction.Down;
import static game.FieldsHelper.fromList;
import static org.junit.Assert.assertEquals;

public class FieldsTest {
    @Test
    public void shouldJoinFields() {
        // given
        Fields fields = fromList(
                0, 0, 0, 0,
                0, 0, 0, 0,
                2, 0, 0, 0,
                2, 0, 0, 0);

        // when
        fields.move(Down);

        // then
        assertEquals(fields, fromList(
                0, 0, 0, 0,
                0, 0, 0, 0,
                0, 0, 0, 0,
                4, 0, 0, 0));
    }

    @Test
    public void shouldJoinTwoPairs() {
        // given
        Fields fields = fromList(
                2, 0, 0, 0,
                2, 0, 0, 0,
                2, 0, 0, 0,
                2, 0, 0, 0);

        // when
        fields.move(Down);

        // then
        assertEquals(fields, fromList(
                0, 0, 0, 0,
                4, 0, 0, 0,
                0, 0, 0, 0,
                4, 0, 0, 0));
    }

    @Test
    public void shouldMoveFieldsDown() {
        // given
        Fields fields = fromList(
                0, 2, 0, 0,
                2, 0, 0, 32,
                0, 0, 16, 0,
                4, 0, 0, 0);

        // when
        fields.move(Down);

        // then
        assertEquals(fields, fromList(
                0, 0, 0, 0,
                0, 0, 0, 0,
                2, 0, 16, 0,
                4, 2, 16, 32));
    }
}