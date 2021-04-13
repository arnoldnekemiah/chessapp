/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.c6
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.AssertionError
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c.b.b.a.e.d;

import a.c.a.a;
import c.b.b.a.e.d.c6;
import c.b.b.a.e.d.e8;
import c.b.b.a.e.d.f8;
import c.b.b.a.e.d.h8;
import c.b.b.a.e.d.j8;

public final class i8
extends f8 {
    public static int a(byte[] arrby, int n10, long l10, int n11) {
        if (n11 != 0) {
            if (n11 != 1) {
                if (n11 == 2) {
                    return j8.a(n10, (int)e8.a(arrby, l10), (int)e8.a(arrby, l10 + 1L));
                }
                throw new AssertionError();
            }
            return j8.a(n10, e8.a(arrby, l10));
        }
        return j8.a(n10);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final int a(int n10, byte[] arrby, int n11, int n12) {
        long l10;
        int n13;
        int n14;
        block18 : {
            int n15 = arrby.length;
            if ((n11 | n12 | n15 - n12) < 0) {
                Object[] arrobject = new Object[]{n15, n11, n12};
                ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(String.format((String)"Array length=%d, index=%d, limit=%d", (Object[])arrobject));
                throw arrayIndexOutOfBoundsException;
            }
            l10 = n11;
            n13 = (int)((long)n12 - l10);
            if (n13 < 16) {
                n14 = 0;
            } else {
                long l11 = l10;
                for (n14 = 0; n14 < n13; ++n14) {
                    long l12 = l11 + 1L;
                    if (e8.a(arrby, l11) >= 0) {
                        l11 = l12;
                        continue;
                    }
                    break block18;
                }
                n14 = n13;
            }
        }
        int n16 = n13 - n14;
        long l13 = l10 + (long)n14;
        do {
            long l14;
            byte by = 0;
            while (n16 > 0) {
                long l15 = l13 + 1L;
                by = e8.a(arrby, l13);
                if (by >= 0) {
                    --n16;
                    l13 = l15;
                    continue;
                }
                l13 = l15;
                break;
            }
            if (n16 == 0) {
                return 0;
            }
            int n17 = n16 - 1;
            if (by < -32) {
                if (n17 == 0) return by;
                n16 = n17 - 1;
                if (by < -62) return -1;
                l14 = l13 + 1L;
                if (e8.a(arrby, l13) > -65) {
                    return -1;
                }
            } else {
                if (by < -16) {
                    if (n17 < 2) {
                        return i8.a(arrby, by, l13, n17);
                    }
                    n16 = n17 - 2;
                    long l16 = l13 + 1L;
                    byte by2 = e8.a(arrby, l13);
                    if (by2 > -65) return -1;
                    if (by == -32) {
                        if (by2 < -96) return -1;
                    }
                    if (by == -19) {
                        if (by2 >= -96) return -1;
                    }
                    l13 = l16 + 1L;
                    if (e8.a(arrby, l16) <= -65) continue;
                    return -1;
                }
                if (n17 < 3) {
                    return i8.a(arrby, by, l13, n17);
                }
                n16 = n17 - 3;
                long l17 = l13 + 1L;
                byte by3 = e8.a(arrby, l13);
                if (by3 > -65) return -1;
                if ((by << 28) + (by3 + 112) >> 30 != 0) return -1;
                long l18 = l17 + 1L;
                if (e8.a(arrby, l17) > -65) return -1;
                l14 = l18 + 1L;
                if (e8.a(arrby, l18) > -65) {
                    return -1;
                }
            }
            l13 = l14;
        } while (true);
    }

    @Override
    public final int a(CharSequence charSequence, byte[] arrby, int n10, int n11) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException;
        int n12;
        block6 : {
            long l10;
            block7 : {
                int n13;
                long l11;
                l10 = n10;
                long l12 = l10 + (long)n11;
                n12 = charSequence.length();
                if (n12 > n11 || arrby.length - n11 < n10) break block6;
                int n14 = 0;
                do {
                    int n15;
                    n13 = 128;
                    l11 = 1L;
                    if (n14 >= n12 || (n15 = charSequence.charAt(n14)) >= n13) break;
                    long l13 = l11 + l10;
                    e8.a(arrby, l10, (byte)n15);
                    ++n14;
                    l10 = l13;
                } while (true);
                if (n14 == n12) break block7;
                while (n14 < n12) {
                    int n16;
                    char c2;
                    block12 : {
                        block13 : {
                            int n17;
                            block14 : {
                                long l14;
                                long l15;
                                block9 : {
                                    block11 : {
                                        block10 : {
                                            block8 : {
                                                c2 = charSequence.charAt(n14);
                                                if (c2 >= n13 || l10 >= l12) break block8;
                                                long l16 = l10 + l11;
                                                e8.a(arrby, l10, (byte)c2);
                                                l14 = l11;
                                                l15 = l16;
                                                break block9;
                                            }
                                            if (c2 >= '\u0800' || l10 > -2L + l12) break block10;
                                            long l17 = l10 + l11;
                                            e8.a(arrby, l10, (byte)(960 | c2 >>> 6));
                                            long l18 = l17 + l11;
                                            e8.a(arrby, l17, (byte)(128 | c2 & 63));
                                            long l19 = l11;
                                            l15 = l18;
                                            l14 = l19;
                                            break block9;
                                        }
                                        if (c2 >= '\ud800' && c2 <= '\udfff' || l10 > -3L + l12) break block11;
                                        long l20 = l10 + l11;
                                        e8.a(arrby, l10, (byte)(480 | c2 >>> 12));
                                        long l21 = l20 + l11;
                                        e8.a(arrby, l20, (byte)(128 | 63 & c2 >>> 6));
                                        long l22 = l21 + 1L;
                                        e8.a(arrby, l21, (byte)(128 | c2 & 63));
                                        l15 = l22;
                                        l14 = 1L;
                                        break block9;
                                    }
                                    if (l10 > -4L + l12) break block12;
                                    n17 = n14 + 1;
                                    if (n17 == n12) break block13;
                                    char c10 = charSequence.charAt(n17);
                                    if (!Character.isSurrogatePair((char)c2, (char)c10)) break block14;
                                    int n18 = Character.toCodePoint((char)c2, (char)c10);
                                    long l23 = l10 + 1L;
                                    e8.a(arrby, l10, (byte)(240 | n18 >>> 18));
                                    long l24 = l23 + 1L;
                                    e8.a(arrby, l23, (byte)(128 | 63 & n18 >>> 12));
                                    long l25 = l24 + 1L;
                                    e8.a(arrby, l24, (byte)(128 | 63 & n18 >>> 6));
                                    l14 = 1L;
                                    l15 = l25 + l14;
                                    e8.a(arrby, l25, (byte)(128 | n18 & 63));
                                    n14 = n17;
                                }
                                ++n14;
                                n13 = 128;
                                long l26 = l14;
                                l10 = l15;
                                l11 = l26;
                                continue;
                            }
                            n14 = n17;
                        }
                        throw new h8(n14 - 1, n12);
                    }
                    if (!(c2 < '\ud800' || c2 > '\udfff' || (n16 = n14 + 1) != n12 && Character.isSurrogatePair((char)c2, (char)charSequence.charAt(n16)))) {
                        throw new h8(n14, n12);
                    }
                    StringBuilder stringBuilder = new StringBuilder(46);
                    stringBuilder.append("Failed writing ");
                    stringBuilder.append(c2);
                    stringBuilder.append(" at index ");
                    stringBuilder.append(l10);
                    throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
                }
                return (int)l10;
            }
            return (int)l10;
        }
        char c11 = charSequence.charAt(n12 - 1);
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Failed writing ");
        stringBuilder.append(c11);
        stringBuilder.append(" at index ");
        stringBuilder.append(n10 + n11);
        arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        throw arrayIndexOutOfBoundsException;
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
            while (n10 < n13 && a.a(by = e8.a(arrby, (long)n10))) {
                ++n10;
                int n15 = n14 + 1;
                arrc[n14] = (char)by;
                n14 = n15;
            }
            block1 : while (n10 < n13) {
                int n16 = n10 + 1;
                byte by2 = e8.a(arrby, (long)n10);
                if (a.a(by2)) {
                    int n17 = n14 + 1;
                    arrc[n14] = (char)by2;
                    n10 = n16;
                    do {
                        byte by3;
                        n14 = n17;
                        if (n10 >= n13 || !a.a(by3 = e8.a(arrby, (long)n10))) continue block1;
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
                        a.a(by2, e8.a(arrby, (long)n16), arrc, n14);
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
                        a.a(by2, e8.a(arrby, (long)n16), e8.a(arrby, (long)n20), arrc, n14);
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
                    a.a(by2, e8.a(arrby, (long)n16), e8.a(arrby, (long)n23), e8.a(arrby, (long)n24), arrc, n14);
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

