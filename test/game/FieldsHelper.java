package game;

class FieldsHelper {
    static Fields fromList(int... a) {
        Fields fields = new Fields();
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                fields.getField(j, i).setValue(a[i * 4 + j]);
        return fields;
    }
}
