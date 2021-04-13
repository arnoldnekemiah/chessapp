/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.util.Log
 *  c.b.b.a.b.i.b
 *  c.b.b.a.e.c.e
 *  c.b.b.a.e.c.f
 *  c.b.b.a.e.c.g
 *  java.io.Serializable
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.ConcurrentHashMap
 */
package c.b.b.a.b.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import c.b.b.a.b.h.q;
import c.b.b.a.b.i.b;
import c.b.b.a.e.c.e;
import c.b.b.a.e.c.f;
import c.b.b.a.e.c.g;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

public class a {
    public static final Object b = new Object();
    public static volatile a c;
    public static e<Boolean> d;
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> a = new ConcurrentHashMap();

    public static {
        e e2 = b.a;
        if (!(e2 instanceof f) && !(e2 instanceof g)) {
            Object object = e2 instanceof Serializable ? new g(e2) : new f(e2);
            e2 = object;
        }
        d = e2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a a() {
        Object object;
        if (c != null) return c;
        Object object2 = object = b;
        synchronized (object2) {
            if (c != null) return c;
            c = new a();
            return c;
        }
    }

    public static boolean a(ServiceConnection serviceConnection) {
        return (Boolean)d.a() != false && !(serviceConnection instanceof q);
    }

    public static final /* synthetic */ boolean b() {
        return false;
    }

    @SuppressLint(value={"UntrackedBindService"})
    public void a(Context context, ServiceConnection serviceConnection) {
        void var3_10;
        if (a.a(serviceConnection) && this.a.containsKey((Object)serviceConnection)) {
            try {
                block11 : {
                    void var8_6;
                    ServiceConnection serviceConnection2 = (ServiceConnection)this.a.get((Object)serviceConnection);
                    try {
                        context.unbindService(serviceConnection2);
                        break block11;
                    }
                    catch (IllegalStateException illegalStateException) {
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        // empty catch block
                    }
                    Log.w((String)"ConnectionTracker", (String)"Exception thrown while unbinding", (Throwable)var8_6);
                }
                return;
            }
            finally {
                this.a.remove((Object)serviceConnection);
            }
        }
        try {
            context.unbindService(serviceConnection);
            return;
        }
        catch (IllegalStateException illegalStateException) {
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        Log.w((String)"ConnectionTracker", (String)"Exception thrown while unbinding", (Throwable)var3_10);
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int n2) {
        return this.a(context, context.getClass().getName(), intent, serviceConnection, n2);
    }

    /*
     * Exception decompiling
     */
    public final boolean a(Context var1, String var2, Intent var3, ServiceConnection var4, int var5) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl30.1 : ICONST_0 : trying to set 1 previously set to 0
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

