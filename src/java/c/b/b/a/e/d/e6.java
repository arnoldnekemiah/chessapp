/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.d.u6
 *  c.b.b.a.e.d.v4
 *  java.lang.Object
 */
package c.b.b.a.e.d;

import c.b.b.a.e.d.g5;
import c.b.b.a.e.d.u6;
import c.b.b.a.e.d.v4;
import c.b.b.a.e.d.x4;

public class e6 {
    public volatile u6 a;
    public volatile x4 b;

    public static {
        g5.a();
    }

    public final int a() {
        if (this.b != null) {
            return ((v4)this.b).d.length;
        }
        if (this.a != null) {
            return this.a.c();
        }
        return 0;
    }

    /*
     * Exception decompiling
     */
    public final void a(u6 var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl27 : ALOAD : trying to set 1 previously set to 0
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final x4 b() {
        if (this.b != null) {
            return this.b;
        }
        e6 e62 = this;
        synchronized (e62) {
            if (this.b != null) {
                return this.b;
            }
            x4 x42 = this.a == null ? x4.b : this.a.b();
            this.b = x42;
            return this.b;
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof e6)) {
            return false;
        }
        e6 e62 = (e6)object;
        u6 u62 = this.a;
        u6 u63 = e62.a;
        if (u62 == null && u63 == null) {
            return this.b().equals(e62.b());
        }
        if (u62 != null && u63 != null) {
            return u62.equals((Object)u63);
        }
        if (u62 != null) {
            e62.a(u62.a());
            return u62.equals((Object)e62.a);
        }
        this.a(u63.a());
        return this.a.equals((Object)u63);
    }

    public int hashCode() {
        return 1;
    }
}

