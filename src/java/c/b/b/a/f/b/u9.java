/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.f.b.a9
 *  c.b.b.a.f.b.p9
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.BitSet
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package c.b.b.a.f.b;

import c.b.b.a.e.d.g2;
import c.b.b.a.e.d.j1;
import c.b.b.a.e.d.o1;
import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.p9;
import c.b.b.a.f.b.r8;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class u9
extends r8 {
    public String d;
    public Set<Integer> e;
    public Map<Integer, p9> f;
    public Long g;
    public Long h;

    public u9(a9 a92) {
        super(a92);
    }

    public final p9 a(Integer n7) {
        if (this.f.containsKey((Object)n7)) {
            return (p9)this.f.get((Object)n7);
        }
        p9 p92 = new p9(this, this.d);
        this.f.put((Object)n7, (Object)p92);
        return p92;
    }

    /*
     * Exception decompiling
     */
    public final List<j1> a(String var1_1, List<o1> var2_2, List<g2> var3_3, Long var4_4, Long var5_5) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.lang.UnsupportedOperationException
        // org.benf.cfr.reader.b.a.a.f.c(Op01WithProcessedDataAndByteJumps.java:77)
        // org.benf.cfr.reader.entities.e.f.a(ExceptionGroup.java:90)
        // org.benf.cfr.reader.entities.e.f.a(ExceptionGroup.java:67)
        // org.benf.cfr.reader.entities.e.b.a(ExceptionAggregator.java:360)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:273)
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

    public final boolean a(int n7, int n9) {
        p9 p92 = (p9)this.f.get((Object)n7);
        if (p92 == null) {
            return false;
        }
        return p92.d.get(n9);
    }

    @Override
    public final boolean j() {
        return false;
    }
}

