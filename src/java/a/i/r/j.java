/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.BroadcastReceiver$PendingResult
 *  android.content.Context
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  androidx.work.impl.WorkDatabase
 *  androidx.work.impl.utils.ForceStopRunnable
 *  java.lang.Deprecated
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.List
 *  java.util.concurrent.Executor
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package a.i.r;

import a.i.b;
import a.i.h;
import a.i.o;
import a.i.r.c;
import a.i.r.d;
import a.i.r.e;
import a.i.r.p.k;
import a.i.r.p.l;
import a.i.r.q.g;
import a.i.r.q.m.a;
import a.i.r.q.m.b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public class j
extends o {
    public static j j;
    public static j k;
    public static final Object l;
    public Context a;
    public a.i.b b;
    public WorkDatabase c;
    public a d;
    public List<d> e;
    public c f;
    public g g;
    public boolean h;
    public BroadcastReceiver.PendingResult i;

    public static {
        l = new Object();
    }

    public j(Context context, a.i.b b2, a a5) {
        Context context2;
        boolean bl = context.getResources().getBoolean(a.i.l.workmanager_test_configuration);
        Context context3 = context.getApplicationContext();
        WorkDatabase workDatabase = WorkDatabase.a((Context)context3, (Executor)b2.b, (boolean)bl);
        h.a(new h(b2.d){
            public int b;
            {
                this.b = n4;
            }

            public /* varargs */ void a(String string, String string2, Throwable ... arrthrowable) {
                if (this.b <= 3) {
                    if (arrthrowable != null && arrthrowable.length >= 1) {
                        android.util.Log.d((String)string, (String)string2, (Throwable)arrthrowable[0]);
                        return;
                    }
                    android.util.Log.d((String)string, (String)string2);
                }
            }

            public /* varargs */ void b(String string, String string2, Throwable ... arrthrowable) {
                if (this.b <= 6) {
                    if (arrthrowable != null && arrthrowable.length >= 1) {
                        android.util.Log.e((String)string, (String)string2, (Throwable)arrthrowable[0]);
                        return;
                    }
                    android.util.Log.e((String)string, (String)string2);
                }
            }

            public /* varargs */ void c(String string, String string2, Throwable ... arrthrowable) {
                if (this.b <= 4) {
                    if (arrthrowable != null && arrthrowable.length >= 1) {
                        android.util.Log.i((String)string, (String)string2, (Throwable)arrthrowable[0]);
                        return;
                    }
                    android.util.Log.i((String)string, (String)string2);
                }
            }

            public /* varargs */ void d(String string, String string2, Throwable ... arrthrowable) {
                if (this.b <= 5) {
                    if (arrthrowable != null && arrthrowable.length >= 1) {
                        android.util.Log.w((String)string, (String)string2, (Throwable)arrthrowable[0]);
                        return;
                    }
                    android.util.Log.w((String)string, (String)string2);
                }
            }
        });
        Object[] arrobject = new d[]{e.a(context3, this), new a.i.r.n.a.a(context3, a5, this)};
        List list = Arrays.asList((Object[])arrobject);
        c c2 = new c(context, b2, a5, workDatabase, (List<d>)list);
        this.a = context2 = context.getApplicationContext();
        this.b = b2;
        this.d = a5;
        this.c = workDatabase;
        this.e = list;
        this.f = c2;
        this.g = new g(context2);
        this.h = false;
        a a6 = this.d;
        ForceStopRunnable forceStopRunnable = new ForceStopRunnable(context2, this);
        ((b)a6).a.execute((Runnable)forceStopRunnable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static j a(Context context) {
        Object object;
        Object object2 = object = l;
        synchronized (object2) {
            j j2 = j.c();
            if (j2 != null) return j2;
            Context context2 = context.getApplicationContext();
            if (!(context2 instanceof b.b)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            j.a(context2, ((b.b)context2).a());
            return j.a(context2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context context, a.i.b b2) {
        Object object;
        Object object2 = object = l;
        synchronized (object2) {
            if (j != null && k != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class levelJavadoc for more information.");
            }
            if (j == null) {
                Context context2 = context.getApplicationContext();
                if (k == null) {
                    k = new j(context2, b2, new b(b2.b));
                }
                j = k;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Deprecated
    public static j c() {
        Object object;
        Object object2 = object = l;
        synchronized (object2) {
            if (j == null) return k;
            return j;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a() {
        Object object;
        Object object2 = object = l;
        synchronized (object2) {
            this.h = true;
            if (this.i != null) {
                this.i.finish();
                this.i = null;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(BroadcastReceiver.PendingResult pendingResult) {
        Object object;
        Object object2 = object = l;
        synchronized (object2) {
            this.i = pendingResult;
            if (this.h) {
                pendingResult.finish();
                this.i = null;
            }
            return;
        }
    }

    public void a(String string) {
        a a5 = this.d;
        a.i.r.q.j j2 = new a.i.r.q.j(this, string);
        ((b)a5).a.execute((Runnable)j2);
    }

    public void b() {
        if (Build.VERSION.SDK_INT >= 23) {
            a.i.r.n.c.b.a(this.a);
        }
        l l8 = (l)this.c.k();
        l8.a.b();
        a.g.a.f.e e6 = l8.i.a();
        l8.a.c();
        try {
            e6.a();
            l8.a.g();
        }
        catch (Throwable throwable) {
            l8.a.d();
            l8.i.a(e6);
            throw throwable;
        }
        l8.a.d();
        a.f.j j2 = l8.i;
        if (e6 == j2.c) {
            j2.a.set(false);
        }
        e.a(this.b, this.c, this.e);
    }
}

