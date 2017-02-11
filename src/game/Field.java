package game;

public class Field {
    private int value;

    Field() {
        this(0);
    }

    Field(int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    void duplicate() {
        value *= 2;
    }

    boolean isEmpty() {
        return value == 0;
    }

    void setEmpty() {
        value = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Field field = (Field) o;
        return value == field.value;
    }
}
