/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.database.ContentObserver
 *  android.net.Uri
 *  c.b.b.a.e.d.b3
 *  c.b.b.a.e.d.c3
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  javax.annotation.Nullable
 */
package c.b.b.a.e.d;

import a.c.a.a;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import c.b.b.a.e.d.b3;
import c.b.b.a.e.d.c3;
import c.b.b.a.e.d.t2;
import javax.annotation.Nullable;

public final class d3
implements b3 {
    public static d3 c;
    @Nullable
    public final Context a;
    @Nullable
    public final ContentObserver b;

    public d3() {
        this.a = null;
        this.b = null;
    }

    public d3(Context context) {
        this.a = context;
        this.b = new c3();
        context.getContentResolver().registerContentObserver(t2.a, true, this.b);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static d3 a(Context context) {
        Class<d3> class_ = d3.class;
        synchronized (d3.class) {
            if (c != null) return c;
            d3 d32 = a.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new d3(context) : new d3();
            c = d32;
            return c;
        }
    }

    public static void a() {
        Class<d3> class_ = d3.class;
        synchronized (d3.class) {
            if (c != null && d3.c.a != null && d3.c.b != null) {
                d3.c.a.getContentResolver().unregisterContentObserver(d3.c.b);
            }
            c = null;
            // ** MonitorExit[var1] (shouldn't be in output)
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final String b(String var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 6[CATCHBLOCK]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
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

