/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.a6
 *  c.b.b.a.e.d.i7
 *  c.b.b.a.e.d.u6
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.a6;
import c.b.b.a.e.d.i7;
import c.b.b.a.e.d.k5;
import c.b.b.a.e.d.k8;
import c.b.b.a.e.d.l7;
import c.b.b.a.e.d.l8;
import c.b.b.a.e.d.p7;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.v5;
import c.b.b.a.e.d.x4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class l5<T extends k5<T>> {
    public static final l5 d = new l5<T>(true);
    public final p7<T, Object> a;
    public boolean b;
    public boolean c;

    public l5() {
        this.a = new i7(16);
    }

    public l5(boolean bl) {
        i7 i72 = new i7(0);
        this.a = i72;
        if (!this.b) {
            i72.a();
            this.b = true;
        }
        if (this.b) {
            return;
        }
        this.a.a();
        this.b = true;
    }

    public static <T extends k5<T>> l5<T> a() {
        throw null;
    }

    public static final void b(T t9, Object object) {
        block18 : {
            block19 : {
                boolean bl;
                k8 k82 = t9.b();
                a6.a((Object)object);
                switch (k82.a.ordinal()) {
                    default: {
                        break block18;
                    }
                    case 8: {
                        if (object instanceof u6) {
                            return;
                        }
                        break block18;
                    }
                    case 7: {
                        if (object instanceof Integer) break block19;
                        if (object instanceof v5) {
                            return;
                        }
                        break block18;
                    }
                    case 6: {
                        if (object instanceof x4) break block19;
                        if (object instanceof byte[]) {
                            return;
                        }
                        break block18;
                    }
                    case 5: {
                        bl = object instanceof String;
                        break;
                    }
                    case 4: {
                        bl = object instanceof Boolean;
                        break;
                    }
                    case 3: {
                        bl = object instanceof Double;
                        break;
                    }
                    case 2: {
                        bl = object instanceof Float;
                        break;
                    }
                    case 1: {
                        bl = object instanceof Long;
                        break;
                    }
                    case 0: {
                        bl = object instanceof Integer;
                    }
                }
                if (!bl) break block18;
            }
            return;
        }
        Object[] arrobject = new Object[]{t9.a(), t9.b().a, object.getClass().getName()};
        throw new IllegalArgumentException(String.format((String)"Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", (Object[])arrobject));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(T t9, Object object) {
        if (t9.c()) {
            if (!(object instanceof List)) throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((Collection)((List)object));
            int n2 = arrayList.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                l5.b(t9, arrayList.get(i2));
            }
            object = arrayList;
        } else {
            l5.b(t9, object);
        }
        this.a.a(t9, object);
    }

    public final Object clone() {
        l5<k5> l52 = new l5<k5>();
        for (int i2 = 0; i2 < this.a.b(); ++i2) {
            Map.Entry<T, Object> entry = this.a.a(i2);
            l52.a((k5)entry.getKey(), entry.getValue());
        }
        p7<T, Object> p72 = this.a;
        Set set = p72.c.isEmpty() ? l7.b : p72.c.entrySet();
        for (Map.Entry entry : set) {
            l52.a((k5)entry.getKey(), entry.getValue());
        }
        l52.c = this.c;
        return l52;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof l5)) {
            return false;
        }
        l5 l52 = (l5)object;
        return this.a.equals(l52.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

