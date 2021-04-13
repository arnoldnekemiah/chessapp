/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  J
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.UnsupportedOperationException
 *  java.lang.reflect.Array
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.util.Locale
 */
package c.c.b.i;

import a.c.a.a;
import c.c.b.i.f;
import c.c.b.i.l;
import c.c.b.i.o;
import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

public class j {
    public static long[][] j;
    public static long k;
    public static long[] l;
    public static long[] m;
    public int[] a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public long g;
    public int h;
    public int i;

    public static {
        long[] arrl;
        j = (long[][])Array.newInstance(J.class, (int[])new int[]{13, 64});
        l = new long[16];
        m = new long[9];
        int n10 = 0;
        for (int i10 = 0; i10 < 13; ++i10) {
            for (int i11 = 0; i11 < 64; ++i11) {
                long[] arrl2 = j[i10];
                int n11 = n10 + 1;
                arrl2[i11] = j.e(n10);
                n10 = n11;
            }
        }
        int n12 = n10 + 1;
        k = j.e(n10);
        int n13 = 0;
        do {
            long[] arrl3 = l;
            int n14 = arrl3.length;
            if (n13 >= n14) break;
            int n15 = n12 + 1;
            arrl3[n13] = j.e(n12);
            ++n13;
            n12 = n15;
        } while (true);
        for (int i12 = 0; i12 < (arrl = m).length; ++i12) {
            int n16 = n12 + 1;
            arrl[i12] = j.e(n12);
            n12 = n16;
        }
    }

    public j() {
        this.a = new int[64];
        for (int i10 = 0; i10 < 64; ++i10) {
            this.a[i10] = 0;
        }
        this.b = true;
        this.c = 0;
        this.d = -1;
        this.e = 0;
        this.f = 1;
        long l10 = 0L;
        for (int i11 = 0; i11 < 64; ++i11) {
            int n10 = this.a[i11];
            l10 ^= j[n10][i11];
        }
        if (this.b) {
            l10 ^= k;
        }
        long l11 = l10 ^ l[this.c];
        long[] arrl = m;
        int n11 = this.d;
        int n12 = 0;
        if (n11 >= 0) {
            n12 = 1 + (n11 & 7);
        }
        this.g = l11 ^ arrl[n12];
        this.i = -1;
        this.h = -1;
    }

    public j(j j10) {
        int[] arrn = new int[64];
        this.a = arrn;
        System.arraycopy((Object)j10.a, (int)0, (Object)arrn, (int)0, (int)64);
        this.b = j10.b;
        this.c = j10.c;
        this.d = j10.d;
        this.e = j10.e;
        this.f = j10.f;
        this.g = j10.g;
        this.h = j10.h;
        this.i = j10.i;
    }

    public static final int b(int n10, int n11) {
        return n10 + n11 * 8;
    }

    public static final long e(int n10) {
        byte[] arrby;
        long l10;
        MessageDigest messageDigest = MessageDigest.getInstance((String)"SHA-1");
        byte[] arrby2 = new byte[4];
        int n11 = 0;
        for (int i10 = 0; i10 < 4; ++i10) {
            arrby2[i10] = (byte)(255 & n10 >> i10 * 8);
        }
        try {
            arrby = messageDigest.digest(arrby2);
            l10 = 0L;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            UnsupportedOperationException unsupportedOperationException;
            unsupportedOperationException = new UnsupportedOperationException("SHA-1 not available");
            throw unsupportedOperationException;
        }
        while (n11 < 8) {
            byte by = arrby[n11];
            l10 ^= (long)by << n11 * 8;
            ++n11;
        }
        return l10;
    }

    public static final int f(int n10) {
        return n10 & 7;
    }

    public static final int g(int n10) {
        return n10 >> 3;
    }

    public final int a(int n10) {
        int n11 = 0;
        for (int i10 = 0; i10 < 64; ++i10) {
            if (this.a[i10] != n10) continue;
            ++n11;
        }
        return n11;
    }

    public final int a(boolean bl) {
        if (bl) {
            return this.h;
        }
        return this.i;
    }

    public final void a(int n10, int n11) {
        long l10;
        int[] arrn = this.a;
        int n12 = arrn[n10];
        long l11 = this.g;
        long[][] arrl = j;
        this.g = l10 = l11 ^ arrl[n12][n10];
        this.g = l10 ^ arrl[n11][n10];
        arrn[n10] = n11;
        if (n11 == 1) {
            this.h = n10;
            return;
        }
        if (n11 == 7) {
            this.i = n10;
        }
    }

    public final boolean a() {
        return (1 & this.c) != 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean a(f var1_1, o var2_2) {
        block24 : {
            block23 : {
                block21 : {
                    block22 : {
                        block17 : {
                            block20 : {
                                block19 : {
                                    block18 : {
                                        var3_3 = this.a;
                                        var4_4 = var1_1.b;
                                        var2_2.a = var3_3[var4_4];
                                        var2_2.b = this.c;
                                        var2_2.c = this.d;
                                        var2_2.d = this.e;
                                        var5_5 = this.b;
                                        var6_6 = var1_1.a;
                                        var7_7 = var3_3[var6_6];
                                        var8_8 = var3_3[var4_4];
                                        var9_9 = var6_6 == 0 && var4_4 == 0;
                                        this.e = !var9_9 && var8_8 == 0 && var7_7 != (var31_10 = var5_5 != false ? 6 : 12) ? 1 + this.e : 0;
                                        if (!var5_5) {
                                            this.f = 1 + this.f;
                                        }
                                        var10_11 = var5_5 != false ? 1 : 7;
                                        var11_12 = var1_1.a;
                                        var12_13 = 3;
                                        if (var7_7 != var10_11) break block17;
                                        var23_14 = var1_1.b;
                                        if (var23_14 != var11_12 + 2) break block18;
                                        var26_15 = var11_12 + 1;
                                        var30_16 = this.a;
                                        var28_17 = var11_12 + var12_13;
                                        var29_18 = var30_16[var28_17];
                                        break block19;
                                    }
                                    if (var23_14 != var11_12 - 2) break block20;
                                    var26_15 = var11_12 - 1;
                                    var27_19 = this.a;
                                    var28_17 = var11_12 - 4;
                                    var29_18 = var27_19[var28_17];
                                }
                                this.a(var26_15, var29_18);
                                this.a(var28_17, 0);
                            }
                            var24_20 = this.c;
                            if (var5_5) {
                                this.c(var24_20 & -2);
                                var25_21 = -3 & this.c;
                            } else {
                                this.c(var24_20 & -5);
                                var25_21 = -9 & this.c;
                            }
                            this.c(var25_21);
                        }
                        if (!var9_9) {
                            var22_22 = var5_5 != false ? 3 : 9;
                            if (var7_7 == var22_22) {
                                this.b(var1_1.a);
                            }
                            if (var5_5) {
                                var12_13 = 9;
                            }
                            if (var8_8 == var12_13) {
                                this.b(var1_1.b);
                            }
                        }
                        var13_23 = this.d;
                        this.d(-1);
                        var2_2.e = 0;
                        if (var7_7 != 6) break block21;
                        var20_24 = var1_1.b;
                        if (var20_24 - var1_1.a != 16) break block22;
                        var21_25 = var20_24 & 7;
                        if ((var21_25 <= 0 || this.a[var20_24 - 1] != 12) && (var21_25 >= 7 || this.a[1 + var1_1.b] != 12)) ** GOTO lbl-1000
                        var19_26 = 8 + var1_1.a;
                        break block23;
                    }
                    if (var20_24 != var13_23) ** GOTO lbl-1000
                    this.a(var20_24 - 8, 0);
                    var2_2.e = 12;
                    ** GOTO lbl82
                }
                if (var7_7 != 12) ** GOTO lbl-1000
                var17_28 = var1_1.b;
                if (var17_28 - var1_1.a != -16) break block24;
                var18_29 = var17_28 & 7;
                if ((var18_29 <= 0 || this.a[var17_28 - 1] != 6) && (var18_29 >= 7 || this.a[1 + var1_1.b] != 6)) ** GOTO lbl-1000
                var19_26 = -8 + var1_1.a;
            }
            this.d(var19_26);
            ** GOTO lbl-1000
        }
        if (var17_28 == var13_23) {
            this.a(var17_28 + 8, 0);
            var2_2.e = 6;
lbl82: // 2 sources:
            var14_27 = true;
        } else lbl-1000: // 6 sources:
        {
            var14_27 = false;
        }
        this.a(var1_1.a, 0);
        var15_30 = var1_1.c;
        var16_31 = var1_1.b;
        if (var15_30 != 0) {
            this.a(var16_31, var15_30);
        } else {
            this.a(var16_31, var7_7);
        }
        this.b(var5_5 ^ true);
        return var14_27;
    }

    public final boolean a(j j10) {
        for (int i10 = 0; i10 < 64; ++i10) {
            if (this.a[i10] == j10.a[i10]) continue;
            return false;
        }
        if (this.b != j10.b) {
            return false;
        }
        if (this.c != j10.c) {
            return false;
        }
        return this.d == j10.d;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(int n10) {
        int n11;
        if (n10 == 0) {
            n11 = -2 & this.c;
        } else if (n10 == 7) {
            n11 = -3 & this.c;
        } else if (n10 == 56) {
            n11 = -5 & this.c;
        } else {
            if (n10 != 63) {
                return;
            }
            n11 = -9 & this.c;
        }
        this.c(n11);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(f f10, o o10) {
        int n10;
        int n11;
        block8 : {
            int n12;
            int n13;
            int n14;
            block10 : {
                int n15;
                int n16;
                block9 : {
                    this.b(true ^ this.b);
                    n10 = this.a[f10.b];
                    this.a(f10.a, n10);
                    this.a(f10.b, o10.a);
                    this.c(o10.b);
                    this.d(o10.c);
                    this.e = o10.d;
                    boolean bl = this.b;
                    if (f10.c != 0) {
                        n10 = bl ? 6 : 12;
                        this.a(f10.a, n10);
                    }
                    if (!bl) {
                        --this.f;
                    }
                    int n17 = bl ? 1 : 7;
                    n16 = f10.a;
                    if (n10 != n17) break block8;
                    n15 = f10.b;
                    if (n15 != n16 + 2) break block9;
                    n14 = n16 + 3;
                    int[] arrn = this.a;
                    n13 = n16 + 1;
                    n12 = arrn[n13];
                    break block10;
                }
                if (n15 != n16 - 2) break block8;
                n14 = n16 - 4;
                int[] arrn = this.a;
                n13 = n16 - 1;
                n12 = arrn[n13];
            }
            this.a(n14, n12);
            this.a(n13, 0);
        }
        if ((n11 = f10.b) == this.d) {
            if (n10 == 6) {
                this.a(n11 - 8, 12);
                return;
            }
            if (n10 == 12) {
                this.a(n11 + 8, 6);
            }
        }
    }

    public final void b(boolean bl) {
        if (bl != this.b) {
            this.g ^= k;
            this.b = bl;
        }
    }

    public final boolean b() {
        return (4 & this.c) != 0;
    }

    public final void c(int n10) {
        long l10;
        long l11 = this.g;
        long[] arrl = l;
        this.g = l10 = l11 ^ arrl[this.c];
        this.g = l10 ^ arrl[n10];
        this.c = n10;
    }

    public final boolean c() {
        return (2 & this.c) != 0;
    }

    public final void d(int n10) {
        int n11 = this.d;
        if (n11 != n10) {
            long l10;
            long l11 = this.g;
            long[] arrl = m;
            int n12 = n11 >= 0 ? 1 + (n11 & 7) : 0;
            this.g = l10 = l11 ^ arrl[n12];
            long[] arrl2 = m;
            int n13 = 0;
            if (n10 >= 0) {
                n13 = 1 + (n10 & 7);
            }
            this.g = l10 ^ arrl2[n13];
            this.d = n10;
        }
    }

    public final boolean d() {
        return (8 & this.c) != 0;
    }

    public boolean equals(Object object) {
        if (object != null) {
            if (object.getClass() != j.class) {
                return false;
            }
            j j10 = (j)object;
            if (!this.a(j10)) {
                return false;
            }
            if (this.e != j10.e) {
                return false;
            }
            if (this.f != j10.f) {
                return false;
            }
            return this.g == j10.g;
        }
        return false;
    }

    public int hashCode() {
        return (int)this.g;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(400);
        String string = String.format((Locale)Locale.US, (String)"%n", (Object[])new Object[0]);
        stringBuilder.append("    +----+----+----+----+----+----+----+----+");
        stringBuilder.append(string);
        for (int i10 = 7; i10 >= 0; --i10) {
            stringBuilder.append("    |");
            for (int i11 = 0; i11 < 8; ++i11) {
                String string2;
                char c10 = ' ';
                stringBuilder.append(c10);
                int n10 = j.b(i11, i10);
                int n11 = this.a[n10];
                if (n11 == 0) {
                    boolean bl = (i11 & 1) == (i10 & 1);
                    string2 = bl ? ".. |" : "   |";
                } else {
                    if (!a.f(n11)) {
                        c10 = '*';
                    }
                    stringBuilder.append(c10);
                    String string3 = l.a(n11);
                    if (string3.length() == 0) {
                        string3 = "P";
                    }
                    stringBuilder.append(string3);
                    string2 = " |";
                }
                stringBuilder.append(string2);
            }
            stringBuilder.append(string);
            stringBuilder.append("    +----+----+----+----+----+----+----+----+");
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }
}

