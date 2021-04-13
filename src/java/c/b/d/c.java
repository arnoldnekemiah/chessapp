/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.b.a
 *  android.annotation.TargetApi
 *  android.app.Application
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.UserManager
 *  android.util.Base64
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.Executor
 *  java.util.concurrent.atomic.AtomicBoolean
 *  java.util.concurrent.atomic.AtomicReference
 *  javax.annotation.concurrent.GuardedBy
 */
package c.b.d;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.UserManager;
import android.util.Base64;
import android.util.Log;
import c.b.b.a.b.g.a.a;
import c.b.b.a.b.h.h;
import c.b.d.g.k;
import c.b.d.g.s;
import c.b.d.g.t;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

public class c {
    public static final Object i = new Object();
    public static final Executor j = new d(null);
    @GuardedBy(value="LOCK")
    public static final Map<String, c> k = new a.b.a();
    public final Context a;
    public final String b;
    public final c.b.d.e c;
    public final k d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final t<c.b.d.l.a> g;
    public final List<b> h;

    /*
     * Exception decompiling
     */
    public c(Context var1, String var2, c.b.d.e var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl88 : ACONST_NULL : trying to set 1 previously set to 0
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
    public static c a(Context context) {
        Object object;
        Object object2 = object = i;
        synchronized (object2) {
            if (k.containsKey((Object)"[DEFAULT]")) {
                return c.e();
            }
            c.b.d.e e10 = c.b.d.e.a(context);
            if (e10 != null) return c.a(context, e10, "[DEFAULT]");
            Log.w((String)"FirebaseApp", (String)"Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c a(Context context, c.b.d.e e10, String string) {
        Object object;
        c c10;
        c.a(context);
        String string2 = string.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Object object2 = object = i;
        synchronized (object2) {
            boolean bl = !k.containsKey((Object)string2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FirebaseApp name ");
            stringBuilder.append(string2);
            stringBuilder.append(" already exists!");
            a.c.a.a.b(bl, (Object)stringBuilder.toString());
            a.c.a.a.a(context, (Object)"Application context cannot be null.");
            c10 = new c(context, string2, e10);
            k.put((Object)string2, (Object)c10);
        }
        c10.c();
        return c10;
    }

    public static /* synthetic */ c.b.d.l.a a(c c10, Context context) {
        return new c.b.d.l.a(context, c10.b(), c10.d.a(c.b.d.h.c.class));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c e() {
        Object object;
        Object object2 = object = i;
        synchronized (object2) {
            c c10 = (c)k.get((Object)"[DEFAULT]");
            if (c10 != null) {
                return c10;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Default FirebaseApp is not initialized in this process ");
            stringBuilder.append(c.b.b.a.b.j.e.a());
            stringBuilder.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final void a() {
        a.c.a.a.b(true ^ this.f.get(), (Object)"FirebaseApp was deleted");
    }

    public String b() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a();
        byte[] arrby = this.b.getBytes(Charset.defaultCharset());
        String string = arrby == null ? null : Base64.encodeToString((byte[])arrby, (int)11);
        stringBuilder.append(string);
        stringBuilder.append("+");
        this.a();
        byte[] arrby2 = this.c.b.getBytes(Charset.defaultCharset());
        String string2 = arrby2 == null ? null : Base64.encodeToString((byte[])arrby2, (int)11);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final void c() {
        Context context = this.a;
        boolean bl = Build.VERSION.SDK_INT >= 24 ? ((UserManager)context.getSystemService(UserManager.class)).isUserUnlocked() : true;
        if (bl ^ true) {
            e e10;
            Context context2 = this.a;
            if (e.b.get() == null && e.b.compareAndSet(null, (Object)(e10 = new e(context2)))) {
                context2.registerReceiver((BroadcastReceiver)e10, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
        } else {
            k k10 = this.d;
            boolean bl2 = this.d();
            for (Map.Entry entry : k10.a.entrySet()) {
                c.b.d.g.d d10 = (c.b.d.g.d)entry.getKey();
                t t9 = (t)entry.getValue();
                boolean bl3 = d10.c == 1;
                if (!bl3) {
                    int n10 = d10.c;
                    boolean bl4 = false;
                    if (n10 == 2) {
                        bl4 = true;
                    }
                    if (!bl4 || !bl2) continue;
                }
                t9.get();
            }
            k10.d.a();
        }
    }

    public boolean d() {
        this.a();
        return "[DEFAULT]".equals((Object)this.b);
    }

    public boolean equals(Object object) {
        if (!(object instanceof c)) {
            return false;
        }
        String string = this.b;
        c c10 = (c)object;
        c10.a();
        return string.equals((Object)c10.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        h h10 = a.c.a.a.b(this);
        h10.a("name", this.b);
        h10.a("options", this.c);
        return h10.toString();
    }

    public static interface b {
        public void a(boolean var1);
    }

    public static class d
    implements Executor {
        public static final Handler a = new Handler(Looper.getMainLooper());

        public /* synthetic */ d(a a10) {
        }

        public void execute(Runnable runnable) {
            a.post(runnable);
        }
    }

    @TargetApi(value=24)
    public static class e
    extends BroadcastReceiver {
        public static AtomicReference<e> b = new AtomicReference();
        public final Context a;

        public e(Context context) {
            this.a = context;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public void onReceive(Context context, Intent intent) {
            Object object;
            Object object2 = object = c.i;
            // MONITORENTER : object2
            Iterator iterator = c.k.values().iterator();
            while (iterator.hasNext()) {
                ((c)iterator.next()).c();
            }
            // MONITOREXIT : object2
            {
                catch (Throwable throwable) {}
                {
                    // MONITOREXIT : object2
                    throw throwable;
                }
            }
            this.a.unregisterReceiver((BroadcastReceiver)this);
        }
    }

}

