/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Handler
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  androidx.work.WorkerParameters
 *  androidx.work.WorkerParameters$a
 *  androidx.work.impl.WorkDatabase
 *  androidx.work.impl.background.systemalarm.SystemAlarmService
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.List
 */
package a.i.r.n.b;

import a.i.h;
import a.i.r.a;
import a.i.r.c;
import a.i.r.j;
import a.i.r.n.b.b;
import a.i.r.n.b.e;
import a.i.r.n.b.g;
import a.i.r.p.k;
import a.i.r.p.l;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Collections;
import java.util.List;

public class d
implements a.i.r.o.c,
a,
g.b {
    public static final String j = h.a("DelayMetCommandHandler");
    public final Context a;
    public final int b;
    public final String c;
    public final e d;
    public final a.i.r.o.d e;
    public final Object f;
    public int g;
    public PowerManager.WakeLock h;
    public boolean i;

    public d(Context context, int n4, String string, e e6) {
        this.a = context;
        this.b = n4;
        this.d = e6;
        this.c = string;
        a.i.r.q.m.a a5 = e6.b;
        this.e = new a.i.r.o.d(this.a, a5, this);
        this.i = false;
        this.g = 0;
        this.f = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object object;
        Object object2 = object = this.f;
        synchronized (object2) {
            this.e.a();
            this.d.c.a(this.c);
            if (this.h != null && this.h.isHeld()) {
                h h4 = h.a();
                String string = j;
                Object[] arrobject = new Object[]{this.h, this.c};
                h4.a(string, String.format((String)"Releasing wakelock %s for WorkSpec %s", (Object[])arrobject), new Throwable[0]);
                this.h.release();
            }
            return;
        }
    }

    @Override
    public void a(String string) {
        h.a().a(j, String.format((String)"Exceeded time limits on execution for %s", (Object[])new Object[]{string}), new Throwable[0]);
        this.c();
    }

    @Override
    public void a(String string, boolean bl) {
        h h4 = h.a();
        String string2 = j;
        Object[] arrobject = new Object[]{string, bl};
        h4.a(string2, String.format((String)"onExecuted %s, %s", (Object[])arrobject), new Throwable[0]);
        this.a();
        if (bl) {
            Intent intent = b.b(this.a, this.c);
            e e6 = this.d;
            Runnable runnable = new Runnable(e6, intent, this.b){
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
            e6.g.post(runnable);
        }
        if (this.i) {
            Intent intent = b.a(this.a);
            e e10 = this.d;
            Runnable runnable = new /* invalid duplicate definition of identical inner class */;
            e10.g.post(runnable);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(List<String> list) {
        Object object;
        if (!list.contains((Object)this.c)) {
            return;
        }
        Object object2 = object = this.f;
        synchronized (object2) {
            if (this.g == 0) {
                this.g = 1;
                h h4 = h.a();
                String string = j;
                Object[] arrobject = new Object[]{this.c};
                h4.a(string, String.format((String)"onAllConstraintsMet for %s", (Object[])arrobject), new Throwable[0]);
                if (this.d.d.a(this.c, null)) {
                    this.d.c.a(this.c, 600000L, this);
                } else {
                    this.a();
                }
            } else {
                h h8 = h.a();
                String string = j;
                Object[] arrobject = new Object[]{this.c};
                h8.a(string, String.format((String)"Already started work for %s", (Object[])arrobject), new Throwable[0]);
            }
            return;
        }
    }

    public void b() {
        boolean bl;
        Context context = this.a;
        Object[] arrobject = new Object[]{this.c, this.b};
        this.h = a.i.r.q.k.a(context, String.format((String)"%s (%s)", (Object[])arrobject));
        h h4 = h.a();
        String string = j;
        Object[] arrobject2 = new Object[]{this.h, this.c};
        h4.a(string, String.format((String)"Acquiring wakelock %s for WorkSpec %s", (Object[])arrobject2), new Throwable[0]);
        this.h.acquire();
        k k2 = this.d.e.c.k();
        String string2 = this.c;
        a.i.r.p.j j2 = ((l)k2).d(string2);
        if (j2 == null) {
            this.c();
            return;
        }
        this.i = bl = j2.b();
        if (!bl) {
            h h8 = h.a();
            String string3 = j;
            Object[] arrobject3 = new Object[]{this.c};
            h8.a(string3, String.format((String)"No constraints for %s", (Object[])arrobject3), new Throwable[0]);
            this.a((List<String>)Collections.singletonList((Object)this.c));
            return;
        }
        this.e.c((List<a.i.r.p.j>)Collections.singletonList((Object)j2));
    }

    @Override
    public void b(List<String> list) {
        this.c();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        Object object;
        Object object2 = object = this.f;
        synchronized (object2) {
            if (this.g < 2) {
                this.g = 2;
                h h4 = h.a();
                String string = j;
                Object[] arrobject = new Object[]{this.c};
                h4.a(string, String.format((String)"Stopping work for WorkSpec %s", (Object[])arrobject), new Throwable[0]);
                Context context = this.a;
                String string2 = this.c;
                Intent intent = new Intent(context, SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", string2);
                e e6 = this.d;
                Runnable runnable = new /* invalid duplicate definition of identical inner class */;
                e6.g.post(runnable);
                if (this.d.d.b(this.c)) {
                    h h8 = h.a();
                    String string3 = j;
                    Object[] arrobject2 = new Object[]{this.c};
                    h8.a(string3, String.format((String)"WorkSpec %s needs to be rescheduled", (Object[])arrobject2), new Throwable[0]);
                    Intent intent2 = b.b(this.a, this.c);
                    e e10 = this.d;
                    Runnable runnable2 = new /* invalid duplicate definition of identical inner class */;
                    e10.g.post(runnable2);
                } else {
                    h h10 = h.a();
                    String string4 = j;
                    Object[] arrobject3 = new Object[]{this.c};
                    h10.a(string4, String.format((String)"Processor does not have WorkSpec %s. No need to reschedule ", (Object[])arrobject3), new Throwable[0]);
                }
            } else {
                h h11 = h.a();
                String string = j;
                Object[] arrobject = new Object[]{this.c};
                h11.a(string, String.format((String)"Already stopped work for %s", (Object[])arrobject), new Throwable[0]);
            }
            return;
        }
    }
}

