/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.a6
 *  c.b.b.a.e.d.b5
 *  c.b.b.a.e.d.c5
 *  c.b.b.a.e.d.e8
 *  c.b.b.a.e.d.f8
 *  c.b.b.a.e.d.h8
 *  c.b.b.a.e.d.j8
 *  c.b.b.a.e.d.m4
 *  c.b.b.a.e.d.v4
 *  c.b.b.a.e.d.x4
 *  c.b.b.a.e.d.z4
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.logging.Level
 *  java.util.logging.Logger
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.a6;
import c.b.b.a.e.d.b5;
import c.b.b.a.e.d.c5;
import c.b.b.a.e.d.e8;
import c.b.b.a.e.d.f8;
import c.b.b.a.e.d.h8;
import c.b.b.a.e.d.j8;
import c.b.b.a.e.d.m4;
import c.b.b.a.e.d.v4;
import c.b.b.a.e.d.x4;
import c.b.b.a.e.d.z4;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class a5
extends c5 {
    public final byte[] d;
    public final int e;
    public int f;

    public a5(byte[] arrby, int n7, int n9) {
        super(null);
        int n10 = arrby.length;
        if ((n9 | n10 - n9) >= 0) {
            this.d = arrby;
            this.f = 0;
            this.e = n9;
            return;
        }
        Object[] arrobject = new Object[]{n10, 0, n9};
        throw new IllegalArgumentException(String.format((String)"Array range is invalid. Buffer.length=%d, offset=%d, length=%d", (Object[])arrobject));
    }

    public final void a(byte by) {
        try {
            byte[] arrby = this.d;
            int n7 = this.f;
            this.f = n7 + 1;
            arrby[n7] = by;
            return;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            Object[] arrobject = new Object[]{this.f, this.e, 1};
            throw new b5(String.format((String)"Pos: %d, limit: %d, len: %d", (Object[])arrobject), (Throwable)indexOutOfBoundsException);
        }
    }

    public final void a(int n7) {
        if (n7 >= 0) {
            this.b(n7);
            return;
        }
        this.a((long)n7);
    }

    public final void a(int n7, int n9) {
        this.b(n7 << 3);
        if (n9 >= 0) {
            this.b(n9);
            return;
        }
        this.a((long)n9);
    }

    public final void a(int n7, x4 x42) {
        this.b(2 | n7 << 3);
        this.b(x42.c());
        v4 v42 = (v4)x42;
        this.a(v42.d, 0, v42.c());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(int n7, String string) {
        this.b(2 | n7 << 3);
        int n9 = this.f;
        try {
            int n10;
            int n11 = c5.f((int)(3 * string.length()));
            int n12 = c5.f((int)string.length());
            if (n12 == n11) {
                int n13;
                this.f = n13 = n9 + n12;
                byte[] arrby = this.d;
                int n14 = this.e - n13;
                n10 = j8.a.a((CharSequence)string, arrby, n13, n14);
                this.f = n9;
                this.b(n10 - n9 - n12);
            } else {
                this.b(j8.a((CharSequence)string));
                byte[] arrby = this.d;
                int n15 = this.f;
                int n16 = this.e - n15;
                n10 = j8.a.a((CharSequence)string, arrby, n15, n16);
            }
            this.f = n10;
            return;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new b5((Throwable)indexOutOfBoundsException);
        }
        catch (h8 h82) {
            this.f = n9;
            c5.b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable)h82);
            byte[] arrby = string.getBytes(a6.a);
            try {
                int n17 = arrby.length;
                this.b(n17);
                this.a(arrby, 0, n17);
                return;
            }
            catch (b5 b52) {
                throw b52;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                b5 b53 = new b5((Throwable)indexOutOfBoundsException);
                throw b53;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void a(long var1_1) {
        if (c5.c && this.e - this.f >= 10) {
            do {
                if ((var1_1 & -128L) == 0L) {
                    var12_4 = this.d;
                    var13_5 = this.f;
                    this.f = var13_5 + 1;
                    e8.a((byte[])var12_4, (long)var13_5, (byte)((byte)var1_1));
                    return;
                }
                var10_2 = this.d;
                var11_3 = this.f;
                this.f = var11_3 + 1;
                e8.a((byte[])var10_2, (long)var11_3, (byte)((byte)(128 | 127 & (int)var1_1)));
                var1_1 >>>= 7;
            } while (true);
        }
        do {
            if ((var1_1 & -128L) != 0L) ** GOTO lbl23
            try {
                var8_8 = this.d;
                var9_9 = this.f;
                this.f = var9_9 + 1;
                var8_8[var9_9] = (byte)var1_1;
                return;
lbl23: // 1 sources:
                var6_6 = this.d;
                var7_7 = this.f;
                this.f = var7_7 + 1;
                var6_6[var7_7] = (byte)(128 | 127 & (int)var1_1);
                var1_1 >>>= 7;
            }
            catch (IndexOutOfBoundsException var3_10) {
                var4_11 = new Object[]{this.f, this.e, 1};
                var5_12 = new b5(String.format((String)"Pos: %d, limit: %d, len: %d", (Object[])var4_11), (Throwable)var3_10);
                throw var5_12;
            }
        } while (true);
    }

    public final void a(byte[] arrby, int n7, int n9) {
        try {
            System.arraycopy((Object)arrby, (int)0, (Object)this.d, (int)this.f, (int)n9);
            this.f = n9 + this.f;
            return;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            Object[] arrobject = new Object[]{this.f, this.e, n9};
            throw new b5(String.format((String)"Pos: %d, limit: %d, len: %d", (Object[])arrobject), (Throwable)indexOutOfBoundsException);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void b(int var1_1) {
        if (c5.c && !m4.a() && (var9_2 = this.e) - (var10_3 = this.f) >= 5) {
            if ((var1_1 & -128) == 0) {
                var29_4 = this.d;
                this.f = var10_3 + 1;
                e8.a((byte[])var29_4, (long)var10_3, (byte)((byte)var1_1));
                return;
            }
            var11_5 = this.d;
            this.f = var10_3 + 1;
            e8.a((byte[])var11_5, (long)var10_3, (byte)((byte)(var1_1 | 128)));
            var12_6 = var1_1 >>> 7;
            if ((var12_6 & -128) == 0) {
                var27_7 = this.d;
                var28_8 = this.f;
                this.f = var28_8 + 1;
                e8.a((byte[])var27_7, (long)var28_8, (byte)((byte)var12_6));
                return;
            }
            var13_9 = this.d;
            var14_10 = this.f;
            this.f = var14_10 + 1;
            e8.a((byte[])var13_9, (long)var14_10, (byte)((byte)(var12_6 | 128)));
            var15_11 = var12_6 >>> 7;
            if ((var15_11 & -128) == 0) {
                var25_12 = this.d;
                var26_13 = this.f;
                this.f = var26_13 + 1;
                e8.a((byte[])var25_12, (long)var26_13, (byte)((byte)var15_11));
                return;
            }
            var16_14 = this.d;
            var17_15 = this.f;
            this.f = var17_15 + 1;
            e8.a((byte[])var16_14, (long)var17_15, (byte)((byte)(var15_11 | 128)));
            var18_16 = var15_11 >>> 7;
            if ((var18_16 & -128) == 0) {
                var23_17 = this.d;
                var24_18 = this.f;
                this.f = var24_18 + 1;
                e8.a((byte[])var23_17, (long)var24_18, (byte)((byte)var18_16));
                return;
            }
            var19_19 = this.d;
            var20_20 = this.f;
            this.f = var20_20 + 1;
            e8.a((byte[])var19_19, (long)var20_20, (byte)((byte)(var18_16 | 128)));
            var21_21 = this.d;
            var22_22 = this.f;
            this.f = var22_22 + 1;
            e8.a((byte[])var21_21, (long)var22_22, (byte)((byte)(var18_16 >>> 7)));
            return;
        }
        do {
            if ((var1_1 & -128) != 0) ** GOTO lbl56
            try {
                var7_25 = this.d;
                var8_26 = this.f;
                this.f = var8_26 + 1;
                var7_25[var8_26] = (byte)var1_1;
                return;
lbl56: // 1 sources:
                var5_23 = this.d;
                var6_24 = this.f;
                this.f = var6_24 + 1;
                var5_23[var6_24] = (byte)(128 | var1_1 & 127);
                var1_1 >>>= 7;
            }
            catch (IndexOutOfBoundsException var2_27) {
                var3_28 = new Object[]{this.f, this.e, 1};
                var4_29 = new b5(String.format((String)"Pos: %d, limit: %d, len: %d", (Object[])var3_28), (Throwable)var2_27);
                throw var4_29;
            }
        } while (true);
    }

    public final void b(long l5) {
        int n7;
        try {
            byte[] arrby = this.d;
            n7 = this.f;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            Object[] arrobject = new Object[]{this.f, this.e, 1};
            throw new b5(String.format((String)"Pos: %d, limit: %d, len: %d", (Object[])arrobject), (Throwable)indexOutOfBoundsException);
        }
        int n9 = n7 + 1;
        this.f = n9;
        arrby[n7] = (byte)(255 & (int)l5);
        int n10 = n9 + 1;
        this.f = n10;
        arrby[n9] = (byte)(255 & (int)(l5 >> 8));
        int n11 = n10 + 1;
        this.f = n11;
        arrby[n10] = (byte)(255 & (int)(l5 >> 16));
        int n12 = n11 + 1;
        this.f = n12;
        arrby[n11] = (byte)(255 & (int)(l5 >> 24));
        int n13 = n12 + 1;
        this.f = n13;
        arrby[n12] = (byte)(255 & (int)(l5 >> 32));
        int n14 = n13 + 1;
        this.f = n14;
        arrby[n13] = (byte)(255 & (int)(l5 >> 40));
        int n15 = n14 + 1;
        this.f = n15;
        arrby[n14] = (byte)(255 & (int)(l5 >> 48));
        this.f = n15 + 1;
        arrby[n15] = (byte)(255 & (int)(l5 >> 56));
    }

    public final void c(int n7) {
        int n9;
        try {
            byte[] arrby = this.d;
            n9 = this.f;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            Object[] arrobject = new Object[]{this.f, this.e, 1};
            throw new b5(String.format((String)"Pos: %d, limit: %d, len: %d", (Object[])arrobject), (Throwable)indexOutOfBoundsException);
        }
        int n10 = n9 + 1;
        this.f = n10;
        arrby[n9] = (byte)(n7 & 255);
        int n11 = n10 + 1;
        this.f = n11;
        arrby[n10] = (byte)(255 & n7 >> 8);
        int n12 = n11 + 1;
        this.f = n12;
        arrby[n11] = (byte)(255 & n7 >> 16);
        this.f = n12 + 1;
        arrby[n12] = (byte)(255 & n7 >> 24);
    }
}

