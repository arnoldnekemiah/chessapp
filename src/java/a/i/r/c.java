/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.work.ListenableWorker
 *  androidx.work.ListenableWorker$a
 *  androidx.work.WorkerParameters
 *  androidx.work.WorkerParameters$a
 *  androidx.work.impl.WorkDatabase
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.Executor
 */
package a.i.r;

import a.i.h;
import a.i.r.d;
import a.i.r.m;
import a.i.r.q.m.b;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public class c
implements a.i.r.a {
    public static final String j = h.a("Processor");
    public Context a;
    public a.i.b b;
    public a.i.r.q.m.a c;
    public WorkDatabase d;
    public Map<String, m> e;
    public List<d> f;
    public Set<String> g;
    public final List<a.i.r.a> h;
    public final Object i;

    public c(Context context, a.i.b b2, a.i.r.q.m.a a5, WorkDatabase workDatabase, List<d> list) {
        this.a = context;
        this.b = b2;
        this.c = a5;
        this.d = workDatabase;
        this.e = new HashMap();
        this.f = list;
        this.g = new HashSet();
        this.h = new ArrayList();
        this.i = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(a.i.r.a a5) {
        Object object;
        Object object2 = object = this.i;
        synchronized (object2) {
            this.h.add((Object)a5);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(String string, boolean bl) {
        Object object;
        Object object2 = object = this.i;
        synchronized (object2) {
            this.e.remove((Object)string);
            h h4 = h.a();
            String string2 = j;
            Object[] arrobject = new Object[]{this.getClass().getSimpleName(), string, bl};
            h4.a(string2, String.format((String)"%s %s executed; reschedule = %s", (Object[])arrobject), new Throwable[0]);
            Iterator iterator = this.h.iterator();
            while (iterator.hasNext()) {
                ((a.i.r.a)iterator.next()).a(string, bl);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(String string) {
        Object object;
        Object object2 = object = this.i;
        synchronized (object2) {
            return this.g.contains((Object)string);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(String string, WorkerParameters.a a5) {
        m m10;
        Object object;
        Object object2 = object = this.i;
        synchronized (object2) {
            if (this.e.containsKey((Object)string)) {
                h.a().a(j, String.format((String)"Work %s is already enqueued for processing", (Object[])new Object[]{string}), new Throwable[0]);
                return false;
            }
            m.a a6 = new m.a(this.a, this.b, this.c, this.d, string);
            a6.g = this.f;
            if (a5 != null) {
                a6.h = a5;
            }
            m10 = new m(a6);
            a.i.r.q.l.c<Boolean> c2 = m10.p;
            c2.a(new Runnable(this, string, c2){
                public a.i.r.a a;
                public String b;
                public c.b.c.a.a.a<Boolean> c;
                {
                    this.a = a5;
                    this.b = string;
                    this.c = a6;
                }

                /*
                 * Exception decompiling
                 */
                public void run() {
                    // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                    // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl10 : ALOAD_0 : trying to set 1 previously set to 0
                    // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
                    // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
                    // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
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
            }, ((b)this.c).c);
            this.e.put((Object)string, (Object)m10);
        }
        ((b)this.c).a.execute((Runnable)m10);
        h h4 = h.a();
        String string2 = j;
        Object[] arrobject = new Object[]{c.class.getSimpleName(), string};
        h4.a(string2, String.format((String)"%s: processing %s", (Object[])arrobject), new Throwable[0]);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(a.i.r.a a5) {
        Object object;
        Object object2 = object = this.i;
        synchronized (object2) {
            this.h.remove((Object)a5);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean b(String string) {
        Object object;
        Object object2 = object = this.i;
        synchronized (object2) {
            return this.e.containsKey((Object)string);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean c(String string) {
        Object object;
        Object object2 = object = this.i;
        synchronized (object2) {
            ListenableWorker listenableWorker;
            h.a().a(j, String.format((String)"Processor cancelling %s", (Object[])new Object[]{string}), new Throwable[0]);
            this.g.add((Object)string);
            m m10 = (m)this.e.remove((Object)string);
            if (m10 == null) {
                h.a().a(j, String.format((String)"WorkerWrapper could not be found for %s", (Object[])new Object[]{string}), new Throwable[0]);
                return false;
            }
            m10.r = true;
            m10.f();
            c.b.c.a.a.a<ListenableWorker.a> a5 = m10.q;
            if (a5 != null) {
                a5.cancel(true);
            }
            if ((listenableWorker = m10.f) != null) {
                listenableWorker.stop();
            }
            h.a().a(j, String.format((String)"WorkerWrapper cancelled for %s", (Object[])new Object[]{string}), new Throwable[0]);
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean d(String string) {
        Object object;
        Object object2 = object = this.i;
        synchronized (object2) {
            ListenableWorker listenableWorker;
            h.a().a(j, String.format((String)"Processor stopping %s", (Object[])new Object[]{string}), new Throwable[0]);
            m m10 = (m)this.e.remove((Object)string);
            if (m10 == null) {
                h.a().a(j, String.format((String)"WorkerWrapper could not be found for %s", (Object[])new Object[]{string}), new Throwable[0]);
                return false;
            }
            m10.r = true;
            m10.f();
            c.b.c.a.a.a<ListenableWorker.a> a5 = m10.q;
            if (a5 != null) {
                a5.cancel(true);
            }
            if ((listenableWorker = m10.f) != null) {
                listenableWorker.stop();
            }
            h.a().a(j, String.format((String)"WorkerWrapper stopped for %s", (Object[])new Object[]{string}), new Throwable[0]);
            return true;
        }
    }

}

