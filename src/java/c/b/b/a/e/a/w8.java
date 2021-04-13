/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  c.b.b.a.e.a.d0
 *  c.b.b.a.e.a.de
 *  c.b.b.a.e.a.h0
 *  c.b.b.a.e.a.p0
 *  c.b.b.a.e.a.u
 *  c.b.b.a.e.a.w0
 *  c.b.b.a.e.a.z8
 *  com.google.android.gms.internal.ads.zzazn
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.WeakHashMap
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  javax.annotation.ParametersAreNonnullByDefault
 */
package c.b.b.a.e.a;

import android.content.Context;
import c.b.b.a.e.a.a9;
import c.b.b.a.e.a.d0;
import c.b.b.a.e.a.de;
import c.b.b.a.e.a.h0;
import c.b.b.a.e.a.p0;
import c.b.b.a.e.a.u;
import c.b.b.a.e.a.w0;
import c.b.b.a.e.a.z8;
import com.google.android.gms.internal.ads.zzazn;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class w8
implements z8 {
    public static final Object d = new Object();
    public static z8 e;
    public final Context a;
    public final ExecutorService b;
    public final zzazn c;

    public w8(Context context) {
        zzazn zzazn2 = new zzazn(12451000, 12451000, true);
        new WeakHashMap();
        this.b = Executors.unconfigurableExecutorService((ExecutorService)Executors.newCachedThreadPool());
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.a = context;
        this.c = zzazn2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static z8 a(Context context) {
        Object object;
        Object object2 = object = d;
        synchronized (object2) {
            if (e == null) {
                u u10;
                e = (Boolean)w0.d.a() != false && (Boolean)de.i.e.a(u10 = h0.f) == false ? new w8(context) : new a9();
            }
            return e;
        }
    }

    /*
     * Exception decompiling
     */
    public final void a(Throwable var1, String var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl71 : NEW : trying to set 1 previously set to 0
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

