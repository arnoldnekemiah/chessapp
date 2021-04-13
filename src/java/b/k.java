/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.c.b.h.c
 *  c.c.b.h.g.c
 *  c.c.b.h.g.c$b
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Comparator
 */
package b;

import b.e;
import b.f;
import b.g;
import b.h;
import b.j;
import b.m;
import b.n;
import b.o;
import c.c.b.h.g.c;
import java.util.ArrayList;
import java.util.Comparator;

public class k {
    public static final g G = new g(0, 0, 0, 0);
    public long A;
    public boolean B;
    public int C;
    public a D;
    public int[] E = new int[64];
    public o F = new o();
    public j a;
    public h b;
    public b.d c;
    public f d;
    public e e;
    public long[] f;
    public int g;
    public int h;
    public m i;
    public n j = null;
    public c[] k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public long p;
    public int q;
    public int r = 5000;
    public int s = 1000;
    public boolean t = false;
    public long u = 0L;
    public long v;
    public long w;
    public int[] x;
    public int[] y;
    public long z;

    public k(j j2, long[] arrl, int n2, m m2, e e2) {
        this.a = new j(j2);
        this.b = new h();
        this.f = arrl;
        this.g = n2;
        this.i = m2;
        this.e = e2;
        this.c = new b.d();
        this.d = new f();
        this.h = n2;
        this.a();
        this.m = -1L;
        this.n = -1L;
        this.o = false;
        this.p = -1L;
        this.k = new c[200];
        for (int i2 = 0; i2 < 200; ++i2) {
            this.k[i2] = new c();
        }
    }

    public static final void a(h.a a2, int n2) {
        int n3 = a2.a[n2].d;
        int n5 = n2;
        for (int i2 = n2 + 1; i2 < a2.b; ++i2) {
            int n7 = a2.a[i2].d;
            if (n7 <= n3) continue;
            n5 = i2;
            n3 = n7;
        }
        if (n5 != n2) {
            g[] arrg = a2.a;
            g g2 = arrg[n2];
            arrg[n2] = arrg[n5];
            arrg[n5] = g2;
        }
    }

    public static final boolean a(j j2, g g2) {
        int n2 = g2.a;
        int n3 = j2.a[n2];
        if (j2.g) {
            if (n3 != 6) {
                return false;
            }
            long[] arrl = b.a.e;
            int n5 = g2.b;
            if ((arrl[n5] & j2.b[12]) != 0L) {
                return false;
            }
            return n5 >= 40;
        }
        if (n3 != 12) {
            return false;
        }
        long[] arrl = b.a.f;
        int n7 = g2.b;
        if ((arrl[n7] & j2.b[6]) != 0L) {
            return false;
        }
        return n7 <= 23;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final int a(int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, boolean var6_6) {
        block83 : {
            block82 : {
                block81 : {
                    block80 : {
                        block79 : {
                            var7_7 = var4_4;
                            this.q = var8_8 = this.q - 1;
                            if (var8_8 <= 0) {
                                this.q = this.r;
                                var270_9 = System.currentTimeMillis();
                                var272_10 = this.o != false ? this.n : this.m;
                                if (var272_10 >= 0L) {
                                    if (var270_9 - this.l >= var272_10) throw new d();
                                }
                                if ((var274_11 = this.p) >= 0L) {
                                    if (this.z >= var274_11) throw new d();
                                }
                                if (var270_9 - this.A >= 1000L) {
                                    this.b();
                                }
                            }
                            if (this.B) {
                                if (var3_3 < 20) {
                                    var269_12 = this.x;
                                    var269_12[var3_3] = 1 + var269_12[var3_3];
                                }
                                if (var7_7 < 160) {
                                    var267_13 = this.y;
                                    var268_14 = var7_7 / 8;
                                    var267_13[var268_14] = 1 + var267_13[var268_14];
                                }
                            }
                            var9_15 = this.a.a();
                            var11_16 = this.a.j >= 100;
                            if (var11_16) {
                                if (h.c(this.a)) {
                                    return 32000 - var3_3;
                                }
                                if (var6_6 == false) return 0;
                                var265_17 = this.b.b(this.a);
                                h.a(this.a, var265_17);
                                if (var265_17.b == 0) {
                                    var266_18 = -(32000 - (var3_3 + 1));
                                    this.b.a(var265_17);
                                    return var266_18;
                                }
                                this.b.a(var265_17);
                                return 0;
                            }
                            var12_19 = this.a;
                            var13_20 = this.f;
                            var14_21 = this.g;
                            var15_22 = this.h;
                            var17_24 = 0;
                            for (var16_23 = var14_21 - 4; var16_23 >= 0; var16_23 -= 2) {
                                if (var12_19.l != var13_20[var16_23]) continue;
                                ++var17_24;
                                if (var16_23 < var15_22) continue;
                                ++var17_24;
                                break;
                            }
                            if (var17_24 >= 2) {
                                return 0;
                            }
                            var18_25 = false;
                            if (var18_25) {
                                return 0;
                            }
                            var19_26 = this.i.c(var9_15);
                            var20_27 = this.k[var3_3];
                            if (var19_26.f != 3) {
                                var259_28 = var19_26.a(var3_3);
                                var22_29 = var19_26.g;
                                var260_30 = 32000 - Math.abs((int)var259_28);
                                var261_31 = 32767 & var19_26.d;
                                var21_32 = var20_27.b;
                                var19_26.a(var21_32);
                                if (var2_2 == var1_1 + 1 && (var261_31 >= var7_7 || var261_31 >= var260_30 * 8) && ((var262_33 = var19_26.f) == 0 || var262_33 == 1 && var259_28 >= var2_2 || var19_26.f == 2 && var259_28 <= var1_1)) {
                                    if (var259_28 >= var2_2 && (var21_32 = var20_27.b) != null && (var263_34 = var21_32.a) != (var264_35 = var21_32.b) && this.a.a[var264_35] == 0) {
                                        this.d.a(var3_3, var21_32);
                                    }
                                    var20_27.d = var21_32;
                                    return var259_28;
                                }
                            } else {
                                var21_32 = null;
                                var22_29 = -32767;
                            }
                            if (var7_7 + (var23_36 = var6_6 != false ? 8 : 0) <= 0) {
                                this.C = var22_29;
                                var253_37 = var20_27.d;
                                var253_37.a = 0;
                                var253_37.b = 0;
                                var253_37.c = 0;
                                var253_37.d = 0;
                                var254_38 = this.a(var1_1, var2_2, var3_3, 0, var6_6);
                                var255_39 = var254_38 <= var1_1 ? 2 : (var254_38 >= var2_2 ? 1 : 0);
                                var256_40 = var20_27.d;
                                var256_40.d = var254_38;
                                var257_41 = this.i;
                                var258_42 = this.C;
                                var257_41.a(var9_15, var256_40, var255_39, var3_3, var4_4, var258_42);
                                return var254_38;
                            }
                            if (Math.abs((int)var1_1) <= 16000 && var7_7 < 32 && var2_2 == var1_1 + 1) {
                                if (var22_29 == -32767) {
                                    var22_29 = this.c.a(this.a);
                                }
                                if (var22_29 < (var248_43 = var2_2 - 250)) {
                                    this.C = var22_29;
                                    var250_44 = var1_1 - 250;
                                    var249_45 = var22_29;
                                    var24_46 = 16000;
                                    var251_47 = this.a(var250_44, var248_43, var3_3, 0, var6_6);
                                    if (var251_47 <= var250_44) {
                                        var252_48 = k.G;
                                        var252_48.d = var251_47;
                                        this.i.a(var9_15, var252_48, 2, var3_3, var4_4, this.C);
                                        return var251_47;
                                    }
                                } else {
                                    var249_45 = var22_29;
                                    var24_46 = 16000;
                                }
                                var22_29 = var249_45;
                            } else {
                                var24_46 = 16000;
                            }
                            if (!var6_6 && var7_7 < 40 && var23_36 == 0 && Math.abs((int)var1_1) <= var24_46 && Math.abs((int)var2_2) <= var24_46) {
                                var238_49 = this.a;
                                var241_54 = var238_49.g != false ? (var246_50 = var238_49.p) > (var247_51 = var238_49.r) && var247_51 > 0 : (var239_52 = var238_49.q) > (var240_53 = var238_49.s) && var240_53 > 0;
                                if (var241_54) {
                                    var243_56 = var22_29 == -32767 ? this.c.a(this.a) : var22_29;
                                    var244_57 = var243_56 - (var242_55 = var7_7 <= 8 ? 204 : (var7_7 <= 16 ? 420 : (var7_7 <= 24 ? 533 : 788)));
                                    if (var244_57 >= var2_2) {
                                        var245_58 = k.G;
                                        var245_58.d = var244_57;
                                        this.i.a(var9_15, var245_58, 1, var3_3, var4_4, var243_56);
                                        return var244_57;
                                    }
                                    var22_29 = var243_56;
                                }
                            }
                            var20_27.e = k.G;
                            if (var7_7 < 24 || var6_6 || !var20_27.c || Math.abs((int)var2_2) > var24_46) break block79;
                            if (h.c(this.a)) {
                                return 32000 - var3_3;
                            }
                            var209_59 = this.a;
                            var212_64 = var209_59.g != false ? (var236_60 = var209_59.p) > (var237_61 = var209_59.r) && var237_61 > 0 : (var210_62 = var209_59.q) > (var211_63 = var209_59.s) && var211_63 > 0;
                            if (!var212_64) ** GOTO lbl-1000
                            if (var22_29 == -32767) {
                                var22_29 = this.c.a(this.a);
                            }
                            if (var22_29 < var2_2) {
                                var213_65 = var22_29;
                                var212_64 = false;
                            } else lbl-1000: // 2 sources:
                            {
                                var213_65 = var22_29;
                            }
                            if (var212_64) {
                                var214_66 = var7_7 > 48 ? 32 : 24;
                                var215_67 = this.a;
                                var215_67.b(true ^ var215_67.g);
                                var216_68 = this.a;
                                var217_69 = var216_68.i;
                                var216_68.c(-1);
                                var218_70 = this.k;
                                var219_71 = var3_3 + 1;
                                var218_70[var219_71].c = false;
                                var220_72 = var218_70[var219_71].d;
                                var220_72.a = 0;
                                var220_72.b = 0;
                                var220_72.c = 0;
                                var220_72.d = 0;
                                var221_73 = -var2_2;
                                var222_74 = -(var2_2 - 1);
                                var223_75 = var7_7 - var214_66;
                                var27_76 = -1;
                                var25_77 = var20_27;
                                var26_78 = 16000;
                                var224_79 = -this.a(var221_73, var222_74, var219_71, var223_75, -1, false);
                                this.k[var219_71].c = true;
                                this.a.c(var217_69);
                                var225_80 = this.a;
                                var225_80.b(true ^ var225_80.g);
                                if (var224_79 >= var2_2) {
                                    if (var224_79 > var26_78) {
                                        var224_79 = var2_2;
                                    }
                                    var235_81 = k.G;
                                    var235_81.d = var224_79;
                                    this.i.a(var9_15, var235_81, 1, var3_3, var4_4, var213_65);
                                    return var224_79;
                                }
                                var226_82 = this.k;
                                var227_83 = var3_3 - 1;
                                if (var226_82[var227_83].f > 0 && var7_7 < 40) {
                                    var228_84 = var226_82[var227_83].e;
                                    var229_85 = var226_82[var219_71].d;
                                    var230_86 = var228_84.a;
                                    var231_87 = var228_84.b;
                                    var232_90 = var230_86 != var231_87 && (var233_88 = var229_85.a) != (var234_89 = var229_85.b) && (var231_87 == var233_88 || var230_86 == var234_89 || (b.a.p[var233_88][var234_89] & 1L << var230_86) != 0L);
                                    if (var232_90) {
                                        return var1_1;
                                    }
                                }
                            } else {
                                var25_77 = var20_27;
                                var26_78 = 16000;
                                var27_76 = -1;
                            }
                            var22_29 = var213_65;
                            break block80;
                        }
                        var25_77 = var20_27;
                        var26_78 = 16000;
                        var27_76 = -1;
                    }
                    if (var6_6 || var7_7 >= 40 || var23_36 != 0 || Math.abs((int)var1_1) > var26_78 || Math.abs((int)var2_2) > var26_78) break block81;
                    if (var7_7 <= 8) {
                        var207_91 = 61;
                        var208_92 = -32767;
                    } else if (var7_7 <= 16) {
                        var207_91 = 144;
                        var208_92 = -32767;
                    } else {
                        var207_91 = var7_7 <= 24 ? 268 : 334;
                        var208_92 = -32767;
                    }
                    if (var22_29 == var208_92) {
                        var22_29 = this.c.a(this.a);
                    }
                    if ((var28_93 = var207_91 + var22_29) > var1_1) break block82;
                    var29_94 = var28_93;
                    var30_95 = var22_29;
                    var31_96 = 32;
                    var32_97 = true;
                    break block83;
                }
                var28_93 = var1_1;
            }
            var29_94 = var28_93;
            var30_95 = var22_29;
            var31_96 = 32;
            var32_97 = false;
        }
        if (!(var7_7 <= var31_96 || var21_32 != null && var21_32.a != var21_32.b || !(var198_98 = var2_2 > var1_1 + 1) && var7_7 <= 64)) {
            var199_99 = var25_77;
            var200_100 = var199_99.g;
            var202_101 = var198_98 != false ? var7_7 - 16 : var7_7 * 3 / 8;
            var203_102 = var202_101;
            var35_103 = var199_99;
            this.a(var1_1, var2_2, var3_3, var203_102, -1, var6_6);
            var35_103.g = var200_100;
            var205_104 = this.i;
            var33_105 = var9_15;
            var206_106 = var205_104.c(var33_105);
            if (var206_106.f != 3) {
                var21_32 = var35_103.b;
                var206_106.a(var21_32);
            }
        } else {
            var33_105 = var9_15;
            var35_103 = var25_77;
        }
        var36_107 = this.b;
        var37_108 = this.a;
        var38_109 = var6_6 != false ? var36_107.a(var37_108) : var36_107.b(var37_108);
        var39_110 = var38_109;
        if (var21_32 != null) {
            for (var40_111 = 0; var40_111 < var39_110.b; ++var40_111) {
                var41_112 = var39_110.a[var40_111];
                if (!var41_112.equals(var21_32)) continue;
                var42_113 = var39_110.a;
                var42_113[var40_111] = var42_113[0];
                var42_113[0] = var41_112;
                var41_112.d = 10000;
                var43_114 = true;
                break;
            }
        } else {
            var43_114 = false;
        }
        if (!var43_114) {
            var44_115 = var3_3;
            this.a(var39_110, var44_115, 0);
            var45_116 = true;
            var46_117 = false;
        } else {
            var44_115 = var3_3;
            var45_116 = false;
            var46_117 = true;
        }
        var47_118 = var35_103.a;
        var48_119 = var44_115 + 1;
        var50_121 = var49_120 = -(32000 - var48_119);
        var51_122 = var45_116;
        var53_124 = var52_123 = var2_2;
        var54_125 = 0;
        var55_126 = -1;
        var56_127 = false;
        var57_128 = 0;
        var58_129 = var1_1;
        while (var54_125 < var39_110.b) {
            block86 : {
                block90 : {
                    block100 : {
                        block99 : {
                            block98 : {
                                block97 : {
                                    block91 : {
                                        block96 : {
                                            block95 : {
                                                block94 : {
                                                    block93 : {
                                                        block92 : {
                                                            block89 : {
                                                                block88 : {
                                                                    block87 : {
                                                                        block84 : {
                                                                            block85 : {
                                                                                if (var54_125 == 1 && !var51_122) {
                                                                                    this.a(var39_110, var44_115, 1);
                                                                                    var51_122 = true;
                                                                                }
                                                                                if (var54_125 > 0 || !var46_117) {
                                                                                    k.a(var39_110, var54_125);
                                                                                }
                                                                                var70_130 = var39_110.a[var54_125];
                                                                                var71_131 = this.a;
                                                                                var72_132 = var49_120;
                                                                                var73_133 = var70_130.b;
                                                                                var74_134 = var48_119;
                                                                                var75_135 = var71_131.a[var73_133];
                                                                                var76_136 = var71_131.g != false ? 7 : 1;
                                                                                if (var75_135 == var76_136) {
                                                                                    this.b.a(var39_110);
                                                                                    return 32000 - var44_115;
                                                                                }
                                                                                var77_137 = this.a;
                                                                                var78_138 = var70_130.b;
                                                                                var79_139 = var77_137.a[var78_138] != 0;
                                                                                var80_140 = var70_130.c != 0;
                                                                                var81_141 = var70_130.d;
                                                                                var82_142 = var39_110;
                                                                                var83_143 = var81_141 < 53 && (var79_139 == false || var81_141 < 0) && var80_140 == false;
                                                                                var84_144 = h.a(this.a, var70_130);
                                                                                if (!var83_143 || !var56_127 || var84_144 || k.a(this.a, var70_130)) break block84;
                                                                                var196_219 = Math.abs((int)var58_129);
                                                                                var85_145 = var33_105;
                                                                                if (var196_219 > 16000 || Math.abs((int)var2_2) > 16000 || var54_125 < (var197_220 = var7_7 <= 8 ? 3 : (var7_7 <= 16 ? 6 : (var7_7 <= 24 ? 12 : (var7_7 <= 32 ? 24 : 256))))) break block85;
                                                                                var110_169 = var58_129;
                                                                                var108_167 = var54_125;
                                                                                var97_156 = var23_36;
                                                                                var115_174 = var72_132;
                                                                                var101_160 = var74_134;
                                                                                var118_177 = var82_142;
                                                                                break block86;
                                                                            }
                                                                            if (!var32_97) break block87;
                                                                            var87_146 = true;
                                                                            break block88;
                                                                        }
                                                                        var85_145 = var33_105;
                                                                    }
                                                                    var87_146 = false;
                                                                }
                                                                if (!var87_146) break block89;
                                                                var105_164 = var58_129;
                                                                var108_167 = var54_125;
                                                                var97_156 = var23_36;
                                                                var110_169 = var29_94;
                                                                var112_171 = var52_123;
                                                                var109_168 = var72_132;
                                                                var101_160 = var74_134;
                                                                var106_165 = var82_142;
                                                                break block90;
                                                            }
                                                            if (var23_36 != 0) break block91;
                                                            var183_206 = b.d.i;
                                                            if (var70_130.b != var5_5) break block92;
                                                            var192_215 = this.a(var70_130);
                                                            var193_216 = b.d.n;
                                                            var88_147 = var54_125;
                                                            var194_217 = this.a;
                                                            var195_218 = var70_130.b;
                                                            if (var192_215 <= var193_216[var194_217.a[var195_218]] - var183_206 / 2) break block93;
                                                            var184_207 = 8;
                                                            break block94;
                                                        }
                                                        var88_147 = var54_125;
                                                    }
                                                    var184_207 = 0;
                                                }
                                                if (var184_207 >= 8 || !var79_139) break block95;
                                                var186_209 = this.a;
                                                var187_210 = var186_209.r;
                                                var185_208 = var184_207;
                                                var188_211 = var186_209.s;
                                                if (var187_210 + var188_211 <= var183_206) break block96;
                                                var189_212 = b.d.n;
                                                var190_213 = var70_130.b;
                                                var191_214 = var189_212[var186_209.a[var190_213]];
                                                if (!(var186_209.g != false ? var186_209.p == var187_210 && var186_209.q - var188_211 == var191_214 : var186_209.q == var188_211 && var186_209.p - var187_210 == var191_214)) break block96;
                                                var89_148 = 8;
                                                break block97;
                                            }
                                            var185_208 = var184_207;
                                        }
                                        var89_148 = var185_208;
                                        break block97;
                                    }
                                    var88_147 = var54_125;
                                    var89_148 = 0;
                                }
                                var90_149 = Math.max((int)var23_36, (int)var89_148);
                                if (var7_7 >= 24 && var83_143 && var90_149 == 0 && !var84_144 && !k.a(this.a, var70_130)) {
                                    var182_205 = var57_128 + 1;
                                    if (var182_205 > 3 && var7_7 > 24 && !var79_139) {
                                        var57_128 = var182_205;
                                        var91_150 = 16;
                                    } else {
                                        var57_128 = var182_205;
                                        var91_150 = 8;
                                    }
                                } else {
                                    var91_150 = 0;
                                }
                                var92_151 = var90_149 + (var7_7 - 8) - var91_150;
                                if (!var79_139 || !var84_144 && var7_7 + var90_149 <= 8) ** GOTO lbl-1000
                                var173_196 = b.d.n;
                                var174_197 = this.a;
                                var175_198 = var70_130.a;
                                var176_199 = var174_197.a;
                                var177_200 = var173_196[var176_199[var175_198]];
                                var178_201 = var173_196[var176_199[var70_130.b]];
                                var179_202 = b.d.i;
                                var180_203 = Math.abs((int)(var178_201 - var177_200));
                                if (var180_203 < (var181_204 = var179_202 / 2) && Math.abs((int)this.a(var70_130)) < var181_204) {
                                    var93_152 = var70_130.b;
                                } else lbl-1000: // 2 sources:
                                {
                                    var93_152 = -1;
                                }
                                var94_153 = this.f;
                                var95_154 = this.g;
                                this.g = var95_154 + 1;
                                var96_155 = this.a;
                                var97_156 = var23_36;
                                var94_153[var95_154] = var96_155.l;
                                var96_155.a(var70_130, var47_118);
                                this.v = 1L + this.v;
                                this.z = 1L + this.z;
                                var35_103.e = var70_130;
                                var35_103.f = var91_150;
                                var98_157 = var53_124;
                                var99_158 = -var98_157;
                                var100_159 = -var58_129;
                                var101_160 = var74_134;
                                var102_161 = var47_118;
                                var103_162 = var70_130;
                                var104_163 = var101_160;
                                var105_164 = var58_129;
                                var106_165 = var82_142;
                                var107_166 = var93_152;
                                var108_167 = var88_147;
                                var109_168 = var72_132;
                                var110_169 = -this.a(var99_158, var100_159, var104_163, var92_151, var107_166, var84_144);
                                if (var91_150 <= 0 || var110_169 <= var105_164) break block98;
                                var171_194 = var2_2;
                                break block99;
                            }
                            if (var110_169 <= var105_164 || var110_169 >= (var171_194 = var2_2) || var98_157 == var171_194 || var110_169 == var109_168) break block100;
                        }
                        var35_103.f = 0;
                        var172_195 = var92_151 + var91_150;
                        var110_169 = -this.a(-var171_194, var100_159, var101_160, var172_195, var93_152, var84_144);
                    }
                    --this.g;
                    var111_170 = this.a;
                    var70_130 = var103_162;
                    var47_118 = var102_161;
                    var111_170.b(var70_130, var47_118);
                    var112_171 = var2_2;
                }
                if (this.t && var56_127) {
                    var139_179 = this.a;
                    var140_180 = var139_179.l;
                    var142_181 = j.t;
                    var143_182 = (Long.MAX_VALUE & (var140_180 ^ var142_181[0][var70_130.a] ^ var142_181[0][var70_130.b] ^ this.u)) % 1000000000L;
                    Double.isNaN((double)var143_182);
                    Double.isNaN((double)var143_182);
                    Double.isNaN((double)var143_182);
                    var148_183 = var143_182 / 1.0E9;
                    var150_184 = this.s;
                    Double.isNaN((double)var150_184);
                    Double.isNaN((double)var150_184);
                    Double.isNaN((double)var150_184);
                    var155_185 = (17.0 - 50.0 * (var150_184 * 0.001)) / 3.0;
                    var157_186 = b.d.a(var139_179.p + var139_179.q, 0, 30, 4 * b.d.m, 100);
                    var113_172 = var3_3;
                    var158_187 = var157_186 * var113_172;
                    var114_173 = var109_168;
                    var159_188 = var158_187;
                    Double.isNaN((double)var159_188);
                    Double.isNaN((double)var159_188);
                    Double.isNaN((double)var159_188);
                    var164_189 = 1.0 / (1.0 + Math.exp((double)(var155_185 + var159_188 * 0.01)));
                    var166_190 = var70_130.b;
                    var167_191 = var139_179.a[var166_190] != 0 || var113_172 < 2 || this.k[var113_172 - 2].e.b == var70_130.a;
                    if (var167_191) {
                        var169_193 = 1.0 - var164_189;
                        var164_189 = 1.0 - var169_193 * var169_193;
                    }
                    if (var168_192 = var148_183 > var164_189) {
                        var110_169 = var114_173;
                    }
                } else {
                    var113_172 = var3_3;
                    var114_173 = var109_168;
                }
                var70_130.d = var110_169;
                var115_174 = var114_173;
                var116_175 = var50_121;
                if (var110_169 != var115_174) {
                    var56_127 = true;
                }
                var117_176 = Math.max((int)var116_175, (int)var110_169);
                if (var110_169 > var105_164) {
                    var138_178 = var35_103.d;
                    var138_178.a = var70_130.a;
                    var138_178.b = var70_130.b;
                    var138_178.c = var70_130.c;
                    var55_126 = var108_167;
                } else {
                    var110_169 = var105_164;
                }
                if (var110_169 >= var112_171) {
                    var119_221 = this.a;
                    var120_222 = var70_130.b;
                    if (var119_221.a[var120_222] == 0) {
                        this.d.a(var113_172, var70_130);
                        var122_223 = this.e;
                        var123_224 = this.a;
                        var124_225 = var4_4 / 8;
                        if (var122_223 == null) throw null;
                        var125_226 = var70_130.a;
                        var126_227 = var123_224.a[var125_226];
                        var127_228 = var122_223.a[var126_227];
                        var128_229 = var70_130.b;
                        var129_230 = var124_225 + var127_228[var128_229];
                        if (var129_230 > 1000) {
                            var129_230 /= 2;
                            var137_231 = var122_223.b[var126_227];
                            var137_231[var128_229] = var137_231[var128_229] / 2;
                        }
                        var130_232 = var122_223.a[var126_227];
                        var131_233 = var70_130.b;
                        var130_232[var131_233] = var129_230;
                        var122_223.c[var126_227][var131_233] = var27_76;
                        for (var132_234 = var108_167 - 1; var132_234 >= 0; --var132_234) {
                            var133_235 = var106_165;
                            var134_236 = var133_235.a[var132_234];
                            var135_237 = this.a;
                            var136_238 = var134_236.b;
                            if (var135_237.a[var136_238] == 0) {
                                this.e.a(var135_237, var134_236, var124_225);
                            }
                            var106_165 = var133_235;
                        }
                    }
                    var121_239 = var106_165;
                    this.i.a(var85_145, var70_130, 1, var3_3, var4_4, var30_95);
                    this.b.a(var121_239);
                    return var110_169;
                }
                var118_177 = var106_165;
                var53_124 = var110_169 + 1;
                var52_123 = var112_171;
                var50_121 = var117_176;
            }
            var54_125 = var108_167 + 1;
            var44_115 = var3_3;
            var7_7 = var4_4;
            var58_129 = var110_169;
            var49_120 = var115_174;
            var48_119 = var101_160;
            var23_36 = var97_156;
            var33_105 = var85_145;
            var39_110 = var118_177;
        }
        var59_240 = var39_110;
        var60_241 = var33_105;
        var62_242 = var50_121;
        if (!var56_127 && !var6_6) {
            this.b.a(var59_240);
            return 0;
        }
        if (var55_126 >= 0) {
            var68_243 = this.i;
            var69_244 = var59_240.a[var55_126];
            var66_245 = var68_243;
            var65_246 = var69_244;
            var67_247 = 0;
        } else {
            var63_248 = k.G;
            var63_248.d = var62_242;
            var64_249 = this.i;
            var65_246 = var63_248;
            var66_245 = var64_249;
            var67_247 = 2;
        }
        var66_245.a(var60_241, var65_246, var67_247, var3_3, var4_4, var30_95);
        this.b.a(var59_240);
        return var62_242;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final int a(int var1_1, int var2_2, int var3_3, int var4_4, boolean var5_5) {
        block85 : {
            block83 : {
                block90 : {
                    block91 : {
                        block81 : {
                            block93 : {
                                block89 : {
                                    block92 : {
                                        block82 : {
                                            block88 : {
                                                block86 : {
                                                    block87 : {
                                                        block84 : {
                                                            var6_6 = this;
                                                            if (var5_5) {
                                                                var7_7 = -(32000 - (var3_3 + 1));
                                                            } else if (var4_4 != 0 || (var7_7 = var6_6.C) == -32767) {
                                                                var7_7 = var6_6.c.a(var6_6.a);
                                                                if (var4_4 == 0) {
                                                                    var6_6.C = var7_7;
                                                                }
                                                            }
                                                            var8_8 = var7_7;
                                                            if (var8_8 >= var2_2) {
                                                                if (var4_4 != 0) return var8_8;
                                                                var235_9 = 32000 - var3_3;
                                                                if (var8_8 >= var235_9) return var8_8;
                                                                if (h.c(var6_6.a) == false) return var8_8;
                                                                return var235_9;
                                                            }
                                                            var9_10 = var1_1;
                                                            if (var8_8 > var9_10) {
                                                                var9_10 = var8_8;
                                                            }
                                                            var10_11 = var4_4 > -1;
                                                            if (!var5_5) break block84;
                                                            var33_12 = var6_6.b.a(var6_6.a);
                                                            var13_13 = var8_8;
                                                            var14_14 = var10_11;
                                                            break block85;
                                                        }
                                                        var11_15 = 0L;
                                                        if (!var10_11) break block86;
                                                        var92_16 = var6_6.b;
                                                        var93_17 = var6_6.a;
                                                        var94_18 = var92_16.a();
                                                        var14_14 = var10_11;
                                                        var95_19 = var93_17.c | var93_17.d;
                                                        if (!var93_17.g) break block87;
                                                        var164_20 = var93_17.a(false);
                                                        var167_22 = b.a.c(var164_20, var95_19 & ((var165_21 = b.a.c(var164_20, var95_19)) ^ -1L));
                                                        var170_24 = (var167_22 & ((var169_23 = var93_17.b)[2] | var169_23[3])) != var11_15 ? var165_21 | var11_15 : var11_15;
                                                        var172_25 = b.a.a(var164_20, var95_19);
                                                        var174_26 = var172_25 ^ -1L;
                                                        var176_27 = var170_24;
                                                        var178_28 = b.a.a(var164_20, var95_19 & var174_26);
                                                        var180_29 = var93_17.b;
                                                        var181_30 = (var178_28 & (var180_29[2] | var180_29[4])) != var11_15 ? var176_27 | var172_25 : var176_27;
                                                        break block88;
                                                    }
                                                    var13_13 = var8_8;
                                                    var97_65 = var95_19;
                                                    var99_66 = var93_17.a(true);
                                                    var102_68 = b.a.c(var99_66, var97_65 & ((var100_67 = b.a.c(var99_66, var97_65)) ^ -1L));
                                                    var105_70 = (var102_68 & ((var104_69 = var93_17.b)[8] | var104_69[9])) != var11_15 ? var100_67 | var11_15 : var11_15;
                                                    var107_71 = b.a.a(var99_66, var97_65);
                                                    var109_72 = b.a.a(var99_66, var97_65 & (var107_71 ^ -1L));
                                                    if ((var109_72 & ((var111_73 = var93_17.b)[8] | var111_73[10])) == var11_15) break block89;
                                                    var105_70 |= var107_71;
                                                    break block89;
                                                }
                                                var13_13 = var8_8;
                                                var14_14 = var10_11;
                                                var15_101 = var6_6.b;
                                                var16_102 = var6_6.a;
                                                var17_103 = var15_101.a();
                                                var18_104 = var16_102.c | var16_102.d;
                                                if (!var16_102.g) break block90;
                                                break block91;
                                            }
                                            for (var183_31 = var93_17.b[2]; var183_31 != var11_15; var183_31 &= var183_31 - 1L) {
                                                var230_32 = b.a.b(var183_31);
                                                var231_33 = b.a.c(var230_32, var95_19) | b.a.a(var230_32, var95_19);
                                                if ((var181_30 & 1L << var230_32) == var11_15) {
                                                    var233_34 = var95_19;
                                                    var231_33 &= var172_25 | (var165_21 | var93_17.d);
                                                } else {
                                                    var233_34 = var95_19;
                                                }
                                                if (h.a(var94_18, var93_17, var230_32, var231_33 & (-1L ^ var93_17.c))) {
                                                    var13_13 = var8_8;
                                                    break block81;
                                                }
                                                var95_19 = var233_34;
                                            }
                                            var185_35 = var95_19;
                                            var187_36 = 1L;
                                            for (var189_37 = var93_17.b[3]; var189_37 != var11_15; var189_37 &= var189_37 - var187_36) {
                                                var225_38 = b.a.b(var189_37);
                                                var191_41 = var8_8;
                                                var226_39 = var185_35;
                                                var228_40 = b.a.c(var225_38, var226_39);
                                                if ((var181_30 & var187_36 << var225_38) == var11_15) {
                                                    var228_40 &= var165_21 | var93_17.d;
                                                }
                                                if (!h.a(var94_18, var93_17, var225_38, var228_40 & (-1L ^ var93_17.c))) {
                                                    var187_36 = 1L;
                                                    var185_35 = var226_39;
                                                    var8_8 = var191_41;
                                                    continue;
                                                }
                                                break block82;
                                            }
                                            var191_41 = var8_8;
                                            var192_42 = var185_35;
                                            break block92;
                                        }
lbl97: // 3 sources:
                                        do {
                                            var13_13 = var191_41;
                                            break block81;
                                            break;
                                        } while (true);
                                    }
                                    for (var194_43 = var93_17.b[4]; var194_43 != var11_15; var194_43 &= var194_43 - var187_36) {
                                        var222_47 = b.a.b(var194_43);
                                        var223_48 = b.a.a(var222_47, var192_42);
                                        if ((var181_30 & var187_36 << var222_47) == var11_15) {
                                            var223_48 &= var172_25 | var93_17.d;
                                        }
                                        if (h.a(var94_18, var93_17, var222_47, var223_48 & (-1L ^ var93_17.c))) ** GOTO lbl97
                                        var187_36 = 1L;
                                    }
                                    ** while (h.a((h.a)var94_18, (j)var93_17, (int)(var196_44 = var93_17.a((boolean)true)), (long)((var197_45 = b.a.a[var196_44]) & (var199_46 = (var181_30 & var187_36 << var196_44) == var11_15 ? var93_17.d : -1L ^ var93_17.c))))
lbl110: // 1 sources:
                                    if (var196_44 == 4) {
                                        if ((2 & var93_17.h) != 0 && (96L & (var93_17.c | var93_17.d)) == var11_15 && var93_17.a[7] == 3 && !h.a(var93_17, 4) && !h.a(var93_17, 5)) {
                                            h.a(var94_18, 4, 6, 0);
                                        }
                                        if ((1 & var93_17.h) != 0 && (14L & (var93_17.c | var93_17.d)) == var11_15 && var93_17.a[0] == 3 && !h.a(var93_17, 4) && !h.a(var93_17, 3)) {
                                            h.a(var94_18, 4, 2, 0);
                                        }
                                    }
                                    var203_50 = b.a.b[var164_20];
                                    for (var201_49 = var93_17.b[5]; var201_49 != var11_15; var201_49 &= var201_49 - 1L) {
                                        var217_51 = b.a.b(var201_49);
                                        var218_52 = b.a.b[var217_51] & (-1L ^ var93_17.c);
                                        var220_53 = var181_30 & 1L << var217_51 LCMP var11_15;
                                        var13_13 = var191_41;
                                        var221_54 = var164_20;
                                        if (var220_53 == false) {
                                            var218_52 &= var203_50 | var93_17.d;
                                        }
                                        if (!h.a(var94_18, var93_17, var217_51, var218_52 & (-1L ^ var93_17.c))) {
                                            var164_20 = var221_54;
                                            var191_41 = var13_13;
                                            continue;
                                        }
                                        break block81;
                                    }
                                    var13_13 = var191_41;
                                    var205_55 = var164_20;
                                    var206_56 = var93_17.b[6];
                                    var208_57 = var93_17.i;
                                    if (var208_57 >= 0) {
                                        var11_15 = 1L << var208_57;
                                    }
                                    if (h.a(var94_18, var93_17, 0x7F7F7F7F7F7F7F7FL & var206_56 << 7 & (var11_15 | var93_17.d), -7, false) || h.a(var94_18, var93_17, -72340172838076674L & var206_56 << 9 & (var11_15 | var93_17.d), -9, false) || h.a(var94_18, var93_17, var211_59 = (var206_56 & (var209_58 = 0xFF000000000000L | var181_30)) << 8 & (-1L ^ (var93_17.c | var93_17.d)), -8, false)) break block81;
                                    var213_60 = (var211_59 & 0xFF0000L) << 8 & (-1L ^ (var93_17.c | var93_17.d));
                                    var140_61 = -16;
                                    h.a(var94_18, var213_60, var140_61);
                                    var215_62 = (var206_56 & (var209_58 ^ -1L)) << 8 & (-1L ^ (var93_17.c | var93_17.d));
                                    if (h.a(var94_18, var93_17, var215_62 & b.a.d[var205_55], -8, false)) break block81;
                                    var147_63 = (var215_62 & 0xFF0000L) << 8 & (-1L ^ (var93_17.c | var93_17.d));
                                    var145_64 = b.a.d[var205_55];
                                    break block93;
                                }
                                for (var112_74 = var93_17.b[8]; var112_74 != var11_15; var112_74 &= var112_74 - 1L) {
                                    var158_75 = b.a.b(var112_74);
                                    var159_76 = b.a.c(var158_75, var97_65) | b.a.a(var158_75, var97_65);
                                    var161_77 = var105_70 & 1L << var158_75 LCMP var11_15;
                                    var162_78 = var105_70;
                                    if (var161_77 == false) {
                                        var159_76 &= var107_71 | (var100_67 | var93_17.c);
                                    }
                                    if (!h.a(var94_18, var93_17, var158_75, var159_76 & (-1L ^ var93_17.d))) {
                                        var105_70 = var162_78;
                                        continue;
                                    }
                                    break block81;
                                }
                                var114_79 = var105_70;
                                var116_80 = 1L;
                                for (var118_81 = var93_17.b[9]; var118_81 != var11_15; var118_81 &= var118_81 - var116_80) {
                                    var155_82 = b.a.b(var118_81);
                                    var156_83 = b.a.c(var155_82, var97_65);
                                    if ((var114_79 & var116_80 << var155_82) == var11_15) {
                                        var156_83 &= var100_67 | var93_17.c;
                                    }
                                    if (!h.a(var94_18, var93_17, var155_82, var156_83 & (-1L ^ var93_17.d))) {
                                        var116_80 = 1L;
                                        continue;
                                    }
                                    break block81;
                                }
                                for (var120_84 = var93_17.b[10]; var120_84 != var11_15; var120_84 &= var120_84 - var116_80) {
                                    var152_85 = b.a.b(var120_84);
                                    var153_86 = b.a.a(var152_85, var97_65);
                                    if ((var114_79 & var116_80 << var152_85) == var11_15) {
                                        var153_86 &= var107_71 | var93_17.c;
                                    }
                                    if (!h.a(var94_18, var93_17, var152_85, var153_86 & (-1L ^ var93_17.d))) {
                                        var116_80 = 1L;
                                        continue;
                                    }
                                    break block81;
                                }
                                var122_87 = var93_17.a(false);
                                if (h.a(var94_18, var93_17, var122_87, (var125_89 = (var114_79 & var116_80 << var122_87) == var11_15 ? var93_17.c : -1L ^ var93_17.d) & (var123_88 = b.a.a[var122_87]))) break block81;
                                if (var122_87 == 60) {
                                    if ((8 & var93_17.h) != 0 && (0x6000000000000000L & (var93_17.c | var93_17.d)) == var11_15 && var93_17.a[63] == 9 && !h.a(var93_17, 60) && !h.a(var93_17, 61)) {
                                        h.a(var94_18, 60, 62, 0);
                                    }
                                    if ((4 & var93_17.h) != 0 && (0xE00000000000000L & (var93_17.c | var93_17.d)) == var11_15 && var93_17.a[56] == 9 && !h.a(var93_17, 60) && !h.a(var93_17, 59)) {
                                        h.a(var94_18, 60, 58, 0);
                                    }
                                }
                                var129_91 = b.a.b[var99_66];
                                for (var127_90 = var93_17.b[11]; var127_90 != var11_15; var127_90 &= var127_90 - 1L) {
                                    var149_92 = b.a.b(var127_90);
                                    var150_93 = b.a.b[var149_92] & (-1L ^ var93_17.d);
                                    if ((var114_79 & 1L << var149_92) == var11_15) {
                                        var150_93 &= var129_91 | var93_17.c;
                                    }
                                    if (!h.a(var94_18, var93_17, var149_92, var150_93 & (-1L ^ var93_17.d))) {
                                        continue;
                                    }
                                    break block81;
                                }
                                var131_94 = var93_17.b[12];
                                var133_95 = var93_17.i;
                                if (var133_95 >= 0) {
                                    var11_15 = 1L << var133_95;
                                }
                                if (h.a(var94_18, var93_17, 0x7F7F7F7F7F7F7F7FL & var131_94 >>> 9 & (var11_15 | var93_17.c), 9, false) || h.a(var94_18, var93_17, -72340172838076674L & var131_94 >>> 7 & (var11_15 | var93_17.c), 7, false) || h.a(var94_18, var93_17, var136_97 = (var131_94 & (var134_96 = var114_79 | 65280L)) >>> 8 & (-1L ^ (var93_17.c | var93_17.d)), 8, false)) break block81;
                                var138_98 = (var136_97 & 0xFF0000000000L) >>> 8 & (-1L ^ (var93_17.c | var93_17.d));
                                var140_61 = 16;
                                h.a(var94_18, var138_98, var140_61);
                                var141_99 = (var131_94 & (var134_96 ^ -1L)) >>> 8 & (-1L ^ (var93_17.c | var93_17.d));
                                if (h.a(var94_18, var93_17, var141_99 & b.a.c[var99_66], 8, false)) break block81;
                                var143_100 = (var141_99 & 0xFF0000000000L) >>> 8 & (-1L ^ (var93_17.c | var93_17.d));
                                var145_64 = b.a.c[var99_66];
                                var147_63 = var143_100;
                            }
                            h.a(var94_18, var147_63 & var145_64, var140_61);
                        }
                        var33_12 = var94_18;
                        var6_6 = this;
                        break block85;
                    }
                    for (var75_105 = var16_102.b[2]; var75_105 != var11_15; var75_105 &= var75_105 - 1L) {
                        var91_106 = b.a.b(var75_105);
                        if (!h.a(var17_103, var16_102, var91_106, (b.a.c(var91_106, var18_104) | b.a.a(var91_106, var18_104)) & var16_102.d)) {
                            continue;
                        }
                        break block83;
                    }
                    for (var77_107 = var16_102.b[3]; var77_107 != var11_15; var77_107 &= var77_107 - 1L) {
                        var90_112 = b.a.b(var77_107);
                        if (!h.a(var17_103, var16_102, var90_112, b.a.c(var90_112, var18_104) & var16_102.d)) {
                            continue;
                        }
                        break block83;
                    }
                    for (var79_108 = var16_102.b[4]; var79_108 != var11_15; var79_108 &= var79_108 - 1L) {
                        var89_111 = b.a.b(var79_108);
                        if (!h.a(var17_103, var16_102, var89_111, b.a.a(var89_111, var18_104) & var16_102.d)) {
                            continue;
                        }
                        break block83;
                    }
                    for (var81_109 = var16_102.b[5]; var81_109 != var11_15; var81_109 &= var81_109 - 1L) {
                        var88_110 = b.a.b(var81_109);
                        if (!h.a(var17_103, var16_102, var88_110, b.a.b[var88_110] & var16_102.d)) {
                            continue;
                        }
                        break block83;
                    }
                    var83_113 = var16_102.a(true);
                    if (!h.a(var17_103, var16_102, var83_113, b.a.a[var83_113] & var16_102.d) && !h.a(var17_103, var16_102, -72057594037927936L & ((var84_114 = var16_102.b[6]) << 8 & (-1L ^ (var16_102.c | var16_102.d))), -8, false)) {
                        var86_115 = var16_102.i;
                        if (var86_115 >= 0) {
                            var11_15 = 1L << var86_115;
                        }
                        if (!h.a(var17_103, var16_102, 0x7F7F7F7F7F7F7F7FL & var84_114 << 7 & (var11_15 | var16_102.d), -7, false)) {
                            h.a(var17_103, var16_102, -72340172838076674L & var84_114 << 9 & (var11_15 | var16_102.d), -9, false);
                        }
                    }
                    break block83;
                }
                for (var20_120 = var16_102.b[8]; var20_120 != var11_15; var20_120 &= var20_120 - 1L) {
                    var74_119 = b.a.b(var20_120);
                    if (!h.a(var17_103, var16_102, var74_119, (b.a.c(var74_119, var18_104) | b.a.a(var74_119, var18_104)) & var16_102.c)) {
                        continue;
                    }
                    break block83;
                }
                for (var22_121 = var16_102.b[9]; var22_121 != var11_15; var22_121 &= var22_121 - 1L) {
                    var73_118 = b.a.b(var22_121);
                    if (!h.a(var17_103, var16_102, var73_118, b.a.c(var73_118, var18_104) & var16_102.c)) {
                        continue;
                    }
                    break block83;
                }
                for (var24_122 = var16_102.b[10]; var24_122 != var11_15; var24_122 &= var24_122 - 1L) {
                    var72_117 = b.a.b(var24_122);
                    if (!h.a(var17_103, var16_102, var72_117, b.a.a(var72_117, var18_104) & var16_102.c)) {
                        continue;
                    }
                    break block83;
                }
                for (var26_123 = var16_102.b[11]; var26_123 != var11_15; var26_123 &= var26_123 - 1L) {
                    var71_116 = b.a.b(var26_123);
                    if (!h.a(var17_103, var16_102, var71_116, b.a.b[var71_116] & var16_102.c)) {
                        continue;
                    }
                    break block83;
                }
                var28_124 = var16_102.a(false);
                if (!h.a(var17_103, var16_102, var28_124, b.a.a[var28_124] & var16_102.c) && !h.a(var17_103, var16_102, 255L & ((var29_125 = var16_102.b[12]) >>> 8 & (-1L ^ (var16_102.c | var16_102.d))), 8, false)) {
                    var31_126 = var16_102.i;
                    if (var31_126 >= 0) {
                        var11_15 = 1L << var31_126;
                    }
                    if (!h.a(var17_103, var16_102, 0x7F7F7F7F7F7F7F7FL & var29_125 >>> 9 & (var11_15 | var16_102.c), 9, false)) {
                        h.a(var17_103, var16_102, -72340172838076674L & var29_125 >>> 7 & (var11_15 | var16_102.c), 7, false);
                    }
                }
            }
            var33_12 = var17_103;
        }
        for (var34_127 = 0; var34_127 < var33_12.b; ++var34_127) {
            var64_128 = var33_12.a[var34_127];
            var65_129 = var6_6.a;
            var66_130 = var64_128.b;
            var67_131 = var65_129.a;
            var68_132 = var67_131[var66_130];
            var69_133 = var67_131[var64_128.a];
            var70_134 = b.d.n;
            var64_128.d = 10000 * var70_134[var68_132] - var70_134[var69_133];
        }
        var35_135 = var6_6.k[var3_3].a;
        var36_136 = var9_10;
        var37_137 = var13_13;
        var38_138 = 0;
        do {
            block96 : {
                block97 : {
                    block94 : {
                        block98 : {
                            block95 : {
                                if (var38_138 >= var33_12.b) {
                                    var6_6.b.a(var33_12);
                                    return var37_137;
                                }
                                if (var38_138 < 8) {
                                    k.a(var33_12, var38_138);
                                }
                                var39_139 = var33_12.a[var38_138];
                                var40_140 = var6_6.a;
                                var41_141 = var39_139.b;
                                var42_142 = var40_140.a[var41_141];
                                var43_143 = var40_140.g != false ? 7 : 1;
                                if (var42_142 == var43_143) {
                                    var6_6.b.a(var33_12);
                                    return 32000 - var3_3;
                                }
                                if (var5_5) break block94;
                                var44_144 = var6_6.a;
                                var45_145 = var39_139.b;
                                if (var44_144.a[var45_145] != 0 || var39_139.c != 0) break block95;
                                if (!var14_14 || !(var51_151 = h.a(var44_144, var39_139)) || var6_6.b(var39_139)) break block96;
                                var52_152 = true;
                                break block97;
                            }
                            if (var6_6.b(var39_139)) break block96;
                            var46_146 = b.d.n;
                            var47_147 = var6_6.a;
                            var48_148 = var39_139.b;
                            var49_149 = var46_146[var47_147.a[var48_148]];
                            var50_150 = 200 + (var46_146[var39_139.c] + (var13_13 + var49_149));
                            if (var50_150 >= var36_136 || (var60_160 = var47_147.r) <= 0 || var47_147.p <= var60_160 + var49_149 || (var61_161 = var47_147.s) <= 0 || var47_147.q <= var49_149 + var61_161) break block94;
                            if (var4_4 - 1 > -2) {
                                var63_163 = h.a(var47_147, var39_139);
                                var62_162 = true;
                            } else {
                                var62_162 = false;
                                var63_163 = false;
                            }
                            if (var63_163) break block98;
                            if (var50_150 > var37_137) {
                                var37_137 = var50_150;
                            }
                            break block96;
                        }
                        var52_152 = var62_162;
                        var51_151 = var63_163;
                        break block97;
                    }
                    var51_151 = false;
                    var52_152 = false;
                }
                if (!var52_152 && var4_4 - 1 > -2) {
                    var51_151 = h.a(var6_6.a, var39_139);
                }
                var54_154 = (var53_153 = var4_4 - 1) > -2 ? var51_151 : false;
                var6_6.a.a(var39_139, var35_135);
                var6_6.w = 1L + var6_6.w;
                var6_6.z = 1L + var6_6.z;
                var55_155 = -this.a(-var2_2, -var36_136, var3_3 + 1, var53_153, var54_154);
                var6_6.a.b(var39_139, var35_135);
                if (var55_155 > var37_137) {
                    if (var55_155 > var36_136) {
                        if (var4_4 == 0) {
                            var56_156 = var6_6.k[var3_3].d;
                            var57_157 = var39_139.a;
                            var58_158 = var39_139.b;
                            var59_159 = var39_139.c;
                            var56_156.a = var57_157;
                            var56_156.b = var58_158;
                            var56_156.c = var59_159;
                            var56_156.d = var55_155;
                        }
                        if (var55_155 >= var2_2) {
                            var6_6.b.a(var33_12);
                            return var55_155;
                        }
                        var37_137 = var36_136 = var55_155;
                    } else {
                        var37_137 = var55_155;
                    }
                }
            }
            ++var38_138;
        } while (true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final int a(g var1_1) {
        block21 : {
            block23 : {
                block22 : {
                    var2_2 = var1_1.b;
                    var3_3 = this.a;
                    if (var2_2 == var3_3.i) {
                        this.E[0] = b.d.i;
                    } else {
                        var4_4 = this.E;
                        var4_4[0] = b.d.n[var3_3.a[var2_2]];
                        if (var4_4[0] == 9900) {
                            return 9900;
                        }
                    }
                    var5_5 = this.a;
                    var6_6 = this.F;
                    var7_7 = var5_5.a;
                    var8_8 = var1_1.b;
                    var6_6.a = var7_7[var8_8];
                    var9_9 = var7_7[var1_1.a];
                    var10_10 = var5_5.i;
                    var11_11 = 8;
                    if (var8_8 != var10_10) break block21;
                    if (var9_9 != 6) break block22;
                    var61_12 = var8_8 - 8;
                    break block23;
                }
                if (var9_9 != 12) break block21;
                var61_12 = var8_8 + var11_11;
            }
            var5_5.c(var61_12, 0);
        }
        var5_5.c(var1_1.a, 0);
        var5_5.c(var1_1.b, var9_9);
        var5_5.g = true ^ var5_5.g;
        var12_13 = this.a;
        var13_14 = var12_13.g;
        var14_15 = b.d.n[var12_13.a[var2_2]];
        var15_16 = var12_13.c | var12_13.d;
        var17_17 = 1;
        do {
            block28 : {
                block25 : {
                    block24 : {
                        block27 : {
                            block26 : {
                                if (!var13_14) break block24;
                                var47_32 = b.a.d[var2_2];
                                var49_33 = this.a.b;
                                var21_20 = var15_16 & (var47_32 & var49_33[6]);
                                if (var21_20 != 0L) break block25;
                                var23_21 = var15_16 & (b.a.b[var2_2] & var49_33[5]);
                                if (var23_21 != 0L) ** GOTO lbl-1000
                                var50_34 = var15_16 & b.a.a(var2_2, var15_16);
                                var52_35 = var50_34 & this.a.b[4];
                                if (var52_35 == 0L) break block26;
                                var44_29 = b.d.k;
                                var21_20 = var52_35;
                                ** GOTO lbl94
                            }
                            var54_36 = var15_16 & b.a.c(var2_2, var15_16);
                            var57_38 = var54_36 & (var56_37 = this.a.b)[3];
                            if (var57_38 == 0L) break block27;
                            var44_29 = b.d.l;
                            var21_20 = var57_38;
                            ** GOTO lbl94
                        }
                        var21_20 = (var50_34 | var54_36) & var56_37[2];
                        if (var21_20 != 0L) ** GOTO lbl-1000
                        var59_39 = var15_16 & (b.a.a[var2_2] & var56_37[1]);
                        if (var59_39 == 0L) break;
                        var21_20 = var59_39;
                        var44_29 = 9900;
                        ** GOTO lbl94
                    }
                    var18_18 = b.a.c[var2_2];
                    var20_19 = this.a.b;
                    var21_20 = var15_16 & (var18_18 & var20_19[12]);
                    if (var21_20 == 0L) break block28;
                }
                var44_29 = b.d.i;
                ** GOTO lbl94
            }
            var23_21 = var15_16 & (b.a.b[var2_2] & var20_19[11]);
            if (var23_21 != 0L) lbl-1000: // 2 sources:
            {
                var44_29 = b.d.j;
                var42_28 = var23_21;
            } else {
                var25_22 = var15_16 & b.a.a(var2_2, var15_16);
                var27_23 = var25_22 & this.a.b[10];
                if (var27_23 != 0L) {
                    var44_29 = b.d.k;
                    var42_28 = var27_23;
                } else {
                    var29_24 = var15_16 & b.a.c(var2_2, var15_16);
                    var32_26 = var29_24 & (var31_25 = this.a.b)[9];
                    if (var32_26 != 0L) {
                        var44_29 = b.d.l;
                        var42_28 = var32_26;
                    } else {
                        var21_20 = (var25_22 | var29_24) & var31_25[var11_11];
                        if (var21_20 != 0L) lbl-1000: // 2 sources:
                        {
                            var44_29 = b.d.m;
lbl94: // 5 sources:
                            var42_28 = var21_20;
                        } else {
                            var34_27 = var15_16 & (b.a.a[var2_2] & var31_25[7]);
                            if (var34_27 == 0L) break;
                            var42_28 = var34_27;
                            var44_29 = 9900;
                        }
                    }
                }
            }
            var45_30 = this.E;
            var46_31 = var17_17 + 1;
            var45_30[var17_17] = var14_15;
            if (var14_15 == 9900) {
                var17_17 = var46_31;
                break;
            }
            var15_16 &= -1L ^ var42_28 & -var42_28;
            var13_14 ^= true;
            var14_15 = var44_29;
            var17_17 = var46_31;
            var11_11 = 8;
        } while (true);
        var36_40 = this.a;
        var37_41 = this.F;
        var36_40.g = true ^ var36_40.g;
        var38_42 = var36_40.a[var1_1.b];
        var36_40.c(var1_1.a, var38_42);
        var36_40.c(var1_1.b, var37_41.a);
        var39_43 = var1_1.b;
        if (var39_43 == var36_40.i) {
            if (var38_42 == 6) {
                var36_40.c(var39_43 - 8, 12);
            } else if (var38_42 == 12) {
                var36_40.c(var39_43 + 8, 6);
            }
        }
        var40_44 = var17_17 - 1;
        var41_45 = 0;
        while (var40_44 > 0) {
            var41_45 = Math.max((int)0, (int)(this.E[var40_44] - var41_45));
            --var40_44;
        }
        return this.E[0] - var41_45;
    }

    public final void a() {
        this.w = 0L;
        this.v = 0L;
        this.x = new int[20];
        this.y = new int[20];
        for (int i2 = 0; i2 < 20; ++i2) {
            this.x[i2] = 0;
            this.y[i2] = 0;
        }
    }

    public final void a(int n2, int n3) {
        this.m = n2;
        this.n = n3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a(int var1_1, int var2_2, boolean var3_3, boolean var4_4, g var5_5) {
        block11 : {
            var6_6 = var2_2;
            if (this.D == null) return;
            if (var6_6 <= 16000) break block11;
            var6_6 = (32000 - var6_6) / 2;
            ** GOTO lbl9
        }
        if (var6_6 < -16000) {
            var6_6 = -((var6_6 + 32000 - 1) / 2);
lbl9: // 2 sources:
            var7_7 = true;
        } else {
            var7_7 = false;
        }
        var8_8 = (int)(System.currentTimeMillis() - this.l);
        if (var8_8 > 0) {
            var39_9 = this.z;
            var41_10 = var8_8;
            Double.isNaN((double)var41_10);
            var44_11 = var41_10 / 1000.0;
            Double.isNaN((double)var39_9);
            var9_12 = (int)(var39_9 / var44_11);
        } else {
            var9_12 = 0;
        }
        var10_13 = this.i;
        var11_14 = this.a;
        if (var10_13 == null) throw null;
        var12_15 = new j(var11_14);
        var13_16 = new g(var5_5);
        var14_17 = new ArrayList();
        var15_18 = new o();
        var16_19 = new ArrayList();
        var17_20 = new h();
        do {
            block13 : {
                block12 : {
                    block10 : {
                        var14_17.add((Object)var13_16);
                        var12_15.a(var13_16, var15_18);
                        var19_21 = var9_12;
                        if (var16_19.contains((Object)var12_15.l)) break block12;
                        var16_19.add((Object)var12_15.l);
                        var21_22 = var10_13.c(var12_15.a());
                        if (var21_22.f == 3) break block12;
                        var22_23 = new g(0, 0, 0);
                        var21_22.a(var22_23);
                        var23_24 = var17_20.b(var12_15);
                        h.a(var12_15, var23_24);
                        for (var24_25 = 0; var24_25 < var23_24.b; ++var24_25) {
                            if (!var23_24.a[var24_25].equals(var22_23)) continue;
                            var25_26 = true;
                            break block10;
                        }
                        var25_26 = false;
                    }
                    if (var25_26) break block13;
                }
                var26_27 = this.D;
                var27_28 = this.z;
                var29_29 = (c.b)var26_27;
                if (var29_29 == null) throw null;
                var30_30 = new StringBuilder();
                for (g var36_32 : var14_17) {
                    var30_30.append(" ");
                    var30_30.append(c.c.b.h.g.c.a((g)var36_32));
                }
                var32_33 = var3_3 != false ? " upperbound" : (var4_4 != false ? " lowerbound" : "");
                var33_34 = var29_29.a;
                var34_35 = new Object[8];
                var34_35[0] = var1_1;
                var35_36 = var7_7 != false ? "mate" : "cp";
                var34_35[1] = var35_36;
                var34_35[2] = var6_6;
                var34_35[3] = var32_33;
                var34_35[4] = var8_8;
                var34_35[5] = var27_28;
                var34_35[6] = var19_21;
                var34_35[7] = var30_30.toString();
                var33_34.a("info depth %d score %s %d%s time %d nodes %d nps %d pv%s", var34_35);
                return;
            }
            var9_12 = var19_21;
            var13_16 = var22_23;
        } while (true);
    }

    public final void a(h.a a2, int n2, int n3) {
        while (n3 < a2.b) {
            block13 : {
                block21 : {
                    int n5;
                    block20 : {
                        g g2;
                        int n7;
                        block19 : {
                            int n8;
                            block16 : {
                                block17 : {
                                    short s2;
                                    f.a a4;
                                    block18 : {
                                        int n9;
                                        f.a[] arra;
                                        f f2;
                                        block14 : {
                                            f.a a5;
                                            block15 : {
                                                g2 = a2.a[n3];
                                                j j2 = this.a;
                                                int n10 = g2.b;
                                                int n11 = j2.a[n10];
                                                n8 = 1;
                                                boolean bl = n11 != 0 || g2.c != 0;
                                                if (bl) {
                                                    int n12;
                                                    if (bl) {
                                                        int[] arrn = b.d.n;
                                                        j j3 = this.a;
                                                        int[] arrn2 = j3.a;
                                                        int n13 = g2.a;
                                                        n12 = arrn[arrn2[n13]] < arrn[arrn2[g2.b]] ? 1 : this.a(g2);
                                                    } else {
                                                        n12 = 0;
                                                    }
                                                    j j4 = this.a;
                                                    int n14 = g2.b;
                                                    int[] arrn = j4.a;
                                                    int n15 = arrn[n14];
                                                    int n16 = arrn[g2.a];
                                                    int[] arrn3 = b.d.n;
                                                    int n17 = 1000 * (arrn3[n15] / 10) - arrn3[n16] / 10;
                                                    int n18 = n12 > 0 ? n17 + 2000000 : (n12 == 0 ? n17 + 1000000 : n17 - 1000000);
                                                    n7 = n18 * 100;
                                                } else {
                                                    n7 = 0;
                                                }
                                                f2 = this.d;
                                                if (f2 == null) break block13;
                                                s2 = (short)(g2.a + (g2.b << 6) + (g2.c << 12));
                                                f.a[] arra2 = f2.a;
                                                if (n2 >= arra2.length) break block14;
                                                a5 = arra2[n2];
                                                if (s2 != a5.a) break block15;
                                                n8 = 4;
                                                break block16;
                                            }
                                            if (s2 != a5.b) break block14;
                                            n8 = 3;
                                            break block16;
                                        }
                                        if ((n9 = n2 - 2) < 0 || n9 >= (arra = f2.a).length) break block17;
                                        a4 = arra[n9];
                                        if (s2 != a4.a) break block18;
                                        n8 = 2;
                                        break block16;
                                    }
                                    if (s2 == a4.b) break block16;
                                }
                                n8 = 0;
                            }
                            if (n8 <= 0) break block19;
                            n5 = n7 + (n8 + 50);
                            break block20;
                        }
                        e e2 = this.e;
                        j j5 = this.a;
                        if (e2 == null) break block21;
                        int n19 = g2.a;
                        int n20 = j5.a[n19];
                        int[] arrn = e2.c[n20];
                        int n21 = g2.b;
                        int n22 = arrn[n21];
                        if (n22 < 0) {
                            int n23 = e2.a[n20][n21];
                            int n24 = n23 + e2.b[n20][n21];
                            int n25 = 0;
                            if (n24 > 0) {
                                n25 = n23 * 49 / n24;
                            }
                            e2.c[n20][g2.b] = n25;
                            n22 = n25;
                        }
                        n5 = n7 + n22;
                    }
                    g2.d = n5;
                    ++n3;
                    continue;
                }
                throw null;
            }
            throw null;
        }
    }

    public final void b() {
        long l2 = System.currentTimeMillis();
        if (this.D != null) {
            int n2;
            int n3 = (int)(l2 - this.l);
            if (n3 > 0) {
                double d2 = this.z;
                double d3 = n3;
                Double.isNaN((double)d3);
                double d4 = d3 / 1000.0;
                Double.isNaN((double)d2);
                n2 = (int)(d2 / d4);
            } else {
                n2 = 0;
            }
            a a2 = this.D;
            long l3 = this.z;
            c.c.b.h.c c2 = ((c.b)a2).a;
            Object[] arrobject = new Object[]{l3, n2, n3};
            c2.a("info nodes %d nps %d time %d", arrobject);
        }
        this.A = l2;
    }

    public final boolean b(g g2) {
        int[] arrn = b.d.n;
        j j2 = this.a;
        int[] arrn2 = j2.a;
        int n2 = g2.a;
        int n3 = arrn[arrn2[n2]];
        if (arrn[arrn2[g2.b]] >= n3) {
            return false;
        }
        int n5 = this.a(g2);
        boolean bl = false;
        if (n5 < 0) {
            bl = true;
        }
        return bl;
    }

    public static interface a {
    }

    public static final class b.k$b {
        public g a;
        public long b;

        public b.k$b(g g2, int n2) {
            this.a = g2;
            this.b = n2;
        }

        public static final class a
        implements Comparator<b.k$b> {
            /*
             * Enabled aggressive block sorting
             */
            public int compare(Object object, Object object2) {
                b.k$b b2 = (b.k$b)object;
                b.k$b b3 = (b.k$b)object2;
                if (b2 == null && b3 == null) {
                    return 0;
                }
                if (b2 == null) {
                    return 1;
                }
                if (b3 == null) {
                    return -1;
                }
                long l2 = b3.b - b2.b;
                if (l2 < 0L) {
                    return -1;
                }
                if (l2 <= 0L) return 0;
                return 1;
            }
        }

        public static final class b
        implements Comparator<b.k$b> {
            public int compare(Object object, Object object2) {
                b.k$b b2 = (b.k$b)object;
                b.k$b b3 = (b.k$b)object2;
                if (b2 == null && b3 == null) {
                    return 0;
                }
                if (b2 == null) {
                    return 1;
                }
                if (b3 == null) {
                    return -1;
                }
                return b3.a.d - b2.a.d;
            }
        }

    }

    public static final class c {
        public o a = new o();
        public g b = new g(0, 0, 0);
        public boolean c = true;
        public g d = new g(0, 0, 0);
        public g e;
        public int f;
        public long g;
    }

    public static final class d
    extends Exception {
    }

}

