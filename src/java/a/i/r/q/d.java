/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.i.k$b$a
 *  a.i.k$b$c
 *  a.i.r.b
 *  a.i.r.f
 *  a.i.r.j
 *  android.content.Context
 *  androidx.work.impl.WorkDatabase
 *  androidx.work.impl.background.systemalarm.RescheduleReceiver
 *  androidx.work.impl.workers.ConstraintTrackingWorker
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package a.i.r.q;

import a.i.b;
import a.i.c;
import a.i.e;
import a.i.h;
import a.i.k;
import a.i.r.j;
import a.i.r.q.f;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Exception performing whole class analysis.
 */
public class d
implements Runnable {
    public static final String c;
    public final a.i.r.f a;
    public final a.i.r.b b;

    public static {
        c = h.a("EnqueueRunnable");
    }

    public d(a.i.r.f f2) {
        this.a = f2;
        this.b = new a.i.r.b();
    }

    public static void a(a.i.r.p.j j2) {
        c c2 = j2.j;
        if (c2.d || c2.e) {
            String string = j2.c;
            e.a a2 = new e.a();
            a2.a(j2.e.a);
            a2.a.put((Object)"androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", (Object)string);
            j2.c = ConstraintTrackingWorker.class.getName();
            j2.e = a2.a();
        }
    }

    /*
     * Exception decompiling
     */
    public static boolean a(a.i.r.f var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl604.1 : ICONST_0 : trying to set 1 previously set to 0
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
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void run() {
        try {
            var2_1 = this.a;
            if (var2_1 == null) throw null;
            if (a.i.r.f.a((a.i.r.f)var2_1, (Set)new HashSet())) ** GOTO lbl24
            var4_2 = this.a.a.c;
            var4_2.c();
        }
        catch (Throwable var1_7) {
            this.b.a((k.b)new /* Unavailable Anonymous Inner Class!! */);
            return;
        }
        var6_3 = d.a(this.a);
        var4_2.g();
        {
            catch (Throwable var5_5) {
                var4_2.d();
                throw var5_5;
            }
        }
        var4_2.d();
        if (var6_3) {
            f.a(this.a.a.a, RescheduleReceiver.class, true);
            var7_4 = this.a.a;
            a.i.r.e.a(var7_4.b, var7_4.c, (List<a.i.r.d>)var7_4.e);
        }
        this.b.a((k.b)k.a);
        return;
lbl24: // 1 sources:
        var3_6 = new Object[]{this.a};
        throw new IllegalStateException(String.format((String)"WorkContinuation has cycles (%s)", (Object[])var3_6));
    }
}

