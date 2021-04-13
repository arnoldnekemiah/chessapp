/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.Signature
 *  android.util.Log
 *  c.b.b.a.b.o
 *  c.b.b.a.b.r
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  javax.annotation.CheckReturnValue
 *  javax.annotation.Nullable
 */
package c.b.b.a.b;

import a.c.a.a;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import c.b.b.a.b.n;
import c.b.b.a.b.o;
import c.b.b.a.b.r;
import c.b.b.a.b.t;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
public class e {
    @Nullable
    public static e b;
    public final Context a;

    public e(Context context) {
        this.a = context.getApplicationContext();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static e a(Context context) {
        a.a(context);
        Class<e> class_ = e.class;
        synchronized (e.class) {
            if (b == null) {
                n.a(context);
                b = new e(context);
            }
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return b;
        }
    }

    @Nullable
    public static /* varargs */ o a(PackageInfo packageInfo, o ... arro) {
        Signature[] arrsignature = packageInfo.signatures;
        if (arrsignature == null) {
            return null;
        }
        if (arrsignature.length != 1) {
            Log.w((String)"GoogleSignatureVerifier", (String)"Package has more than one signature.");
            return null;
        }
        Signature[] arrsignature2 = packageInfo.signatures;
        r r2 = new r(arrsignature2[0].toByteArray());
        for (int i2 = 0; i2 < arro.length; ++i2) {
            if (!arro[i2].equals((Object)r2)) continue;
            return arro[i2];
        }
        return null;
    }

    public static boolean a(PackageInfo packageInfo, boolean bl) {
        if (packageInfo != null && packageInfo.signatures != null) {
            o o2;
            if (bl) {
                o2 = e.a(packageInfo, t.a);
            } else {
                o[] arro = new o[]{t.a[0]};
                o2 = e.a(packageInfo, arro);
            }
            if (o2 != null) {
                return true;
            }
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    public boolean a(int var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl132 : ALOAD_3 : trying to set 1 previously set to 0
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
}

