/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package a.b;

import a.b.d;

public class g<E>
implements Cloneable {
    public static final Object e = new Object();
    public boolean a = false;
    public int[] b;
    public Object[] c;
    public int d;

    public g() {
        int n2 = d.a(10);
        this.b = new int[n2];
        this.c = new Object[n2];
        this.d = 0;
    }

    public E a(int n2) {
        Object[] arrobject;
        int n3 = d.a(this.b, this.d, n2);
        if (n3 >= 0 && (arrobject = this.c)[n3] != e) {
            return (E)arrobject[n3];
        }
        return null;
    }

    public final void a() {
        int n2 = this.d;
        int[] arrn = this.b;
        Object[] arrobject = this.c;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = arrobject[i2];
            if (object == e) continue;
            if (i2 != n3) {
                arrn[n3] = arrn[i2];
                arrobject[n3] = object;
                arrobject[i2] = null;
            }
            ++n3;
        }
        this.a = false;
        this.d = n3;
    }

    public void a(int n2, E e2) {
        int n3;
        int n4 = this.d;
        if (n4 != 0 && n2 <= this.b[n4 - 1]) {
            this.b(n2, e2);
            return;
        }
        if (this.a && this.d >= this.b.length) {
            this.a();
        }
        if ((n3 = this.d) >= this.b.length) {
            int n5 = d.a(n3 + 1);
            int[] arrn = new int[n5];
            Object[] arrobject = new Object[n5];
            int[] arrn2 = this.b;
            System.arraycopy((Object)arrn2, (int)0, (Object)arrn, (int)0, (int)arrn2.length);
            Object[] arrobject2 = this.c;
            System.arraycopy((Object)arrobject2, (int)0, (Object)arrobject, (int)0, (int)arrobject2.length);
            this.b = arrn;
            this.c = arrobject;
        }
        this.b[n3] = n2;
        this.c[n3] = e2;
        this.d = n3 + 1;
    }

    public void b(int n2) {
        Object object;
        Object object2;
        Object[] arrobject;
        int n3 = d.a(this.b, this.d, n2);
        if (n3 >= 0 && (object = (arrobject = this.c)[n3]) != (object2 = e)) {
            arrobject[n3] = object2;
            this.a = true;
        }
    }

    public void b(int n2, E e2) {
        int n3;
        int n4;
        Object[] arrobject;
        int n5 = d.a(this.b, this.d, n2);
        if (n5 >= 0) {
            this.c[n5] = e2;
            return;
        }
        int n6 = ~n5;
        if (n6 < this.d && (arrobject = this.c)[n6] == e) {
            this.b[n6] = n2;
            arrobject[n6] = e2;
            return;
        }
        if (this.a && this.d >= this.b.length) {
            this.a();
            n6 = -1 ^ d.a(this.b, this.d, n2);
        }
        if ((n4 = this.d) >= this.b.length) {
            int n7 = d.a(n4 + 1);
            int[] arrn = new int[n7];
            Object[] arrobject2 = new Object[n7];
            int[] arrn2 = this.b;
            System.arraycopy((Object)arrn2, (int)0, (Object)arrn, (int)0, (int)arrn2.length);
            Object[] arrobject3 = this.c;
            System.arraycopy((Object)arrobject3, (int)0, (Object)arrobject2, (int)0, (int)arrobject3.length);
            this.b = arrn;
            this.c = arrobject2;
        }
        if ((n3 = this.d) - n6 != 0) {
            int[] arrn = this.b;
            int n8 = n6 + 1;
            System.arraycopy((Object)arrn, (int)n6, (Object)arrn, (int)n8, (int)(n3 - n6));
            Object[] arrobject4 = this.c;
            System.arraycopy((Object)arrobject4, (int)n6, (Object)arrobject4, (int)n8, (int)(this.d - n6));
        }
        this.b[n6] = n2;
        this.c[n6] = e2;
        this.d = 1 + this.d;
    }

    public Object clone() {
        try {
            g g2 = (g)super.clone();
            g2.b = (int[])this.b.clone();
            g2.c = (Object[])this.c.clone();
            return g2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new AssertionError((Object)cloneNotSupportedException);
        }
    }

    public String toString() {
        int n2;
        if (this.a) {
            this.a();
        }
        if ((n2 = this.d) <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(n2 * 28);
        stringBuilder.append('{');
        for (int i2 = 0; i2 < this.d; ++i2) {
            Object object;
            if (i2 > 0) {
                stringBuilder.append(", ");
            }
            if (this.a) {
                this.a();
            }
            stringBuilder.append(this.b[i2]);
            stringBuilder.append('=');
            if (this.a) {
                this.a();
            }
            if ((object = this.c[i2]) != this) {
                stringBuilder.append(object);
                continue;
            }
            stringBuilder.append("(this Map)");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

