package game;

class Field {
    private int value;
    private boolean empty;

    Field(int value) {
        this.value = value;
        empty = false;
    }

    int getValue() {
        return value;
    }

    void setValue(int value) {
        this.value = value;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
}
