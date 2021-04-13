/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  J
 *  java.lang.Class
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.lang.reflect.Array
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.util.Locale
 */
package b;

import a.c.a.a;
import b.d;
import b.g;
import b.l;
import b.o;
import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

public class j {
    public static final long[][] t;
    public static final long u;
    public static final long[] v;
    public static final long[] w;
    public static final long[] x;
    public int[] a = new int[64];
    public long[] b;
    public long c;
    public long d;
    public short[] e;
    public short[] f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;

    public static {
        long[] arrl;
        long[] arrl2;
        t = (long[][])Array.newInstance(J.class, (int[])new int[]{13, 64});
        v = new long[16];
        w = new long[9];
        x = new long[101];
        int n2 = 0;
        for (int i2 = 0; i2 < 13; ++i2) {
            for (int i3 = 0; i3 < 64; ++i3) {
                long[] arrl3 = t[i2];
                int n3 = n2 + 1;
                arrl3[i3] = j.d(n2);
                n2 = n3;
            }
        }
        int n5 = n2 + 1;
        u = j.d(n2);
        for (int i4 = 0; i4 < (arrl2 = v).length; ++i4) {
            int n7 = n5 + 1;
            arrl2[i4] = j.d(n5);
            n5 = n7;
        }
        int n8 = 0;
        do {
            long[] arrl4 = w;
            int n9 = arrl4.length;
            if (n8 >= n9) break;
            int n10 = n5 + 1;
            arrl4[n8] = j.d(n5);
            ++n8;
            n5 = n10;
        } while (true);
        for (int i5 = 0; i5 < (arrl = x).length; ++i5) {
            int n11 = n5 + 1;
            arrl[i5] = j.d(n5);
            n5 = n11;
        }
    }

    public j() {
        long l2;
        for (int i2 = 0; i2 < 64; ++i2) {
            this.a[i2] = 0;
        }
        this.b = new long[13];
        this.e = new short[13];
        this.f = new short[13];
        int n2 = 0;
        do {
            l2 = 0L;
            if (n2 >= 13) break;
            this.b[n2] = l2;
            this.e[n2] = 0;
            this.f[n2] = 0;
            ++n2;
        } while (true);
        this.d = l2;
        this.c = l2;
        this.g = true;
        this.h = 0;
        this.i = -1;
        this.j = 0;
        this.k = 1;
        for (int i3 = 0; i3 < 64; ++i3) {
            int n3 = this.a[i3];
            l2 ^= t[n3][i3];
            if (n3 != 6 && n3 != 12) continue;
            this.m ^= t[n3][i3];
        }
        if (this.g) {
            l2 ^= u;
        }
        long l3 = l2 ^ v[this.h];
        long[] arrl = w;
        int n5 = this.i;
        int n7 = n5 >= 0 ? 1 + (n5 & 7) : 0;
        this.l = l3 ^ arrl[n7];
        this.o = -1;
        this.n = -1;
        this.q = -9900;
        this.p = -9900;
        this.s = 0;
        this.r = 0;
    }

    public j(j j2) {
        int n2 = 0;
        for (int i2 = 0; i2 < 64; ++i2) {
            this.a[i2] = j2.a[i2];
        }
        this.b = new long[13];
        this.e = new short[13];
        this.f = new short[13];
        while (n2 < 13) {
            this.b[n2] = j2.b[n2];
            this.e[n2] = j2.e[n2];
            this.f[n2] = j2.f[n2];
            ++n2;
        }
        this.c = j2.c;
        this.d = j2.d;
        this.g = j2.g;
        this.h = j2.h;
        this.i = j2.i;
        this.j = j2.j;
        this.k = j2.k;
        this.l = j2.l;
        this.m = j2.m;
        this.n = j2.n;
        this.o = j2.o;
        this.p = j2.p;
        this.q = j2.q;
        this.r = j2.r;
        this.s = j2.s;
    }

    public static final int d(int n2, int n3) {
        return n2 + n3 * 8;
    }

    public static final long d(int n2) {
        byte[] arrby;
        long l2;
        MessageDigest messageDigest = MessageDigest.getInstance((String)"SHA-1");
        byte[] arrby2 = new byte[4];
        int n3 = 0;
        for (int i2 = 0; i2 < 4; ++i2) {
            arrby2[i2] = (byte)(255 & n2 >> i2 * 8);
        }
        try {
            arrby = messageDigest.digest(arrby2);
            l2 = 0L;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            UnsupportedOperationException unsupportedOperationException;
            unsupportedOperationException = new UnsupportedOperationException("SHA-1 not available");
            throw unsupportedOperationException;
        }
        while (n3 < 8) {
            byte by = arrby[n3];
            l2 ^= (long)by << n3 * 8;
            ++n3;
        }
        return l2;
    }

    public static final int e(int n2) {
        return n2 & 7;
    }

    public static final int f(int n2) {
        return n2 >> 3;
    }

    public final int a(boolean bl) {
        if (bl) {
            return this.n;
        }
        return this.o;
    }

    public final long a() {
        long l2 = this.l;
        int n2 = this.j;
        if (n2 >= 80) {
            l2 ^= x[Math.min((int)n2, (int)100)];
        }
        return l2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(int n2) {
        int n3;
        if (n2 == 0) {
            n3 = -2 & this.h;
        } else if (n2 == 7) {
            n3 = -3 & this.h;
        } else if (n2 == 56) {
            n3 = -5 & this.h;
        } else {
            if (n2 != 63) {
                return;
            }
            n3 = -9 & this.h;
        }
        this.b(n3);
    }

    public final void a(int n2, int n3) {
        long l2;
        long l3;
        long l4;
        int[] arrn = this.a;
        int n5 = arrn[n2];
        long l5 = this.l;
        long[][] arrl = t;
        this.l = l2 = l5 ^ arrl[n5][n2];
        this.l = l3 = l2 ^ arrl[n5][n3];
        this.l = l4 = l3 ^ arrl[0][n2];
        this.l = l4 ^ arrl[0][n3];
        arrn[n2] = 0;
        arrn[n3] = n5;
        long l6 = 1L << n2;
        long l7 = 1L << n3;
        long[] arrl2 = this.b;
        long l8 = arrl2[n5];
        long l9 = l6 ^ -1L;
        arrl2[n5] = l8 & l9;
        arrl2[n5] = l7 | arrl2[n5];
        if (a.e(n5)) {
            long l10;
            this.c = l10 = l9 & this.c;
            this.c = l7 | l10;
            if (n5 == 1) {
                this.n = n3;
            }
        } else {
            long l11;
            this.d = l11 = l9 & this.d;
            this.d = l7 | l11;
            if (n5 == 7) {
                this.o = n3;
            }
        }
        short[] arrs = this.e;
        short s2 = arrs[n5];
        int[][] arrn2 = d.J;
        arrs[n5] = (short)(s2 + (arrn2[n5][n3] - arrn2[n5][n2]));
        short[] arrs2 = this.f;
        short s3 = arrs2[n5];
        int[][] arrn3 = d.K;
        arrs2[n5] = (short)(s3 + (arrn3[n5][n3] - arrn3[n5][n2]));
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(g g2, o o2) {
        boolean bl;
        block35 : {
            int n2;
            block36 : {
                int n3;
                long l2;
                int n5;
                block34 : {
                    block28 : {
                        long[] arrl;
                        block31 : {
                            int n7;
                            int n8;
                            block33 : {
                                int n9;
                                block32 : {
                                    block29 : {
                                        int n10;
                                        block30 : {
                                            block23 : {
                                                block24 : {
                                                    int n11;
                                                    block27 : {
                                                        int n12;
                                                        int n13;
                                                        block26 : {
                                                            int n14;
                                                            int n15;
                                                            block25 : {
                                                                long[] arrl2;
                                                                int[] arrn = this.a;
                                                                int n16 = g2.b;
                                                                o2.a = arrn[n16];
                                                                o2.b = this.h;
                                                                o2.c = n8 = this.i;
                                                                o2.d = this.j;
                                                                bl = this.g;
                                                                int n17 = g2.a;
                                                                n3 = arrn[n17];
                                                                n5 = arrn[n16];
                                                                l2 = 1L << n17;
                                                                this.c(-1);
                                                                if (n5 != 0 || (l2 & ((arrl2 = this.b)[6] | arrl2[12])) != 0L) break block23;
                                                                this.j = 1 + this.j;
                                                                if ((l2 & (arrl2[1] | arrl2[7])) == 0L) break block24;
                                                                n14 = g2.b;
                                                                n15 = g2.a;
                                                                if (n14 != n15 + 2) break block25;
                                                                n13 = n15 + 3;
                                                                n12 = n15 + 1;
                                                                break block26;
                                                            }
                                                            if (n14 != n15 - 2) break block27;
                                                            n13 = n15 - 4;
                                                            n12 = n15 - 1;
                                                        }
                                                        this.a(n13, n12);
                                                    }
                                                    int n18 = this.h;
                                                    if (bl) {
                                                        this.b(n18 & -2);
                                                        n11 = -3 & this.h;
                                                    } else {
                                                        this.b(n18 & -5);
                                                        n11 = -9 & this.h;
                                                    }
                                                    this.b(n11);
                                                }
                                                this.a(g2.a, g2.b);
                                                break block28;
                                            }
                                            this.j = 0;
                                            if (n3 != 6) break block29;
                                            n10 = g2.b;
                                            if (n10 - g2.a != 16) break block30;
                                            int n19 = n10 & 7;
                                            if ((n19 <= 0 || this.a[n10 - 1] != 12) && (n19 >= 7 || this.a[1 + g2.b] != 12)) break block31;
                                            n9 = 8 + g2.a;
                                            break block32;
                                        }
                                        if (n10 == n8) {
                                            this.b(n10 - 8, 0);
                                        }
                                        break block31;
                                    }
                                    if (n3 != 12) break block31;
                                    n7 = g2.b;
                                    if (n7 - g2.a != -16) break block33;
                                    int n20 = n7 & 7;
                                    if ((n20 <= 0 || this.a[n7 - 1] != 6) && (n20 >= 7 || this.a[1 + g2.b] != 6)) break block31;
                                    n9 = -8 + g2.a;
                                }
                                this.c(n9);
                                break block31;
                            }
                            if (n7 == n8) {
                                this.b(n7 + 8, 0);
                            }
                        }
                        if ((l2 & ((arrl = this.b)[1] | arrl[7])) != 0L) {
                            int n21;
                            int n22 = this.h;
                            if (bl) {
                                this.b(n22 & -2);
                                n21 = -3 & this.h;
                            } else {
                                this.b(n22 & -5);
                                n21 = -9 & this.h;
                            }
                            this.b(n21);
                        }
                        this.b(g2.a, 0);
                        int n23 = g2.c;
                        if (n23 != 0) {
                            this.b(g2.b, n23);
                        } else {
                            this.b(g2.b, n3);
                        }
                    }
                    if (!bl) break block34;
                    if ((l2 & -9151314442816847743L) != 0L && n3 == 3) {
                        this.a(g2.a);
                    }
                    if ((-9151314442816847743L & 1L << (n2 = g2.b)) == 0L || n5 != 9) break block35;
                    break block36;
                }
                this.k = 1 + this.k;
                if ((l2 & -9151314442816847743L) != 0L && n3 == 9) {
                    this.a(g2.a);
                }
                if ((-9151314442816847743L & 1L << (n2 = g2.b)) == 0L || n5 != 3) break block35;
            }
            this.a(n2);
        }
        this.l ^= u;
        this.g = bl ^ true;
    }

    public final void b(int n2) {
        long l2;
        long l3 = this.l;
        long[] arrl = v;
        this.l = l2 = l3 ^ arrl[this.h];
        this.l = l2 ^ arrl[n2];
        this.h = n2;
    }

    public final void b(int n2, int n3) {
        int n5;
        long l2;
        block11 : {
            long l3;
            long l4;
            block13 : {
                long l5;
                int n7;
                block12 : {
                    long l6;
                    int[] arrn = this.a;
                    n5 = arrn[n2];
                    arrn[n2] = n3;
                    long l7 = this.l;
                    long[][] arrl = t;
                    this.l = l6 = l7 ^ arrl[n5][n2];
                    this.l = l6 ^ arrl[n3][n2];
                    l2 = 1L << n2;
                    long[] arrl2 = this.b;
                    long l8 = arrl2[n5];
                    l5 = -1L ^ l2;
                    arrl2[n5] = l8 & l5;
                    arrl2[n3] = l2 | arrl2[n3];
                    if (n5 == 0) break block11;
                    n7 = d.n[n5];
                    if (!a.e(n5)) break block12;
                    this.p -= n7;
                    this.c = l5 & this.c;
                    if (n5 != 6) break block11;
                    this.r -= n7;
                    l4 = this.m;
                    l3 = t[6][n2];
                    break block13;
                }
                this.q -= n7;
                this.d = l5 & this.d;
                if (n5 != 12) break block11;
                this.s -= n7;
                l4 = this.m;
                l3 = t[12][n2];
            }
            this.m = l4 ^ l3;
        }
        if (n3 != 0) {
            int n8 = d.n[n3];
            if (a.e(n3)) {
                this.p = n8 + this.p;
                this.c = l2 | this.c;
                if (n3 == 6) {
                    this.r = n8 + this.r;
                    this.m ^= t[6][n2];
                }
                if (n3 == 1) {
                    this.n = n2;
                }
            } else {
                this.q = n8 + this.q;
                this.d = l2 | this.d;
                if (n3 == 12) {
                    this.s = n8 + this.s;
                    this.m ^= t[12][n2];
                }
                if (n3 == 7) {
                    this.o = n2;
                }
            }
        }
        short[] arrs = this.e;
        arrs[n5] = (short)(arrs[n5] - d.J[n5][n2]);
        short[] arrs2 = this.f;
        arrs2[n5] = (short)(arrs2[n5] - d.K[n5][n2]);
        arrs[n3] = (short)(arrs[n3] + d.J[n3][n2]);
        arrs2[n3] = (short)(arrs2[n3] + d.K[n3][n2]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(g g2, o o2) {
        int n2;
        int n3;
        block9 : {
            int n5;
            int n7;
            block11 : {
                int n8;
                int n9;
                block10 : {
                    this.l ^= u;
                    boolean bl = this.g;
                    int n10 = 1;
                    this.g = bl ^ n10;
                    n3 = this.a[g2.b];
                    this.b(g2.a, n3);
                    this.b(g2.b, o2.a);
                    this.b(o2.b);
                    this.c(o2.c);
                    this.j = o2.d;
                    boolean bl2 = this.g;
                    if (g2.c != 0) {
                        n3 = bl2 ? 6 : 12;
                        this.b(g2.a, n3);
                    }
                    if (!bl2) {
                        this.k -= n10;
                    }
                    if (!bl2) {
                        n10 = 7;
                    }
                    if (n3 != n10) break block9;
                    n9 = g2.b;
                    n8 = g2.a;
                    if (n9 != n8 + 2) break block10;
                    n7 = n8 + 1;
                    n5 = n8 + 3;
                    break block11;
                }
                if (n9 != n8 - 2) break block9;
                n7 = n8 - 1;
                n5 = n8 - 4;
            }
            this.a(n7, n5);
        }
        if ((n2 = g2.b) == this.i) {
            if (n3 == 6) {
                this.b(n2 - 8, 12);
                return;
            }
            if (n3 == 12) {
                this.b(n2 + 8, 6);
            }
        }
    }

    public final void b(boolean bl) {
        if (bl != this.g) {
            this.l ^= u;
            this.g = bl;
        }
    }

    public final void c(int n2) {
        int n3 = this.i;
        if (n3 != n2) {
            long l2;
            long l3 = this.l;
            long[] arrl = w;
            int n5 = n3 >= 0 ? 1 + (n3 & 7) : 0;
            this.l = l2 = l3 ^ arrl[n5];
            long[] arrl2 = w;
            int n7 = 0;
            if (n2 >= 0) {
                n7 = 1 + (n2 & 7);
            }
            this.l = l2 ^ arrl2[n7];
            this.i = n2;
        }
    }

    public final void c(int n2, int n3) {
        int[] arrn = this.a;
        int n5 = arrn[n2];
        arrn[n2] = n3;
        long l2 = 1L << n2;
        long[] arrl = this.b;
        long l3 = arrl[n5];
        long l4 = -1L ^ l2;
        arrl[n5] = l3 & l4;
        arrl[n3] = l2 | arrl[n3];
        if (n5 != 0) {
            if (a.e(n5)) {
                this.c = l4 & this.c;
            } else {
                this.d = l4 & this.d;
            }
        }
        if (n3 != 0) {
            if (a.e(n3)) {
                this.c = l2 | this.c;
                return;
            }
            this.d = l2 | this.d;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object.getClass() != j.class) {
            return false;
        }
        j j2 = (j)object;
        for (int i2 = 0; i2 < 64; ++i2) {
            if (this.a[i2] != j2.a[i2]) return false;
            {
                continue;
            }
        }
        if (this.g != j2.g) return false;
        if (this.h != j2.h || this.i != j2.i) {
            return false;
        }
        boolean bl = true;
        if (!bl) {
            return false;
        }
        if (this.j != j2.j) {
            return false;
        }
        if (this.k != j2.k) {
            return false;
        }
        if (this.l != j2.l) {
            return false;
        }
        if (this.m == j2.m) return true;
        return false;
    }

    public int hashCode() {
        return (int)this.l;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder(400);
        String string = String.format((Locale)Locale.US, (String)"%n", (Object[])new Object[0]);
        stringBuilder2.append("    +----+----+----+----+----+----+----+----+");
        stringBuilder2.append(string);
        for (int i2 = 7; i2 >= 0; --i2) {
            stringBuilder2.append("    |");
            for (int i3 = 0; i3 < 8; ++i3) {
                String string2;
                char c2 = ' ';
                stringBuilder2.append(c2);
                int n2 = j.d(i3, i2);
                int n3 = this.a[n2];
                if (n3 == 0) {
                    boolean bl = (i3 & 1) == (i2 & 1);
                    string2 = bl ? ".. |" : "   |";
                } else {
                    if (!a.e(n3)) {
                        c2 = '*';
                    }
                    stringBuilder2.append(c2);
                    String string3 = l.a(n3);
                    if (string3.length() == 0) {
                        string3 = "P";
                    }
                    stringBuilder2.append(string3);
                    string2 = " |";
                }
                stringBuilder2.append(string2);
            }
            stringBuilder2.append(string);
            stringBuilder2.append("    +----+----+----+----+----+----+----+----+");
            stringBuilder2.append(string);
        }
        stringBuilder.append(stringBuilder2.toString());
        String string4 = this.g ? "white\n" : "black\n";
        stringBuilder.append(string4);
        stringBuilder.append(Long.toHexString((long)this.l));
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}

