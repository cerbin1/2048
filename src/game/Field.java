package game;

class Field {
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

    void setValue(int value) {
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
}
