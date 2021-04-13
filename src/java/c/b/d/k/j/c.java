/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package c.b.d.k.j;

import android.content.Context;
import c.b.d.k.j.d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
    public final File a;
    public final c.b.d.c b;

    public c(c.b.d.c c10) {
        c10.a();
        File file = c10.a.getFilesDir();
        StringBuilder stringBuilder = c.a.b.a.a.a("PersistedInstallation.");
        stringBuilder.append(c10.b());
        stringBuilder.append(".json");
        this.a = new File(file, stringBuilder.toString());
        this.b = c10;
    }

    /*
     * Exception decompiling
     */
    public d a() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl48 : ALOAD : trying to set 1 previously set to 0
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

    public d a(d d10) {
        block3 : {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", (Object)((c.b.d.k.j.a)d10).a);
            jSONObject.put("Status", ((c.b.d.k.j.a)d10).b.ordinal());
            jSONObject.put("AuthToken", (Object)((c.b.d.k.j.a)d10).c);
            jSONObject.put("RefreshToken", (Object)((c.b.d.k.j.a)d10).d);
            jSONObject.put("TokenCreationEpochInSecs", ((c.b.d.k.j.a)d10).f);
            jSONObject.put("ExpiresInSecs", ((c.b.d.k.j.a)d10).e);
            jSONObject.put("FisError", (Object)((c.b.d.k.j.a)d10).g);
            c.b.d.c c10 = this.b;
            c10.a();
            File file = File.createTempFile((String)"PersistedInstallation", (String)"tmp", (File)c10.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!file.renameTo(this.a)) break block3;
            return d10;
        }
        try {
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        }
        catch (IOException | JSONException throwable) {
            return d10;
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a;
        public static final /* enum */ a b;
        public static final /* enum */ a c;
        public static final /* enum */ a d;
        public static final /* enum */ a e;
        public static final /* synthetic */ a[] f;

        public static {
            a a10;
            a = new a();
            b = new a();
            c = new a();
            d = new a();
            e = a10 = new a();
            a[] arra = new a[]{a, b, c, d, a10};
            f = arra;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])f.clone();
        }
    }

}

