/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  c.b.b.a.e.a.a5
 *  c.b.b.a.e.a.b7
 *  c.b.b.a.e.a.w6
 *  c.b.b.a.e.a.y4
 *  com.google.android.gms.ads.mediation.NetworkExtras
 *  com.google.android.gms.ads.mediation.customevent.CustomEvent
 *  com.google.android.gms.ads.mediation.rtb.RtbAdapter
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.util.Map
 */
package c.b.b.a.e.a;

import android.os.RemoteException;
import c.a.b.a.a;
import c.b.b.a.e.a.a5;
import c.b.b.a.e.a.b7;
import c.b.b.a.e.a.e7;
import c.b.b.a.e.a.w6;
import c.b.b.a.e.a.y4;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.lang.reflect.Constructor;
import java.util.Map;

public final class w4
extends y4 {
    public Map<Class<? extends NetworkExtras>, NetworkExtras> a;

    public final boolean d(String string) {
        try {
            boolean bl = CustomEvent.class.isAssignableFrom(Class.forName((String)string, (boolean)false, (ClassLoader)w4.class.getClassLoader()));
            return bl;
        }
        catch (Throwable throwable) {
            StringBuilder stringBuilder = new StringBuilder(a.a(string, 80));
            stringBuilder.append("Could not load custom event implementation class: ");
            stringBuilder.append(string);
            stringBuilder.append(", assuming old implementation.");
            a.c.a.a.i(stringBuilder.toString());
            return false;
        }
    }

    /*
     * Exception decompiling
     */
    public final a5 n(String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl174 : NEW : trying to set 0 previously set to 1
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

    public final w6 p(String string) {
        try {
            e7 e72 = new e7((RtbAdapter)Class.forName((String)string, (boolean)false, (ClassLoader)b7.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            return e72;
        }
        catch (Throwable throwable) {
            throw new RemoteException();
        }
    }
}

