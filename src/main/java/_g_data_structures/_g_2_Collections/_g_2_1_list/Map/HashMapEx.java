package _g_data_structures._g_2_Collections._g_2_1_list.Map;

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
