/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.a6
 *  c.b.b.a.e.d.b7
 *  c.b.b.a.e.d.l4
 *  c.b.b.a.e.d.z5
 *  java.lang.Boolean
 *  java.lang.IllegalArgumentException
 *  java.lang.IndexOutOfBoundsException
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
import c.b.b.a.e.d.z5;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class o4
extends l4<Boolean>
implements RandomAccess,
z5,
b7 {
    public static final o4 d;
    public boolean[] b;
    public int c;

    public static {
        o4 o42;
        d = o42 = new o4(new boolean[0], 0);
        o42.a = false;
    }

    public o4() {
        boolean[] arrbl = new boolean[10];
        this.b = arrbl;
        this.c = 0;
    }

    public o4(boolean[] arrbl, int n7) {
        this.b = arrbl;
        this.c = n7;
    }

    public final void a(boolean bl) {
        this.c();
        int n7 = this.c;
        boolean[] arrbl = this.b;
        if (n7 == arrbl.length) {
            boolean[] arrbl2 = new boolean[1 + n7 * 3 / 2];
            System.arraycopy((Object)arrbl, (int)0, (Object)arrbl2, (int)0, (int)n7);
            this.b = arrbl2;
        }
        boolean[] arrbl3 = this.b;
        int n9 = this.c;
        this.c = n9 + 1;
        arrbl3[n9] = bl;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        this.c();
        a6.a(collection);
        if (!(collection instanceof o4)) {
            return super.addAll(collection);
        }
        o4 o42 = (o4)collection;
        int n7 = o42.c;
        if (n7 == 0) {
            return false;
        }
        int n9 = this.c;
        if (Integer.MAX_VALUE - n9 >= n7) {
            int n10 = n9 + n7;
            boolean[] arrbl = this.b;
            if (n10 > arrbl.length) {
                this.b = Arrays.copyOf((boolean[])arrbl, (int)n10);
            }
            System.arraycopy((Object)o42.b, (int)0, (Object)this.b, (int)this.c, (int)o42.c);
            this.c = n10;
            ((AbstractList)this).modCount = 1 + ((AbstractList)this).modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final String b(int n7) {
        int n9 = this.c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(n7);
        stringBuilder.append(", Size:");
        stringBuilder.append(n9);
        return stringBuilder.toString();
    }

    public final void c(int n7) {
        if (n7 >= 0 && n7 < this.c) {
            return;
        }
        throw new IndexOutOfBoundsException(this.b(n7));
    }

    public final boolean contains(Object object) {
        return this.indexOf(object) != -1;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof o4)) {
            return super.equals(object);
        }
        o4 o42 = (o4)((Object)object);
        if (this.c != o42.c) {
            return false;
        }
        boolean[] arrbl = o42.b;
        for (int i3 = 0; i3 < this.c; ++i3) {
            if (this.b[i3] == arrbl[i3]) continue;
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int n7 = 1;
        for (int i3 = 0; i3 < this.c; ++i3) {
            n7 = n7 * 31 + a6.a((boolean)this.b[i3]);
        }
        return n7;
    }

    public final int indexOf(Object object) {
        if (!(object instanceof Boolean)) {
            return -1;
        }
        boolean bl = (Boolean)object;
        int n7 = this.c;
        for (int i3 = 0; i3 < n7; ++i3) {
            if (this.b[i3] != bl) continue;
            return i3;
        }
        return -1;
    }

    public final void removeRange(int n7, int n9) {
        this.c();
        if (n9 >= n7) {
            boolean[] arrbl = this.b;
            System.arraycopy((Object)arrbl, (int)n9, (Object)arrbl, (int)n7, (int)(this.c - n9));
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

