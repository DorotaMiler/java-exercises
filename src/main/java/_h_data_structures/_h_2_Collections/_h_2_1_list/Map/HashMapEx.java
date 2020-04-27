package _h_data_structures._h_2_Collections._h_2_1_list.Map;

public class HashMapEx<K, V> {
    private MapInfo<K, V>[] table;
    private static final INITIAL_CAPACITY = 5;

    HashMapEx(){
        table = new MapInfo[INITIAL_CAPACITY];
    }

    public MapInfo<K, V>[] getTable() {
        return table;
    }
}
