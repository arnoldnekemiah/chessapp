/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.i.r.q.l.a
 *  c.b.c.a.a.a
 *  java.lang.Object
 *  java.lang.Throwable
 */
package a.i.r.q.l;

import a.i.r.q.l.a;

public final class c<V>
extends a<V> {
    public boolean a(Throwable throwable) {
        if (throwable != null) {
            a.d d4 = new a.d(throwable);
            if (a.f.a(this, null, d4)) {
                a.a((a)this);
                return true;
            }
            return false;
        }
        throw null;
    }

    /*
     * Exception decompiling
     */
    public boolean b(c.b.c.a.a.a<? extends V> var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl55 : GETSTATIC : trying to set 1 previously set to 0
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

    public boolean c(V object) {
        if (object == null) {
            object = a.g;
        }
        if (a.f.a(this, null, object)) {
            a.a((a)this);
            return true;
        }
        return false;
    }
}

