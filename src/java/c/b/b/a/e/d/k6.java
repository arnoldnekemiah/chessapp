/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.a6
 *  c.b.b.a.e.d.b7
 *  c.b.b.a.e.d.l4
 *  c.b.b.a.e.d.y5
 *  c.b.b.a.e.d.z5
 *  java.lang.IllegalArgumentException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.AbstractList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.RandomAccess
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.a6;
import c.b.b.a.e.d.b7;
import c.b.b.a.e.d.l4;
import c.b.b.a.e.d.y5;
import c.b.b.a.e.d.z5;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class k6
extends l4<Long>
implements RandomAccess,
y5,
b7 {
    public static final k6 d;
    public long[] b;
    public int c;

    public static {
        k6 k62;
        d = k62 = new k6(new long[0], 0);
        k62.a = false;
    }

    public k6() {
        long[] arrl = new long[10];
        this.b = arrl;
        this.c = 0;
    }

    public k6(long[] arrl, int n7) {
        this.b = arrl;
        this.c = n7;
    }

    public final void a(long l5) {
        this.c();
        int n7 = this.c;
        long[] arrl = this.b;
        if (n7 == arrl.length) {
            long[] arrl2 = new long[1 + n7 * 3 / 2];
            System.arraycopy((Object)arrl, (int)0, (Object)arrl2, (int)0, (int)n7);
            this.b = arrl2;
        }
        long[] arrl3 = this.b;
        int n9 = this.c;
        this.c = n9 + 1;
        arrl3[n9] = l5;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        this.c();
        a6.a(collection);
        if (!(collection instanceof k6)) {
            return super.addAll(collection);
        }
        k6 k62 = (k6)collection;
        int n7 = k62.c;
        if (n7 == 0) {
            return false;
        }
        int n9 = this.c;
        if (Integer.MAX_VALUE - n9 >= n7) {
            int n10 = n9 + n7;
            long[] arrl = this.b;
            if (n10 > arrl.length) {
                this.b = Arrays.copyOf((long[])arrl, (int)n10);
            }
            System.arraycopy((Object)k62.b, (int)0, (Object)this.b, (int)this.c, (int)k62.c);
            this.c = n10;
            ((AbstractList)this).modCount = 1 + ((AbstractList)this).modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final long c(int n7) {
        this.e(n7);
        return this.b[n7];
    }

    public final boolean contains(Object object) {
        return this.indexOf(object) != -1;
    }

    public final y5 d(int n7) {
        if (n7 >= this.c) {
            return new k6(Arrays.copyOf((long[])this.b, (int)n7), this.c);
        }
        throw new IllegalArgumentException();
    }

    public final void e(int n7) {
        if (n7 >= 0 && n7 < this.c) {
            return;
        }
        throw new IndexOutOfBoundsException(this.f(n7));
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof k6)) {
            return super.equals(object);
        }
        k6 k62 = (k6)((Object)object);
        if (this.c != k62.c) {
            return false;
        }
        long[] arrl = k62.b;
        for (int i3 = 0; i3 < this.c; ++i3) {
            if (this.b[i3] == arrl[i3]) continue;
            return false;
        }
        return true;
    }

    public final String f(int n7) {
        int n9 = this.c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(n7);
        stringBuilder.append(", Size:");
        stringBuilder.append(n9);
        return stringBuilder.toString();
    }

    public final int hashCode() {
        int n7 = 1;
        for (int i3 = 0; i3 < this.c; ++i3) {
            n7 = n7 * 31 + a6.a((long)this.b[i3]);
        }
        return n7;
    }

    public final int indexOf(Object object) {
        if (!(object instanceof Long)) {
            return -1;
        }
        long l5 = (Long)object;
        int n7 = this.c;
        for (int i3 = 0; i3 < n7; ++i3) {
            if (this.b[i3] != l5) continue;
            return i3;
        }
        return -1;
    }

    public final void removeRange(int n7, int n9) {
        this.c();
        if (n9 >= n7) {
            long[] arrl = this.b;
            System.arraycopy((Object)arrl, (int)n9, (Object)arrl, (int)n7, (int)(this.c - n9));
            this.c -= n9 - n7;
            ((AbstractList)this).modCount = 1 + ((AbstractList)this).modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final int size() {
        return this.c;
    }
}

