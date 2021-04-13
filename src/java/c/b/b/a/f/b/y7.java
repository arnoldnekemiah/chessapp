/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.pm.PackageManager
 *  android.os.Parcelable
 *  android.os.SystemClock
 *  c.b.b.a.b.j.c
 *  c.b.b.a.f.b.c7
 *  c.b.b.a.f.b.e5
 *  c.b.b.a.f.b.f3
 *  c.b.b.a.f.b.k
 *  c.b.b.a.f.b.n7
 *  c.b.b.a.f.b.o8
 *  c.b.b.a.f.b.t2
 *  c.b.b.a.f.b.u2
 *  c.b.b.a.f.b.x2
 *  com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable
 *  com.google.android.gms.measurement.internal.zzaa
 *  com.google.android.gms.measurement.internal.zzp
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.concurrent.atomic.AtomicReference
 */
package c.b.b.a.f.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Parcelable;
import android.os.SystemClock;
import c.b.b.a.b.i.a;
import c.b.b.a.b.j.b;
import c.b.b.a.b.j.c;
import c.b.b.a.f.b.b3;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.c7;
import c.b.b.a.f.b.d3;
import c.b.b.a.f.b.e;
import c.b.b.a.f.b.e5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.h7;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.j7;
import c.b.b.a.f.b.k;
import c.b.b.a.f.b.n7;
import c.b.b.a.f.b.o8;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.u2;
import c.b.b.a.f.b.u3;
import c.b.b.a.f.b.x2;
import c.b.b.a.f.b.x3;
import c.b.b.a.f.b.x7;
import c.b.b.a.f.b.z2;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class y7
extends x3 {
    public final x7 c;
    public x2 d;
    public volatile Boolean e;
    public final k f;
    public final o8 g;
    public final List<Runnable> h = new ArrayList();
    public final k i;

    public y7(i4 i42) {
        super(i42);
        this.g = new o8(i42.n);
        this.c = new x7(this);
        this.f = new h7(this, i42);
        this.i = new j7(this, i42);
    }

    public static /* synthetic */ void a(y7 y72, ComponentName componentName) {
        y72.g();
        if (y72.d != null) {
            y72.d = null;
            y72.a.a().n.a("Disconnected from device MeasurementService", (Object)componentName);
            y72.g();
            y72.l();
        }
    }

    /*
     * Exception decompiling
     */
    public final zzp a(boolean var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl327 : ALOAD : trying to set 1 previously set to 0
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
     * Exception decompiling
     */
    public final void a(x2 var1, AbstractSafeParcelable var2, zzp var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl568 : ALOAD : trying to set 1 previously set to 0
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

    public final void a(zzaa zzaa2) {
        boolean bl;
        a.c.a.a.a(zzaa2);
        this.g();
        this.h();
        i4 i42 = this.a;
        b3 b32 = i42.r();
        byte[] arrby = b32.a.p().a((Parcelable)zzaa2);
        if (arrby.length > 131072) {
            b32.a.a().g.a("Conditional user property too long for local database. Sending directly to service");
            bl = false;
        } else {
            bl = b32.a(2, arrby);
        }
        zzaa zzaa3 = new zzaa(zzaa2);
        zzp zzp2 = this.a(true);
        n7 n72 = new n7(this, zzp2, bl, zzaa3, zzaa2);
        this.a((Runnable)n72);
    }

    public final void a(Runnable runnable) {
        this.g();
        if (this.t()) {
            runnable.run();
            return;
        }
        int n9 = this.h.size();
        i4 i42 = this.a;
        if ((long)n9 >= 1000L) {
            i42.a().f.a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.h.add((Object)runnable);
        this.i.a(60000L);
        this.l();
    }

    public final void a(AtomicReference<String> atomicReference) {
        this.g();
        this.h();
        this.a((Runnable)new c7(this, atomicReference, this.a(false)));
    }

    @Override
    public final boolean j() {
        return false;
    }

    public final void l() {
        this.g();
        this.h();
        if (this.t()) {
            return;
        }
        if (!this.n()) {
            if (!this.a.g.o()) {
                i4 i42 = this.a;
                List list = i42.a.getPackageManager().queryIntentServices(new Intent().setClassName(this.a.a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (list != null && list.size() > 0) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    i4 i43 = this.a;
                    Context context = i43.a;
                    intent.setComponent(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
                    this.c.a(intent);
                    return;
                }
                this.a.a().f.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
            return;
        }
        this.c.a();
    }

    public final Boolean m() {
        return this.e;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean n() {
        int n9;
        block6 : {
            int n10;
            block18 : {
                block7 : {
                    String string;
                    f3 f32;
                    block15 : {
                        block8 : {
                            block9 : {
                                block19 : {
                                    block14 : {
                                        Boolean bl;
                                        block17 : {
                                            block10 : {
                                                f3 f33;
                                                String string2;
                                                block16 : {
                                                    block11 : {
                                                        block12 : {
                                                            block13 : {
                                                                this.g();
                                                                this.h();
                                                                if (this.e != null) return this.e;
                                                                this.g();
                                                                this.h();
                                                                u3 u32 = this.a.m();
                                                                u32.g();
                                                                bl = !u32.n().contains("use_service") ? null : Boolean.valueOf((boolean)u32.n().getBoolean("use_service", false));
                                                                n9 = 1;
                                                                if (bl != null && bl.booleanValue()) break block6;
                                                                i4 i42 = this.a;
                                                                z2 z22 = i42.f();
                                                                z22.h();
                                                                if (z22.j == n9) break block7;
                                                                this.a.a().n.a("Checking service availability");
                                                                g9 g92 = this.a.p();
                                                                if (g92 == null) throw null;
                                                                int n11 = c.b.b.a.b.b.b.a(g92.a.a, 12451000);
                                                                if (n11 == 0) break block8;
                                                                if (n11 == n9) break block9;
                                                                if (n11 == 2) break block10;
                                                                if (n11 == 3) break block11;
                                                                if (n11 == 9) break block12;
                                                                if (n11 == 18) break block13;
                                                                this.a.a().i.a("Unexpected service status", (Object)n11);
                                                                break block14;
                                                            }
                                                            f32 = this.a.a().i;
                                                            string = "Service updating";
                                                            break block15;
                                                        }
                                                        f33 = this.a.a().i;
                                                        string2 = "Service invalid";
                                                        break block16;
                                                    }
                                                    f33 = this.a.a().i;
                                                    string2 = "Service disabled";
                                                }
                                                f33.a(string2);
                                                break block14;
                                            }
                                            this.a.a().m.a("Service container out of date");
                                            if (this.a.p().n() >= 17443) break block17;
                                            n10 = 0;
                                            break block18;
                                        }
                                        if (bl == null) break block19;
                                    }
                                    n9 = 0;
                                }
                                n10 = n9;
                                n9 = 0;
                                break block18;
                            }
                            this.a.a().n.a("Service missing");
                            n10 = 0;
                            break block18;
                        }
                        f32 = this.a.a().n;
                        string = "Service available";
                    }
                    f32.a(string);
                }
                n10 = 1;
            }
            if (n10 == 0 && this.a.g.o()) {
                this.a.a().f.a("No way to upload. Consider using the full version of Analytics");
            } else if (n9 != 0) {
                u3 u33 = this.a.m();
                u33.g();
                SharedPreferences.Editor editor = u33.n().edit();
                editor.putBoolean("use_service", (boolean)n10);
                editor.apply();
            }
            n9 = n10;
        }
        this.e = (boolean)n9;
        return this.e;
    }

    public final void o() {
        this.g();
        this.h();
        x7 x72 = this.c;
        if (x72.b != null && (x72.b.d() || x72.b.e())) {
            x72.b.b();
        }
        x72.b = null;
        try {
            a.a().a(this.a.a, this.c);
        }
        catch (IllegalArgumentException | IllegalStateException throwable) {}
        this.d = null;
    }

    public final boolean p() {
        this.g();
        this.h();
        if (!this.a.g.c(null, (t2<Boolean>)u2.y0)) {
            return false;
        }
        if (this.n()) {
            return this.a.p().n() >= (Integer)u2.z0.a(null);
        }
        return true;
    }

    public final boolean q() {
        return true;
    }

    public final void r() {
        this.g();
        o8 o82 = this.g;
        if ((c)o82.a != null) {
            o82.b = SystemClock.elapsedRealtime();
            k k5 = this.f;
            k5.a(((Long)u2.J.a(null)).longValue());
            return;
        }
        throw null;
    }

    public final void s() {
        this.g();
        this.a.a().n.a("Processing queued up service tasks", (Object)this.h.size());
        for (Runnable runnable : this.h) {
            try {
                runnable.run();
            }
            catch (Exception exception) {
                this.a.a().f.a("Task exception while flushing queue", (Object)exception);
            }
        }
        this.h.clear();
        this.i.b();
    }

    public final boolean t() {
        this.g();
        this.h();
        return this.d != null;
    }
}

