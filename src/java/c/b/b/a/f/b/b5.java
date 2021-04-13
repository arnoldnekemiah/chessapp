/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Binder
 *  android.os.Bundle
 *  android.text.TextUtils
 *  c.b.b.a.b.j.c
 *  c.b.b.a.e.d.z8
 *  c.b.b.a.f.b.a5
 *  c.b.b.a.f.b.a9
 *  c.b.b.a.f.b.d4
 *  c.b.b.a.f.b.e4
 *  c.b.b.a.f.b.e9
 *  c.b.b.a.f.b.f3
 *  c.b.b.a.f.b.j4
 *  c.b.b.a.f.b.k4
 *  c.b.b.a.f.b.l4
 *  c.b.b.a.f.b.m4
 *  c.b.b.a.f.b.n4
 *  c.b.b.a.f.b.o4
 *  c.b.b.a.f.b.p4
 *  c.b.b.a.f.b.q4
 *  c.b.b.a.f.b.r4
 *  c.b.b.a.f.b.s4
 *  c.b.b.a.f.b.t2
 *  c.b.b.a.f.b.t4
 *  c.b.b.a.f.b.u2
 *  c.b.b.a.f.b.u4
 *  c.b.b.a.f.b.v4
 *  c.b.b.a.f.b.v8
 *  c.b.b.a.f.b.w4
 *  c.b.b.a.f.b.y4
 *  c.b.b.a.f.b.z4
 *  com.google.android.gms.measurement.internal.zzaa
 *  com.google.android.gms.measurement.internal.zzas
 *  com.google.android.gms.measurement.internal.zzkg
 *  com.google.android.gms.measurement.internal.zzp
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Thread
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.Callable
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Future
 *  java.util.concurrent.FutureTask
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import c.b.b.a.b.d;
import c.b.b.a.b.j.b;
import c.b.b.a.b.j.c;
import c.b.b.a.e.d.z8;
import c.b.b.a.f.b.a5;
import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.c3;
import c.b.b.a.f.b.d4;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.e4;
import c.b.b.a.f.b.e9;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.j4;
import c.b.b.a.f.b.k4;
import c.b.b.a.f.b.l4;
import c.b.b.a.f.b.m4;
import c.b.b.a.f.b.n4;
import c.b.b.a.f.b.o4;
import c.b.b.a.f.b.p4;
import c.b.b.a.f.b.q4;
import c.b.b.a.f.b.r4;
import c.b.b.a.f.b.s4;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.t4;
import c.b.b.a.f.b.u2;
import c.b.b.a.f.b.u4;
import c.b.b.a.f.b.v4;
import c.b.b.a.f.b.v8;
import c.b.b.a.f.b.w2;
import c.b.b.a.f.b.w4;
import c.b.b.a.f.b.y4;
import c.b.b.a.f.b.z4;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzkg;
import com.google.android.gms.measurement.internal.zzp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class b5
extends w2 {
    public final a9 a;
    public Boolean b;
    public String c;

    public b5(a9 a92) {
        a.a(a92);
        this.a = a92;
        this.c = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List<zzkg> a(zzp zzp2, boolean bl) {
        void var6_11;
        this.f(zzp2);
        String string = zzp2.a;
        a.a(string);
        FutureTask futureTask = (FutureTask)this.a.d().a(new y4(this, string));
        try {
            List list = (List)futureTask.get();
            ArrayList arrayList = new ArrayList(list.size());
            Iterator iterator = list.iterator();
            do {
                if (!iterator.hasNext()) {
                    return arrayList;
                }
                e9 e92 = (e9)iterator.next();
                if (!bl && g9.h(e92.c)) continue;
                arrayList.add((Object)new zzkg(e92));
            } while (true);
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        this.a.a().f.a("Failed to get user properties. appId", h3.a(zzp2.a), (Object)var6_11);
        return null;
    }

    public final List<zzaa> a(String string, String string2, zzp zzp2) {
        void var7_9;
        this.f(zzp2);
        String string3 = zzp2.a;
        a.a(string3);
        FutureTask futureTask = (FutureTask)this.a.d().a(new o4(this, string3, string, string2));
        try {
            List list = (List)futureTask.get();
            return list;
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        this.a.a().f.a("Failed to get conditional user properties", (Object)var7_9);
        return Collections.emptyList();
    }

    public final List<zzaa> a(String string, String string2, String string3) {
        void var5_8;
        this.a(string, true);
        FutureTask futureTask = (FutureTask)this.a.d().a(new p4(this, string, string2, string3));
        try {
            List list = (List)futureTask.get();
            return list;
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        this.a.a().f.a("Failed to get conditional user properties as", (Object)var5_8);
        return Collections.emptyList();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List<zzkg> a(String string, String string2, String string3, boolean bl) {
        void var6_12;
        this.a(string, true);
        FutureTask futureTask = (FutureTask)this.a.d().a(new n4(this, string, string2, string3));
        try {
            List list = (List)futureTask.get();
            ArrayList arrayList = new ArrayList(list.size());
            Iterator iterator = list.iterator();
            do {
                if (!iterator.hasNext()) {
                    return arrayList;
                }
                e9 e92 = (e9)iterator.next();
                if (!bl && g9.h(e92.c)) continue;
                arrayList.add((Object)new zzkg(e92));
            } while (true);
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        this.a.a().f.a("Failed to get user properties as. appId", h3.a(string), (Object)var6_12);
        return Collections.emptyList();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List<zzkg> a(String string, String string2, boolean bl, zzp zzp2) {
        void var8_13;
        this.f(zzp2);
        String string3 = zzp2.a;
        a.a(string3);
        FutureTask futureTask = (FutureTask)this.a.d().a(new m4(this, string3, string, string2));
        try {
            List list = (List)futureTask.get();
            ArrayList arrayList = new ArrayList(list.size());
            Iterator iterator = list.iterator();
            do {
                if (!iterator.hasNext()) {
                    return arrayList;
                }
                e9 e92 = (e9)iterator.next();
                if (!bl && g9.h(e92.c)) continue;
                arrayList.add((Object)new zzkg(e92));
            } while (true);
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        this.a.a().f.a("Failed to query user properties. appId", h3.a(zzp2.a), (Object)var8_13);
        return Collections.emptyList();
    }

    public final void a(long l6, String string, String string2, String string3) {
        a5 a52 = new a5(this, string2, string3, string, l6);
        this.a((Runnable)a52);
    }

    public final void a(Bundle bundle, zzp zzp2) {
        this.f(zzp2);
        String string = zzp2.a;
        a.a(string);
        this.a((Runnable)new j4(this, string, bundle));
    }

    public final void a(zzaa zzaa2) {
        a.a(zzaa2);
        a.a(zzaa2.c);
        a.c(zzaa2.a);
        this.a(zzaa2.a, true);
        this.a((Runnable)new l4(this, new zzaa(zzaa2)));
    }

    public final void a(zzaa zzaa2, zzp zzp2) {
        a.a(zzaa2);
        a.a(zzaa2.c);
        this.f(zzp2);
        zzaa zzaa3 = new zzaa(zzaa2);
        zzaa3.a = zzp2.a;
        this.a((Runnable)new k4(this, zzaa3, zzp2));
    }

    public final void a(zzas zzas2, zzp zzp2) {
        a.a(zzas2);
        this.f(zzp2);
        this.a((Runnable)new t4(this, zzas2, zzp2));
    }

    public final void a(zzas zzas2, String string, String string2) {
        a.a(zzas2);
        a.c(string);
        this.a(string, true);
        this.a((Runnable)new u4(this, zzas2, string));
    }

    public final void a(zzkg zzkg2, zzp zzp2) {
        a.a(zzkg2);
        this.f(zzp2);
        this.a((Runnable)new w4(this, zzkg2, zzp2));
    }

    public final void a(zzp zzp2) {
        z8.c();
        if (this.a.j.g.c(null, (t2<Boolean>)u2.y0)) {
            a.c(zzp2.a);
            a.a(zzp2.v);
            s4 s42 = new s4(this, zzp2);
            a.a(s42);
            if (this.a.d().n()) {
                s42.run();
                return;
            }
            this.a.d().b((Runnable)s42);
        }
    }

    public final void a(Runnable runnable) {
        a.a(runnable);
        if (this.a.d().n()) {
            runnable.run();
            return;
        }
        this.a.d().a(runnable);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void a(String var1_1, boolean var2_2) {
        block8 : {
            block7 : {
                block6 : {
                    if (TextUtils.isEmpty((CharSequence)var1_1)) {
                        this.a.a().f.a("Measurement Service called without app package");
                        throw new SecurityException("Measurement Service called without app package");
                    }
                    if (!var2_2) ** GOTO lbl11
                    try {
                        if (this.b == null) {
                            if (!"com.google.android.gms".equals((Object)this.c) && !a.a(this.a.j.a, Binder.getCallingUid()) && !c.b.b.a.b.e.a(this.a.j.a).a(Binder.getCallingUid())) break block6;
                            break block7;
                        }
lbl9: // 3 sources:
                        do {
                            if (this.b != false) return;
lbl11: // 2 sources:
                            if (this.c == null && d.a(this.a.j.a, Binder.getCallingUid(), var1_1)) {
                                this.c = var1_1;
                            }
                            if (!var1_1.equals((Object)this.c)) throw new SecurityException(String.format((String)"Unknown calling package name '%s'.", (Object[])new Object[]{var1_1}));
                            return;
                            break;
                        } while (true);
                    }
                    catch (SecurityException var3_4) {
                        this.a.a().f.a("Measurement Service called with invalid calling package. appId", h3.a(var1_1));
                        throw var3_4;
                    }
                }
                var4_3 = false;
                break block8;
            }
            var4_3 = true;
        }
        this.b = var4_3;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final byte[] a(zzas zzas2, String string) {
        void var11_11;
        a.c(string);
        a.a(zzas2);
        this.a(string, true);
        this.a.a().m.a("Log and bundle. event", (Object)this.a.s().a(zzas2.a));
        if ((c)this.a.j.n == null) {
            throw null;
        }
        long l6 = System.nanoTime() / 1000000L;
        f4 f42 = this.a.d();
        v4 v42 = new v4(this, zzas2, string);
        f42.k();
        a.a(v42);
        d4 d42 = new d4(f42, (Callable)v42, true);
        if (Thread.currentThread() == f42.c) {
            d42.run();
        } else {
            f42.a(d42);
        }
        try {
            byte[] arrby = (byte[])d42.get();
            if (arrby == null) {
                this.a.a().f.a("Log and bundle returned null. appId", h3.a(string));
                arrby = new byte[]{};
            }
            if ((c)this.a.j.n != null) {
                long l7 = System.nanoTime();
                this.a.a().m.a("Log and bundle processed. event, size, time_ms", (Object)this.a.s().a(zzas2.a), (Object)arrby.length, (Object)(l7 / 1000000L - l6));
                return arrby;
            }
            throw null;
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        this.a.a().f.a("Failed to log and bundle. appId, event, error", h3.a(string), (Object)this.a.s().a(zzas2.a), (Object)var11_11);
        return null;
    }

    public final void b(zzp zzp2) {
        this.f(zzp2);
        this.a((Runnable)new z4(this, zzp2));
    }

    public final void c(zzp zzp2) {
        this.f(zzp2);
        this.a((Runnable)new r4(this, zzp2));
    }

    public final String d(zzp zzp2) {
        void var4_10;
        a9 a92;
        this.f(zzp2);
        a92 = this.a;
        Future future = a92.j.d().a(new v8(a92, zzp2));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        FutureTask futureTask = (FutureTask)future;
        try {
            String string = (String)futureTask.get(30000L, timeUnit);
            return string;
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
        }
        catch (TimeoutException timeoutException) {
            // empty catch block
        }
        a92.j.a().f.a("Failed to get app instance id. appId", h3.a(zzp2.a), (Object)var4_10);
        return null;
    }

    public final void e(zzp zzp2) {
        a.c(zzp2.a);
        this.a(zzp2.a, false);
        this.a((Runnable)new q4(this, zzp2));
    }

    public final void f(zzp zzp2) {
        a.a(zzp2);
        a.c(zzp2.a);
        this.a(zzp2.a, false);
        this.a.j.p().a(zzp2.b, zzp2.q, zzp2.u);
    }
}

