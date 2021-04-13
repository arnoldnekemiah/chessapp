/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Enum
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.TreeMap
 */
package c.c.b.h;

import android.content.Context;
import c.c.b.h.e;
import c.c.b.h.f;
import c.c.b.i.b;
import c.c.b.i.g;
import c.c.b.i.j;
import c.c.b.i.k;
import c.c.b.i.l;
import c.c.b.i.o;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class b {
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public c.c.b.h.d a = null;
    public final k b;
    public final c.c.b.g.c c;
    public c.c.b.b d = new c.c.b.b();
    public Map<String, String> e = new TreeMap();
    public boolean f = false;
    public int g = 1;
    public String h = "Computer";
    public a i = new a();
    public c j = null;
    public Thread k;
    public long l = 0L;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public int s = 0;
    public long t = 0L;
    public long u = 0L;
    public int v = 0;
    public ArrayList<String> w = new ArrayList();
    public String x = "";
    public int y = 0;
    public ArrayList<k.a> z = new ArrayList();

    public b(Context context, k k10) {
        this.b = k10;
        this.c = c.c.b.g.c.e;
    }

    public static final String a(j j10, long[] arrl, int n10, c.c.b.i.f f10) {
        String string;
        block6 : {
            o o10;
            block9 : {
                String string2;
                String string3;
                StringBuilder stringBuilder;
                block8 : {
                    int n11;
                    block7 : {
                        boolean bl = j10.e >= 100;
                        string = "";
                        if (bl) {
                            return "draw 50";
                        }
                        if (b.a(j10, arrl, n10, n10)) {
                            return "draw rep";
                        }
                        if (f10 == null) break block6;
                        string2 = l.a(j10, f10, false, false);
                        n11 = n10 + 1;
                        arrl[n10] = j10.g;
                        o10 = new o();
                        j10.a(f10, o10);
                        int n12 = j10.e;
                        boolean bl2 = false;
                        if (n12 >= 100) {
                            bl2 = true;
                        }
                        if (!bl2) break block7;
                        stringBuilder = new StringBuilder();
                        string3 = "draw 50 ";
                        break block8;
                    }
                    if (!b.a(j10, arrl, n11, n11)) break block9;
                    stringBuilder = new StringBuilder();
                    string3 = "draw rep ";
                }
                string = c.a.b.a.a.a(stringBuilder, string3, string2);
            }
            j10.b(f10, o10);
        }
        return string;
    }

    public static final void a(boolean bl) {
        if (bl) {
            return;
        }
        throw new RuntimeException();
    }

    public static final boolean a(j j10, long[] arrl, int n10, int n11) {
        int n12 = 0;
        for (int i10 = n10 - 4; i10 >= 0; i10 -= 2) {
            if (j10.g != arrl[i10]) continue;
            ++n12;
            if (i10 < n11) continue;
            ++n12;
            break;
        }
        boolean bl = false;
        if (n12 >= 2) {
            bl = true;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(int n10) {
        b b10 = this;
        synchronized (b10) {
            if (this.j != null && this.j.s != null && this.j.a == n10) {
                c c10 = this.j;
                if (c10.s != null) {
                    o o10 = new o();
                    c10.e.a(c10.s, o10);
                    c10.s = null;
                }
                if (this.i.b != b.e) {
                    this.j.b = System.currentTimeMillis();
                }
                if (this.i.b == b.e) {
                    c.c.b.h.d d10 = this.a;
                    c.c.b.h.g.b b11 = (c.c.b.h.g.b)d10;
                    b11.b("ponderhit");
                    this.i.b = b.d;
                    this.C = true;
                    this.g();
                }
                return;
            }
            return;
        }
    }

    public final void a(int n10, String string) {
        b b10 = this;
        synchronized (b10) {
            this.a(string);
            this.i();
            c c10 = new c();
            c10.a = n10;
            c10.g = false;
            c10.h = false;
            c10.i = false;
            c10.o = string;
            c10.t = null;
            c10.u = 0;
            this.j = c10;
            this.f();
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(c var1_1) {
        var29_2 = this;
        // MONITORENTER : var29_2
        this.a(var1_1.o);
        this.i();
        if (var1_1.s != null) {
            var1_1.d.add((Object)var1_1.s);
        }
        var4_3 = new long[1 + var1_1.d.size()];
        var5_4 = new j(var1_1.c);
        var6_5 = new o();
        var8_7 = 0;
        for (var7_6 = 0; var7_6 < var1_1.d.size(); ++var7_6) {
            var9_8 = var8_7 + 1;
            var4_3[var8_7] = var5_4.g;
            var5_4.a((c.c.b.i.f)var1_1.d.get(var7_6), var6_5);
            var8_7 = var9_8;
        }
        if (var1_1.s != null) ** GOTO lbl53
        var11_9 = this.c.a(var1_1.e);
        if (var11_9 == null || b.a(var1_1.e, var4_3, var8_7, var11_9) != "") ** GOTO lbl33
        var23_10 = this.b;
        var24_11 = var1_1.a;
        var25_12 = l.a(var1_1.e, var11_9, false, false);
        var26_13 = var1_1.i;
        var27_14 = var23_10;
        var27_14.a(var24_11, var25_12, null, var26_13);
        // MONITOREXIT : var29_2
        return;
lbl33: // 1 sources:
        var12_15 = new g().a(var1_1.e);
        if (var12_15.size() != 0) ** GOTO lbl43
        var19_16 = this.b;
        var20_17 = var1_1.a;
        var21_18 = var1_1.i;
        var22_19 = var19_16;
        var22_19.a(var20_17, "", null, var21_18);
        // MONITOREXIT : var29_2
        return;
lbl43: // 1 sources:
        if (var12_15.size() != 1 || b.a(var1_1.e, var4_3, var8_7, var13_20 = (c.c.b.i.f)var12_15.get(0)) != "") ** GOTO lbl53
        var14_21 = this.b;
        var15_22 = var1_1.a;
        var16_23 = l.a(var13_20);
        var17_24 = var1_1.i;
        var18_25 = var14_21;
        var18_25.a(var15_22, var16_23, null, var17_24);
        // MONITOREXIT : var29_2
        return;
lbl53: // 2 sources:
        var1_1.t = var4_3;
        var1_1.u = var8_7;
        this.j = var1_1;
        this.f();
        // MONITOREXIT : var29_2
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public final void a(c.c.b.h.d var1_1, String var2_2) {
        var15_3 = this;
        synchronized (var15_3) {
            block17 : {
                block16 : {
                    var4_4 = Thread.currentThread().isInterrupted();
                    if (!var4_4) break block16;
                    return;
                }
                if (var2_2 != null) ** GOTO lbl12
                this.h();
                return;
lbl12: // 1 sources:
                var5_5 = var2_2.length();
                if (var5_5 != 0) break block17;
                return;
            }
            var6_6 = this.i.b.ordinal();
            if (var6_6 == 0) ** GOTO lbl53
            if (var6_6 == 1) ** GOTO lbl49
            if (var6_6 == 3 || var6_6 == 4) ** GOTO lbl-1000
            ** if (var6_6 != 5 || !this.b((String)var2_2)[0].equals((Object)"bestmove")) goto lbl30
lbl-1000: // 1 sources:
            {
                var14_7 = (c.c.b.h.g.b)var1_1;
                var14_7.b("isready");
                var8_8 = this.i;
                var9_9 = b.b;
lbl27: // 2 sources:
                do {
                    var8_8.b = var9_9;
                    ** GOTO lbl64
                    break;
                } while (true);
            }
lbl30: // 1 sources:
            ** GOTO lbl64
lbl-1000: // 1 sources:
            {
                var10_10 = this.b(var2_2);
                if (var10_10[0].equals((Object)"info")) {
                    this.a(var10_10);
                } else if (var10_10[0].equals((Object)"bestmove")) {
                    var11_11 = var10_10[1];
                    var12_12 = "";
                    if (var10_10.length >= 4 && var10_10[2].equals((Object)"ponder")) {
                        var12_12 = var10_10[3];
                    }
                    var13_13 = l.a(var12_12);
                    if (this.i.b == b.d) {
                        this.a(var11_11, var13_13);
                    }
                    this.i.b = b.c;
                    this.j = null;
lbl45: // 2 sources:
                    do {
                        this.e();
                        ** GOTO lbl64
                        break;
                    } while (true);
                }
                ** GOTO lbl64
lbl49: // 1 sources:
                if ("readyok".equals((Object)var2_2)) {
                    this.i.b = b.c;
                    ** continue;
                }
                ** GOTO lbl64
lbl53: // 1 sources:
                if (!this.b(var1_1, var2_2)) ** GOTO lbl64
                this.e.clear();
                if ((e)var1_1 == null) ** GOTO lbl63
            }
            var7_14 = (c.c.b.h.g.b)var1_1;
            try {
                var7_14.b("ucinewgame");
                var7_14.b("isready");
                var8_8 = this.i;
                var9_9 = b.b;
                ** continue;
lbl63: // 1 sources:
                throw null;
lbl64: // 7 sources:
                return;
            }
            catch (Throwable var3_15) {
                throw var3_15;
            }
        }
    }

    public final void a(String string) {
        boolean bl = true ^ string.equals((Object)this.i.a);
        if (!bl && this.a != null) {
            bl = false;
        }
        if (bl) {
            this.h();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a(String var1_1, c.c.b.i.f var2_2) {
        var3_3 = this.j;
        if (this.o <= 0 && (var12_4 = b.a(var3_3.e, var3_3.t, var3_3.u, l.a(var1_1))) != "") {
            var1_1 = var12_4;
            var4_5 = false;
        } else {
            var4_5 = true;
        }
        if (var3_3.f && !this.p && this.o <= -300) {
            var1_1 = "draw accept";
            var4_5 = false;
        }
        if (!var4_5) ** GOTO lbl-1000
        var9_6 = l.a(var3_3.e, var1_1);
        if (var9_6 == null || !l.b(var3_3.e, var9_6)) {
            var4_5 = false;
        }
        if (!var4_5) ** GOTO lbl-1000
        var10_7 = new j(var3_3.e);
        var10_7.a(var9_6, new o());
        if (!l.b(var10_7, var2_2)) {
            var5_8 = false;
        } else lbl-1000: // 3 sources:
        {
            var5_8 = var4_5;
        }
        if (!var5_8) {
            var2_2 = null;
        }
        var6_9 = this.b;
        var7_10 = var3_3.a;
        var8_11 = var3_3.i;
        (var6_9).a(var7_10, var1_1, var2_2, var8_11);
    }

    /*
     * Exception decompiling
     */
    public final void a(String[] var1) {
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a() {
        b b10 = this;
        synchronized (b10) {
            boolean bl = this.e.isEmpty();
            if (bl) {
                return false;
            }
            c.c.b.h.d d10 = this.a;
            boolean bl2 = false;
            if (d10 != null) {
                Map<String, String> map = this.e;
                e e10 = (e)d10;
                for (Map.Entry entry : map.entrySet()) {
                    String string = ((String)entry.getKey()).toLowerCase(Locale.US);
                    String string2 = (String)entry.getValue();
                    if (!e10.a(string)) continue;
                    bl2 |= e10.a(string, string2);
                }
            }
            this.e.clear();
            return bl2;
        }
    }

    public final String b() {
        b b10 = this;
        synchronized (b10) {
            String string = this.h;
            return string;
        }
    }

    public final boolean b(int n10) {
        b b10 = this;
        synchronized (b10) {
            int n11;
            boolean bl = this.j != null && (n11 = this.j.a) == n10;
            return bl;
        }
    }

    /*
     * Exception decompiling
     */
    public final boolean b(c.c.b.h.d var1, String var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl504.1 : ACONST_NULL : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
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

    public final String[] b(String string) {
        return string.trim().split("\\s+");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int c() {
        b b10 = this;
        synchronized (b10) {
            if (!(this.A || this.B || this.C)) {
                if (!this.D) return 2000000000;
            }
            boolean bl = true;
            int n10 = 2000000000;
            if (!bl) return n10;
            long l10 = System.currentTimeMillis();
            return Math.max((int)1, (int)Math.min((int)1000, (int)((int)(1L + (100L + this.l - l10)))));
        }
    }

    public final d d() {
        b b10 = this;
        synchronized (b10) {
            block10 : {
                block9 : {
                    block8 : {
                        block7 : {
                            if (this.j != null) break block7;
                            d d10 = d.a;
                            return d10;
                        }
                        if (!this.j.h) break block8;
                        d d11 = d.d;
                        return d11;
                    }
                    if (this.j.g) break block9;
                    d d12 = d.a;
                    return d12;
                }
                if (this.j.s != null) break block10;
                d d13 = d.b;
                return d13;
            }
            d d14 = d.c;
            return d14;
        }
    }

    public final void e() {
        Thread thread;
        c c10 = this.j;
        if (c10 == null) {
            return;
        }
        if (this.a != null && this.i.a.equals((Object)c10.o)) {
            int n10;
            int n11;
            if (this.f) {
                ((c.c.b.h.g.b)this.a).b("ucinewgame");
                ((c.c.b.h.g.b)this.a).b("isready");
                this.i.b = b.b;
                this.f = false;
                return;
            }
            if (this.a()) {
                ((c.c.b.h.g.b)this.a).b("isready");
                this.i.b = b.b;
                return;
            }
            boolean bl = c10.g;
            boolean bl2 = c10.h;
            if (!bl && !bl2) {
                this.j = null;
                return;
            }
            this.i.c = this.j.a;
            if (bl) {
                boolean bl3;
                long l10 = System.currentTimeMillis();
                c c11 = this.j;
                int n12 = (int)(l10 - c11.b);
                boolean bl4 = c11.s != null;
                if (bl4 ^ (bl3 = c11.e.b)) {
                    c c12 = this.j;
                    c12.j = Math.max((int)1, (int)(c12.j - n12));
                } else {
                    c c13 = this.j;
                    c13.k = Math.max((int)1, (int)(c13.k - n12));
                }
            }
            this.o = 0;
            this.n = 0;
            this.m = 0;
            this.r = false;
            this.q = false;
            this.p = false;
            this.s = 0;
            this.u = 0L;
            this.t = 0L;
            this.v = 0;
            this.A = true;
            this.B = true;
            this.C = true;
            this.D = true;
            this.z.clear();
            this.x = "";
            this.y = 0;
            c.c.b.h.d d10 = this.a;
            int n13 = this.j.p;
            ((c.c.b.h.g.b)d10).a("strength", n13);
            int n14 = this.g;
            if (n14 > 1) {
                int n15 = Math.min((int)n14, (int)this.j.q);
                ((e)this.a).a("MultiPV", n15);
            }
            StringBuilder stringBuilder = c.a.b.a.a.a("position fen ");
            stringBuilder.append(l.b(c10.c));
            int n16 = c10.d.size();
            if (n16 > 0) {
                stringBuilder.append(" moves");
                for (int i10 = 0; i10 < n16; ++i10) {
                    stringBuilder.append(" ");
                    stringBuilder.append(l.a((c.c.b.i.f)c10.d.get(i10)));
                }
            }
            c.c.b.h.d d11 = this.a;
            boolean bl5 = c10.r;
            e e10 = (e)d11;
            String string = bl5 ? "true" : "false";
            e10.a("Ponder", string);
            ((e)this.a).a("UCI_AnalyseMode", "false");
            c.c.b.h.d d12 = this.a;
            String string2 = stringBuilder.toString();
            ((c.c.b.h.g.b)d12).b(string2);
            if (c10.j < 1) {
                c10.j = 1;
            }
            if (c10.k < 1) {
                c10.k = 1;
            }
            StringBuilder stringBuilder2 = new StringBuilder(96);
            Locale locale = Locale.US;
            Object[] arrobject = new Object[]{c10.j, c10.k};
            stringBuilder2.append(String.format((Locale)locale, (String)"go wtime %d btime %d", (Object[])arrobject));
            int n17 = c10.l;
            if (n17 > 0) {
                Locale locale2 = Locale.US;
                Object[] arrobject2 = new Object[]{n17};
                stringBuilder2.append(String.format((Locale)locale2, (String)" winc %d", (Object[])arrobject2));
            }
            if ((n10 = c10.m) > 0) {
                Locale locale3 = Locale.US;
                Object[] arrobject3 = new Object[]{n10};
                stringBuilder2.append(String.format((Locale)locale3, (String)" binc %d", (Object[])arrobject3));
            }
            if ((n11 = c10.n) > 0) {
                Locale locale4 = Locale.US;
                Object[] arrobject4 = new Object[]{n11};
                stringBuilder2.append(String.format((Locale)locale4, (String)" movestogo %d", (Object[])arrobject4));
            }
            if (c10.s != null) {
                stringBuilder2.append(" ponder");
            }
            if (c10.v != null) {
                stringBuilder2.append(" searchmoves");
                for (c.c.b.i.f f10 : c10.v) {
                    stringBuilder2.append(' ');
                    stringBuilder2.append(l.a(f10));
                }
            }
            c.c.b.h.d d13 = this.a;
            String string3 = stringBuilder2.toString();
            ((c.c.b.h.g.b)d13).b(string3);
            a a10 = this.i;
            b b10 = c10.s == null ? b.d : b.e;
            a10.b = b10;
            return;
        }
        this.h();
        boolean bl = this.a == null;
        b.a(bl);
        boolean bl6 = this.k == null;
        b.a(bl6);
        boolean bl7 = this.i.b == b.g;
        b.a(bl7);
        c c14 = this.j;
        boolean bl8 = false;
        if (c14 != null) {
            bl8 = true;
        }
        b.a(bl8);
        this.h = "Computer";
        c.c.b.h.g.b b11 = new c.c.b.h.g.b();
        this.a = b11;
        if (!b11.a) {
            Thread thread2;
            b11.i = thread2 = new Thread((Runnable)new c.c.b.h.g.a(b11));
            thread2.setPriority(3);
            b11.i.start();
            b11.a = true;
        }
        this.k = thread = new Thread((Runnable)new c.c.b.h.a(this, this.a));
        thread.start();
        f f11 = ((e)this.a).b;
        f11.a.clear();
        f11.b.clear();
        ((c.c.b.h.g.b)this.a).b("uci");
        this.g = 1;
        a a11 = this.i;
        a11.a = this.j.o;
        a11.b = b.a;
    }

    public final void f() {
        a a10 = this.i;
        if (a10.b == b.g) {
            a10.a = "";
            a10.b = b.c;
        }
        if (this.i.b == b.c) {
            this.e();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g() {
        b b10 = this;
        synchronized (b10) {
            long l10;
            boolean bl = Thread.currentThread().isInterrupted();
            if (bl) {
                return;
            }
            long l11 = System.currentTimeMillis();
            if (l11 < (l10 = this.l) + 100L) {
                return;
            }
            this.l = l11;
            if (this.j != null && this.j.e != null) {
                int n10 = this.i.c;
                if (this.A) {
                    k k10 = this.b;
                    int n11 = this.m;
                    b.c c10 = k10;
                    c10.a = n11;
                    c10.b(n10);
                    this.A = false;
                }
                if (this.B) {
                    c.c.b.i.f f10 = l.a(this.x);
                    j j10 = this.j.e;
                    if (this.j.s != null && f10 != null) {
                        j j11 = new j(j10);
                        o o10 = new o();
                        j11.a(this.j.s, o10);
                        j10 = j11;
                    }
                    k k11 = this.b;
                    int n12 = this.y;
                    b.c c11 = k11;
                    c11.a(n10, j10, f10, n12);
                    this.B = false;
                }
                if (this.C) {
                    k k12 = this.b;
                    j j12 = this.j.e;
                    ArrayList<k.a> arrayList = this.z;
                    c.c.b.i.f f11 = this.j.s;
                    b.c c12 = k12;
                    c12.a(n10, j12, arrayList, f11);
                    this.C = false;
                }
                if (this.D) {
                    k k13 = this.b;
                    long l12 = this.t;
                    int n13 = this.v;
                    long l13 = this.u;
                    int n14 = this.s;
                    b.c c13 = k13;
                    c13.e = l12;
                    c13.f = n13;
                    c13.g = l13;
                    c13.h = n14;
                    c13.b(n10);
                    this.D = false;
                }
                return;
            }
            return;
        }
    }

    public final void h() {
        b b10 = this;
        synchronized (b10) {
            if (this.a != null) {
                this.k.interrupt();
                this.k = null;
                c.c.b.h.g.b b11 = (c.c.b.h.g.b)this.a;
                if (b11.a) {
                    b11.b("quit");
                    b11.a = false;
                }
                b11.g.a();
                this.a = null;
            }
            this.i.b = b.g;
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean i() {
        b b10 = this;
        synchronized (b10) {
            block5 : {
                this.j = null;
                int n10 = this.i.b.ordinal();
                if (n10 == 3 || n10 == 4) break block5;
                return false;
            }
            c.c.b.h.d d10 = this.a;
            c.c.b.h.g.b b11 = (c.c.b.h.g.b)d10;
            b11.b("stop");
            this.i.b = b.f;
            return true;
        }
    }

    public final void j() {
        b b10 = this;
        synchronized (b10) {
            this.f = true;
            return;
        }
    }

    public static final class a {
        public String a = "";
        public b b = b.g;
        public int c = -1;
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a;
        public static final /* enum */ b b;
        public static final /* enum */ b c;
        public static final /* enum */ b d;
        public static final /* enum */ b e;
        public static final /* enum */ b f;
        public static final /* enum */ b g;
        public static final /* synthetic */ b[] h;

        public static {
            b b10;
            a = new b();
            b = new b();
            c = new b();
            d = new b();
            e = new b();
            f = new b();
            g = b10 = new b();
            b[] arrb = new b[]{a, b, c, d, e, f, b10};
            h = arrb;
        }

        public static b valueOf(String string) {
            return (b)Enum.valueOf(b.class, (String)string);
        }

        public static b[] values() {
            return (b[])h.clone();
        }
    }

    public static final class c {
        public int a;
        public long b;
        public j c;
        public ArrayList<c.c.b.i.f> d;
        public j e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public String o;
        public int p;
        public int q;
        public boolean r;
        public c.c.b.i.f s;
        public long[] t;
        public int u;
        public ArrayList<c.c.b.i.f> v;

        public static c a(int n10, long l10, j j10, ArrayList<c.c.b.i.f> arrayList, j j11, boolean bl, int n11, int n12, int n13, int n14, int n15, boolean bl2, c.c.b.i.f f10, String string, int n16, boolean bl3) {
            c c10 = new c();
            c10.a = n10;
            c10.b = l10;
            c10.c = j10;
            c10.d = arrayList;
            c10.e = j11;
            c10.f = bl;
            c10.g = true;
            c10.h = false;
            c10.j = n11;
            c10.k = n12;
            c10.l = n13;
            c10.m = n14;
            c10.n = n15;
            c10.o = string;
            c10.p = n16;
            c10.q = 1;
            c10.r = bl2;
            c10.s = f10;
            c10.t = null;
            c10.u = 0;
            c10.i = bl3;
            return c10;
        }
    }

    public static final class d
    extends Enum<d> {
        public static final /* enum */ d a;
        public static final /* enum */ d b;
        public static final /* enum */ d c;
        public static final /* enum */ d d;
        public static final /* synthetic */ d[] e;

        public static {
            d d10;
            a = new d();
            b = new d();
            c = new d();
            d = d10 = new d();
            d[] arrd = new d[]{a, b, c, d10};
            e = arrd;
        }

        public static d valueOf(String string) {
            return (d)Enum.valueOf(d.class, (String)string);
        }

        public static d[] values() {
            return (d[])e.clone();
        }
    }

}

