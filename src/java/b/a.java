/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.RuntimeException
 */
package b;

import b.j;

public class a {
    public static final long[] a;
    public static final long[] b;
    public static final long[] c;
    public static final long[] d;
    public static final long[] e;
    public static final long[] f;
    public static final long[] g;
    public static final long[][] h;
    public static final long[] i;
    public static final int[] j;
    public static final long[] k;
    public static final long[][] l;
    public static final long[] m;
    public static final int[] n;
    public static final long[] o;
    public static final long[][] p;
    public static final byte[] q;
    public static final byte[] r;
    public static final int[] s;

    public static {
        long l2;
        int n2;
        long l3;
        g = new long[]{0x101010101010101L, 0x202020202020202L, 0x404040404040404L, 0x808080808080808L, 0x1010101010101010L, 0x2020202020202020L, 0x4040404040404040L, -9187201950435737472L};
        a = new long[64];
        int n3 = 0;
        do {
            long l4;
            l2 = -72340172838076674L;
            n2 = 1;
            if (n3 >= 64) break;
            long l5 = 1L << n3;
            a.a[n3] = l4 = 0x7F7F7F7F7F7F7F7FL & (l5 >>> n2 | l5 << 7 | l5 >>> 9) | l2 & (l5 << n2 | l5 << 9 | l5 >>> 7) | l5 << 8 | l5 >>> 8;
            ++n3;
        } while (true);
        b = new long[64];
        for (int i2 = 0; i2 < 64; ++i2) {
            long l6;
            long l7 = 1L << i2;
            a.b[i2] = l6 = 0x3F3F3F3F3F3F3F3FL & (l7 << 6 | l7 >>> 10) | 0x7F7F7F7F7F7F7F7FL & (l7 << 15 | l7 >>> 17) | l2 & (l7 << 17 | l7 >>> 15) | -217020518514230020L & (l7 << 10 | l7 >>> 6);
        }
        c = new long[64];
        d = new long[64];
        e = new long[64];
        f = new long[64];
        int n5 = 0;
        do {
            long l8;
            long l9;
            l3 = 0L;
            if (n5 >= 64) break;
            long l10 = 1L << n5;
            a.c[n5] = l9 = 0x7F7F7F7F7F7F7F7FL & l10 << 7 | l2 & l10 << 9;
            a.d[n5] = l8 = 0x7F7F7F7F7F7F7F7FL & l10 >>> 9 | l2 & l10 >>> 7;
            int n7 = j.e(n5);
            int n8 = j.f(n5);
            int n9 = n8 + 1;
            long l11 = l3;
            for (int i3 = n9; i3 < 8; ++i3) {
                if (n7 > 0) {
                    l11 |= 1L << j.d(n7 - 1, i3);
                }
                l11 |= 1L << j.d(n7, i3);
                if (n7 >= 7) continue;
                l11 |= 1L << j.d(n7 + 1, i3);
            }
            a.e[n5] = l11;
            for (int i4 = n8 - 1; i4 >= 0; --i4) {
                if (n7 > 0) {
                    l3 |= 1L << j.d(n7 - 1, i4);
                }
                l3 |= 1L << j.d(n7, i4);
                if (n7 >= 7) continue;
                l3 |= 1L << j.d(n7 + 1, i4);
            }
            a.f[n5] = l3;
            ++n5;
            l2 = -72340172838076674L;
        } while (true);
        j = new int[]{12, 11, 11, 11, 11, 11, 11, 12, 11, 10, 10, 11, 10, 10, 10, 11, 11, 10, 10, 10, 10, 10, 10, 11, 11, 10, 10, 10, 10, 10, 10, 11, 11, 10, 10, 10, 10, 10, 10, 11, 11, 10, 10, 11, 10, 10, 10, 11, 10, 9, 9, 9, 9, 9, 10, 10, 11, 10, 10, 10, 10, 11, 10, 11};
        k = new long[]{1848728085108359167L, 4600427526163791871L, 4616189678032715774L, 22518134233300991L, 22520746999807920L, 9178338789504843761L, 9173833196911984636L, 6582011165858594810L, 11980280127029247L, 87963062239231L, 35923245514620927L, 29994700382404607L, 35852941194362879L, 35676987234189282L, 35676970188537851L, 32035380319485914L, 44895464958984186L, 29273603745513471L, 27127563202543612L, 7318761912639485L, 3659587114737663L, 422624832282623L, 3298602778618L, 442347278434282L, 72041182162610176L, 36011444545830916L, 17962042859864056L, 2374946727534588L, 4502504411760644L, 2250704597550082L, 1125765689507843L, 562766075187968L, 72054501667766369L, 36028245477425216L, 18013900299567200L, 9005161420691552L, 4502773907331084L, 2251556061711366L, 1125379456635909L, 562944222953728L, 72055385753669632L, 36028251222552576L, 18014258390327296L, 9007063162179584L, 4502775111139340L, 2251112748900362L, 1125825818574853L, 562941162074113L, 72056743622363648L, 36027972373209856L, 18013960417324544L, 9006314477480448L, 4502611769538048L, 2251756863129088L, 1125890779774688L, 562906839946912L, 72056898243121078L, 36028500663190958L, 18013788614474986L, 9007036043130222L, 4503556676860134L, 2251791223629046L, 1125827562356340L, 562946262392926L};
        n = new int[]{5, 4, 5, 5, 5, 5, 4, 5, 4, 4, 5, 5, 5, 5, 4, 4, 4, 4, 7, 7, 7, 7, 4, 4, 5, 5, 7, 9, 9, 7, 5, 5, 5, 5, 7, 9, 9, 7, 5, 5, 4, 4, 7, 7, 7, 7, 4, 4, 4, 4, 5, 5, 5, 5, 4, 4, 5, 4, 5, 5, 5, 5, 4, 5};
        o = new long[]{1952686320645632L, 14733686573891371L, 5734402566249142L, 16352366346826269L, 5325398646559693L, 3802671688720598L, 2053671302982807L, 58268109635583L, 128022462535670L, 64644406420471L, 26790649133962L, 63876497502311L, 3912191768878L, 2897894937198L, 7463220018964L, 3958716612487L, 18031115270168572L, 9045705682161648L, 34622014848752637L, 8162778822212934L, 1126045987905531L, 4398114455420793L, 1126607445753823L, 562985900507098L, 11844308793409469L, 2825837151694801L, 1695451174678522L, 18020995780612112L, 7318487940759616L, 7318761976758208L, 3671055931490189L, 426217592647633L, 8934040670841357L, 4470902072285711L, 2247368196227137L, 71227737670144L, 35995193598042118L, 16745420625420031L, 8887319769598474L, 4458604167471753L, 4458152248360972L, 2237120603840524L, 1125341528473344L, 4385816235524L, 140480350264640L, 36028107417714976L, 17915865573188611L, 8975422564778497L, 2249584024491195L, 1121050810550855L, 4360174343501L, 17060070275L, 546442396816L, 138288447840934L, 35786712062400428L, 17994843236161116L, 1125069266668743L, 4316391458302L, 17070781523L, 66640899L, 2130346310L, 544720744288L, 139943527242966L, 35947823912432565L};
        h = new long[64][];
        i = new long[64];
        for (int i5 = 0; i5 < 64; ++i5) {
            int n10 = j.e(i5);
            int n11 = j.f(i5);
            a.i[i5] = a.b(n10, n11, l3, (boolean)n2);
            int n12 = n2 << j[i5];
            long[] arrl = new long[n12];
            for (int i6 = 0; i6 < n12; ++i6) {
                arrl[i6] = -1L;
            }
            int n13 = n2 << Long.bitCount((long)i[i5]);
            for (int i7 = 0; i7 < n13; ++i7) {
                long l12 = a.b(i7, i[i5]);
                int n14 = (int)(l12 * k[i5] >>> 64 - j[i5]);
                long l13 = a.b(n10, n11, l12, false);
                if (arrl[n14] == -1L) {
                    arrl[n14] = l13;
                    continue;
                }
                if (arrl[n14] == l13) {
                    continue;
                }
                throw new RuntimeException();
            }
            a.h[i5] = arrl;
            n2 = 1;
            l3 = 0L;
        }
        l = new long[64][];
        m = new long[64];
        for (int i8 = 0; i8 < 64; ++i8) {
            int n15 = j.e(i8);
            int n16 = j.f(i8);
            a.m[i8] = a.a(n15, n16, 0L, true);
            int n17 = 1 << n[i8];
            long[] arrl = new long[n17];
            for (int i9 = 0; i9 < n17; ++i9) {
                arrl[i9] = -1L;
            }
            int n18 = 1 << Long.bitCount((long)m[i8]);
            for (int i10 = 0; i10 < n18; ++i10) {
                long l14 = a.b(i10, m[i8]);
                int n19 = (int)(l14 * o[i8] >>> 64 - n[i8]);
                long l15 = a.a(n15, n16, l14, false);
                if (arrl[n19] == -1L) {
                    arrl[n19] = l15;
                    continue;
                }
                if (arrl[n19] == l15) {
                    continue;
                }
                throw new RuntimeException();
            }
            a.l[i8] = arrl;
        }
        p = new long[64][];
        for (int i11 = 0; i11 < 64; ++i11) {
            a.p[i11] = new long[64];
            for (int i12 = 0; i12 < 64; ++i12) {
                a.p[i11][i12] = 0L;
            }
            for (int i13 = -1; i13 <= 1; ++i13) {
                for (int i14 = -1; i14 <= 1; ++i14) {
                    if (i13 == 0 && i14 == 0) continue;
                    int n20 = j.e(i11);
                    int n21 = j.f(i11);
                    long l16 = 0L;
                    while ((n20 += i13) >= 0 && n20 <= 7 && (n21 += i14) >= 0 && n21 <= 7) {
                        int n22 = j.d(n20, n21);
                        a.p[i11][n22] = l16;
                        l16 |= 1L << n22;
                    }
                }
            }
        }
        q = new byte[]{-9, 0, 0, 0, 0, 0, 0, -8, 0, 0, 0, 0, 0, 0, -7, 0, 0, -9, 0, 0, 0, 0, 0, -8, 0, 0, 0, 0, 0, -7, 0, 0, 0, 0, -9, 0, 0, 0, 0, -8, 0, 0, 0, 0, -7, 0, 0, 0, 0, 0, 0, -9, 0, 0, 0, -8, 0, 0, 0, -7, 0, 0, 0, 0, 0, 0, 0, 0, -9, 0, 0, -8, 0, 0, -7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -9, -17, -8, -15, -7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -10, -9, -8, -7, -6, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 6, 7, 8, 9, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 15, 8, 17, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 8, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 8, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 8, 0, 0, 0, 0, 9, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 9, 0, 0, 7, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 9};
        r = new byte[]{7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 0, 7, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 0, 7, 6, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 7, 0, 7, 6, 5, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 6, 7, 0, 7, 6, 5, 4, 3, 3, 3, 3, 3, 3, 3, 4, 5, 6, 7, 0, 7, 6, 5, 4, 3, 2, 2, 2, 2, 2, 3, 4, 5, 6, 7, 0, 7, 6, 5, 4, 3, 2, 1, 1, 1, 2, 3, 4, 5, 6, 7, 0, 7, 6, 5, 4, 3, 2, 1, 0, 1, 2, 3, 4, 5, 6, 7, 0, 7, 6, 5, 4, 3, 2, 1, 1, 1, 2, 3, 4, 5, 6, 7, 0, 7, 6, 5, 4, 3, 2, 2, 2, 2, 2, 3, 4, 5, 6, 7, 0, 7, 6, 5, 4, 3, 3, 3, 3, 3, 3, 3, 4, 5, 6, 7, 0, 7, 6, 5, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 6, 7, 0, 7, 6, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 7, 0, 7, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 0, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
        s = new int[]{63, 0, 58, 1, 59, 47, 53, 2, 60, 39, 48, 27, 54, 33, 42, 3, 61, 51, 37, 40, 49, 18, 28, 20, 55, 30, 34, 11, 43, 14, 22, 4, 62, 57, 46, 52, 38, 26, 32, 41, 50, 36, 17, 19, 29, 10, 13, 21, 56, 45, 25, 31, 35, 16, 9, 12, 44, 24, 15, 8, 23, 7, 6, 5};
    }

    public static final int a(int n2, int n3) {
        int n5 = 119 + (n3 + (n3 | 7) - n2 - (n2 | 7));
        return q[n5];
    }

    public static final long a(int n2, int n3, long l2, boolean bl) {
        return a.a(a.a(a.a(a.a(0L, n2, n3, 1, 1, l2, bl), n2, n3, -1, -1, l2, bl), n2, n3, 1, -1, l2, bl), n2, n3, -1, 1, l2, bl);
    }

    public static final long a(int n2, long l2) {
        return l[n2][(int)((l2 & m[n2]) * o[n2] >>> 64 - n[n2])];
    }

    public static final long a(long l2) {
        long l3 = l2 | l2 << 8;
        long l4 = l3 | l3 << 16;
        return l4 | l4 << 32;
    }

    public static final long a(long l2, int n2, int n3, int n5, int n7, long l3, boolean n8) {
        long l4;
        int n9 = n8 != 0 ? 6 : 7;
        do {
            if (n5 != 0) {
                if ((n2 += n5) < n8) break;
                if (n2 > n9) {
                    return l2;
                }
            }
            if (n7 != 0) {
                if ((n3 += n7) < n8) break;
                if (n3 > n9) {
                    return l2;
                }
            }
            l4 = 1L << j.d(n2, n3);
            l2 |= l4;
        } while ((l4 & l3) == 0L);
        return l2;
    }

    public static final int b(int n2, int n3) {
        int n5 = 119 + (n3 + (n3 | 7) - n2 - (n2 | 7));
        return r[n5];
    }

    public static final int b(long l2) {
        return s[(int)(571347909858961602L * (l2 & -l2) >>> 58)];
    }

    public static final long b(int n2, int n3, long l2, boolean bl) {
        return a.a(a.a(a.a(a.a(0L, n2, n3, 1, 0, l2, bl), n2, n3, -1, 0, l2, bl), n2, n3, 0, 1, l2, bl), n2, n3, 0, -1, l2, bl);
    }

    public static final long b(int n2, long l2) {
        int n3 = 0;
        long l3 = 0L;
        do {
            long l4 = l2 & l2 - 1L;
            long l5 = l2 ^ l4;
            if (((long)n2 & 1L << n3) != 0L) {
                l3 |= l5;
            }
            if (l4 == 0L) {
                return l3;
            }
            ++n3;
            l2 = l4;
        } while (true);
    }

    public static final long c(int n2, long l2) {
        return h[n2][(int)((l2 & i[n2]) * k[n2] >>> 64 - j[n2])];
    }

    public static final long c(long l2) {
        long l3 = l2 | l2 >>> 8;
        long l4 = l3 | l3 >>> 16;
        return l4 | l4 >>> 32;
    }
}
