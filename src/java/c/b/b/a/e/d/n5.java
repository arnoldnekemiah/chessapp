/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.a6
 *  c.b.b.a.e.d.b7
 *  c.b.b.a.e.d.l4
 *  c.b.b.a.e.d.z5
 *  java.lang.Float
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

public final class n5
extends l4<Float>
implements RandomAccess,
z5,
b7 {
    public static final n5 d;
    public float[] b;
    public int c;

    public static {
        n5 n52;
        d = n52 = new n5(new float[0], 0);
        n52.a = false;
    }

    public n5() {
        float[] arrf = new float[10];
        this.b = arrf;
        this.c = 0;
    }

    public n5(float[] arrf, int n7) {
        this.b = arrf;
        this.c = n7;
    }

    public final void a(float f5) {
        this.c();
        int n7 = this.c;
        float[] arrf = this.b;
        if (n7 == arrf.length) {
            float[] arrf2 = new float[1 + n7 * 3 / 2];
            System.arraycopy((Object)arrf, (int)0, (Object)arrf2, (int)0, (int)n7);
            this.b = arrf2;
        }
        float[] arrf3 = this.b;
        int n9 = this.c;
        this.c = n9 + 1;
        arrf3[n9] = f5;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        this.c();
        a6.a(collection);
        if (!(collection instanceof n5)) {
            return super.addAll(collection);
        }
        n5 n52 = (n5)collection;
        int n7 = n52.c;
        if (n7 == 0) {
            return false;
        }
        int n9 = this.c;
        if (Integer.MAX_VALUE - n9 >= n7) {
            int n10 = n9 + n7;
            float[] arrf = this.b;
            if (n10 > arrf.length) {
                this.b = Arrays.copyOf((float[])arrf, (int)n10);
            }
            System.arraycopy((Object)n52.b, (int)0, (Object)this.b, (int)this.c, (int)n52.c);
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
        if (!(object instanceof n5)) {
            return super.equals(object);
        }
        n5 n52 = (n5)((Object)object);
        if (this.c != n52.c) {
            return false;
        }
        float[] arrf = n52.b;
        for (int i3 = 0; i3 < this.c; ++i3) {
            if (Float.floatToIntBits((float)this.b[i3]) == Float.floatToIntBits((float)arrf[i3])) continue;
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int n7 = 1;
        for (int i3 = 0; i3 < this.c; ++i3) {
            n7 = n7 * 31 + Float.floatToIntBits((float)this.b[i3]);
        }
        return n7;
    }

    public final int indexOf(Object object) {
        if (!(object instanceof Float)) {
            return -1;
        }
        float f5 = ((Float)object).floatValue();
        int n7 = this.c;
        for (int i3 = 0; i3 < n7; ++i3) {
            if (this.b[i3] != f5) continue;
            return i3;
        }
        return -1;
    }

    public final void removeRange(int n7, int n9) {
        this.c();
        if (n9 >= n7) {
            float[] arrf = this.b;
            System.arraycopy((Object)arrf, (int)n9, (Object)arrf, (int)n7, (int)(this.c - n9));
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

