/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build
 *  android.util.Log
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package c.b.b.a.b;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import c.b.b.a.b.e;
import c.b.b.a.b.k.a;
import c.b.b.a.b.k.b;
import java.util.concurrent.atomic.AtomicBoolean;

public class d {
    @Deprecated
    public static final int a = 12451000;
    public static boolean b;
    public static boolean c;
    public static final AtomicBoolean d;

    public static {
        new AtomicBoolean();
        d = new AtomicBoolean();
    }

    @Deprecated
    public static int a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return packageInfo.versionCode;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            Log.w((String)"GooglePlayServicesUtil", (String)"Google Play services is missing.");
            return 0;
        }
    }

    /*
     * Exception decompiling
     */
    @Deprecated
    public static int a(Context var0, int var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl356 : ICONST_1 : trying to set 1 previously set to 0
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

    @Deprecated
    @TargetApi(value=19)
    public static boolean a(Context context, int n2, String string) {
        return a.c.a.a.a(context, n2, string);
    }

    public static Context b(Context context) {
        try {
            Context context2 = context.createPackageContext("com.google.android.gms", 3);
            return context2;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return null;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static boolean c(Context context) {
        block7 : {
            if (!c) {
                Throwable throwable2222;
                block6 : {
                    block5 : {
                        try {
                            PackageInfo packageInfo = b.b((Context)context).a.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                            e.a(context);
                            b = packageInfo != null && !e.a(packageInfo, false) && e.a(packageInfo, true);
                            break block5;
                        }
                        catch (Throwable throwable2222) {
                            break block6;
                        }
                        catch (PackageManager.NameNotFoundException nameNotFoundException) {
                            Log.w((String)"GooglePlayServicesUtil", (String)"Cannot find Google Play services package name.", (Throwable)nameNotFoundException);
                        }
                    }
                    c = true;
                    break block7;
                }
                c = true;
                throw throwable2222;
            }
        }
        if (b) return true;
        if ("user".equals((Object)Build.TYPE)) return false;
        return true;
    }
}

