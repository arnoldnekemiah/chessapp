/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  c.b.b.a.b.j.c
 *  c.b.b.a.e.d.q3
 *  c.b.b.a.e.d.z8
 *  c.b.b.a.f.b.a4
 *  c.b.b.a.f.b.e5
 *  c.b.b.a.f.b.f3
 *  c.b.b.a.f.b.h4
 *  c.b.b.a.f.b.i6
 *  c.b.b.a.f.b.j5
 *  c.b.b.a.f.b.t2
 *  c.b.b.a.f.b.u2
 *  c.b.b.a.f.b.v9
 *  c.b.b.a.f.b.y3
 *  com.google.android.gms.internal.measurement.zzy
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.concurrent.atomic.AtomicInteger
 *  org.checkerframework.dataflow.qual.Pure
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import c.b.b.a.b.j.b;
import c.b.b.a.b.j.c;
import c.b.b.a.e.d.q3;
import c.b.b.a.e.d.z8;
import c.b.b.a.f.b.a4;
import c.b.b.a.f.b.b3;
import c.b.b.a.f.b.c3;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.d5;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.e5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.h4;
import c.b.b.a.f.b.i6;
import c.b.b.a.f.b.j5;
import c.b.b.a.f.b.j6;
import c.b.b.a.f.b.l;
import c.b.b.a.f.b.n6;
import c.b.b.a.f.b.n8;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.u2;
import c.b.b.a.f.b.u3;
import c.b.b.a.f.b.v9;
import c.b.b.a.f.b.x3;
import c.b.b.a.f.b.y3;
import c.b.b.a.f.b.y6;
import c.b.b.a.f.b.y7;
import c.b.b.a.f.b.z1;
import c.b.b.a.f.b.z2;
import com.google.android.gms.internal.measurement.zzy;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.dataflow.qual.Pure;

public final class i4
implements e5 {
    public static volatile i4 I;
    public long A;
    public volatile Boolean B;
    public Boolean C;
    public Boolean D;
    public volatile boolean E;
    public int F;
    public final AtomicInteger G;
    public final long H;
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final v9 f;
    public final e g;
    public final u3 h;
    public final h3 i;
    public final f4 j;
    public final n8 k;
    public final g9 l;
    public final c3 m;
    public final b n;
    public final y6 o;
    public final j6 p;
    public final z1 q;
    public final n6 r;
    public final String s;
    public b3 t;
    public y7 u;
    public l v;
    public z2 w;
    public y3 x;
    public boolean y;
    public Boolean z;

    public i4(j5 j52) {
        block6 : {
            block8 : {
                f3 f32;
                String string;
                block9 : {
                    block7 : {
                        long l6;
                        block5 : {
                            c c8;
                            block4 : {
                                Bundle bundle;
                                v9 v92;
                                this.y = false;
                                this.G = new AtomicInteger(0);
                                a.a(j52);
                                this.f = v92 = new v9();
                                a.f = v92;
                                this.a = j52.a;
                                this.b = j52.b;
                                this.c = j52.c;
                                this.d = j52.d;
                                this.e = j52.h;
                                this.B = j52.e;
                                this.s = j52.j;
                                this.E = true;
                                zzy zzy2 = j52.g;
                                if (zzy2 != null && (bundle = zzy2.g) != null) {
                                    Object object;
                                    Object object2 = bundle.get("measurementEnabled");
                                    if (object2 instanceof Boolean) {
                                        this.C = (Boolean)object2;
                                    }
                                    if ((object = zzy2.g.get("measurementDeactivated")) instanceof Boolean) {
                                        this.D = (Boolean)object;
                                    }
                                }
                                q3.a((Context)this.a);
                                c8 = c.a;
                                this.n = c8;
                                Long l7 = j52.i;
                                if (l7 == null) break block4;
                                l6 = l7;
                                break block5;
                            }
                            if (c8 == null) break block6;
                            l6 = System.currentTimeMillis();
                        }
                        this.H = l6;
                        this.g = new e(this);
                        u3 u32 = new u3(this);
                        u32.l();
                        this.h = u32;
                        h3 h32 = new h3(this);
                        h32.l();
                        this.i = h32;
                        g9 g92 = new g9(this);
                        g92.l();
                        this.l = g92;
                        c3 c32 = new c3(this);
                        c32.l();
                        this.m = c32;
                        this.q = new z1(this);
                        y6 y62 = new y6(this);
                        y62.i();
                        this.o = y62;
                        j6 j62 = new j6(this);
                        j62.i();
                        this.p = j62;
                        n8 n82 = new n8(this);
                        n82.i();
                        this.k = n82;
                        n6 n62 = new n6(this);
                        n62.l();
                        this.r = n62;
                        f4 f42 = new f4(this);
                        f42.l();
                        this.j = f42;
                        zzy zzy3 = j52.g;
                        boolean bl = zzy3 == null || zzy3.b == 0L;
                        if (!(this.a.getApplicationContext() instanceof Application)) break block7;
                        j6 j63 = this.o();
                        if (!(j63.a.a.getApplicationContext() instanceof Application)) break block8;
                        Application application = (Application)j63.a.a.getApplicationContext();
                        if (j63.c == null) {
                            j63.c = new i6(j63);
                        }
                        if (!bl) break block8;
                        application.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)j63.c);
                        application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)j63.c);
                        f32 = j63.a.a().n;
                        string = "Registered activity lifecycle callback";
                        break block9;
                    }
                    f32 = this.a().i;
                    string = "Application context is not an Application";
                }
                f32.a(string);
            }
            this.j.a((Runnable)new h4(this, j52));
            return;
        }
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static i4 a(Context context, zzy zzy2, Long l6) {
        Bundle bundle;
        if (zzy2 != null && (zzy2.e == null || zzy2.f == null)) {
            zzy zzy3;
            zzy2 = zzy3 = new zzy(zzy2.a, zzy2.b, zzy2.c, zzy2.d, null, null, zzy2.g, null);
        }
        a.a(context);
        a.a(context.getApplicationContext());
        if (I == null) {
            Class<i4> class_ = i4.class;
            synchronized (i4.class) {
                if (I == null) {
                    I = new i4(new j5(context, zzy2, l6));
                }
                // ** MonitorExit[var10_4] (shouldn't be in output)
            }
        } else if (zzy2 != null && (bundle = zzy2.g) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            a.a(I);
            i4.I.B = zzy2.g.getBoolean("dataCollectionDefaultEnabled");
        }
        {
            a.a(I);
            return I;
        }
    }

    public static final void a(c5 c52) {
        if (c52 != null) {
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    public static final void a(d5 d52) {
        if (d52 != null) {
            if (d52.j()) {
                return;
            }
            String string = String.valueOf((Object)d52.getClass());
            throw new IllegalStateException(c.a.b.a.a.a(new StringBuilder(27 + string.length()), "Component not initialized: ", string));
        }
        throw new IllegalStateException("Component not created");
    }

    public static final void a(x3 x32) {
        if (x32 != null) {
            if (x32.b) {
                return;
            }
            String string = String.valueOf((Object)x32.getClass());
            throw new IllegalStateException(c.a.b.a.a.a(new StringBuilder(27 + string.length()), "Component not initialized: ", string));
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final h3 a() {
        i4.a(this.i);
        return this.i;
    }

    @Pure
    public final b b() {
        return this.n;
    }

    @Pure
    public final v9 c() {
        return this.f;
    }

    @Pure
    public final f4 d() {
        i4.a(this.j);
        return this.j;
    }

    @Pure
    public final Context e() {
        return this.a;
    }

    @Pure
    public final z2 f() {
        i4.a(this.w);
        return this.w;
    }

    @Pure
    public final z1 g() {
        z1 z12 = this.q;
        if (z12 != null) {
            return z12;
        }
        throw new IllegalStateException("Component not created");
    }

    public final boolean h() {
        return this.B != null && this.B != false;
    }

    public final boolean i() {
        return this.j() == 0;
    }

    public final int j() {
        Boolean bl;
        this.d().g();
        if (this.g.l()) {
            return 1;
        }
        Boolean bl2 = this.D;
        if (bl2 != null && bl2.booleanValue()) {
            return 2;
        }
        z8.c();
        if (this.g.c(null, (t2<Boolean>)u2.w0)) {
            this.d().g();
            if (!this.E) {
                return 8;
            }
        }
        if ((bl = this.m().o()) != null) {
            if (bl.booleanValue()) {
                return 0;
            }
            return 3;
        }
        e e6 = this.g;
        Boolean bl3 = e6.c("firebase_analytics_collection_enabled");
        if (bl3 != null) {
            if (bl3.booleanValue()) {
                return 0;
            }
            return 4;
        }
        Boolean bl4 = this.C;
        if (bl4 != null) {
            if (bl4.booleanValue()) {
                return 0;
            }
            return 5;
        }
        if (this.g.c(null, (t2<Boolean>)u2.T) && this.B != null) {
            if (this.B.booleanValue()) {
                return 0;
            }
            return 7;
        }
        return 0;
    }

    public final boolean k() {
        block2 : {
            block6 : {
                block4 : {
                    boolean bl;
                    block8 : {
                        block7 : {
                            Boolean bl2;
                            block3 : {
                                block5 : {
                                    if (!this.y) break block2;
                                    this.d().g();
                                    Boolean bl3 = this.z;
                                    if (bl3 == null || this.A == 0L) break block3;
                                    if (bl3.booleanValue()) break block4;
                                    if ((c)this.n == null) break block5;
                                    if (Math.abs((long)(SystemClock.elapsedRealtime() - this.A)) <= 1000L) break block4;
                                    break block3;
                                }
                                throw null;
                            }
                            if ((c)this.n == null) break block6;
                            this.A = SystemClock.elapsedRealtime();
                            boolean bl4 = this.p().a("android.permission.INTERNET") && this.p().a("android.permission.ACCESS_NETWORK_STATE") && (c.b.b.a.b.k.b.b(this.a).a() || this.g.o() || a4.a((Context)this.a) && g9.a(this.a));
                            this.z = bl2 = Boolean.valueOf((boolean)bl4);
                            if (!bl2.booleanValue()) break block4;
                            g9 g92 = this.p();
                            String string = this.f().m();
                            z2 z22 = this.f();
                            z22.h();
                            String string2 = z22.l;
                            z2 z23 = this.f();
                            z23.h();
                            a.a(z23.m);
                            if (g92.a(string, string2, z23.m)) break block7;
                            z2 z24 = this.f();
                            z24.h();
                            boolean bl5 = TextUtils.isEmpty((CharSequence)z24.l);
                            bl = false;
                            if (bl5) break block8;
                        }
                        bl = true;
                    }
                    this.z = bl;
                }
                return this.z;
            }
            throw null;
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    @Pure
    public final e l() {
        return this.g;
    }

    @Pure
    public final u3 m() {
        i4.a((c5)this.h);
        return this.h;
    }

    @Pure
    public final n8 n() {
        i4.a(this.k);
        return this.k;
    }

    @Pure
    public final j6 o() {
        i4.a(this.p);
        return this.p;
    }

    @Pure
    public final g9 p() {
        i4.a((c5)this.l);
        return this.l;
    }

    @Pure
    public final c3 q() {
        i4.a((c5)this.m);
        return this.m;
    }

    @Pure
    public final b3 r() {
        i4.a(this.t);
        return this.t;
    }

    @Pure
    public final n6 s() {
        i4.a(this.r);
        return this.r;
    }

    @Pure
    public final boolean t() {
        return TextUtils.isEmpty((CharSequence)this.b);
    }

    @Pure
    public final y6 u() {
        i4.a(this.o);
        return this.o;
    }

    @Pure
    public final y7 v() {
        i4.a(this.u);
        return this.u;
    }

    @Pure
    public final l w() {
        i4.a(this.v);
        return this.v;
    }
}

