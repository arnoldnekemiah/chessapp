/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package b;

import b.g;

public class f {
    public a[] a = new a[200];

    public f() {
        a[] arra;
        for (int i2 = 0; i2 < (arra = this.a).length; ++i2) {
            arra[i2] = new a();
        }
    }

    public final void a(int n2, g g2) {
        a[] arra = this.a;
        if (n2 >= arra.length) {
            return;
        }
        short s2 = (short)(g2.a + (g2.b << 6) + (g2.c << 12));
        a a2 = arra[n2];
        int n3 = a2.a;
        if (s2 != n3) {
            a2.b = n3;
            a2.a = s2;
        }
    }

    public static final class a {
        public int a = 0;
        public int b = 0;
    }

}

