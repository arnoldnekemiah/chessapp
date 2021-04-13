/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 *  android.text.TextUtils
 *  c.b.b.a.e.d.na
 *  c.b.b.a.e.d.oa
 *  c.b.b.a.f.b.d
 *  c.b.b.a.f.b.f3
 *  c.b.b.a.f.b.t2
 *  c.b.b.a.f.b.u2
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  org.checkerframework.checker.nullness.qual.EnsuresNonNull
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import c.b.b.a.b.k.b;
import c.b.b.a.e.d.na;
import c.b.b.a.e.d.oa;
import c.b.b.a.f.b.c;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.d;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.t2;
import c.b.b.a.f.b.u2;
import c.b.b.a.f.b.y7;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class e
extends c5 {
    public Boolean b;
    public d c = c.a;
    public Boolean d;

    public e(i4 i42) {
        super(i42);
    }

    public static final long p() {
        return (Long)u2.D.a(null);
    }

    public static final long q() {
        return (Long)u2.d.a(null);
    }

    public final int a(String string) {
        return Math.max((int)Math.min((int)this.b(string, (t2<Integer>)u2.I), (int)100), (int)25);
    }

    public final int a(String string, t2<Integer> t22, int n7, int n9) {
        return Math.max((int)Math.min((int)this.b(string, t22), (int)n9), (int)n7);
    }

    /*
     * Exception decompiling
     */
    public final long a(String var1, t2<Long> var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
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

    public final int b(String string) {
        return Math.max((int)Math.min((int)this.b(string, (t2<Integer>)u2.H), (int)2000), (int)500);
    }

    /*
     * Exception decompiling
     */
    public final int b(String var1, t2<Integer> var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
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

    public final String b(String string, String string2) {
        String string3;
        f3 f32;
        void var3_8;
        try {
            String string4 = (String)Class.forName((String)"android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{string, ""});
            a.a(string4);
            return string4;
        }
        catch (InvocationTargetException invocationTargetException) {
            f32 = this.a.a().f;
            string3 = "SystemProperties.get() threw an exception";
        }
        catch (IllegalAccessException illegalAccessException) {
            f32 = this.a.a().f;
            string3 = "Could not access SystemProperties.get()";
        }
        catch (NoSuchMethodException noSuchMethodException) {
            f32 = this.a.a().f;
            string3 = "Could not find SystemProperties.get() method";
        }
        catch (ClassNotFoundException classNotFoundException) {
            f32 = this.a.a().f;
            string3 = "Could not find SystemProperties class";
        }
        f32.a(string3, (Object)var3_8);
        return "";
    }

    public final Boolean c(String string) {
        a.c(string);
        Bundle bundle = this.k();
        if (bundle == null) {
            this.a.a().f.a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!bundle.containsKey(string)) {
            return null;
        }
        return bundle.getBoolean(string);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean c(String string, t2<Boolean> t22) {
        String string2;
        Object object;
        if (string != null && !TextUtils.isEmpty((CharSequence)(string2 = this.c.a(string, t22.a)))) {
            object = t22.a((Object)Boolean.parseBoolean((String)string2));
            return (Boolean)object;
        }
        object = t22.a(null);
        return (Boolean)object;
    }

    public final boolean d(String string) {
        return "1".equals((Object)this.c.a(string, "gaia_collection_enabled"));
    }

    public final boolean e(String string) {
        return "1".equals((Object)this.c.a(string, "measurement.event_sampling_enabled"));
    }

    public final int h() {
        g9 g92 = this.a.p();
        Boolean bl = g92.a.v().e;
        if (g92.n() < 201500 && (bl == null || bl.booleanValue())) {
            return 25;
        }
        return 100;
    }

    public final long i() {
        return 39000L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @EnsuresNonNull(value={"this.isMainProcess"})
    public final boolean j() {
        if (this.d != null) return this.d;
        e e6 = this;
        synchronized (e6) {
            try {
                if (this.d != null) return this.d;
                ApplicationInfo applicationInfo = this.a.a.getApplicationInfo();
                String string = c.b.b.a.b.j.e.a();
                if (applicationInfo != null) {
                    String string2 = applicationInfo.processName;
                    boolean bl = false;
                    if (string2 != null) {
                        boolean bl2 = string2.equals((Object)string);
                        bl = false;
                        if (bl2) {
                            bl = true;
                        }
                    }
                    this.d = bl;
                }
                if (this.d != null) return this.d;
                this.d = Boolean.TRUE;
                this.a.a().f.a("My process not in the list of running processes");
                return this.d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Bundle k() {
        ApplicationInfo applicationInfo;
        block6 : {
            block5 : {
                try {
                    if (this.a.a.getPackageManager() != null) break block5;
                    this.a.a().f.a("Failed to load metadata: PackageManager is null");
                    return null;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    this.a.a().f.a("Failed to load metadata: Package name not found", (Object)nameNotFoundException);
                    return null;
                }
            }
            applicationInfo = b.b(this.a.a).a(this.a.a.getPackageName(), 128);
            if (applicationInfo != null) break block6;
            this.a.a().f.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        }
        Bundle bundle = applicationInfo.metaData;
        return bundle;
    }

    public final boolean l() {
        Boolean bl = this.c("firebase_analytics_collection_deactivated");
        return bl != null && bl != false;
    }

    public final boolean m() {
        Boolean bl = this.c("google_analytics_adid_collection_enabled");
        return bl == null || bl.booleanValue();
        {
        }
    }

    public final boolean n() {
        na.b.b().a();
        if (!this.c(null, (t2<Boolean>)u2.t0)) {
            return true;
        }
        Boolean bl = this.c("google_analytics_automatic_screen_reporting_enabled");
        if (bl != null) {
            return bl != false;
        }
        return true;
    }

    public final boolean o() {
        if (this.b == null) {
            Boolean bl;
            this.b = bl = this.c("app_measurement_lite");
            if (bl == null) {
                this.b = false;
            }
        }
        return this.b.booleanValue() || !this.a.e;
        {
        }
    }
}

