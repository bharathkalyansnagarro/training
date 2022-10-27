package datastructures;

/*
* Insert !
• Delete !
• Contains !
• Get Value by key !
• Size !
• Iterator // TODO :
• Traverse/Print !
* */
public class CustomHashMap<K, V> {

    private int size = 0;

    private static final int INITIAL_SIZE = 1 << 4;
    private static final int MAXIMUM_CAPACITY = 1 << 30;


    static class Entry<K, V> {
        public K key;
        public V value;
        public Entry<K, V> next;

        Entry(K k, V v) {
            this.key = k;
            this.value = v;
        }
    }

    private final Entry[] hashTable;

    public CustomHashMap() {
        hashTable = new Entry[INITIAL_SIZE];
    }

    CustomHashMap(int capacity) {
        int tableSize = tableSizeFor(capacity);
        hashTable = new Entry[tableSize];
    }


    public int getSize() {
        return size;
    }

    static int tableSizeFor(int n) {
        n = n - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    public V remove(K k) {
        int hashCode = k.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];
        if (node == null) return null;
        else {
            V v = (V) node.value;
            hashTable[hashCode] = null;
            size--;
            return v;
        }
    }

    public void put(K k, V v) {
        int hashCode = k.hashCode() % hashTable.length;

        Entry node = hashTable[hashCode];
        if (node == null) {
            Entry<K, V> entry = new Entry<>(k, v);
            hashTable[hashCode] = entry;
            size++;
        } else {
            Entry temp = node;
            while (temp.next != null) {
                if (temp.key == k) { //If key is found update the value!
                    temp.value = v;
                    return;
                }
                temp = temp.next;
            }
            size++;
            temp.next = new Entry<>(k, v);
        }
    }

    public V get(K k) {
        int hashCode = k.hashCode() % hashTable.length;

        Entry temp = hashTable[hashCode];
        while (temp != null) {
            if (temp.key == k)
                return (V) temp.value;
            temp = temp.next;
        }

        return null;
    }

    public boolean containsKey(K k) {
        int hashCode = k.hashCode() % hashTable.length;

        Entry temp = hashTable[hashCode];
        while (temp != null) {
            if (temp.key == k)
                return true;
            temp = temp.next;
        }

        return false;
    }

    //You can use your own hash code function here!
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void print() {
        for (Entry entry : hashTable) {
            if (entry != null) {
                Entry temp = entry;
                while (temp != null) {
                    System.out.println(entry.key + " : " + entry.value);
                    temp = temp.next;
                }
            }
        }
    }

}
