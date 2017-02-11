package game;

public class Fields {
    private Field[][] fields = initializeFields();

    private Field[][] initializeFields() {
        Field[][] fields = new Field[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                fields[i][j] = new Field();
            }
        }
        return fields;
    }

    Field getField(int x, int y) {
        return fields[x][y];
    }

    public void move(Direction direction) {

    }
}
