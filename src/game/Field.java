package game;

class Field {
    private int value;
    private boolean isEmpty;

    Field(int value) {
        this.value = value;
        isEmpty = false;
    }

    public int getValue() {
        return value;
    }
}
