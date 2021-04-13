/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.a6
 *  c.b.b.a.e.d.b7
 *  c.b.b.a.e.d.l4
 *  c.b.b.a.e.d.z5
 *  java.lang.Double
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

public final class e5
extends l4<Double>
implements RandomAccess,
z5,
b7 {
    public static final e5 d;
    public double[] b;
    public int c;

    public static {
        e5 e52;
        d = e52 = new e5(new double[0], 0);
        e52.a = false;
    }

    public e5() {
        double[] arrd = new double[10];
        this.b = arrd;
        this.c = 0;
    }

    public e5(double[] arrd, int n7) {
        this.b = arrd;
        this.c = n7;
    }

    public final void a(double d4) {
        this.c();
        int n7 = this.c;
        double[] arrd = this.b;
        if (n7 == arrd.length) {
            double[] arrd2 = new double[1 + n7 * 3 / 2];
            System.arraycopy((Object)arrd, (int)0, (Object)arrd2, (int)0, (int)n7);
            this.b = arrd2;
        }
        double[] arrd3 = this.b;
        int n9 = this.c;
        this.c = n9 + 1;
        arrd3[n9] = d4;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        this.c();
        a6.a(collection);
        if (!(collection instanceof e5)) {
            return super.addAll(collection);
        }
        e5 e52 = (e5)collection;
        int n7 = e52.c;
        if (n7 == 0) {
            return false;
        }
        int n9 = this.c;
        if (Integer.MAX_VALUE - n9 >= n7) {
            int n10 = n9 + n7;
            double[] arrd = this.b;
            if (n10 > arrd.length) {
                this.b = Arrays.copyOf((double[])arrd, (int)n10);
            }
            System.arraycopy((Object)e52.b, (int)0, (Object)this.b, (int)this.c, (int)e52.c);
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
        if (!(object instanceof e5)) {
            return super.equals(object);
        }
        e5 e52 = (e5)((Object)object);
        if (this.c != e52.c) {
            return false;
        }
        double[] arrd = e52.b;
        for (int i3 = 0; i3 < this.c; ++i3) {
            if (Double.doubleToLongBits((double)this.b[i3]) == Double.doubleToLongBits((double)arrd[i3])) continue;
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int n7 = 1;
        for (int i3 = 0; i3 < this.c; ++i3) {
            n7 = n7 * 31 + a6.a((long)Double.doubleToLongBits((double)this.b[i3]));
        }
        return n7;
    }

    public final int indexOf(Object object) {
        if (!(object instanceof Double)) {
            return -1;
        }
        double d4 = (Double)object;
        int n7 = this.c;
        for (int i3 = 0; i3 < n7; ++i3) {
            if (this.b[i3] != d4) continue;
            return i3;
        }
        return -1;
    }

    public final void removeRange(int n7, int n9) {
        this.c();
        if (n9 >= n7) {
            double[] arrd = this.b;
            System.arraycopy((Object)arrd, (int)n9, (Object)arrd, (int)n7, (int)(this.c - n9));
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

