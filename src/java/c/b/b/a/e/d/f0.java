/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.util.Log
 *  c.b.b.a.b.j.c
 *  c.b.b.a.e.d.d
 *  c.b.b.a.e.d.l
 *  c.b.b.a.e.d.o
 *  c.b.b.a.e.d.p
 *  c.b.b.a.e.d.q
 *  c.b.b.a.e.d.s
 *  c.b.b.a.e.d.u
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Random
 *  java.util.Set
 *  java.util.concurrent.ExecutorService
 */
package c.b.b.a.e.d;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import c.b.b.a.b.j.b;
import c.b.b.a.b.j.c;
import c.b.b.a.e.d.d;
import c.b.b.a.e.d.l;
import c.b.b.a.e.d.o;
import c.b.b.a.e.d.p;
import c.b.b.a.e.d.q;
import c.b.b.a.e.d.s;
import c.b.b.a.e.d.u;
import c.b.b.a.e.d.wb;
import c.b.b.a.e.d.x9;
import c.b.b.a.f.a.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public final class f0 {
    public static volatile f0 i;
    public static Boolean j;
    public final String a;
    public final b b;
    public final ExecutorService c;
    public final a d;
    public int e;
    public boolean f;
    public final String g;
    public volatile wb h;

    /*
     * Exception decompiling
     */
    public f0(Context var1, String var2, String var3, String var4, Bundle var5) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl70 : ILOAD : trying to set 1 previously set to 0
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
    public static f0 a(Context context, String string, String string2, String string3, Bundle bundle) {
        a.c.a.a.a(context);
        if (i != null) return i;
        Class<f0> class_ = f0.class;
        synchronized (f0.class) {
            f0 f02;
            if (i != null) return i;
            i = f02 = new f0(context, string, string2, string3, bundle);
            // ** MonitorExit[var8_5] (shouldn't be in output)
            return i;
        }
    }

    /*
     * Exception decompiling
     */
    public static /* synthetic */ void a(Context var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl41.1 : ALOAD_0 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:885)
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
     * Exception decompiling
     */
    public static final boolean b(String var0, String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl13 : ILOAD_2 : trying to set 1 previously set to 0
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

    public final int a(String string) {
        x9 x92 = new x9();
        s s10 = new s(this, string, x92);
        this.c.execute((Runnable)s10);
        Integer n2 = x9.a(x92.b(10000L), Integer.class);
        if (n2 == null) {
            return 25;
        }
        return n2;
    }

    public final long a() {
        x9 x92 = new x9();
        l l2 = new l(this, x92);
        this.c.execute((Runnable)l2);
        Long l10 = x9.a(x92.b(500L), Long.class);
        if (l10 == null) {
            long l11 = System.nanoTime();
            if ((c)this.b != null) {
                int n2;
                long l12 = new Random(l11 ^ System.currentTimeMillis()).nextLong();
                this.e = n2 = 1 + this.e;
                return l12 + (long)n2;
            }
            throw null;
        }
        return l10;
    }

    public final Bundle a(Bundle bundle, boolean bl) {
        x9 x92 = new x9();
        q q2 = new q(this, bundle, x92);
        this.c.execute((Runnable)q2);
        if (bl) {
            return x92.b(5000L);
        }
        return null;
    }

    public final List<Bundle> a(String string, String string2) {
        x9 x92 = new x9();
        d d2 = new d(this, string, string2, x92);
        this.c.execute((Runnable)d2);
        List list = x9.a(x92.b(5000L), List.class);
        if (list == null) {
            list = Collections.emptyList();
        }
        return list;
    }

    public final Map<String, Object> a(String string, String string2, boolean bl) {
        x9 x92 = new x9();
        o o2 = new o(this, string, string2, bl, x92);
        this.c.execute((Runnable)o2);
        Bundle bundle = x92.b(5000L);
        if (bundle != null && bundle.size() != 0) {
            HashMap hashMap = new HashMap(bundle.size());
            for (String string3 : bundle.keySet()) {
                Object object = bundle.get(string3);
                if (!(object instanceof Double) && !(object instanceof Long) && !(object instanceof String)) continue;
                hashMap.put((Object)string3, object);
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }

    public final void a(Exception exception, boolean bl, boolean bl2) {
        this.f = bl | this.f;
        if (bl) {
            Log.w((String)this.a, (String)"Data collection startup failed. No data will be collected.", (Throwable)exception);
            return;
        }
        if (bl2) {
            p p2 = new p(this, "Error with data collection. Data lost.", (Object)exception);
            this.c.execute((Runnable)p2);
        }
        Log.w((String)this.a, (String)"Error with data collection. Data lost.", (Throwable)exception);
    }

    public final void a(String string, String string2, Bundle bundle, boolean bl, boolean bl2, Long l2) {
        u u8 = new u(this, l2, string, string2, bundle, bl, bl2);
        this.c.execute((Runnable)u8);
    }
}

