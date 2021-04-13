/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.e.d
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.Runnable
 */
package a.e;

import a.e.b;
import a.e.c;
import a.e.d;
import android.os.Handler;

public class g {
    public final d a;
    public final Handler b;
    public a c;

    public g(c c2) {
        this.a = new d(c2);
        this.b = new Handler();
    }

    public final void a(b.a a2) {
        a a4;
        a a5 = this.c;
        if (a5 != null) {
            a5.run();
        }
        this.c = a4 = new a(this.a, a2);
        this.b.postAtFrontOfQueue((Runnable)a4);
    }

    public static class a
    implements Runnable {
        public final d a;
        public final b.a b;
        public boolean c = false;

        public a(d d2, b.a a2) {
            this.a = d2;
            this.b = a2;
        }

        /*
         * Exception decompiling
         */
        public void run() {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // java.lang.IllegalStateException: Invisible function parameters on a non-constructor (or reads of uninitialised local variables).
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1560)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1816)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:332)
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
    }

}

