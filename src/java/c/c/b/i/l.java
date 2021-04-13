/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package c.c.b.i;

import c.c.b.i.a;
import c.c.b.i.f;
import c.c.b.i.g;
import c.c.b.i.j;
import c.c.b.i.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class l {
    public static String[] a;

    /*
     * Exception decompiling
     */
    public static final int a(boolean var0, char var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous
        // org.benf.cfr.reader.b.a.a.b.as.a(SwitchReplacer.java:478)
        // org.benf.cfr.reader.b.a.a.b.as.a(SwitchReplacer.java:61)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:372)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public static final f a(j j10, String string) {
        return l.a(j10, string, null);
    }

    public static final f a(j j10, String string, ArrayList<f> arrayList) {
        int n10;
        int n11;
        int n12;
        boolean bl;
        int n13;
        int n14;
        int n15;
        block29 : {
            int n16;
            int n17;
            block30 : {
                boolean bl2;
                block27 : {
                    block28 : {
                        boolean bl3;
                        if (string.equals((Object)"--")) {
                            return new f(0, 0, 0);
                        }
                        String string2 = string.replaceAll("=", "").replaceAll("\\+", "").replaceAll("#", "");
                        bl2 = j10.b;
                        if (string2.equals((Object)"O-O") || string2.equals((Object)"0-0") || string2.equals((Object)"o-o")) break block27;
                        if (string2.equals((Object)"O-O-O") || string2.equals((Object)"0-0-0") || string2.equals((Object)"o-o-o")) break block28;
                        boolean bl4 = false;
                        bl = false;
                        n14 = -1;
                        n10 = -1;
                        n12 = -1;
                        int n18 = -1;
                        int n19 = -1;
                        int n20 = -1;
                        for (int i10 = 0; i10 < string2.length(); ++i10) {
                            int n21;
                            int n22;
                            int n23;
                            char c10 = string2.charAt(i10);
                            if (i10 == 0 && (n22 = l.a(bl2, c10)) >= 0) {
                                n19 = n22;
                                continue;
                            }
                            int n24 = c10 - 97;
                            if (n24 >= 0 && n24 < 8) {
                                if (!bl4 && n14 < 0) {
                                    n14 = n24;
                                } else {
                                    n10 = n24;
                                }
                            }
                            if ((n23 = c10 - 49) >= 0 && n23 < 8) {
                                if (!bl4 && n12 < 0) {
                                    n12 = n23;
                                } else {
                                    n18 = n23;
                                }
                            }
                            if (c10 == 'x' || c10 == '-') {
                                bl4 = true;
                                if (c10 == 'x') {
                                    bl = true;
                                }
                            }
                            if (i10 != string2.length() - 1 || (n21 = l.a(bl2, c10)) < 0) continue;
                            n20 = n21;
                        }
                        if (n14 >= 0 && n10 < 0) {
                            n10 = n14;
                            n14 = -1;
                        }
                        if (n12 >= 0 && n18 < 0) {
                            n13 = -1;
                        } else {
                            n13 = n12;
                            n12 = n18;
                        }
                        if (n19 < 0 && !(bl3 = n14 >= 0 && n13 >= 0 && n10 >= 0 && n12 >= 0)) {
                            int n25 = bl2 ? 6 : 12;
                            n19 = n25;
                        }
                        if (n20 < 0) {
                            n20 = 0;
                        }
                        n11 = n19;
                        n15 = n20;
                        break block29;
                    }
                    int n26 = bl2 ? 1 : 7;
                    int n27 = bl2 ? 0 : 7;
                    n16 = n26;
                    n12 = n13 = n27;
                    n17 = 2;
                    break block30;
                }
                int n28 = bl2 ? 1 : 7;
                int n29 = bl2 ? 0 : 7;
                n16 = n28;
                n12 = n13 = n29;
                n17 = 6;
            }
            n14 = 4;
            n10 = n17;
            n11 = n16;
            n15 = 0;
            bl = false;
        }
        ArrayList<f> arrayList2 = arrayList == null ? g.e.a(j10) : arrayList;
        ArrayList arrayList3 = new ArrayList(2);
        for (int i11 = 0; i11 < arrayList2.size(); ++i11) {
            f f10 = (f)arrayList2.get(i11);
            int n30 = f10.a;
            int n31 = j10.a[n30];
            boolean bl5 = n11 < 0 || n11 == n31;
            if (n14 >= 0 && n14 != (7 & f10.a)) {
                bl5 = false;
            }
            if (n13 >= 0 && n13 != f10.a >> 3) {
                bl5 = false;
            }
            if (n10 >= 0 && n10 != (7 & f10.b)) {
                bl5 = false;
            }
            if (n12 >= 0 && n12 != f10.b >> 3) {
                bl5 = false;
            }
            if (n15 >= 0 && n15 != f10.c) {
                bl5 = false;
            }
            if (!bl5) continue;
            arrayList3.add((Object)f10);
        }
        int n32 = arrayList3.size();
        if (n32 == 0) {
            return null;
        }
        if (n32 == 1) {
            return (f)arrayList3.get(0);
        }
        if (!bl) {
            return null;
        }
        f f11 = null;
        for (int i12 = 0; i12 < arrayList3.size(); ++i12) {
            f f12 = (f)arrayList3.get(i12);
            int n33 = f12.b;
            if (j10.a[n33] == 0) continue;
            if (f11 == null) {
                f11 = f12;
                continue;
            }
            return null;
        }
        return f11;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final f a(String string) {
        int n10;
        int n11;
        int n12;
        int n13 = string.length();
        if (n13 < (n12 = 4)) return null;
        int n14 = string.length();
        if (n14 > (n11 = 5)) {
            return null;
        }
        int n15 = 2;
        int n16 = l.b(string.substring(0, n15));
        int n17 = l.b(string.substring(n15, n12));
        if (n16 < 0) return null;
        if (n17 < 0) {
            return null;
        }
        int n18 = string.length();
        boolean bl = true;
        if (n18 == n11) {
            n10 = string.charAt(n12);
            if (j.g(n17) != 7) {
                if (n17 >> 3 != 0) return null;
                bl = false;
            }
        } else {
            n10 = 32;
        }
        int n19 = 0;
        if (n10 == 32) return new f(n16, n17, n19);
        if (n10 != 98) {
            if (n10 != 110) {
                if (n10 != 113) {
                    if (n10 != 114) {
                        return null;
                    }
                    n19 = bl ? 3 : 9;
                    return new f(n16, n17, n19);
                } else {
                    if (!bl) {
                        n15 = 8;
                    }
                    n19 = n15;
                }
                return new f(n16, n17, n19);
            } else {
                if (!bl) {
                    n11 = 11;
                }
                n19 = n11;
            }
            return new f(n16, n17, n19);
        } else {
            if (!bl) {
                n12 = 10;
            }
            n19 = n12;
        }
        return new f(n16, n17, n19);
    }

    public static final String a(int n10) {
        switch (n10) {
            default: {
                return "";
            }
            case 5: 
            case 11: {
                return "N";
            }
            case 4: 
            case 10: {
                return "B";
            }
            case 3: 
            case 9: {
                return "R";
            }
            case 2: 
            case 8: {
                return "Q";
            }
            case 1: 
            case 7: 
        }
        return "K";
    }

    public static final String a(f f10) {
        StringBuilder stringBuilder;
        String string;
        StringBuilder stringBuilder2 = c.a.b.a.a.a(l.c(f10.a));
        stringBuilder2.append(l.c(f10.b));
        String string2 = stringBuilder2.toString();
        switch (f10.c) {
            default: {
                return string2;
            }
            case 5: 
            case 11: {
                stringBuilder = c.a.b.a.a.a(string2);
                string = "n";
                break;
            }
            case 4: 
            case 10: {
                stringBuilder = c.a.b.a.a.a(string2);
                string = "b";
                break;
            }
            case 3: 
            case 9: {
                stringBuilder = c.a.b.a.a.a(string2);
                string = "r";
                break;
            }
            case 2: 
            case 8: {
                stringBuilder = c.a.b.a.a.a(string2);
                string = "q";
            }
        }
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public static final String a(j j10, f f10, boolean bl, boolean bl2) {
        return l.a(j10, f10, bl, bl2, null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static final String a(j var0, f var1_1, boolean var2_2, boolean var3_3, List<f> var4_4) {
        block27 : {
            block29 : {
                block21 : {
                    block32 : {
                        block31 : {
                            block30 : {
                                block28 : {
                                    block24 : {
                                        block25 : {
                                            block26 : {
                                                block23 : {
                                                    block22 : {
                                                        if (var1_1 == null) return "--";
                                                        var5_5 = 0;
                                                        if (var1_1.equals(new f(0, 0, 0))) {
                                                            return "--";
                                                        }
                                                        var6_6 = new StringBuilder();
                                                        var7_7 = j.b(4, 0);
                                                        var8_8 = var1_1.a;
                                                        var9_9 = 6;
                                                        if (var8_8 != var7_7 || var0.a[var7_7] != 1) break block22;
                                                        var52_10 = var1_1.b;
                                                        if (var52_10 == var9_9) break block23;
                                                        if (var52_10 != 2) break block24;
                                                        break block25;
                                                    }
                                                    if (var1_1.a != 60 || var0.a[60] != 7) break block24;
                                                    var49_11 = var1_1.b;
                                                    if (var49_11 != 62) break block26;
                                                }
                                                var6_6.append("O-O");
                                                break block24;
                                            }
                                            if (var49_11 != 58) break block24;
                                        }
                                        var6_6.append("O-O-O");
                                    }
                                    if (var6_6.length() != 0) break block27;
                                    var14_12 = l.a == null ? false : var3_3;
                                    var15_13 = var1_1.a;
                                    var16_14 = var0.a[var15_13];
                                    var17_15 = var14_12 != false ? l.b(var16_14) : l.a(var16_14);
                                    var6_6.append(var17_15);
                                    var19_16 = var1_1.a;
                                    var20_17 = var19_16 & 7;
                                    var21_18 = var19_16 >> 3;
                                    var22_19 = var1_1.b;
                                    var23_20 = var22_19 & 7;
                                    var24_21 = var22_19 >> 3;
                                    if (!var2_2) break block28;
                                    var6_6.append((char)(var20_17 + 97));
                                    var6_6.append((char)(var21_18 + 49));
                                    var47_22 = l.a(var0, var1_1) != false ? 'x' : '-';
                                    var6_6.append(var47_22);
                                    break block29;
                                }
                                if (!var0.b) {
                                    var9_9 = 12;
                                }
                                if (var16_14 != var9_9) break block30;
                                if (!l.a(var0, var1_1)) break block21;
                                break block31;
                            }
                            if (var4_4 == null) {
                                var25_24 = g.e.a(var0);
                            } else {
                                var25_25 = var4_4;
                            }
                            var26_29 = var25_26.size();
                            var27_30 = 0;
                            var28_31 = 0;
                            var29_32 = 0;
                            break block32;
                        }
                        do {
                            var31_23 = (char)(var20_17 + 97);
lbl63: // 2 sources:
                            do {
                                var6_6.append(var31_23);
                                break block21;
                                break;
                            } while (true);
                            break;
                        } while (true);
                    }
                    while (var5_5 < var26_29) {
                        var39_33 = (f)var25_27.get(var5_5);
                        var40_34 = var25_27;
                        var41_35 = var39_33.a;
                        var42_36 = var26_29;
                        if (var0.a[var41_35] == var16_14) {
                            var44_38 = var39_33.b;
                            var43_37 = var16_14;
                            if (var44_38 == var1_1.b) {
                                ++var28_31;
                                if ((var41_35 & 7) == var20_17) {
                                    ++var29_32;
                                }
                                if (var39_33.a >> 3 == var21_18) {
                                    ++var27_30;
                                }
                            }
                        } else {
                            var43_37 = var16_14;
                        }
                        ++var5_5;
                        var25_28 = var40_34;
                        var26_29 = var42_36;
                        var16_14 = var43_37;
                    }
                    if (var28_31 >= 2) {
                        if (var29_32 < 2) ** continue;
                        if (var27_30 >= 2) {
                            var6_6.append((char)(var20_17 + 97));
                        }
                        var31_23 = (char)(var21_18 + 49);
                        ** continue;
                    }
                }
                if (l.a(var0, var1_1)) {
                    var6_6.append('x');
                }
            }
            var6_6.append((char)(var23_20 + 97));
            var6_6.append((char)(var24_21 + 49));
            var35_39 = var1_1.c;
            if (var35_39 != 0) {
                var36_40 = var14_12 != false ? l.b(var35_39) : l.a(var35_39);
                var6_6.append(var36_40);
            }
        }
        var10_41 = new o();
        var0.a(var1_1, var10_41);
        if (g.b(var0)) {
            var12_42 = g.e.a(var0).size() == 0 ? '#' : '+';
            var6_6.append(var12_42);
        }
        var0.b(var1_1, var10_41);
        return var6_6.toString();
    }

    public static final void a(j j10) {
        int n10 = j10.d;
        if (n10 >= 0) {
            boolean bl;
            block3 : {
                int n11;
                f f10;
                int n12;
                int n13;
                Iterator iterator = g.e.a(j10).iterator();
                do {
                    boolean bl2 = iterator.hasNext();
                    bl = false;
                    if (!bl2) break block3;
                    f10 = (f)iterator.next();
                } while (f10.b != n10 || (n11 = j10.a[n13 = f10.a]) != (n12 = j10.b ? 6 : 12));
                bl = true;
            }
            if (!bl) {
                j10.d(-1);
            }
        }
    }

    public static final void a(j j10, int n10, int n11, int n12) {
        if (n11 >= 0) {
            if (n10 <= 7) {
                if (n12 != 6 && n12 != 12 || n11 != 0 && n11 != 7) {
                    j10.a(j.b(n10, n11), n12);
                    return;
                }
                throw new a(2131427361);
            }
            throw new a(2131427363);
        }
        throw new a(2131427364);
    }

    public static final boolean a(j j10, f f10) {
        int[] arrn = j10.a;
        int n10 = f10.b;
        if (arrn[n10] == 0) {
            int n11 = arrn[f10.a];
            int n12 = j10.b ? 6 : 12;
            return n11 == n12 && f10.b == j10.d;
        }
        return true;
    }

    public static final int b(String string) {
        int n10 = -97 + string.charAt(0);
        int n11 = -49 + string.charAt(1);
        if (n10 >= 0 && n10 <= 7 && n11 >= 0 && n11 <= 7) {
            return j.b(n10, n11);
        }
        return -1;
    }

    public static final String b(int n10) {
        switch (n10) {
            default: {
                return "";
            }
            case 5: 
            case 11: {
                return a[1];
            }
            case 4: 
            case 10: {
                return a[2];
            }
            case 3: 
            case 9: {
                return a[3];
            }
            case 2: 
            case 8: {
                return a[4];
            }
            case 1: 
            case 7: 
        }
        return a[5];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static final String b(j var0) {
        var1_1 = new StringBuilder();
        var2_2 = 7;
        do {
            if (var2_2 >= 0) {
                var25_5 = 0;
            } else {
                var3_8 = var0.b != false ? " w " : " b ";
                var1_1.append(var3_8);
                var5_9 = var0.c();
                var6_10 = true;
                var7_11 = false;
                if (var5_9) {
                    var1_1.append('K');
                    var7_11 = true;
                }
                if (var0.a()) {
                    var1_1.append('Q');
                    var7_11 = true;
                }
                if (var0.d()) {
                    var1_1.append('k');
                    var7_11 = true;
                }
                if (var0.b()) {
                    var1_1.append('q');
                } else {
                    var6_10 = var7_11;
                }
                var8_12 = '-';
                if (!var6_10) {
                    var1_1.append(var8_12);
                }
                var1_1.append(' ');
                var10_13 = var0.d;
                if (var10_13 >= 0) {
                    var16_14 = var10_13 & 7;
                    var17_15 = var10_13 >> 3;
                    var1_1.append((char)(var16_14 + 97));
                    var8_12 = (char)(var17_15 + 49);
                }
                var1_1.append(var8_12);
                var1_1.append(' ');
                var1_1.append(var0.e);
                var1_1.append(' ');
                var1_1.append(var0.f);
                return var1_1.toString();
            }
            block15 : for (var24_4 = 0; var24_4 < 8; ++var24_4) {
                var28_6 = j.b(var24_4, var2_2);
                var29_7 = var0.a[var28_6];
                if (var29_7 == 0) {
                    ++var25_5;
                    continue;
                }
                if (var25_5 > 0) {
                    var1_1.append(var25_5);
                    var25_5 = 0;
                }
                switch (var29_7) {
                    default: {
                        throw new RuntimeException();
                    }
                    case 12: {
                        var32_3 = 'p';
                        ** GOTO lbl82
                    }
                    case 11: {
                        var32_3 = 'n';
                        ** GOTO lbl82
                    }
                    case 10: {
                        var32_3 = 'b';
                        ** GOTO lbl82
                    }
                    case 9: {
                        var32_3 = 'r';
                        ** GOTO lbl82
                    }
                    case 8: {
                        var1_1.append('q');
                        continue block15;
                    }
                    case 7: {
                        var1_1.append('k');
                        continue block15;
                    }
                    case 6: {
                        var32_3 = 'P';
                        ** GOTO lbl82
                    }
                    case 5: {
                        var32_3 = 'N';
                        ** GOTO lbl82
                    }
                    case 4: {
                        var32_3 = 'B';
                        ** GOTO lbl82
                    }
                    case 3: {
                        var32_3 = 'R';
lbl82: // 8 sources:
                        var1_1.append(var32_3);
                        continue block15;
                    }
                    case 2: {
                        var1_1.append('Q');
                        continue block15;
                    }
                    case 1: 
                }
                var1_1.append('K');
            }
            if (var25_5 > 0) {
                var1_1.append(var25_5);
            }
            if (var2_2 > 0) {
                var1_1.append('/');
            }
            --var2_2;
        } while (true);
    }

    public static final boolean b(j j10, f f10) {
        if (f10 == null) {
            return false;
        }
        ArrayList<f> arrayList = new g().a(j10);
        for (int i10 = 0; i10 < arrayList.size(); ++i10) {
            if (!f10.equals(arrayList.get(i10))) continue;
            return true;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    public static final j c(String var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public static final String c(int n10) {
        StringBuilder stringBuilder = new StringBuilder();
        int n11 = j.f(n10);
        int n12 = n10 >> 3;
        stringBuilder.append((char)(n11 + 97));
        stringBuilder.append((char)(n12 + 49));
        return stringBuilder.toString();
    }
}

