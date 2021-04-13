/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.a6
 *  c.b.b.a.e.d.b7
 *  c.b.b.a.e.d.l4
 *  c.b.b.a.e.d.x5
 *  c.b.b.a.e.d.z5
 *  java.lang.IllegalArgumentException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Integer
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
import c.b.b.a.e.d.x5;
import c.b.b.a.e.d.z5;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class u5
extends l4<Integer>
implements RandomAccess,
x5,
b7 {
    public static final u5 d;
    public int[] b;
    public int c;

    public static {
        u5 u52;
        d = u52 = new u5(new int[0], 0);
        u52.a = false;
    }

    public u5() {
        int[] arrn = new int[10];
        this.b = arrn;
        this.c = 0;
    }

    public u5(int[] arrn, int n7) {
        this.b = arrn;
        this.c = n7;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        this.c();
        a6.a(collection);
        if (!(collection instanceof u5)) {
            return super.addAll(collection);
        }
        u5 u52 = (u5)collection;
        int n7 = u52.c;
        if (n7 == 0) {
            return false;
        }
        int n9 = this.c;
        if (Integer.MAX_VALUE - n9 >= n7) {
            int n10 = n9 + n7;
            int[] arrn = this.b;
            if (n10 > arrn.length) {
                this.b = Arrays.copyOf((int[])arrn, (int)n10);
            }
            System.arraycopy((Object)u52.b, (int)0, (Object)this.b, (int)this.c, (int)u52.c);
            this.c = n10;
            ((AbstractList)this).modCount = 1 + ((AbstractList)this).modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final int b(int n7) {
        this.e(n7);
        return this.b[n7];
    }

    public final x5 c(int n7) {
        if (n7 >= this.c) {
            return new u5(Arrays.copyOf((int[])this.b, (int)n7), this.c);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object object) {
        return this.indexOf(object) != -1;
    }

    public final void d(int n7) {
        this.c();
        int n9 = this.c;
        int[] arrn = this.b;
        if (n9 == arrn.length) {
            int[] arrn2 = new int[1 + n9 * 3 / 2];
            System.arraycopy((Object)arrn, (int)0, (Object)arrn2, (int)0, (int)n9);
            this.b = arrn2;
        }
        int[] arrn3 = this.b;
        int n10 = this.c;
        this.c = n10 + 1;
        arrn3[n10] = n7;
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
        if (!(object instanceof u5)) {
            return super.equals(object);
        }
        u5 u52 = (u5)((Object)object);
        if (this.c != u52.c) {
            return false;
        }
        int[] arrn = u52.b;
        for (int i3 = 0; i3 < this.c; ++i3) {
            if (this.b[i3] == arrn[i3]) continue;
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
            n7 = n7 * 31 + this.b[i3];
        }
        return n7;
    }

    public final int indexOf(Object object) {
        if (!(object instanceof Integer)) {
            return -1;
        }
        int n7 = (Integer)object;
        int n9 = this.c;
        for (int i3 = 0; i3 < n9; ++i3) {
            if (this.b[i3] != n7) continue;
            return i3;
        }
        return -1;
    }

    public final void removeRange(int n7, int n9) {
        this.c();
        if (n9 >= n7) {
            int[] arrn = this.b;
            System.arraycopy((Object)arrn, (int)n9, (Object)arrn, (int)n7, (int)(this.c - n9));
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

