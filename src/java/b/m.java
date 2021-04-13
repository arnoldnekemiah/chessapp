/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package b;

import b.g;

public class m {
    public a[] a;
    public a b;
    public byte c;

    public m(int n2) {
        a a2;
        int n3 = 1 << n2;
        this.a = new a[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            a a4 = new a();
            a4.a = 0L;
            a4.d = 0;
            a4.f = (byte)3;
            this.a[i2] = a4;
        }
        this.b = a2 = new a();
        a2.f = (byte)3;
        this.c = 0;
    }

    public final int a(long l2) {
        return (int)(l2 & (long)(-1 + this.a.length));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(long l2, g g2, int n2, int n3, int n5, int n7) {
        short s2;
        short s3;
        short s4;
        int n8;
        int n9 = n5 < 0 ? 0 : n5;
        int n10 = (int)(l2 & (long)(-1 + this.a.length));
        int n11 = this.b(l2);
        a[] arra = this.a;
        a a2 = arra[n10];
        if (a2.a != l2) {
            a2 = arra[n11];
            n8 = 1;
        } else {
            n8 = 0;
        }
        if (a2.a != l2) {
            int n12;
            byte by;
            a[] arra2 = this.a;
            if (arra2[n11].a(arra2[n10], this.c)) {
                a2 = this.a[n10];
                n8 = 0;
            }
            boolean bl = a2.e == (by = this.c) && (a2.f == 0 || (32767 & a2.d) > 24);
            if (bl && a2.a(this.a[n12 = a2.d >>> 15 == 0 ? this.b(a2.a) : this.a(a2.a)], this.c)) {
                short s5;
                short s6;
                a a4 = this.a[n12];
                a4.a = a2.a;
                a4.b = a2.b;
                a4.c = a2.c;
                a4.d = s5 = a2.d;
                a4.e = a2.e;
                a4.f = a2.f;
                int n13 = 1 - (a2.d >>> 15);
                a4.d = s6 = (short)(s5 & 32767);
                a4.d = (short)(s6 | n13 << 15);
                a4.g = a2.g;
            }
        }
        if (a2.a == l2 && (32767 & a2.d) > n9 && a2.f == n2) {
            if (n2 == 0) {
                return;
            }
            if (n2 == 1 && g2.d <= a2.a(n3)) {
                return;
            }
            if (n2 == 2 && g2.d >= a2.a(n3)) {
                return;
            }
        }
        boolean bl = true;
        if (!bl) return;
        if (a2.a != l2 || g2.a != g2.b) {
            a2.b = (short)(g2.a + (g2.b << 6) + (g2.c << 12));
        }
        a2.a = l2;
        int n14 = g2.d;
        if (n14 > 31000) {
            n14 += n3;
        } else if (n14 < -31000) {
            n14 -= n3;
        }
        a2.c = (short)n14;
        a2.d = s4 = (short)(32768 & a2.d);
        a2.d = s3 = (short)(s4 | 32767 & (short)n9);
        a2.e = this.c;
        a2.f = (byte)n2;
        a2.d = s2 = (short)(s3 & 32767);
        a2.d = (short)(s2 | n8 << 15);
        a2.g = (short)n7;
    }

    public final int b(long l2) {
        return (int)(l2 >> 32 & (long)(-1 + this.a.length));
    }

    /*
     * Enabled aggressive block sorting
     */
    public final a c(long l2) {
        a[] arra = this.a;
        a a2 = arra[(int)(l2 & (long)(-1 + arra.length))];
        if (a2.a != l2) {
            int n2 = this.b(l2);
            a2 = this.a[n2];
            if (a2.a != l2) {
                return this.b;
            }
        }
        a2.e = this.c;
        return a2;
    }

    public static final class a {
        public long a;
        public short b;
        public short c;
        public short d;
        public byte e;
        public byte f;
        public short g;

        public final int a(int n2) {
            int n3 = this.c;
            if (n3 > 31000) {
                return n3 - n2;
            }
            if (n3 < -31000) {
                n3 += n2;
            }
            return n3;
        }

        public final void a(g g2) {
            short s2 = this.b;
            g2.a = s2 & 63;
            g2.b = 63 & s2 >> 6;
            g2.c = 15 & s2 >> 12;
        }

        public final boolean a(a a2, int n2) {
            boolean bl;
            boolean bl2;
            boolean bl3 = this.e == n2;
            if (bl3 != (bl = a2.e == n2)) {
                return this.e == n2;
            }
            boolean bl4 = this.f == 0;
            if (bl4 != (bl2 = a2.f == 0)) {
                return this.f == 0;
            }
            short s2 = this.d;
            int n3 = s2 & 32767;
            short s3 = a2.d;
            if (n3 != (s3 & 32767)) {
                return (s2 & 32767) > (s3 & 32767);
            }
            return false;
        }
    }

}

