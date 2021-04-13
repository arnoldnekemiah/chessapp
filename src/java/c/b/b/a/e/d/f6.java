/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.a6
 *  c.b.b.a.e.d.f8
 *  c.b.b.a.e.d.g6
 *  c.b.b.a.e.d.j8
 *  c.b.b.a.e.d.l4
 *  c.b.b.a.e.d.v4
 *  c.b.b.a.e.d.x4
 *  c.b.b.a.e.d.y7
 *  c.b.b.a.e.d.z5
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 *  java.util.AbstractList
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  java.util.RandomAccess
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.a6;
import c.b.b.a.e.d.f8;
import c.b.b.a.e.d.g6;
import c.b.b.a.e.d.j8;
import c.b.b.a.e.d.l4;
import c.b.b.a.e.d.v4;
import c.b.b.a.e.d.x4;
import c.b.b.a.e.d.y7;
import c.b.b.a.e.d.z5;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class f6
extends l4<String>
implements RandomAccess,
g6 {
    public static final f6 c;
    public final List<Object> b;

    public static {
        f6 f62;
        c = f62 = new f6(10);
        f62.a = false;
    }

    public f6() {
        this(10);
    }

    public f6(int n7) {
        ArrayList arrayList = new ArrayList(n7);
        this.b = arrayList;
    }

    public f6(ArrayList<Object> arrayList) {
        this.b = arrayList;
    }

    public static String a(Object object) {
        if (object instanceof String) {
            return (String)object;
        }
        if (object instanceof x4) {
            return ((x4)object).a(a6.a);
        }
        return a6.a((byte[])((byte[])object));
    }

    public final void a(x4 x42) {
        this.c();
        this.b.add((Object)x42);
        ((AbstractList)this).modCount = 1 + ((AbstractList)this).modCount;
    }

    public final boolean addAll(int n7, Collection<? extends String> list) {
        this.c();
        if (list instanceof g6) {
            list = ((g6)list).e();
        }
        boolean bl = this.b.addAll(n7, (Collection)list);
        ((AbstractList)this).modCount = 1 + ((AbstractList)this).modCount;
        return bl;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return this.addAll(this.size(), collection);
    }

    public final Object b(int n7) {
        return this.b.get(n7);
    }

    public final String c(int n7) {
        Object object = this.b.get(n7);
        if (object instanceof String) {
            return (String)object;
        }
        if (object instanceof x4) {
            x4 x42 = (x4)object;
            String string = x42.a(a6.a);
            v4 v42 = (v4)x42;
            if (j8.a((byte[])v42.d, (int)0, (int)v42.c())) {
                this.b.set(n7, (Object)string);
            }
            return string;
        }
        byte[] arrby = (byte[])object;
        String string = a6.a((byte[])arrby);
        int n9 = j8.a.a(0, arrby, 0, arrby.length);
        boolean bl = false;
        if (n9 == 0) {
            bl = true;
        }
        if (bl) {
            this.b.set(n7, (Object)string);
        }
        return string;
    }

    public final void clear() {
        this.c();
        this.b.clear();
        ((AbstractList)this).modCount = 1 + ((AbstractList)this).modCount;
    }

    public final List<?> e() {
        return Collections.unmodifiableList(this.b);
    }

    public final g6 f() {
        if (this.a) {
            return new y7((g6)this);
        }
        return this;
    }

    public final int size() {
        return this.b.size();
    }
}

