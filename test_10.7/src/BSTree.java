import jdk.nashorn.internal.ir.EmptyNode;

import javax.xml.ws.EndpointReference;

/**
 * @program:test_10.7
 * @author:Nine_odes
 * @description:
 * @create:2020-10-07 20:19
 **/
public class BSTree<K extends Comparable<K>,V> {
    private static class Entry<K,V>{
        private K key;
        private V value;
        private Entry<K,V> left = null;
        private Entry<K,V> right = null;
        private Entry(K key,V value){
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return String.format("{%s=%s",key,value);
        }
    }

    private Entry<K,V> root = null;

    public V get(K key){
        Entry<K,V> cur = root;
        while(cur != null){
            int r = key.compareTo(cur.key);
            if(r == 0){
                return cur.value;
            }else if(r < 0){
                cur = cur.left;//要搜索的值小于cur的值
            }else{
                cur = cur.right;
            }
        }
        return null;
    }

    public V put(K key,V value){
        if(root == null){
            root = new Entry<>(key,value);
            return null;
        }
        Entry<K,V> parent = null;
        Entry<K,V> cur = root;
        while(cur != null){
            int r = key.compareTo(cur.key);
            if(r == 0){
                V oldValue = cur.value;
                cur.value = value;
                return oldValue;
            }else if(r < 0){
                parent = cur;
                cur = cur.left;
            }else{
                parent = cur;
                cur = cur.right;
            }
        }

        Entry<K,V> entry = new Entry<>(key,value);
        if(key.compareTo(parent.key) < 0){
            parent.left = entry;
        }else {
            parent.right = entry;
        }
        return null;
    }

    public V remove(K key){
        Entry<K,V> parent = null;
        Entry<K,V> cur = root;
        while(cur != null){
            int r = key.compareTo(cur.key);
            if(r == 0){
                V oldValue = cur.value;
                removeEntry(parent,cur);
                return oldValue;
            }else if(r < 0){
                parent = cur;
                cur = cur.left;
            }else{
                parent = cur;
                cur = cur.right;
            }
        }
        return null;
    }

    private void removeEntry(Entry<K,V> parent,Entry<K,V> cur){
        if(cur.left == null){
            //要删除的左孩子为空
            if(cur == root){
                root = cur.right;
            }else if(cur == parent.left){
                parent.left = cur.right;
            }else{
                parent.right = cur.right;
            }
        }else if(cur.right == null){
            if(cur == root){
                root = cur.left;
            }else if(cur == parent.left){
                parent.left =cur.left;
            }else{
                parent.right = cur.left;
            }
        }else{
            Entry<K,V> gParent = cur;
            Entry<K,V> goat =cur.left;
            while(goat.right != null){
                gParent = goat;
                goat = goat.right;
            }
            cur.key = goat.key;
            cur.value = goat.value;
            if(goat == gParent.left){
                gParent.left = goat.left;
            }else{
                gParent.right = goat.left;
            }
        }
    }
}
