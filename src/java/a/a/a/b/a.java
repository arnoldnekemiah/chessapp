/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.HashMap
 */
package a.a.a.b;

import a.a.a.b.b;
import java.util.HashMap;

public class a<K, V>
extends b<K, V> {
    public HashMap<K, b.c<K, V>> e = new HashMap();

    @Override
    public b.c<K, V> a(K k2) {
        return (b.c)this.e.get(k2);
    }

    @Override
    public V b(K k2, V v2) {
        b.c c2 = (b.c)this.e.get(k2);
        if (c2 != null) {
            return c2.b;
        }
        this.e.put(k2, this.a(k2, v2));
        return null;
    }

    @Override
    public V remove(K k2) {
        Object v2 = super.remove(k2);
        this.e.remove(k2);
        return v2;
    }
}

