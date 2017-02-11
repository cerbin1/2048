package game;

import org.junit.Test;

import static org.junit.Assert.*;

public class FieldsTest {
    @Test
    public void shouldJoinFields() {
        // given
        Fields fields = new Fields();
        fields.getField(0, 3).setValue(2);
        fields.getField(0, 2).setValue(2);

        // when
        fields.moveDown();

        // then
        assertEquals(fields.getField(0, 3).getValue(), 4);
        assertEquals(fields.getField(0, 2).getValue(), 0);
    }
}