/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.c6
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c.b.b.a.e.d;

import a.c.a.a;
import c.b.b.a.e.d.c6;
import c.b.b.a.e.d.f8;
import c.b.b.a.e.d.h8;
import c.b.b.a.e.d.j8;

public final class g8
extends f8 {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final int a(int n10, byte[] arrby, int n11, int n12) {
        while (n11 < n12 && arrby[n11] >= 0) {
            ++n11;
        }
        if (n11 >= n12) {
            return 0;
        }
        while (n11 < n12) {
            int n13 = n11 + 1;
            byte by = arrby[n11];
            if (by < 0) {
                if (by < -32) {
                    if (n13 >= n12) return by;
                    if (by < -62) return -1;
                    n11 = n13 + 1;
                    if (arrby[n13] <= -65) continue;
                    return -1;
                }
                if (by < -16) {
                    if (n13 >= n12 - 1) {
                        return j8.b(arrby, n13, n12);
                    }
                    int n14 = n13 + 1;
                    byte by2 = arrby[n13];
                    if (by2 > -65) return -1;
                    if (by == -32) {
                        if (by2 < -96) return -1;
                    }
                    if (by == -19) {
                        if (by2 >= -96) return -1;
                    }
                    n11 = n14 + 1;
                    if (arrby[n14] <= -65) continue;
                    return -1;
                }
                if (n13 >= n12 - 2) {
                    return j8.b(arrby, n13, n12);
                }
                int n15 = n13 + 1;
                byte by3 = arrby[n13];
                if (by3 > -65) return -1;
                if ((by << 28) + (by3 + 112) >> 30 != 0) return -1;
                int n16 = n15 + 1;
                if (arrby[n15] > -65) return -1;
                n13 = n16 + 1;
                if (arrby[n16] > -65) {
                    return -1;
                }
            }
            n11 = n13;
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final int a(CharSequence var1_1, byte[] var2_2, int var3_3, int var4_4) {
        block11 : {
            var5_5 = var1_1.length();
            var6_6 = var4_4 + var3_3;
            for (var7_7 = 0; var7_7 < var5_5 && (var26_8 = var7_7 + var3_3) < var6_6 && (var27_9 = var1_1.charAt(var7_7)) < ''; ++var7_7) {
                var2_2[var26_8] = (byte)var27_9;
            }
            if (var7_7 == var5_5) {
                return var3_3 + var5_5;
            }
            var8_10 = var3_3 + var7_7;
            while (var7_7 < var5_5) {
                block12 : {
                    var9_11 = var1_1.charAt(var7_7);
                    if (var9_11 >= '' || var8_10 >= var6_6) break block12;
                    var24_20 = var8_10 + 1;
                    var2_2[var8_10] = (byte)var9_11;
                    ** GOTO lbl29
                }
                if (var9_11 < '\u0800' && var8_10 <= var6_6 - 2) {
                    var25_21 = var8_10 + 1;
                    var2_2[var8_10] = (byte)(960 | var9_11 >>> 6);
                    var8_10 = var25_21 + 1;
                    var2_2[var25_21] = (byte)(128 | var9_11 & 63);
                } else if ((var9_11 < '\ud800' || var9_11 > '\udfff') && var8_10 <= var6_6 - 3) {
                    var22_18 = var8_10 + 1;
                    var2_2[var8_10] = (byte)(480 | var9_11 >>> 12);
                    var23_19 = var22_18 + 1;
                    var2_2[var22_18] = (byte)(128 | 63 & var9_11 >>> 6);
                    var24_20 = var23_19 + 1;
                    var2_2[var23_19] = (byte)(128 | var9_11 & 63);
lbl29: // 2 sources:
                    var8_10 = var24_20;
                } else {
                    if (var8_10 > var6_6 - 4) break block11;
                    var16_12 = var7_7 + 1;
                    if (var16_12 == var1_1.length()) throw new h8(var7_7 - 1, var5_5);
                    var17_13 = var1_1.charAt(var16_12);
                    if (!Character.isSurrogatePair((char)var9_11, (char)var17_13)) {
                        var7_7 = var16_12;
                        throw new h8(var7_7 - 1, var5_5);
                    }
                    var18_14 = Character.toCodePoint((char)var9_11, (char)var17_13);
                    var19_15 = var8_10 + 1;
                    var2_2[var8_10] = (byte)(240 | var18_14 >>> 18);
                    var20_16 = var19_15 + 1;
                    var2_2[var19_15] = (byte)(128 | 63 & var18_14 >>> 12);
                    var21_17 = var20_16 + 1;
                    var2_2[var20_16] = (byte)(128 | 63 & var18_14 >>> 6);
                    var8_10 = var21_17 + 1;
                    var2_2[var21_17] = (byte)(128 | var18_14 & 63);
                    var7_7 = var16_12;
                }
                ++var7_7;
            }
            return var8_10;
        }
        if (var9_11 >= '\ud800' && var9_11 <= '\udfff') {
            var15_22 = var7_7 + 1;
            if (var15_22 == var1_1.length()) throw new h8(var7_7, var5_5);
            if (!Character.isSurrogatePair((char)var9_11, (char)var1_1.charAt(var15_22))) {
                throw new h8(var7_7, var5_5);
            }
        }
        var10_23 = new StringBuilder(37);
        var10_23.append("Failed writing ");
        var10_23.append(var9_11);
        var10_23.append(" at index ");
        var10_23.append(var8_10);
        throw new ArrayIndexOutOfBoundsException(var10_23.toString());
    }

    @Override
    public final String a(byte[] arrby, int n10, int n11) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException;
        int n12 = arrby.length;
        if ((n10 | n11 | n12 - n10 - n11) >= 0) {
            byte by;
            int n13 = n10 + n11;
            char[] arrc = new char[n11];
            int n14 = 0;
            while (n10 < n13 && a.a(by = arrby[n10])) {
                ++n10;
                int n15 = n14 + 1;
                arrc[n14] = (char)by;
                n14 = n15;
            }
            block1 : while (n10 < n13) {
                int n16 = n10 + 1;
                byte by2 = arrby[n10];
                if (a.a(by2)) {
                    int n17 = n14 + 1;
                    arrc[n14] = (char)by2;
                    n10 = n16;
                    do {
                        byte by3;
                        n14 = n17;
                        if (n10 >= n13 || !a.a(by3 = arrby[n10])) continue block1;
                        ++n10;
                        n17 = n14 + 1;
                        arrc[n14] = (char)by3;
                    } while (true);
                }
                boolean bl = by2 < -32;
                if (bl) {
                    if (n16 < n13) {
                        int n18 = n16 + 1;
                        int n19 = n14 + 1;
                        a.a(by2, arrby[n16], arrc, n14);
                        n10 = n18;
                        n14 = n19;
                        continue;
                    }
                    throw c6.e();
                }
                boolean bl2 = by2 < -16;
                if (bl2) {
                    if (n16 < n13 - 1) {
                        int n20 = n16 + 1;
                        int n21 = n20 + 1;
                        int n22 = n14 + 1;
                        a.a(by2, arrby[n16], arrby[n20], arrc, n14);
                        n10 = n21;
                        n14 = n22;
                        continue;
                    }
                    throw c6.e();
                }
                if (n16 < n13 - 2) {
                    int n23 = n16 + 1;
                    int n24 = n23 + 1;
                    int n25 = n24 + 1;
                    a.a(by2, arrby[n16], arrby[n23], arrby[n24], arrc, n14);
                    n14 += 2;
                    n10 = n25;
                    continue;
                }
                throw c6.e();
            }
            return new String(arrc, 0, n14);
        }
        Object[] arrobject = new Object[]{n12, n10, n11};
        arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(String.format((String)"buffer length=%d, index=%d, size=%d", (Object[])arrobject));
        throw arrayIndexOutOfBoundsException;
    }
}

