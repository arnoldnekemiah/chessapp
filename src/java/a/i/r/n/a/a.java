/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  androidx.work.WorkerParameters
 *  androidx.work.WorkerParameters$a
 *  java.lang.CharSequence
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.concurrent.Executor
 */
package a.i.r.n.a;

import a.i.c;
import a.i.d;
import a.i.h;
import a.i.n;
import a.i.r.j;
import a.i.r.q.i;
import a.i.r.q.m.b;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

public class a
implements a.i.r.d,
a.i.r.o.c,
a.i.r.a {
    public static final String f = h.a("GreedyScheduler");
    public j a;
    public a.i.r.o.d b;
    public List<a.i.r.p.j> c = new ArrayList();
    public boolean d;
    public final Object e;

    public a(Context context, a.i.r.q.m.a a5, j j2) {
        this.a = j2;
        this.b = new a.i.r.o.d(context, a5, this);
        this.e = new Object();
    }

    @Override
    public void a(String string) {
        if (!this.d) {
            this.a.f.a(this);
            this.d = true;
        }
        h.a().a(f, String.format((String)"Cancelling work ID %s", (Object[])new Object[]{string}), new Throwable[0]);
        j j2 = this.a;
        a.i.r.q.m.a a5 = j2.d;
        a.i.r.q.j j5 = new a.i.r.q.j(j2, string);
        ((b)a5).a.execute((Runnable)j5);
    }

    @Override
    public void a(String string, boolean bl) {
        this.b(string);
    }

    @Override
    public void a(List<String> list) {
        for (String string : list) {
            h.a().a(f, String.format((String)"Constraints met: Scheduling work ID %s", (Object[])new Object[]{string}), new Throwable[0]);
            j j2 = this.a;
            a.i.r.q.m.a a5 = j2.d;
            i i10 = new i(j2, string, null);
            ((b)a5).a.execute((Runnable)i10);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public /* varargs */ void a(a.i.r.p.j ... arrj) {
        Object object;
        if (!this.d) {
            this.a.f.a(this);
            this.d = true;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (a.i.r.p.j j2 : arrj) {
            if (j2.b != n.a || j2.d() || j2.g != 0L || j2.c()) continue;
            if (j2.b()) {
                boolean bl;
                if (Build.VERSION.SDK_INT >= 24 && (bl = j2.j.h.a() > 0)) continue;
                arrayList.add((Object)j2);
                arrayList2.add((Object)j2.a);
                continue;
            }
            h h4 = h.a();
            String string = f;
            Object[] arrobject = new Object[]{j2.a};
            h4.a(string, String.format((String)"Starting work for %s", (Object[])arrobject), new Throwable[0]);
            j j5 = this.a;
            String string2 = j2.a;
            a.i.r.q.m.a a5 = j5.d;
            i i10 = new i(j5, string2, null);
            ((b)a5).a.execute((Runnable)i10);
        }
        Object object2 = object = this.e;
        synchronized (object2) {
            if (arrayList.isEmpty()) return;
            h h8 = h.a();
            String string = f;
            Object[] arrobject = new Object[]{TextUtils.join((CharSequence)",", (Iterable)arrayList2)};
            h8.a(string, String.format((String)"Starting tracking for [%s]", (Object[])arrobject), new Throwable[0]);
            this.c.addAll((Collection)arrayList);
            this.b.c(this.c);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(String string) {
        Object object;
        Object object2 = object = this.e;
        synchronized (object2) {
            int n4 = this.c.size();
            int n10 = 0;
            while (n10 < n4) {
                if (((a.i.r.p.j)this.c.get((int)n10)).a.equals((Object)string)) {
                    h.a().a(f, String.format((String)"Stopping tracking for %s", (Object[])new Object[]{string}), new Throwable[0]);
                    this.c.remove(n10);
                    this.b.c(this.c);
                    return;
                }
                ++n10;
            }
            return;
        }
    }

    @Override
    public void b(List<String> list) {
        for (String string : list) {
            h.a().a(f, String.format((String)"Constraints not met: Cancelling work ID %s", (Object[])new Object[]{string}), new Throwable[0]);
            this.a.a(string);
        }
    }
}

