package practice.ds.map;
/*
定义Map接口
 */
public interface Map<K, V> {
    //增
    void add(K key, V v);
    //删
    V remove(K key);
    //改
    void set(K key, V newValue);
    //查
    boolean contains(K key);
    V get(K key);
    int getSize();
    boolean isEmpty();
}
