/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Bundle
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.content.SharedPreferences;
import android.os.Bundle;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.u3;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class q3 {
    public final String a;
    public final Bundle b;
    public Bundle c;
    public final /* synthetic */ u3 d;

    public q3(u3 u32) {
        this.d = u32;
        a.c("default_event_parameters");
        this.a = "default_event_parameters";
        this.b = new Bundle();
    }

    /*
     * Exception decompiling
     */
    public final Bundle a() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl149 : IINC : trying to set 1 previously set to 0
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Bundle bundle) {
        SharedPreferences.Editor editor;
        block8 : {
            block7 : {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                editor = this.d.n().edit();
                if (bundle.size() != 0) break block7;
                editor.remove(this.a);
                break block8;
            }
            String string = this.a;
            JSONArray jSONArray = new JSONArray();
            for (String string2 : bundle.keySet()) {
                Object object = bundle.get(string2);
                if (object == null) continue;
                try {
                    block12 : {
                        JSONObject jSONObject;
                        String string3;
                        block10 : {
                            block11 : {
                                block9 : {
                                    jSONObject = new JSONObject();
                                    jSONObject.put("n", (Object)string2);
                                    jSONObject.put("v", (Object)String.valueOf((Object)object));
                                    boolean bl = object instanceof String;
                                    if (!bl) break block9;
                                    string3 = "s";
                                    break block10;
                                }
                                if (!(object instanceof Long)) break block11;
                                string3 = "l";
                                break block10;
                            }
                            if (!(object instanceof Double)) break block12;
                            string3 = "d";
                        }
                        jSONObject.put("t", (Object)string3);
                        jSONArray.put((Object)jSONObject);
                        continue;
                    }
                    this.d.a.a().f.a("Cannot serialize bundle value to SharedPreferences. Type", (Object)object.getClass());
                }
                catch (JSONException jSONException) {
                    this.d.a.a().f.a("Cannot serialize bundle value to SharedPreferences", (Object)jSONException);
                }
            }
            editor.putString(string, jSONArray.toString());
        }
        editor.apply();
        this.c = bundle;
    }
}

