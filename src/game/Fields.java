package game;

class Fields {
    private Field[][] fields = new Field[4][4];

    Fields() {
        initializeFields();
    }

    private void initializeFields() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                fields[i][j] = new Field(0);
            }
        }
    }

    Field getField(int x, int y) {
        return fields[x][y];
    }

    public void moveDown() {

    }
}
