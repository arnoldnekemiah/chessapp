/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.o6;
import c.b.b.a.e.d.p6;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class q6 {
    public static final int a(int n2, Object object, Object object2) {
        Iterator iterator;
        p6 p62 = (p6)((Object)object);
        (o6)object2;
        if (p62.isEmpty() || !(iterator = p62.entrySet().iterator()).hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry)iterator.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final Object a(Object object, Object object2) {
        p6 p62 = (p6)((Object)object);
        p6 p63 = (p6)((Object)object2);
        if (!p63.isEmpty()) {
            if (!p62.a) {
                p62 = p62.isEmpty() ? new p6() : new p6(p62);
            }
            p62.a();
            if (!p63.isEmpty()) {
                p62.putAll(p63);
            }
        }
        return p62;
    }
}

