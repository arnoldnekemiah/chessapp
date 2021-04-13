/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Deprecated
 *  java.lang.IllegalStateException
 *  java.lang.String
 *  java.util.logging.Logger
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.a5;
import c.b.b.a.e.d.d5;
import c.b.b.a.e.d.e8;
import c.b.b.a.e.d.f7;
import c.b.b.a.e.d.k4;
import c.b.b.a.e.d.p4;
import c.b.b.a.e.d.t5;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.x4;
import c.b.b.a.e.d.z4;
import java.util.logging.Logger;

public abstract class c5
extends p4 {
    public static final Logger b = Logger.getLogger((String)c5.class.getName());
    public static final boolean c = e8.g;
    public d5 a;

    public c5() {
    }

    public /* synthetic */ c5(z4 z42) {
    }

    @Deprecated
    public static int a(int n10, u6 u62, f7 f72) {
        int n11 = c5.f(n10 << 3);
        int n12 = n11 + n11;
        k4 k42 = (k4)u62;
        int n13 = ((t5)k42).zzd;
        if (n13 == -1) {
            ((t5)k42).zzd = n13 = f72.c(k42);
        }
        return n12 + n13;
    }

    public static int a(u6 u62, f7 f72) {
        k4 k42 = (k4)u62;
        int n10 = ((t5)k42).zzd;
        if (n10 == -1) {
            ((t5)k42).zzd = n10 = f72.c(k42);
        }
        return n10 + c5.f(n10);
    }

    public static int a(x4 x42) {
        int n10 = x42.c();
        return n10 + c5.f(n10);
    }

    /*
     * Exception decompiling
     */
    public static int a(String var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl10 : ILOAD_1 : trying to set 1 previously set to 0
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

    public static c5 a(byte[] arrby) {
        return new a5(arrby, 0, arrby.length);
    }

    public static int c(long l10) {
        int n10;
        if ((-128L & l10) == 0L) {
            return 1;
        }
        if (l10 < 0L) {
            return 10;
        }
        if ((-34359738368L & l10) != 0L) {
            l10 >>>= 28;
            n10 = 6;
        } else {
            n10 = 2;
        }
        if ((-2097152L & l10) != 0L) {
            n10 += 2;
            l10 >>>= 14;
        }
        if ((l10 & -16384L) != 0L) {
            ++n10;
        }
        return n10;
    }

    public static int d(int n10) {
        return c5.f(n10 << 3);
    }

    public static int e(int n10) {
        if (n10 >= 0) {
            return c5.f(n10);
        }
        return 10;
    }

    public static int f(int n10) {
        if ((n10 & -128) == 0) {
            return 1;
        }
        if ((n10 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & n10) == 0) {
            return 3;
        }
        if ((n10 & -268435456) == 0) {
            return 4;
        }
        return 5;
    }

    public final void a() {
        a5 a52 = (a5)this;
        if (a52.e - a52.f == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public abstract void a(byte var1);

    public abstract void a(int var1);

    public abstract void a(int var1, int var2);

    public abstract void a(int var1, x4 var2);

    public abstract void a(int var1, String var2);

    public abstract void a(long var1);

    public abstract void b(int var1);

    public abstract void b(long var1);

    public abstract void c(int var1);
}

