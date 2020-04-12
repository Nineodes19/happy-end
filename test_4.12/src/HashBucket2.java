import java.util.Objects;

/**
 * @program:test_4.12
 * @author:Nine_odes
 * @description:
 * @create:2020-04-12 11:45
 **/

class Person{
    public String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
public class HashBucket2<K,V> {
    static class Node<K,V>{
        public K key;
        public V value;
        public Node<K,V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public Node<K,V>[] array;
    public int usesSize;

    public HashBucket2() {
        this.array = (Node<K,V>[])new Object[8];
        this.usesSize = usesSize;
    }

    public void put(K key,V value){
        int hash = key.hashCode();
        int index = hash % this.array.length;
        for(Node<K,V> cur = array[index]; cur != null; cur = cur.next){
            if(cur.key.equals(key)){
                cur.value = value;
                return;
            }

        }
    }
}
