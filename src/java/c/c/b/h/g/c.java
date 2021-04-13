/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.InterruptedException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.ThreadGroup
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Random
 */
package c.c.b.h.g;

import b.e;
import b.g;
import b.h;
import b.j;
import b.k;
import b.l;
import b.m;
import b.o;
import c.c.b.h.g.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class c {
    public c.c.b.h.c a;
    public Thread b;
    public final Object c;
    public k d;
    public m e;
    public e f;
    public h g;
    public j h;
    public long[] i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public List<g> r;
    public int s = 2;
    public boolean t = false;
    public boolean u = false;
    public boolean v = true;
    public int w = 1000;
    public long x = 0L;
    public Random y = new Random();

    public c(c.c.b.h.c c10) {
        this.a = c10;
        this.c = new Object();
        this.c();
        this.f = new e();
        this.g = new h();
    }

    public static final String a(g g10) {
        StringBuilder stringBuilder;
        String string;
        if (g10 == null) {
            return "0000";
        }
        StringBuilder stringBuilder2 = c.a.b.a.a.a(l.b(g10.a));
        stringBuilder2.append(l.b(g10.b));
        String string2 = stringBuilder2.toString();
        switch (g10.c) {
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

    public static void a(c.c.b.h.c c10) {
        c10.b("option name Hash type spin default 2 min 1 max 2048");
        c10.b("option name OwnBook type check default false");
        c10.b("option name Ponder type check default true");
        c10.b("option name UCI_AnalyseMode type check default false");
        c10.a("option name UCI_EngineAbout type string default %s", "ChessPrince");
        c10.b("option name Strength type spin default 1000 min 0 max 1000");
    }

    public final void a() {
        this.x = this.y.nextLong();
        m.a[] arra = this.e.a;
        int n10 = arra.length;
        for (int i10 = 0; i10 < n10; ++i10) {
            arra[i10].f = (byte)3;
        }
        this.f.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(int n10, int n11, final int n12, final int n13) {
        Thread thread;
        k k10;
        Object object;
        Object object2 = object = this.c;
        // MONITORENTER : object2
        this.d = k10 = new k(this.h, this.i, this.j, this.e, this.f);
        k10.m = n10;
        k10.n = n11;
        k10.D = new k.a(this.a){
            public c.c.b.h.c a;
            {
                this.a = c10;
            }
        };
        k k11 = this.d;
        int n14 = this.w;
        long l10 = this.x;
        if (n14 < 0) {
            n14 = 0;
        }
        if (n14 > 1000) {
            n14 = 1000;
        }
        k11.s = n14;
        boolean bl = n14 < 1000;
        k11.t = bl;
        k11.u = l10;
        this.d.r = 500;
        final h.a a10 = this.g.b(this.h);
        h.a(this.h, a10);
        List<g> list = this.r;
        if (list != null && list.size() > 0) {
            List<g> list2 = this.r;
            int n15 = 0;
            for (int i10 = 0; i10 < a10.b; ++i10) {
                if (!list2.contains((Object)a10.a[i10])) continue;
                g[] arrg = a10.a;
                int n16 = n15 + 1;
                arrg[n15] = arrg[i10];
                n15 = n16;
            }
            a10.b = n15;
        }
        this.l = false;
        if (a10.b < 2 && !this.m) {
            this.l = true;
            if (!(this.k || n12 >= 0 && n12 <= 2)) {
                n12 = 2;
            }
        }
        m m10 = this.e;
        m10.c = (byte)(1 + m10.c);
        Runnable runnable = new Runnable(){

            /*
             * Exception decompiling
             */
            public void run() {
                // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl1422.1 : ALOAD : trying to set 0 previously set to 1
                // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
                // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
                // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
                // org.benf.cfr.reader.entities.g.p(Method.java:396)
                // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
                // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
                // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
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
        };
        ThreadGroup threadGroup = new ThreadGroup("searcher");
        this.b = thread = new Thread(threadGroup, runnable, "searcher", 32768L);
        thread.start();
    }

    public final void a(j j10, ArrayList<g> arrayList, d d10) {
        this.a(new j(j10), (List<g>)arrayList);
        this.a(d10);
        this.k = false;
        int n10 = this.o;
        boolean bl = false;
        if (n10 < 0) {
            int n11 = this.p;
            bl = false;
            if (n11 < 0) {
                int n12 = this.q;
                bl = false;
                if (n12 < 0) {
                    bl = true;
                }
            }
        }
        this.m = bl;
        this.r = d10.a;
        this.a(this.n, this.o, this.p, this.q);
    }

    public final void a(j j10, List<g> list) {
        o o10 = new o();
        this.i = new long[200 + list.size()];
        this.j = 0;
        for (g g10 : list) {
            long[] arrl = this.i;
            int n10 = this.j;
            this.j = n10 + 1;
            arrl[n10] = j10.l;
            j10.a(g10, o10);
        }
        this.h = j10;
    }

    public final void a(j j10, List<g> list, d d10) {
        this.a(new j(j10), list);
        this.a(d10);
        this.k = true;
        this.m = false;
        this.a(-1, -1, -1, -1);
    }

    public final void a(d d10) {
        int n10;
        int n11;
        boolean bl;
        block13 : {
            int n12;
            block12 : {
                block11 : {
                    this.n = n12 = -1;
                    this.o = n12;
                    this.p = n12;
                    this.q = n12;
                    if (!d10.k) break block11;
                    this.n = n12;
                    this.o = n12;
                    break block12;
                }
                n12 = d10.g;
                if (n12 > 0) break block12;
                int n13 = d10.i;
                n10 = 1;
                if (n13 <= 0) break block13;
                n12 = n13 * 2 - n10;
            }
            this.p = n12;
            return;
        }
        int n14 = d10.j;
        if (n14 > 0) {
            this.o = n14;
            this.n = n14;
            return;
        }
        int n15 = d10.h;
        if (n15 > 0) {
            this.q = n15;
            return;
        }
        int n16 = d10.f;
        if (n16 == 0) {
            n16 = 999;
        }
        int n17 = Math.min((int)n16, (int)45);
        if (this.v) {
            double d11 = n17;
            Double.isNaN((double)d11);
            Double.isNaN((double)d11);
            n17 = (int)Math.ceil((double)(d11 * 0.65));
        }
        int n18 = (bl = this.h.g) ? d10.b : d10.c;
        int n19 = bl ? d10.d : d10.e;
        int n20 = Math.min((int)1000, (int)(n18 * 9 / 10));
        double d12 = (n18 + n19 * (n17 - 1) - n20) / n17;
        Double.isNaN((double)d12);
        Double.isNaN((double)d12);
        this.n = n11 = (int)(d12 * 0.85);
        double d13 = n11;
        double d14 = n17;
        Double.isNaN((double)d14);
        Double.isNaN((double)d14);
        double d15 = Math.max((double)2.5, (double)Math.min((double)4.0, (double)(d14 / 2.0)));
        Double.isNaN((double)d13);
        Double.isNaN((double)d13);
        this.o = (int)(d15 * d13);
        int n21 = this.n;
        int n22 = n18 - n20;
        if (n21 < n10) {
            n21 = 1;
        } else if (n21 > n22) {
            n21 = n22;
        }
        this.n = n21;
        int n23 = this.o;
        if (n23 >= n10) {
            n10 = n23 > n22 ? n22 : n23;
        }
        this.o = n10;
    }

    /*
     * Exception decompiling
     */
    public final void a(String var1, String var2) {
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
    public final void b() {
        k k10;
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            k10 = this.d;
        }
        int n10 = 1;
        if (k10 != null) {
            if (this.l) {
                if (this.n > n10) {
                    this.n = n10;
                }
                if (this.o > n10) {
                    this.o = n10;
                }
            }
            k10.a(this.n, this.o);
        }
        if (this.o >= 0 || this.p >= 0 || this.q >= 0) {
            n10 = 0;
        }
        this.m = n10;
        this.k = false;
    }

    public final void c() {
        int n10 = this.s;
        int n11 = n10 > 0 ? n10 * 1048576 / 24 : 1024;
        this.e = new m((int)Math.floor((double)(Math.log((double)n11) / Math.log((double)2.0))));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void d() {
        Object object;
        Object object2 = object = this.c;
        // MONITORENTER : object2
        Thread thread = this.b;
        k k10 = this.d;
        // MONITOREXIT : object2
        if (thread == null) return;
        k10.a(0, 0);
        this.m = false;
        this.k = false;
        try {
            thread.join();
            return;
        }
        catch (InterruptedException interruptedException) {
            throw new RuntimeException();
        }
    }

}

