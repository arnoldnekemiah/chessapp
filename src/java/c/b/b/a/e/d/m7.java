/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 *  java.util.Map$Entry
 */
package c.b.b.a.e.d;

import c.a.b.a.a;
import c.b.b.a.e.d.p7;
import java.util.Map;

public final class m7
implements Map.Entry,
Comparable<m7> {
    public final Comparable a;
    public Object b;
    public final /* synthetic */ p7 c;

    public m7(p7 p72, Comparable comparable, Object object) {
        this.c = p72;
        this.a = comparable;
        this.b = object;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        Comparable comparable = this.a;
        Object object2 = entry.getKey();
        boolean bl = comparable == null ? object2 == null : comparable.equals(object2);
        if (bl) {
            Object object3 = this.b;
            Object object4 = entry.getValue();
            boolean bl2 = object3 == null ? object4 == null : object3.equals(object4);
            if (bl2) {
                return true;
            }
        }
        return false;
    }

    public final Object getValue() {
        return this.b;
    }

    public final int hashCode() {
        Comparable comparable = this.a;
        int n2 = comparable == null ? 0 : comparable.hashCode();
        Object object = this.b;
        int n6 = object == null ? 0 : object.hashCode();
        return n2 ^ n6;
    }

    public final Object setValue(Object object) {
        p7.a(this.c);
        Object object2 = this.b;
        this.b = object;
        return object2;
    }

    public final String toString() {
        String string = String.valueOf((Object)this.a);
        String string2 = String.valueOf((Object)this.b);
        int n2 = string.length();
        return a.a(new StringBuilder(string2.length() + (n2 + 1)), string, "=", string2);
    }
}

