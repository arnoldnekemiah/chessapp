/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  c.b.b.a.b.j.c
 *  c.b.b.a.e.d.ab
 *  c.b.b.a.e.d.o9
 *  c.b.b.a.e.d.p9
 *  c.b.b.a.e.d.u9
 *  c.b.b.a.e.d.z8
 *  c.b.b.a.f.b.a7
 *  c.b.b.a.f.b.b7
 *  c.b.b.a.f.b.d9
 *  c.b.b.a.f.b.e6
 *  c.b.b.a.f.b.e7
 *  c.b.b.a.f.b.f
 *  c.b.b.a.f.b.f3
 *  c.b.b.a.f.b.f6
 *  c.b.b.a.f.b.f9
 *  c.b.b.a.f.b.g6
 *  c.b.b.a.f.b.h5
 *  c.b.b.a.f.b.i5
 *  c.b.b.a.f.b.i6
 *  c.b.b.a.f.b.k
 *  c.b.b.a.f.b.k7
 *  c.b.b.a.f.b.l5
 *  c.b.b.a.f.b.l7
 *  c.b.b.a.f.b.l8
 *  c.b.b.a.f.b.l9
 *  c.b.b.a.f.b.m8
 *  c.b.b.a.f.b.n5
 *  c.b.b.a.f.b.o9
 *  c.b.b.a.f.b.p5
 *  c.b.b.a.f.b.p6
 *  c.b.b.a.f.b.q3
 *  c.b.b.a.f.b.q5
 *  c.b.b.a.f.b.r3
 *  c.b.b.a.f.b.s5
 *  c.b.b.a.f.b.t2
 *  c.b.b.a.f.b.t3
 *  c.b.b.a.f.b.t5
 *  c.b.b.a.f.b.u2
 *  c.b.b.a.f.b.y3
 *  com.google.android.gms.measurement.internal.zzkg
 *  com.google.android.gms.measurement.internal.zzp
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.util.List
 *  java.util.Locale
 *  java.util.Set
 *  java.util.concurrent.CopyOnWriteArraySet
 *  java.util.concurrent.atomic.AtomicLong
 *  java.util.concurrent.atomic.AtomicReference
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c.b.b.a.b.j.b;
import c.b.b.a.b.j.c;
import c.b.b.a.e.d.ab;
import c.b.b.a.e.d.p9;
import c.b.b.a.e.d.u9;
import c.b.b.a.e.d.z8;
import c.b.b.a.f.b.a7;
import c.b.b.a.f.b.b3;
import c.b.b.a.f.b.b7;
import c.b.b.a.f.b.c3;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.d9;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.e6;
import c.b.b.a.f.b.e7;
import c.b.b.a.f.b.f;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.f6;
import c.b.b.a.f.b.f9;
import c.b.b.a.f.b.g6;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.h5;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.i5;
import c.b.b.a.f.b.i6;
import c.b.b.a.f.b.k;
import c.b.b.a.f.b.k7;
import c.b.b.a.f.b.l;
import c.b.b.a.f.b.l5;
import c.b.b.a.f.b.l7;
import c.b.b.a.f.b.l8;
import c.b.b.a.f.b.l9;
import c.b.b.a.f.b.m8;
import c.b.b.a.f.b.n5;
import c.b.b.a.f.b.n8;
import c.b.b.a.f.b.o9;
import c.b.b.a.f.b.p5;
import c.b.b.a.f.b.p6;
import c.b.b.a.f.b.q3;
import c.b.b.a.f.b.q5;
import c.b.b.a.f.b.r3;
import c.b.b.a.f.b.s5;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.t3;
import c.b.b.a.f.b.t5;
import c.b.b.a.f.b.u2;
import c.b.b.a.f.b.u3;
import c.b.b.a.f.b.x3;
import c.b.b.a.f.b.y3;
import c.b.b.a.f.b.y5;
import c.b.b.a.f.b.y6;
import c.b.b.a.f.b.y7;
import com.google.android.gms.measurement.internal.zzkg;
import com.google.android.gms.measurement.internal.zzp;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class j6
extends x3 {
    public i6 c;
    public l9 d;
    public final Set<i5> e = new CopyOnWriteArraySet();
    public boolean f;
    public final AtomicReference<String> g = new AtomicReference();
    public final Object h = new Object();
    public f i = new f(null, null);
    public int j = 100;
    public final AtomicLong k = new AtomicLong(0L);
    public long l = -1L;
    public int m = 100;
    public final o9 n;
    public boolean o = true;
    public final f9 p = new y5(this);

    public j6(i4 i42) {
        super(i42);
        this.n = new o9(i42);
    }

    public static /* synthetic */ void a(j6 j62, f f10, int n7, long l6, boolean bl, boolean bl2) {
        j62.g();
        j62.h();
        if (l6 <= j62.l && f.a((int)j62.m, (int)n7)) {
            j62.a.a().l.a("Dropped out-of-date consent setting, proposed settings", (Object)f10);
            return;
        }
        u3 u32 = j62.a.m();
        z8.c();
        if (u32.a.g.c(null, (t2<Boolean>)u2.w0)) {
            u32.g();
            if (u32.a(n7)) {
                SharedPreferences.Editor editor = u32.n().edit();
                editor.putString("consent_settings", f10.a());
                editor.putInt("consent_source", n7);
                editor.apply();
                j62.l = l6;
                j62.m = n7;
                y7 y72 = j62.a.v();
                if (y72 != null) {
                    z8.c();
                    if (y72.a.g.c(null, (t2<Boolean>)u2.w0)) {
                        y72.g();
                        y72.h();
                        if (bl) {
                            y72.q();
                            y72.a.r().l();
                        }
                        if (y72.p()) {
                            y72.a((Runnable)new l7(y72, y72.a(false)));
                        }
                    }
                    if (bl2) {
                        j62.a.v().a((AtomicReference<String>)new AtomicReference());
                    }
                    return;
                }
                throw null;
            }
        }
        j62.a.a().l.a("Lower precedence consent source ignored, proposed source", (Object)n7);
    }

    public final void a(long l6, boolean bl) {
        this.g();
        this.h();
        this.a.a().m.a("Resetting analytics data (FE)");
        n8 n82 = this.a.n();
        n82.g();
        l8 l82 = n82.e;
        l82.c.b();
        l82.a = 0L;
        l82.b = 0L;
        boolean bl2 = this.a.i();
        u3 u32 = this.a.m();
        u32.j.a(l6);
        if (!TextUtils.isEmpty((CharSequence)u32.a.m().y.a())) {
            u32.y.a(null);
        }
        u9.c();
        if (u32.a.g.c(null, (t2<Boolean>)u2.p0)) {
            u32.t.a(0L);
        }
        if (!u32.a.g.l()) {
            u32.a(bl2 ^ true);
        }
        u32.z.a(null);
        u32.A.a(0L);
        u32.B.a(null);
        if (bl) {
            y7 y72 = this.a.v();
            y72.g();
            y72.h();
            zzp zzp2 = y72.a(false);
            y72.q();
            y72.a.r().l();
            y72.a((Runnable)new b7(y72, zzp2));
        }
        u9.c();
        if (this.a.g.c(null, (t2<Boolean>)u2.p0)) {
            this.a.n().d.a();
        }
        this.o = bl2 ^ true;
    }

    public final void a(Bundle bundle, int n7, long l6) {
        z8.c();
        if (this.a.g.c(null, (t2<Boolean>)u2.w0)) {
            this.h();
            String string = f.a((Bundle)bundle);
            if (string != null) {
                this.a.a().k.a("Ignoring invalid consent setting", (Object)string);
                this.a.a().k.a("Valid consent values are 'granted', 'denied'");
            }
            this.a(f.b((Bundle)bundle), n7, l6);
        }
    }

    public final void a(Bundle bundle, long l6) {
        a.a(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty((CharSequence)bundle2.getString("app_id"))) {
            this.a.a().i.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        a.a(bundle2);
        a.a(bundle2, "app_id", String.class, null);
        a.a(bundle2, "origin", String.class, null);
        a.a(bundle2, "name", String.class, null);
        a.a(bundle2, "value", Object.class, null);
        a.a(bundle2, "trigger_event_name", String.class, null);
        Long l10 = 0L;
        a.a(bundle2, "trigger_timeout", Long.class, l10);
        a.a(bundle2, "timed_out_event_name", String.class, null);
        a.a(bundle2, "timed_out_event_params", Bundle.class, null);
        a.a(bundle2, "triggered_event_name", String.class, null);
        a.a(bundle2, "triggered_event_params", Bundle.class, null);
        a.a(bundle2, "time_to_live", Long.class, l10);
        a.a(bundle2, "expired_event_name", String.class, null);
        a.a(bundle2, "expired_event_params", Bundle.class, null);
        a.c(bundle2.getString("name"));
        a.c(bundle2.getString("origin"));
        a.a(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", l6);
        String string = bundle2.getString("name");
        Object object = bundle2.get("value");
        if (this.a.p().e(string) == 0) {
            if (this.a.p().b(string, object) == 0) {
                Object object2 = this.a.p().c(string, object);
                if (object2 == null) {
                    this.a.a().f.a("Unable to normalize conditional user property value", (Object)this.a.q().c(string), object);
                    return;
                }
                a.a(bundle2, object2);
                long l11 = bundle2.getLong("trigger_timeout");
                if (!(TextUtils.isEmpty((CharSequence)bundle2.getString("trigger_event_name")) || l11 <= 15552000000L && l11 >= 1L)) {
                    this.a.a().f.a("Invalid conditional user property timeout", (Object)this.a.q().c(string), (Object)l11);
                    return;
                }
                long l12 = bundle2.getLong("time_to_live");
                i4 i42 = this.a;
                if (l12 <= 15552000000L && l12 >= 1L) {
                    i42.d().a((Runnable)new s5(this, bundle2));
                    return;
                }
                this.a.a().f.a("Invalid conditional user property time to live", (Object)this.a.q().c(string), (Object)l12);
                return;
            }
            this.a.a().f.a("Invalid conditional user property value", (Object)this.a.q().c(string), object);
            return;
        }
        this.a.a().f.a("Invalid conditional user property name", (Object)this.a.q().c(string));
    }

    public final void a(f f10) {
        this.g();
        boolean bl = f10.c() && f10.b() || this.a.v().p();
        i4 i42 = this.a;
        i42.d().g();
        if (bl != i42.E) {
            i4 i43 = this.a;
            i43.d().g();
            i43.E = bl;
            u3 u32 = this.a.m();
            z8.c();
            boolean bl2 = u32.a.g.c(null, (t2<Boolean>)u2.w0);
            Boolean bl3 = null;
            if (bl2) {
                u32.g();
                boolean bl4 = u32.n().contains("measurement_enabled_from_api");
                bl3 = null;
                if (bl4) {
                    bl3 = u32.n().getBoolean("measurement_enabled_from_api", true);
                }
            }
            if (!bl || bl3 == null || bl3.booleanValue()) {
                this.a(bl, false);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(f f10, int n7, long l6) {
        int n9;
        long l10;
        boolean bl;
        block15 : {
            int n10;
            block17 : {
                block16 : {
                    boolean bl2;
                    boolean bl3;
                    block14 : {
                        block13 : {
                            f f11;
                            Object object;
                            Boolean bl4;
                            z8.c();
                            if (!this.a.g.c(null, (t2<Boolean>)u2.w0)) return;
                            this.h();
                            if (this.a.g.c(null, (t2<Boolean>)u2.x0) && n7 == 20) {
                                n9 = 20;
                            } else {
                                if (f10.a == null && f10.b == null) {
                                    this.a.a().k.a("Discarding empty consent settings");
                                    return;
                                }
                                n9 = n7;
                            }
                            Object object2 = object = this.h;
                            // MONITORENTER : object2
                            boolean bl5 = f.a((int)n9, (int)this.j);
                            bl2 = true;
                            if (!bl5) break block13;
                            boolean bl6 = f10.a(this.i);
                            boolean bl7 = f10.c();
                            boolean bl8 = false;
                            if (bl7) {
                                boolean bl9 = this.i.c();
                                bl8 = false;
                                if (!bl9) {
                                    bl8 = true;
                                }
                            }
                            f f12 = this.i;
                            Boolean bl10 = f10.a;
                            if (bl10 == null) {
                                bl10 = f12.a;
                            }
                            if ((bl4 = f10.b) == null) {
                                bl4 = f12.b;
                            }
                            this.i = f11 = new f(bl10, bl4);
                            this.j = n9;
                            bl = bl8;
                            f10 = f11;
                            bl3 = bl6;
                            // MONITOREXIT : object2
                            break block14;
                        }
                        bl2 = false;
                        bl3 = false;
                        bl = false;
                    }
                    if (!bl2) {
                        this.a.a().l.a("Ignoring lower-priority consent settings, proposed settings", (Object)f10);
                        return;
                    }
                    l10 = this.k.getAndIncrement();
                    if (bl3) {
                        this.g.set(null);
                        f4 f42 = this.a.d();
                        e6 e62 = new e6(this, f10, l6, n9, l10, bl);
                        f42.b((Runnable)e62);
                        return;
                    }
                    if (!this.a.g.c(null, (t2<Boolean>)u2.x0)) break block15;
                    if (n9 == 40) break block16;
                    if (n9 != 20) break block15;
                    n10 = 20;
                    break block17;
                }
                n10 = n9;
            }
            f4 f43 = this.a.d();
            f6 f62 = new f6(this, f10, n10, l10, bl);
            f43.b((Runnable)f62);
            return;
        }
        f4 f44 = this.a.d();
        g6 g62 = new g6(this, f10, n9, l10, bl);
        f44.a((Runnable)g62);
    }

    public final void a(l9 l92) {
        l9 l93;
        this.g();
        this.h();
        if (l92 != null && l92 != (l93 = this.d)) {
            boolean bl = l93 == null;
            a.b(bl, (Object)"EventInterceptor already set.");
        }
        this.d = l92;
    }

    public final void a(Boolean bl, boolean bl2) {
        this.g();
        this.h();
        this.a.a().m.a("Setting app measurement enabled (FE)", (Object)bl);
        this.a.m().a(bl);
        z8.c();
        if (this.a.g.c(null, (t2<Boolean>)u2.w0) && bl2) {
            u3 u32 = this.a.m();
            z8.c();
            if (u32.a.g.c(null, (t2<Boolean>)u2.w0)) {
                u32.g();
                SharedPreferences.Editor editor = u32.n().edit();
                if (bl != null) {
                    editor.putBoolean("measurement_enabled_from_api", bl.booleanValue());
                } else {
                    editor.remove("measurement_enabled_from_api");
                }
                editor.apply();
            }
        }
        z8.c();
        if (this.a.g.c(null, (t2<Boolean>)u2.w0)) {
            i4 i42 = this.a;
            i42.d().g();
            if (!i42.E && (bl == null || bl.booleanValue())) {
                return;
            }
        }
        this.n();
    }

    public final void a(String string, Object object) {
        if ((c)this.a.n != null) {
            this.a("auto", string, object, true, System.currentTimeMillis());
            return;
        }
        throw null;
    }

    public final void a(String string, String string2, long l6, Bundle bundle) {
        this.g();
        boolean bl = this.d == null || g9.h(string2);
        this.a(string, string2, l6, bundle, true, bl, false, null);
    }

    /*
     * Exception decompiling
     */
    public final void a(String var1, String var2, long var3, Bundle var5, boolean var6, boolean var7, boolean var8, String var9) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl98 : ALOAD_0 : trying to set 1 previously set to 0
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

    public final void a(String string, String string2, long l6, Object object) {
        f4 f42 = this.a.d();
        q5 q52 = new q5(this, string, string2, object, l6);
        f42.a((Runnable)q52);
    }

    public final void a(String string, String string2, Bundle bundle) {
        if ((c)this.a.n != null) {
            long l6 = System.currentTimeMillis();
            a.c(string);
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", string);
            bundle2.putLong("creation_timestamp", l6);
            if (string2 != null) {
                bundle2.putString("expired_event_name", string2);
                bundle2.putBundle("expired_event_params", bundle);
            }
            this.a.d().a((Runnable)new t5(this, bundle2));
            return;
        }
        throw null;
    }

    public final void a(String string, String string2, Bundle bundle, boolean bl, boolean bl2, long l6) {
        String string3 = string == null ? "app" : string;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (this.a.g.c(null, (t2<Boolean>)u2.u0) && g9.d(string2, "screen_view")) {
            this.a.u().a(bundle2, l6);
            return;
        }
        boolean bl3 = !bl2 || this.d == null || g9.h(string2);
        this.b(string3, string2, l6, bundle2, bl2, bl3, bl ^ true, null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a(String var1_1, String var2_2, Object var3_3, long var4_4) {
        block7 : {
            a.c(var1_1);
            a.c(var2_2);
            this.g();
            this.h();
            if (!"allow_personalized_ads".equals((Object)var2_2)) ** GOTO lbl-1000
            if (!(var3_3 instanceof String) || TextUtils.isEmpty((CharSequence)(var17_5 = (String)var3_3))) break block7;
            var19_7 = "false";
            var18_6 = var17_5.toLowerCase(Locale.ENGLISH);
            var20_8 = true != var19_7.equals((Object)var18_6) ? 0L : 1L;
            var22_9 = var20_8;
            var23_10 = this.a.m().r;
            if (var22_9 == 1L) {
                var19_7 = "true";
            }
            var23_10.a(var19_7);
            var9_11 = var22_9;
            ** GOTO lbl21
        }
        if (var3_3 == null) {
            this.a.m().r.a("unset");
            var9_11 = var3_3;
lbl21: // 2 sources:
            var8_12 = "_npa";
        } else lbl-1000: // 2 sources:
        {
            var8_12 = var2_2;
            var9_11 = var3_3;
        }
        if (!this.a.i()) {
            this.a.a().n.a("User property not set since app measurement is disabled");
            return;
        }
        if (!this.a.k()) {
            return;
        }
        var10_13 = new zzkg(var8_12, var4_4, var9_11, var1_1);
        var11_14 = this.a.v();
        var11_14.g();
        var11_14.h();
        var11_14.q();
        var13_15 = var11_14.a.r();
        if (var13_15 == null) throw null;
        var14_16 = Parcel.obtain();
        d9.a((zzkg)var10_13, (Parcel)var14_16, (int)0);
        var15_17 = var14_16.marshall();
        var14_16.recycle();
        if (var15_17.length > 131072) {
            var13_15.a.a().g.a("User property too long for local database. Sending directly to service");
            var16_18 = false;
        } else {
            var16_18 = var13_15.a(1, var15_17);
        }
        var11_14.a((Runnable)new a7(var11_14, var11_14.a(true), var16_18, var10_13));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a(String var1_1, String var2_2, Object var3_3, boolean var4_4, long var5_5) {
        block8 : {
            block7 : {
                var7_6 = var1_1 == null ? "app" : var1_1;
                if (!var4_4) break block7;
                var10_7 = this.a.p().e(var2_2);
                break block8;
            }
            var8_8 = this.a.p();
            if (!var8_8.b("user property", var2_2)) ** GOTO lbl-1000
            if (!var8_8.a("user property", h5.a, null, var2_2)) {
                var10_7 = 15;
            } else if (!var8_8.a("user property", 24, var2_2)) lbl-1000: // 2 sources:
            {
                var10_7 = 6;
            } else {
                var10_7 = 0;
            }
        }
        if (var10_7 != 0) {
            var17_9 = this.a.p();
            var19_10 = var17_9.a(var2_2, 24, true);
            var20_11 = var2_2 != null ? var2_2.length() : 0;
            this.a.p().a(this.p, null, var10_7, "_ev", var19_10, var20_11);
            return;
        }
        if (var3_3 == null) {
            this.a(var7_6, var2_2, var5_5, (Object)null);
            return;
        }
        var11_12 = this.a.p().b(var2_2, var3_3);
        if (var11_12 == 0) {
            var12_16 = this.a.p().c(var2_2, var3_3);
            if (var12_16 == null) return;
            this.a(var7_6, var2_2, var5_5, var12_16);
            return;
        }
        var13_13 = this.a.p();
        var15_14 = var13_13.a(var2_2, 24, true);
        var16_15 = !(var3_3 instanceof String) && !(var3_3 instanceof CharSequence) ? 0 : String.valueOf((Object)var3_3).length();
        this.a.p().a(this.p, null, var11_12, "_ev", var15_14, var16_15);
    }

    public final void b(String string, String string2, long l6, Bundle bundle, boolean bl, boolean bl2, boolean bl3, String string3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String string4 : bundle2.keySet()) {
            int n7;
            Object object = bundle2.get(string4);
            if (object instanceof Bundle) {
                bundle2.putBundle(string4, new Bundle((Bundle)object));
                continue;
            }
            boolean bl4 = object instanceof Parcelable[];
            if (bl4) {
                Parcelable[] arrparcelable = (Parcelable[])object;
                for (n7 = 0; n7 < arrparcelable.length; ++n7) {
                    Parcelable parcelable = arrparcelable[n7];
                    if (!(parcelable instanceof Bundle)) continue;
                    arrparcelable[n7] = new Bundle((Bundle)parcelable);
                }
                continue;
            }
            if (!(object instanceof List)) continue;
            List list = (List)object;
            while (n7 < list.size()) {
                Object object2 = list.get(n7);
                if (object2 instanceof Bundle) {
                    list.set(n7, (Object)new Bundle((Bundle)object2));
                }
                ++n7;
            }
        }
        f4 f42 = this.a.d();
        p5 p52 = new p5(this, string, string2, l6, bundle2, bl, bl2, bl3, string3);
        f42.a((Runnable)p52);
    }

    public final void b(String string, String string2, Bundle bundle) {
        if ((c)this.a.n != null) {
            this.a(string, string2, bundle, true, true, System.currentTimeMillis());
            return;
        }
        throw null;
    }

    @Override
    public final boolean j() {
        return false;
    }

    public final void l() {
        this.g();
        this.h();
        if (this.a.k()) {
            Boolean bl;
            e e10;
            if (this.a.g.c(null, (t2<Boolean>)u2.c0) && (bl = (e10 = this.a.g).c("google_analytics_deferred_deep_link_enabled")) != null && bl.booleanValue()) {
                this.a.a().m.a("Deferred Deep Link feature enabled.");
                this.a.d().a((Runnable)new l5(this));
            }
            y7 y72 = this.a.v();
            y72.g();
            y72.h();
            zzp zzp2 = y72.a(true);
            y72.a.r().a(3, new byte[0]);
            y72.a((Runnable)new e7(y72, zzp2));
            this.o = false;
            u3 u32 = this.a.m();
            u32.g();
            String string = u32.n().getString("previous_os_version", null);
            u32.a.w().k();
            String string2 = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty((CharSequence)string2) && !string2.equals((Object)string)) {
                SharedPreferences.Editor editor = u32.n().edit();
                editor.putString("previous_os_version", string2);
                editor.apply();
            }
            if (!TextUtils.isEmpty((CharSequence)string)) {
                this.a.w().k();
                if (!string.equals((Object)Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    this.b("auto", "_ou", bundle);
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String m() {
        String string = this.a.b;
        if (string != null) return string;
        string = null;
        ab.c();
        boolean bl = this.a.g.c(null, (t2<Boolean>)u2.B0);
        if (!bl) return p6.a((Context)this.a.a, (String)"google_app_id");
        try {
            return p6.a((Context)this.a.a, (String)"google_app_id", (String)this.a.s);
        }
        catch (IllegalStateException illegalStateException) {
            this.a.a().f.a("getGoogleAppId failed with exception", (Object)illegalStateException);
        }
        return string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void n() {
        this.g();
        String string = this.a.m().r.a();
        if (string != null) {
            if ("unset".equals((Object)string)) {
                if ((c)this.a.n == null) throw null;
                this.a("app", "_npa", null, System.currentTimeMillis());
            } else {
                long l6 = true != "true".equals((Object)string) ? 0L : 1L;
                Long l10 = l6;
                if ((c)this.a.n == null) throw null;
                this.a("app", "_npa", (Object)l10, System.currentTimeMillis());
            }
        }
        if (this.a.i() && this.o) {
            this.a.a().m.a("Recording app launch after enabling measurement for the first time (FE)");
            this.l();
            u9.c();
            if (this.a.g.c(null, (t2<Boolean>)u2.p0)) {
                this.a.n().d.a();
            }
            c.b.b.a.e.d.o9.b.b().a();
            if (this.a.g.c(null, (t2<Boolean>)u2.s0)) {
                y3 y32 = this.a.x;
                a.a(y32);
                if (y32.a.m().k.a() <= 0L) {
                    y32.a(y32.a.a.getPackageName());
                }
            }
            this.a.d().a((Runnable)new n5(this));
            return;
        }
        this.a.a().m.a("Updating Scion state (FE)");
        y7 y72 = this.a.v();
        y72.g();
        y72.h();
        y72.a((Runnable)new k7(y72, y72.a(true)));
    }

    public final void o() {
        if (this.a.a.getApplicationContext() instanceof Application && this.c != null) {
            ((Application)this.a.a.getApplicationContext()).unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this.c);
        }
    }
}

