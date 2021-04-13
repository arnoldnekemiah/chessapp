/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.a6
 *  java.lang.Object
 *  java.lang.UnsupportedOperationException
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.a6;
import c.b.b.a.e.d.v5;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class p6<K, V>
extends LinkedHashMap<K, V> {
    public static final p6 b;
    public boolean a = true;

    public static {
        p6<K, V> p62;
        b = p62 = new p6<K, V>();
        p62.a = false;
    }

    public p6() {
    }

    public p6(Map<K, V> map) {
        super(map);
    }

    public static int a(Object object) {
        if (object instanceof byte[]) {
            return a6.b((byte[])((byte[])object));
        }
        if (!(object instanceof v5)) {
            return object.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public final void a() {
        if (this.a) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.a();
        super.clear();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    public final boolean equals(Object object) {
        if (object instanceof Map) {
            Map map = (Map)object;
            if (this != map) {
                if (this.size() == map.size()) {
                    for (Map.Entry entry : this.entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            Object object2 = entry.getValue();
                            Object object3 = map.get(entry.getKey());
                            boolean bl = object2 instanceof byte[] && object3 instanceof byte[] ? Arrays.equals((byte[])((byte[])object2), (byte[])((byte[])object3)) : object2.equals(object3);
                            if (bl) continue;
                        }
                        break;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator iterator = this.entrySet().iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            n2 += p6.a(entry.getKey()) ^ p6.a(entry.getValue());
        }
        return n2;
    }

    public final V put(K k2, V v2) {
        this.a();
        a6.a(k2);
        if (v2 != null) {
            return (V)super.put(k2, v2);
        }
        throw null;
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        this.a();
        for (Object object : map.keySet()) {
            a6.a((Object)object);
            a6.a((Object)map.get(object));
        }
        super.putAll(map);
    }

    public final V remove(Object object) {
        this.a();
        return (V)super.remove(object);
    }
}

