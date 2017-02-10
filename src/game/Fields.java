package game;

public class Fields {
    private Field[][] fields = new Field[4][4];

    Fields() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                fields[i][j] = new Field(0);
            }
        }
    }

    public Field getFields(int x, int y) {
        return fields[x][y];
    }
}
