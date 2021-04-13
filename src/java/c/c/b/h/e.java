/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.c.b.h.d
 *  c.c.b.h.f
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Locale
 */
package c.c.b.h;

import c.c.b.h.d;
import c.c.b.h.f;
import java.util.Locale;

public abstract class e
implements d {
    public boolean a = false;
    public f b = new f();

    public final void a(String string, int n9) {
        Locale locale = Locale.US;
        Object[] arrobject = new Object[]{n9};
        this.a(string, String.format((Locale)locale, (String)"%d", (Object[])arrobject));
    }

    public boolean a(String string) {
        String string2 = string.toLowerCase(Locale.US);
        return !(string2.startsWith("uci_") || string2.equals((Object)"hash") || string2.equals((Object)"ponder") || string2.equals((Object)"multipv") || string2.equals((Object)"gaviotatbpath") || string2.equals((Object)"syzygypath"));
        {
        }
    }

    /*
     * Exception decompiling
     */
    public final boolean a(String var1, String var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl174.1 : ICONST_0 : trying to set 1 previously set to 0
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
}

