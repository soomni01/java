package ch13.exercise.p3;

class Container<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V getValue() {
        return value;
    }
}
