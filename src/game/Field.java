package game;

class Field {
    private String value;
    private boolean empty;

    Field(String value) {
        this.value = value;
        empty = false;
    }

    String getValue() {
        return value;
    }

    void setValue(String value) {
        this.value = value;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
}
