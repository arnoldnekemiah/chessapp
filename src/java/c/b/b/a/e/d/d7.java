/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.l4
 *  c.b.b.a.e.d.z5
 *  java.lang.IllegalArgumentException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.AbstractList
 *  java.util.Arrays
 *  java.util.RandomAccess
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.l4;
import c.b.b.a.e.d.z5;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

public final class d7<E>
extends l4<E>
implements RandomAccess {
    public static final d7<Object> d;
    public E[] b;
    public int c;

    public static {
        d7<Object> d72 = new d7<Object>(new Object[0], 0);
        d = d72;
        d72.a = false;
    }

    public d7(E[] arrE, int n7) {
        this.b = arrE;
        this.c = n7;
    }

    public final void add(int n7, E e4) {
        int n9;
        this.c();
        if (n7 >= 0 && n7 <= (n9 = this.c)) {
            E[] arrE = this.b;
            if (n9 < arrE.length) {
                System.arraycopy(arrE, (int)n7, arrE, (int)(n7 + 1), (int)(n9 - n7));
            } else {
                Object[] arrobject = new Object[1 + n9 * 3 / 2];
                System.arraycopy(arrE, (int)0, (Object)arrobject, (int)0, (int)n7);
                System.arraycopy(this.b, (int)n7, (Object)arrobject, (int)(n7 + 1), (int)(this.c - n7));
                this.b = arrobject;
            }
            this.b[n7] = e4;
            this.c = 1 + this.c;
            ((AbstractList)this).modCount = 1 + ((AbstractList)this).modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.b(n7));
    }

    public final boolean add(E e4) {
        this.c();
        int n7 = this.c;
        Object[] arrobject = this.b;
        if (n7 == arrobject.length) {
            this.b = Arrays.copyOf((Object[])arrobject, (int)(1 + n7 * 3 / 2));
        }
        E[] arrE = this.b;
        int n9 = this.c;
        this.c = n9 + 1;
        arrE[n9] = e4;
        ((AbstractList)this).modCount = 1 + ((AbstractList)this).modCount;
        return true;
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

    public final E get(int n7) {
        this.c(n7);
        return this.b[n7];
    }

    public final E remove(int n7) {
        this.c();
        this.c(n7);
        E[] arrE = this.b;
        E e4 = arrE[n7];
        int n9 = this.c;
        if (n7 < n9 - 1) {
            System.arraycopy(arrE, (int)(n7 + 1), arrE, (int)n7, (int)(-1 + (n9 - n7)));
        }
        this.c = -1 + this.c;
        ((AbstractList)this).modCount = 1 + ((AbstractList)this).modCount;
        return e4;
    }

    public final E set(int n7, E e4) {
        this.c();
        this.c(n7);
        E[] arrE = this.b;
        E e6 = arrE[n7];
        arrE[n7] = e4;
        ((AbstractList)this).modCount = 1 + ((AbstractList)this).modCount;
        return e6;
    }

    public final int size() {
        return this.c;
    }
}

