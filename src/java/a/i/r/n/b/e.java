/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.PowerManager$WakeLock
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ScheduledExecutorService
 */
package a.i.r.n.b;

import a.i.h;
import a.i.r.j;
import a.i.r.n.b.e;
import a.i.r.n.b.g;
import a.i.r.q.k;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public class e
implements a.i.r.a {
    public static final String k = h.a("SystemAlarmDispatcher");
    public final Context a;
    public final a.i.r.q.m.a b;
    public final g c;
    public final a.i.r.c d;
    public final j e;
    public final a.i.r.n.b.b f;
    public final Handler g;
    public final List<Intent> h;
    public Intent i;
    public c j;

    public e(Context context) {
        j j2;
        a.i.r.c c2;
        this.a = context.getApplicationContext();
        this.f = new a.i.r.n.b.b(this.a);
        this.c = new g();
        this.e = j2 = j.a(context);
        this.d = c2 = j2.f;
        this.b = j2.d;
        c2.a(this);
        this.h = new ArrayList();
        this.i = null;
        this.g = new Handler(Looper.getMainLooper());
    }

    public final void a() {
        if (this.g.getLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }

    @Override
    public void a(String string, boolean bl) {
        Runnable runnable = new Runnable(this, a.i.r.n.b.b.a(this.a, string, bl), 0){
            public final e a;
            public final Intent b;
            public final int c;
            {
                this.a = e6;
                this.b = intent;
                this.c = n4;
            }

            public void run() {
                this.a.a(this.b, this.c);
            }
        };
        this.g.post(runnable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(Intent intent, int n4) {
        List<Intent> list;
        h h4 = h.a();
        String string = k;
        Object[] arrobject = new Object[]{intent, n4};
        h4.a(string, String.format((String)"Adding command %s (%s)", (Object[])arrobject), new Throwable[0]);
        this.a();
        String string2 = intent.getAction();
        if (TextUtils.isEmpty((CharSequence)string2)) {
            h.a().d(k, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals((Object)string2) && this.a("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", n4);
        List<Intent> list2 = list = this.h;
        synchronized (list2) {
            boolean bl = this.h.isEmpty();
            boolean bl2 = false;
            if (!bl) {
                bl2 = true;
            }
            this.h.add((Object)intent);
            if (!bl2) {
                this.d();
            }
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(String string) {
        List<Intent> list;
        this.a();
        List<Intent> list2 = list = this.h;
        synchronized (list2) {
            Iterator iterator = this.h.iterator();
            do {
                if (!iterator.hasNext()) return false;
            } while (!string.equals((Object)((Intent)iterator.next()).getAction()));
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b() {
        List<Intent> list;
        h.a().a(k, "Checking if commands are complete.", new Throwable[0]);
        this.a();
        List<Intent> list2 = list = this.h;
        synchronized (list2) {
            if (this.i != null) {
                h h4 = h.a();
                String string = k;
                Object[] arrobject = new Object[]{this.i};
                h4.a(string, String.format((String)"Removing command %s", (Object[])arrobject), new Throwable[0]);
                if (!((Intent)this.h.remove(0)).equals((Object)this.i)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                this.i = null;
            }
            if (!this.f.a() && this.h.isEmpty()) {
                h.a().a(k, "No more commands & intents.", new Throwable[0]);
                if (this.j != null) {
                    this.j.a();
                }
            } else if (!this.h.isEmpty()) {
                this.d();
            }
            return;
        }
    }

    public void c() {
        h.a().a(k, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.d.b(this);
        g g5 = this.c;
        if (!g5.b.isShutdown()) {
            g5.b.shutdownNow();
        }
        this.j = null;
    }

    public final void d() {
        this.a();
        PowerManager.WakeLock wakeLock = k.a(this.a, "ProcessCommand");
        try {
            wakeLock.acquire();
            a.i.r.q.m.a a5 = this.e.d;
            Runnable runnable = new Runnable(this){
                public final /* synthetic */ e a;
                {
                    this.a = e6;
                }

                /*
                 * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
                 * Unable to fully structure code
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 * Converted monitor instructions to comments
                 * Lifted jumps to return sites
                 */
                public void run() {
                    var20_2 = var1_1 = this.a.h;
                    // MONITORENTER : var20_2
                    this.a.i = (Intent)this.a.h.get(0);
                    // MONITOREXIT : var20_2
                    var3_3 = this.a.i;
                    if (var3_3 == null) return;
                    var4_4 = var3_3.getAction();
                    var5_5 = this.a.i.getIntExtra("KEY_START_ID", 0);
                    var6_6 = h.a();
                    var7_7 = e.k;
                    var8_8 = new Object[]{this.a.i, var5_5};
                    var6_6.a(var7_7, String.format((String)"Processing command %s, %s", (Object[])var8_8), new Throwable[0]);
                    var9_9 = this.a.a;
                    var10_10 = new Object[]{var4_4, var5_5};
                    var11_11 = k.a(var9_9, String.format((String)"%s (%s)", (Object[])var10_10));
                    try {
                        h.a().a(e.k, String.format((String)"Acquiring operation wake lock (%s) %s", (Object[])new Object[]{var4_4, var11_11}), new Throwable[0]);
                        var11_11.acquire();
                        this.a.f.b(this.a.i, var5_5, this.a);
                    }
                    catch (Throwable var12_14) {
                        try {
                            h.a().b(e.k, "Unexpected error in onHandleIntent", new Throwable[]{var12_14});
                        }
                        catch (Throwable var13_15) {
                            h.a().a(e.k, String.format((String)"Releasing operation wake lock (%s) %s", (Object[])new Object[]{var4_4, var11_11}), new Throwable[0]);
                            var11_11.release();
                            var14_16 = this.a;
                            var15_17 = new Runnable(var14_16){
                                public final e a;
                                {
                                    this.a = e6;
                                }

                                public void run() {
                                    this.a.b();
                                }
                            };
                            var14_16.g.post(var15_17);
                            throw var13_15;
                        }
                        h.a().a(e.k, String.format((String)"Releasing operation wake lock (%s) %s", (Object[])new Object[]{var4_4, var11_11}), new Throwable[0]);
                        var11_11.release();
                        var17_12 = this.a;
                        var18_13 = new /* invalid duplicate definition of identical inner class */;
lbl35: // 2 sources:
                        var17_12.g.post(var18_13);
                        return;
                    }
                    h.a().a(e.k, String.format((String)"Releasing operation wake lock (%s) %s", (Object[])new Object[]{var4_4, var11_11}), new Throwable[0]);
                    var11_11.release();
                    var17_12 = this.a;
                    var18_13 = new /* invalid duplicate definition of identical inner class */;
                    ** GOTO lbl35
                    {
                        catch (Throwable var2_18) {}
                        {
                            // MONITOREXIT : var20_2
                            throw var2_18;
                        }
                    }
                }
            };
            ((a.i.r.q.m.b)a5).a.execute(runnable);
            return;
        }
        finally {
            wakeLock.release();
        }
    }

}

