package com.fate.jktest.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public interface MyMap<K, V> {

   class Node<K, V> implements Entry<K, V>{
       final int hash;
       final K key;
       V value;
       Node<K,V> next;

       Node(int hash, K key, V value, Node<K,V> next) {
           this.hash = hash;
           this.key = key;
           this.value = value;
           this.next = next;
       }

       public final K getKey()        { return key; }
       public final V getValue()      { return value; }
       public final String toString() { return key + "=" + value; }

       public final int hashCode() {
           return Objects.hashCode(key) ^ Objects.hashCode(value);
       }

       public final V setValue(V newValue) {
           V oldValue = value;
           value = newValue;
           return oldValue;
       }

       public final boolean equals(Object o) {
           if (o == this)
               return true;
           if (o instanceof Map.Entry) {
               Map.Entry<?,?> e = (Map.Entry<?,?>)o;
               if (Objects.equals(key, e.getKey()) &&
                       Objects.equals(value, e.getValue()))
                   return true;
           }
           return false;
       }
   }


}
