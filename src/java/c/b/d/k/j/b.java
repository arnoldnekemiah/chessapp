/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package c.b.d.k.j;

import android.content.Context;
import android.content.SharedPreferences;
import c.b.d.c;
import c.b.d.e;
import org.json.JSONException;
import org.json.JSONObject;

public class b {
    public static final String[] c = new String[]{"*", "FCM", "GCM", ""};
    public final SharedPreferences a;
    public final String b;

    /*
     * Enabled aggressive block sorting
     */
    public b(c c10) {
        c10.a();
        this.a = c10.a.getSharedPreferences("com.google.android.gms.appid", 0);
        c10.a();
        String string = c10.c.e;
        if (string == null) {
            String[] arrstring;
            c10.a();
            string = c10.c.b;
            if ((string.startsWith("1:") || string.startsWith("2:")) && ((arrstring = string.split(":")).length != 4 || (string = arrstring[1]).isEmpty())) {
                string = null;
            }
        }
        this.b = string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String a() {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2 = sharedPreferences = this.a;
        synchronized (sharedPreferences2) {
            String string = this.b();
            if (string == null) return this.c();
            return string;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String b() {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2 = sharedPreferences = this.a;
        synchronized (sharedPreferences2) {
            return this.a.getString("|S|id", null);
        }
    }

    /*
     * Exception decompiling
     */
    public final String c() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl99 : ALOAD : trying to set 1 previously set to 0
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
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public String d() {
        var18_2 = var1_1 = this.a;
        // MONITORENTER : var18_2
        var3_3 = b.c;
        var4_4 = var3_3.length;
        var5_5 = 0;
lbl7: // 2 sources:
        do {
            var6_6 = null;
            if (var5_5 < var4_4) {
                var7_7 = var3_3[var5_5];
                var8_8 = this.b;
                var9_9 = new StringBuilder();
                var9_9.append("|T|");
                var9_9.append(var8_8);
                var9_9.append("|");
                var9_9.append(var7_7);
                var14_10 = var9_9.toString();
                var15_11 = this.a.getString(var14_10, null);
                if (var15_11 == null || var15_11.isEmpty()) break;
                var16_12 = var15_11.startsWith("{");
                if (var16_12) {
                    try {
                        var6_6 = new JSONObject(var15_11).getString("token");
                    }
                    catch (JSONException v0) {}
                    var15_11 = var6_6;
                }
                // MONITOREXIT : var18_2
                return var15_11;
            }
            // MONITOREXIT : var18_2
            return null;
            break;
        } while (true);
        ++var5_5;
        ** while (true)
    }
}

