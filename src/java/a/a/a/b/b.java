/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.a.a.b.b$a
 *  a.a.a.b.b$e
 *  java.lang.Boolean
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.WeakHashMap
 */
package a.a.a.b;

import a.a.a.b.b;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/*
 * Exception performing whole class analysis.
 */
public class b<K, V>
implements Iterable<Map.Entry<K, V>> {
    public c<K, V> a;
    public c<K, V> b;
    public WeakHashMap<f<K, V>, Boolean> c;
    public int d;

    public b() {
        this.c = new WeakHashMap();
        this.d = 0;
    }

    public c<K, V> a(K k2) {
        c<K, V> c2 = this.a;
        while (c2 != null) {
            if (c2.a.equals(k2)) {
                return c2;
            }
            c2 = c2.c;
        }
        return c2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public c<K, V> a(K k2, V v2) {
        c<K, V> c2 = new c<K, V>(k2, v2);
        this.d = 1 + this.d;
        c<K, V> c3 = this.b;
        if (c3 == null) {
            this.a = c2;
        } else {
            c3.c = c2;
            c2.d = c3;
        }
        this.b = c2;
        return c2;
    }

    public V b(K k2, V v2) {
        c<K, V> c2 = this.a(k2);
        if (c2 != null) {
            return c2.b;
        }
        this.a(k2, v2);
        return null;
    }

    public boolean equals(Object object) {
        e e2;
        e e3;
        if (object == this) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        b b2 = (b)object;
        if (this.d != b2.d) {
            return false;
        }
        Iterator<Map.Entry<K, V>> iterator = this.iterator();
        Iterator<Map.Entry<K, V>> iterator2 = b2.iterator();
        while ((e3 = iterator).hasNext() && (e2 = iterator2).hasNext()) {
            Map.Entry entry = (Map.Entry)e3.next();
            Object object2 = e2.next();
            if ((entry != null || object2 == null) && (entry == null || entry.equals(object2))) continue;
            return false;
        }
        return !e3.hasNext() && !(iterator2).hasNext();
    }

    public int hashCode() {
        e e2;
        Iterator<Map.Entry<K, V>> iterator = this.iterator();
        int n2 = 0;
        while ((e2 = iterator).hasNext()) {
            n2 += ((Map.Entry)e2.next()).hashCode();
        }
        return n2;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        a a2 = new /* Unavailable Anonymous Inner Class!! */;
        this.c.put((Object)a2, (Object)false);
        return a2;
    }

    public V remove(K k2) {
        c c2;
        c<K, V> c3 = this.a(k2);
        if (c3 == null) {
            return null;
        }
        this.d = -1 + this.d;
        if (!this.c.isEmpty()) {
            Iterator iterator = this.c.keySet().iterator();
            while (iterator.hasNext()) {
                ((f)iterator.next()).a(c3);
            }
        }
        if ((c2 = c3.d) != null) {
            c2.c = c3.c;
        } else {
            this.a = c3.c;
        }
        c c4 = c3.c;
        if (c4 != null) {
            c4.d = c3.d;
        } else {
            this.b = c3.d;
        }
        c3.c = null;
        c3.d = null;
        return c3.b;
    }

    public String toString() {
        e e2;
        StringBuilder stringBuilder = c.a.b.a.a.a("[");
        Iterator<Map.Entry<K, V>> iterator = this.iterator();
        while ((e2 = iterator).hasNext()) {
            stringBuilder.append(((Map.Entry)e2.next()).toString());
            if (!e2.hasNext()) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static class c<K, V>
    implements Map.Entry<K, V> {
        public final K a;
        public final V b;
        public c<K, V> c;
        public c<K, V> d;

        public c(K k2, V v2) {
            this.a = k2;
            this.b = v2;
        }

        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof c)) {
                return false;
            }
            c c2 = (c)object;
            return this.a.equals(c2.a) && this.b.equals(c2.b);
        }

        public K getKey() {
            return this.a;
        }

        public V getValue() {
            return this.b;
        }

        public int hashCode() {
            return this.a.hashCode() ^ this.b.hashCode();
        }

        public V setValue(V v2) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("=");
            stringBuilder.append(this.b);
            return stringBuilder.toString();
        }
    }

    public static interface f<K, V> {
        public void a(c<K, V> var1);
    }

}

