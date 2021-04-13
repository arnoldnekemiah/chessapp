/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.util.AbstractSet
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.n7;
import c.b.b.a.e.d.p7;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public final class o7
extends AbstractSet<Map.Entry> {
    public final /* synthetic */ p7 a;

    public /* synthetic */ o7(p7 p72) {
        this.a = p72;
    }

    public final void clear() {
        this.a.clear();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean contains(Object object) {
        Object object2;
        Map.Entry entry = (Map.Entry)object;
        Object v2 = this.a.get(entry.getKey());
        if (v2 == (object2 = entry.getValue())) return true;
        boolean bl = false;
        if (v2 == null) return bl;
        if (!v2.equals(object2)) return false;
        return true;
    }

    public final Iterator<Map.Entry> iterator() {
        return new n7(this.a);
    }

    public final boolean remove(Object object) {
        Map.Entry entry = (Map.Entry)object;
        if (this.contains((Object)entry)) {
            this.a.remove(entry.getKey());
            return true;
        }
        return false;
    }

    public final int size() {
        return this.a.size();
    }
}

