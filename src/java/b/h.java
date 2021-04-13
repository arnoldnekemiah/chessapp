/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package b;

import b.g;
import b.j;
import b.o;

public final class h {
    public static final h c = new h();
    public Object[] a = new Object[200];
    public int b = 0;

    /*
     * Enabled aggressive block sorting
     */
    public static final int a(j j2, int n2, int n3) {
        int n5;
        int n7;
        block4 : {
            block2 : {
                block3 : {
                    block6 : {
                        block5 : {
                            block9 : {
                                block7 : {
                                    block8 : {
                                        n5 = 1;
                                        n7 = -1;
                                        if (n3 == -9) break block2;
                                        if (n3 == -8) break block3;
                                        if (n3 == -7) break block4;
                                        if (n3 == n7) break block5;
                                        if (n3 == n5) break block6;
                                        if (n3 == 7) break block7;
                                        if (n3 == 8) break block8;
                                        if (n3 == 9) break block9;
                                        n5 = 0;
                                        break block6;
                                    }
                                    n5 = 0;
                                    break block9;
                                }
                                n5 = -1;
                            }
                            n7 = 1;
                            break block4;
                        }
                        n5 = -1;
                    }
                    n7 = 0;
                    break block4;
                }
                n5 = 0;
                break block4;
            }
            n5 = -1;
        }
        int n8 = j.e(n2);
        int n9 = n2 >> 3;
        while ((n8 += n5) >= 0 && n8 <= 7 && (n9 += n7) >= 0) {
            if (n9 > 7) {
                return 0;
            }
            int n10 = n8 + n9 * 8;
            int n11 = j2.a[n10];
            if (n11 == 0) continue;
            return n11;
        }
        return 0;
    }

    public static final void a(a a2, int n2, int n3, int n5) {
        g[] arrg = a2.a;
        int n7 = a2.b;
        a2.b = n7 + 1;
        g g2 = arrg[n7];
        g2.a = n2;
        g2.b = n3;
        g2.c = n5;
        g2.d = 0;
    }

    public static final void a(a a2, long l2, int n2) {
        while (l2 != 0L) {
            int n3 = b.a.b(l2);
            h.a(a2, n3 + n2, n3, 0);
            l2 &= l2 - 1L;
        }
    }

    public static final void a(j j2, a a2) {
        int n2;
        o o2 = new o();
        boolean bl = h.a(j2, j2.a(j2.g));
        long l2 = j2.c | j2.d;
        int n3 = j2.a(j2.g);
        long l3 = b.a.c(n3, l2) | b.a.a(n3, l2);
        int n5 = j2.i;
        long l4 = 0L;
        if (bl) {
            long[] arrl = j2.b;
            int n7 = j2.g ? 11 : 5;
            long l5 = l3 | arrl[n7];
            n2 = 0;
            for (int i2 = 0; i2 < a2.b; ++i2) {
                boolean bl2;
                int n8;
                g g2 = a2.a[i2];
                if (g2.a != n3 && (l5 & 1L << (n8 = g2.b)) == l4 && n8 != n5) {
                    bl2 = false;
                } else {
                    j2.a(g2, o2);
                    j2.b(true ^ j2.g);
                    bl2 = true ^ h.a(j2, j2.a(j2.g));
                    j2.b(true ^ j2.g);
                    j2.b(g2, o2);
                }
                if (bl2) {
                    g[] arrg = a2.a;
                    int n9 = n2 + 1;
                    g g3 = arrg[n2];
                    if (g3 != null) {
                        g3.a = g2.a;
                        g3.b = g2.b;
                        g3.c = g2.c;
                        n2 = n9;
                    } else {
                        throw null;
                    }
                }
                l4 = 0L;
            }
        } else {
            int n10 = 0;
            for (int i3 = 0; i3 < a2.b; ++i3) {
                boolean bl3;
                g g4 = a2.a[i3];
                int n11 = g4.a;
                if (n11 != n3 && (l3 & 1L << n11) == 0L && g4.b != n5) {
                    bl3 = true;
                } else {
                    j2.a(g4, o2);
                    j2.b(true ^ j2.g);
                    bl3 = true ^ h.a(j2, j2.a(j2.g));
                    j2.b(true ^ j2.g);
                    j2.b(g4, o2);
                }
                if (!bl3) continue;
                g[] arrg = a2.a;
                int n12 = n10 + 1;
                g g5 = arrg[n10];
                if (g5 != null) {
                    g5.a = g4.a;
                    g5.b = g4.b;
                    g5.c = g4.c;
                    n10 = n12;
                    continue;
                }
                throw null;
            }
            n2 = n10;
        }
        a2.b = n2;
    }

    public static final boolean a(a a2, j j2, int n2, long l2) {
        long[] arrl = j2.b;
        int n3 = j2.g ? 7 : 1;
        long l3 = l2 & arrl[n3];
        if (l3 != 0L) {
            int n5 = b.a.b(l3);
            a2.b = 0;
            h.a(a2, n2, n5, 0);
            return true;
        }
        while (l2 != 0L) {
            h.a(a2, n2, b.a.b(l2), 0);
            l2 &= l2 - 1L;
        }
        return false;
    }

    public static final boolean a(a a2, j j2, long l2, int n2, boolean bl) {
        long l3;
        if (l2 == 0L) {
            return false;
        }
        long[] arrl = j2.b;
        int n3 = j2.g ? 7 : 1;
        long l4 = l2 & arrl[n3];
        if (l4 != 0L) {
            int n5 = b.a.b(l4);
            a2.b = 0;
            h.a(a2, n2 + n5, n5, 0);
            return true;
        }
        long l5 = l2 & (-1L ^ l3);
        for (l3 = -72057594037927681L & l2; l3 != 0L; l3 &= l3 - 1L) {
            int n7;
            int n8 = b.a.b(l3);
            int n9 = n8 + n2;
            if (n8 >= 56) {
                h.a(a2, n9, n8, 2);
                h.a(a2, n9, n8, 5);
                if (!bl) continue;
                h.a(a2, n9, n8, 3);
                n7 = 4;
            } else {
                h.a(a2, n9, n8, 8);
                h.a(a2, n9, n8, 11);
                if (!bl) continue;
                h.a(a2, n9, n8, 9);
                n7 = 10;
            }
            h.a(a2, n9, n8, n7);
        }
        while (l5 != 0L) {
            int n10 = b.a.b(l5);
            h.a(a2, n10 + n2, n10, 0);
            l5 &= l5 - 1L;
        }
        return false;
    }

    public static final boolean a(j j2, int n2) {
        if (j2.g) {
            long l2 = b.a.b[n2];
            long[] arrl = j2.b;
            if ((l2 & arrl[11]) != 0L) {
                return true;
            }
            if ((b.a.a[n2] & arrl[7]) != 0L) {
                return true;
            }
            if ((b.a.c[n2] & arrl[12]) != 0L) {
                return true;
            }
            long l3 = j2.c | j2.d;
            long l4 = arrl[8];
            if ((b.a.a(n2, l3) & (l4 | j2.b[10])) != 0L) {
                return true;
            }
            if ((b.a.c(n2, l3) & (l4 | j2.b[9])) != 0L) {
                return true;
            }
        } else {
            long l5 = b.a.b[n2];
            long[] arrl = j2.b;
            if ((l5 & arrl[5]) != 0L) {
                return true;
            }
            if ((b.a.a[n2] & arrl[1]) != 0L) {
                return true;
            }
            if ((b.a.d[n2] & arrl[6]) != 0L) {
                return true;
            }
            long l6 = j2.c | j2.d;
            long l7 = arrl[2];
            if ((b.a.a(n2, l6) & (l7 | j2.b[4])) != 0L) {
                return true;
            }
            if ((b.a.c(n2, l6) & (l7 | j2.b[3])) != 0L) {
                return true;
            }
        }
        return false;
    }

    public static final boolean a(j j2, g g2) {
        block50 : {
            int n2;
            int n3;
            int n5;
            int n7;
            int n8;
            boolean bl;
            int n9;
            int n10;
            block51 : {
                int n11;
                int n12;
                block52 : {
                    int n13;
                    block53 : {
                        int n14;
                        int n15;
                        int n16;
                        int n17;
                        int n18;
                        int n19;
                        block49 : {
                            block44 : {
                                int n20;
                                int n21;
                                block48 : {
                                    block45 : {
                                        block46 : {
                                            block47 : {
                                                int n22;
                                                block41 : {
                                                    int n23;
                                                    int n24;
                                                    int n25;
                                                    block42 : {
                                                        int n26;
                                                        int n27;
                                                        block43 : {
                                                            int n28;
                                                            block40 : {
                                                                block38 : {
                                                                    block39 : {
                                                                        bl = j2.g;
                                                                        n14 = j2.a(bl ^ true);
                                                                        n2 = bl ? 7 : 1;
                                                                        n18 = g2.c;
                                                                        if (n18 == 0) {
                                                                            int n29 = g2.a;
                                                                            n18 = j2.a[n29];
                                                                        }
                                                                        if (n18 >= 7) {
                                                                            n18 -= 6;
                                                                        }
                                                                        n21 = b.a.a(g2.b, n14);
                                                                        if (n21 == -9) break block38;
                                                                        if (n21 == -8) break block39;
                                                                        if (n21 == -7) break block38;
                                                                        if (n21 == -1 || n21 == 1) break block39;
                                                                        if (n21 == 7) break block38;
                                                                        if (n21 == 8) break block39;
                                                                        if (n21 == 9) break block38;
                                                                        if (n21 != 0 && n18 == 5) {
                                                                            return true;
                                                                        }
                                                                        break block40;
                                                                    }
                                                                    if ((n18 == 2 || n18 == 3) && n21 != 0) {
                                                                        int n30;
                                                                        int n31 = g2.b;
                                                                        while ((n30 = j2.a[n31 += n21]) == 0) {
                                                                        }
                                                                        if (n30 == n2) {
                                                                            return true;
                                                                        }
                                                                    }
                                                                    break block40;
                                                                }
                                                                if (n18 != 2 && n18 != 4) {
                                                                    boolean bl2;
                                                                    int n32;
                                                                    if (n18 == 6 && (bl2 = n21 > 0) == bl && j2.a[n32 = n21 + g2.b] == n2) {
                                                                        return true;
                                                                    }
                                                                } else if (n21 != 0) {
                                                                    int n33;
                                                                    int n34 = g2.b;
                                                                    while ((n33 = j2.a[n34 += n21]) == 0) {
                                                                    }
                                                                    if (n33 == n2) {
                                                                        return true;
                                                                    }
                                                                }
                                                            }
                                                            if ((n22 = b.a.a(g2.a, n14)) == 0 || n22 == n21) break block41;
                                                            int n35 = g2.a;
                                                            while ((n28 = j2.a[n35 += n22]) == 0) {
                                                            }
                                                            if (n28 != n2) break block41;
                                                            n23 = h.a(j2, g2.a, -n22);
                                                            if (n22 == -9) break block42;
                                                            if (n22 == -8) break block43;
                                                            if (n22 == -7) break block42;
                                                            if (n22 == -1 || n22 == 1) break block43;
                                                            if (n22 == 7) break block42;
                                                            if (n22 == 8) break block43;
                                                            if (n22 == 9) break block42;
                                                            break block41;
                                                        }
                                                        if (n23 == (n26 = bl ? 2 : 8) || n23 == (n27 = bl ? 3 : 9)) {
                                                            return true;
                                                        }
                                                        break block41;
                                                    }
                                                    if (n23 == (n24 = bl ? 2 : 8) || n23 == (n25 = bl ? 4 : 10)) {
                                                        return true;
                                                    }
                                                }
                                                if (g2.c == 0 || n21 == 0 || n21 != n22) break block44;
                                                if (n21 == -9) break block45;
                                                if (n21 == -8) break block46;
                                                if (n21 == -7) break block47;
                                                if (n21 == -1 || n21 == 1) break block46;
                                                if (n21 == 7) break block47;
                                                if (n21 == 8) break block46;
                                                if (n21 != 9) break block44;
                                            }
                                            n20 = 2;
                                            break block48;
                                        }
                                        if ((n18 == 2 || n18 == 3) && n21 != 0) {
                                            int n36;
                                            int n37 = g2.a;
                                            while ((n36 = j2.a[n37 += n21]) == 0) {
                                            }
                                            if (n36 == n2) {
                                                return true;
                                            }
                                        }
                                        break block44;
                                    }
                                    n20 = 2;
                                }
                                if ((n18 == n20 || n18 == 4) && n21 != 0) {
                                    int n38;
                                    int n39 = g2.a;
                                    while ((n38 = j2.a[n39 += n21]) == 0) {
                                    }
                                    if (n38 == n2) {
                                        return true;
                                    }
                                }
                            }
                            if (n18 != 1) break block49;
                            int n40 = g2.b;
                            int n41 = g2.a;
                            if (n40 - n41 == 2) {
                                if (h.a(j2, n41, -1) == n2) {
                                    return true;
                                }
                                int n42 = 1 + g2.a;
                                int n43 = bl ? 8 : -8;
                                if (h.a(j2, n42, n43) == n2) {
                                    return true;
                                }
                            } else if (n40 - n41 == -2) {
                                if (h.a(j2, n41, 1) == n2) {
                                    return true;
                                }
                                int n44 = g2.a - 1;
                                int n45 = bl ? 8 : -8;
                                if (h.a(j2, n44, n45) == n2) {
                                    return true;
                                }
                            }
                            break block50;
                        }
                        n11 = 2;
                        if (n18 != 6 || j2.a[n17 = g2.b] != 0 || (n16 = (n19 = n17 & 7) - ((n15 = g2.a) & 7)) == 0) break block50;
                        n10 = n15 + n16;
                        n3 = b.a.a(n10, n14);
                        if (n3 == -9 || n3 == -7) break block51;
                        if (n3 == -1) break block52;
                        if (n3 == 1) break block53;
                        if (n3 == 7 || n3 == 9) break block51;
                        break block50;
                    }
                    int n46 = Math.max((int)n10, (int)g2.a);
                    while ((n13 = j2.a[n46 += n3]) == 0) {
                    }
                    if (n13 == n2) {
                        int n47;
                        int n48 = h.a(j2, Math.min((int)n10, (int)g2.a), -n3);
                        if (!bl) {
                            n11 = 8;
                        }
                        if (n48 == n11 || n48 == (n47 = bl ? 3 : 9)) {
                            return true;
                        }
                    }
                    break block50;
                }
                int n49 = Math.min((int)n10, (int)g2.a);
                while ((n12 = j2.a[n49 += n3]) == 0) {
                }
                if (n12 == n2) {
                    int n50;
                    int n51 = h.a(j2, Math.max((int)n10, (int)g2.a), -n3);
                    if (!bl) {
                        n11 = 8;
                    }
                    if (n51 == n11 || n51 == (n50 = bl ? 3 : 9)) {
                        return true;
                    }
                }
                break block50;
            }
            int n52 = n10;
            while ((n7 = j2.a[n52 += n3]) == 0) {
            }
            if (n7 == n2 && ((n5 = h.a(j2, n10, -n3)) == (n8 = bl ? 2 : 8) || n5 == (n9 = bl ? 4 : 10))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(j j2) {
        j2.b(true ^ j2.g);
        boolean bl = h.a(j2, j2.a(j2.g));
        j2.b(true ^ j2.g);
        return bl;
    }

    public static final boolean d(j j2) {
        return h.a(j2, j2.a(j2.g));
    }

    public final a a() {
        int n2 = this.b;
        if (n2 > 0) {
            int n3;
            Object[] arrobject = this.a;
            this.b = n3 = n2 - 1;
            a a2 = (a)arrobject[n3];
            a2.b = 0;
            return a2;
        }
        a a4 = new a();
        for (int i2 = 0; i2 < 256; ++i2) {
            a4.a[i2] = new g(0, 0, 0);
        }
        return a4;
    }

    public final a a(j j2) {
        a a2 = this.a();
        long l2 = j2.c | j2.d;
        boolean bl = j2.g;
        long l3 = 0L;
        if (bl) {
            long[] arrl;
            long l4;
            long l5;
            long l6;
            long[] arrl2 = j2.b;
            long l7 = arrl2[11];
            long[] arrl3 = b.a.b;
            int n2 = j2.n;
            long l8 = l7 & arrl3[n2];
            long l9 = arrl2[9] | arrl2[8];
            if (l9 != l3) {
                l8 |= l9 & b.a.c(n2, l2);
            }
            if ((l4 = (arrl = j2.b)[10] | arrl[8]) != l3) {
                l8 |= l4 & b.a.a(j2.n, l2);
            }
            if ((l6 = l8 | j2.b[12] & b.a.c[j2.n]) != l3 && (l6 & l6 - 1L) == l3) {
                int n3 = b.a.b(l6);
                l5 = l6 | b.a.p[j2.n][n3];
            } else {
                l5 = l3;
            }
            long[] arrl4 = j2.b;
            long l10 = l5 | arrl4[7];
            for (long i2 = arrl4[2]; i2 != l3; i2 &= i2 - 1L) {
                int n5 = b.a.b(i2);
                if (!h.a(a2, j2, n5, l10 & ((b.a.c(n5, l2) | b.a.a(n5, l2)) & (-1L ^ j2.c)))) continue;
                return a2;
            }
            for (long i3 = j2.b[3]; i3 != l3; i3 &= i3 - 1L) {
                int n7 = b.a.b(i3);
                if (!h.a(a2, j2, n7, l10 & (b.a.c(n7, l2) & (-1L ^ j2.c)))) continue;
                return a2;
            }
            for (long i4 = j2.b[4]; i4 != l3; i4 &= i4 - 1L) {
                int n8 = b.a.b(i4);
                if (!h.a(a2, j2, n8, l10 & (b.a.a(n8, l2) & (-1L ^ j2.c)))) continue;
                return a2;
            }
            int n9 = j2.a(true);
            if (h.a(a2, j2, n9, b.a.a[n9] & (-1L ^ j2.c))) {
                return a2;
            }
            for (long i5 = j2.b[5]; i5 != l3; i5 &= i5 - 1L) {
                int n10 = b.a.b(i5);
                if (!h.a(a2, j2, n10, l10 & (b.a.b[n10] & (-1L ^ j2.c)))) continue;
                return a2;
            }
            long l11 = j2.b[6];
            long l12 = l11 << 8;
            long l13 = l2 ^ -1L;
            long l14 = l12 & l13;
            if (h.a(a2, j2, l14 & l10, -8, true)) {
                return a2;
            }
            h.a(a2, l10 & (l13 & (0xFF0000L & l14) << 8), -16);
            int n11 = j2.i;
            if (n11 >= 0) {
                l3 = 1L << n11;
            }
            if (h.a(a2, j2, 0x7F7F7F7F7F7F7F7FL & l11 << 7 & (l3 | l10 & j2.d), -7, true)) {
                return a2;
            }
            if (h.a(a2, j2, -72340172838076674L & l11 << 9 & (l3 | l10 & j2.d), -9, true)) {
                return a2;
            }
        } else {
            long l15;
            long l16;
            long[] arrl;
            long l17;
            long[] arrl5 = j2.b;
            long l18 = arrl5[5];
            long[] arrl6 = b.a.b;
            int n12 = j2.o;
            long l19 = l18 & arrl6[n12];
            long l20 = arrl5[3] | arrl5[2];
            if (l20 != l3) {
                l19 |= l20 & b.a.c(n12, l2);
            }
            if ((l15 = (arrl = j2.b)[4] | arrl[2]) != l3) {
                l19 |= l15 & b.a.a(j2.o, l2);
            }
            if ((l17 = l19 | j2.b[6] & b.a.d[j2.o]) != l3 && (l17 & l17 - 1L) == l3) {
                int n13 = b.a.b(l17);
                l16 = l17 | b.a.p[j2.o][n13];
            } else {
                l16 = l3;
            }
            long[] arrl7 = j2.b;
            long l21 = l16 | arrl7[1];
            for (long i6 = arrl7[8]; i6 != l3; i6 &= i6 - 1L) {
                int n14 = b.a.b(i6);
                if (!h.a(a2, j2, n14, l21 & ((b.a.c(n14, l2) | b.a.a(n14, l2)) & (-1L ^ j2.d)))) continue;
                return a2;
            }
            for (long i7 = j2.b[9]; i7 != l3; i7 &= i7 - 1L) {
                int n15 = b.a.b(i7);
                if (!h.a(a2, j2, n15, l21 & (b.a.c(n15, l2) & (-1L ^ j2.d)))) continue;
                return a2;
            }
            for (long i8 = j2.b[10]; i8 != l3; i8 &= i8 - 1L) {
                int n16 = b.a.b(i8);
                if (!h.a(a2, j2, n16, l21 & (b.a.a(n16, l2) & (-1L ^ j2.d)))) continue;
                return a2;
            }
            int n17 = j2.a(false);
            if (h.a(a2, j2, n17, b.a.a[n17] & (-1L ^ j2.d))) {
                return a2;
            }
            for (long i9 = j2.b[11]; i9 != l3; i9 &= i9 - 1L) {
                int n18 = b.a.b(i9);
                if (!h.a(a2, j2, n18, l21 & (b.a.b[n18] & (-1L ^ j2.d)))) continue;
                return a2;
            }
            long l22 = j2.b[12];
            long l23 = l22 >>> 8;
            long l24 = l2 ^ -1L;
            long l25 = l23 & l24;
            if (h.a(a2, j2, l25 & l21, 8, true)) {
                return a2;
            }
            h.a(a2, l21 & (l24 & (0xFF0000000000L & l25) >>> 8), 16);
            int n19 = j2.i;
            if (n19 >= 0) {
                l3 = 1L << n19;
            }
            if (h.a(a2, j2, 0x7F7F7F7F7F7F7F7FL & l22 >>> 9 & (l3 | l21 & j2.c), 9, true)) {
                return a2;
            }
            if (h.a(a2, j2, -72340172838076674L & l22 >>> 7 & (l3 | l21 & j2.c), 7, true)) {
                // empty if block
            }
        }
        return a2;
    }

    public final void a(a a2) {
        int n2 = this.b;
        Object[] arrobject = this.a;
        if (n2 < arrobject.length) {
            this.b = n2 + 1;
            arrobject[n2] = a2;
        }
    }

    public final a b(j j2) {
        a a2 = this.a();
        long l2 = j2.c | j2.d;
        boolean bl = j2.g;
        long l3 = 0L;
        if (bl) {
            for (long i2 = j2.b[2]; i2 != l3; i2 &= i2 - 1L) {
                int n2 = b.a.b(i2);
                if (!h.a(a2, j2, n2, (b.a.c(n2, l2) | b.a.a(n2, l2)) & (-1L ^ j2.c))) continue;
                return a2;
            }
            for (long i3 = j2.b[3]; i3 != l3; i3 &= i3 - 1L) {
                int n3 = b.a.b(i3);
                if (!h.a(a2, j2, n3, b.a.c(n3, l2) & (-1L ^ j2.c))) continue;
                return a2;
            }
            for (long i4 = j2.b[4]; i4 != l3; i4 &= i4 - 1L) {
                int n5 = b.a.b(i4);
                if (!h.a(a2, j2, n5, b.a.a(n5, l2) & (-1L ^ j2.c))) continue;
                return a2;
            }
            int n7 = j2.a(true);
            if (h.a(a2, j2, n7, b.a.a[n7] & (-1L ^ j2.c))) {
                return a2;
            }
            if (n7 == 4) {
                if ((2 & j2.h) != 0 && (96L & (j2.c | j2.d)) == l3 && j2.a[7] == 3 && !h.a(j2, 4) && !h.a(j2, 5)) {
                    h.a(a2, 4, 6, 0);
                }
                if ((1 & j2.h) != 0 && (14L & (j2.c | j2.d)) == l3 && j2.a[0] == 3 && !h.a(j2, 4) && !h.a(j2, 3)) {
                    h.a(a2, 4, 2, 0);
                }
            }
            for (long i5 = j2.b[5]; i5 != l3; i5 &= i5 - 1L) {
                int n8 = b.a.b(i5);
                if (!h.a(a2, j2, n8, b.a.b[n8] & (-1L ^ j2.c))) continue;
                return a2;
            }
            long l4 = j2.b[6];
            long l5 = l4 << 8;
            long l6 = l2 ^ -1L;
            long l7 = l5 & l6;
            if (h.a(a2, j2, l7, -8, true)) {
                return a2;
            }
            h.a(a2, l6 & (l7 & 0xFF0000L) << 8, -16);
            int n9 = j2.i;
            if (n9 >= 0) {
                l3 = 1L << n9;
            }
            if (h.a(a2, j2, 0x7F7F7F7F7F7F7F7FL & l4 << 7 & (l3 | j2.d), -7, true)) {
                return a2;
            }
            if (h.a(a2, j2, -72340172838076674L & l4 << 9 & (l3 | j2.d), -9, true)) {
                return a2;
            }
        } else {
            for (long i6 = j2.b[8]; i6 != l3; i6 &= i6 - 1L) {
                int n10 = b.a.b(i6);
                if (!h.a(a2, j2, n10, (b.a.c(n10, l2) | b.a.a(n10, l2)) & (-1L ^ j2.d))) continue;
                return a2;
            }
            for (long i7 = j2.b[9]; i7 != l3; i7 &= i7 - 1L) {
                int n11 = b.a.b(i7);
                if (!h.a(a2, j2, n11, b.a.c(n11, l2) & (-1L ^ j2.d))) continue;
                return a2;
            }
            for (long i8 = j2.b[10]; i8 != l3; i8 &= i8 - 1L) {
                int n12 = b.a.b(i8);
                if (!h.a(a2, j2, n12, b.a.a(n12, l2) & (-1L ^ j2.d))) continue;
                return a2;
            }
            int n13 = j2.a(false);
            if (h.a(a2, j2, n13, b.a.a[n13] & (-1L ^ j2.d))) {
                return a2;
            }
            if (n13 == 60) {
                if ((8 & j2.h) != 0 && (0x6000000000000000L & (j2.c | j2.d)) == l3 && j2.a[63] == 9 && !h.a(j2, 60) && !h.a(j2, 61)) {
                    h.a(a2, 60, 62, 0);
                }
                if ((4 & j2.h) != 0 && (0xE00000000000000L & (j2.c | j2.d)) == l3 && j2.a[56] == 9 && !h.a(j2, 60) && !h.a(j2, 59)) {
                    h.a(a2, 60, 58, 0);
                }
            }
            for (long i9 = j2.b[11]; i9 != l3; i9 &= i9 - 1L) {
                int n14 = b.a.b(i9);
                if (!h.a(a2, j2, n14, b.a.b[n14] & (-1L ^ j2.d))) continue;
                return a2;
            }
            long l8 = j2.b[12];
            long l9 = l8 >>> 8;
            long l10 = l2 ^ -1L;
            long l11 = l9 & l10;
            if (h.a(a2, j2, l11, 8, true)) {
                return a2;
            }
            h.a(a2, l10 & (l11 & 0xFF0000000000L) >>> 8, 16);
            int n15 = j2.i;
            if (n15 >= 0) {
                l3 = 1L << n15;
            }
            if (h.a(a2, j2, 0x7F7F7F7F7F7F7F7FL & l8 >>> 9 & (l3 | j2.c), 9, true)) {
                return a2;
            }
            if (h.a(a2, j2, -72340172838076674L & l8 >>> 7 & (l3 | j2.c), 7, true)) {
                // empty if block
            }
        }
        return a2;
    }

    public static final class a {
        public final g[] a = new g[256];
        public int b = 0;
    }

}

