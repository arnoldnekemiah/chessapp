/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.String
 *  java.util.List
 *  org.checkerframework.checker.nullness.qual.EnsuresNonNull
 */
package c.b.b.a.f.b;

import a.c.a.a;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.x3;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class z2
extends x3 {
    public String c;
    public String d;
    public int e;
    public String f;
    public long g;
    public final long h;
    public List<String> i;
    public int j;
    public String k;
    public String l;
    public String m;

    public z2(i4 i42, long l6) {
        super(i42);
        this.h = l6;
    }

    @Override
    public final boolean j() {
        return true;
    }

    /*
     * Exception decompiling
     */
    @EnsuresNonNull(value={"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    @Override
    public final void k() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl103 : ALOAD_0 : trying to set 1 previously set to 0
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

    public final String l() {
        this.h();
        a.a(this.c);
        return this.c;
    }

    public final String m() {
        this.h();
        a.a(this.k);
        return this.k;
    }
}

