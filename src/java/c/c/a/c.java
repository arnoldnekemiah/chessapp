/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.ProgressDialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.os.AsyncTask
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.ContextThemeWrapper
 *  android.view.View
 *  android.view.Window
 *  com.jetstartgames.chess.SetActivity
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package c.c.a;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import com.jetstartgames.chess.SetActivity;

public class c
extends AsyncTask<String, Integer, String> {
    public static ProgressDialog c;
    public static boolean d;
    public static boolean e;
    public SetActivity a = null;
    public int b = 0;

    public c(SetActivity setActivity, int n10) {
        this.a = setActivity;
        this.b = n10;
    }

    /*
     * Exception decompiling
     */
    @SuppressLint(value={"NewApi"})
    public Object doInBackground(Object[] var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl169 : ACONST_NULL : trying to set 1 previously set to 0
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
    public void onPostExecute(Object var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl16.1 : ALOAD_0 : trying to set 1 previously set to 0
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
     * Lifted jumps to return sites
     */
    @SuppressLint(value={"NewApi"})
    public void onPreExecute() {
        block9 : {
            block8 : {
                block7 : {
                    super.onPreExecute();
                    if (this.a == null) return;
                    var1_1 = Build.VERSION.SDK_INT;
                    var2_2 = var1_1 >= 21 ? new ProgressDialog((Context)new ContextThemeWrapper((Context)this.a, 16974374)) : new ProgressDialog((Context)new ContextThemeWrapper((Context)this.a, 16973935));
                    c.c = var2_2;
                    if (var1_1 >= 19) {
                        c.c.getWindow().setFlags(8, 8);
                    }
                    var3_3 = c.c;
                    var4_4 = this.b;
                    if (var4_4 != 1) break block7;
                    var5_5 = this.a;
                    var6_6 = 2131427458;
                    ** GOTO lbl38
                }
                if (var4_4 != 2) break block8;
                var5_5 = this.a;
                var6_6 = 2131427459;
                ** GOTO lbl38
            }
            if (var4_4 != 3) break block9;
            var5_5 = this.a;
            var6_6 = 2131427460;
            ** GOTO lbl38
        }
        if (var4_4 == 4 || var4_4 == 5) {
            var7_7 = this.a.getString(2131427457);
        } else {
            if (var4_4 == 6) {
                var5_5 = this.a;
                var6_6 = 2131427462;
            } else if (var4_4 == 7) {
                var5_5 = this.a;
                var6_6 = 2131427463;
            } else {
                var5_5 = this.a;
                var6_6 = 2131427461;
            }
lbl38: // 6 sources:
            var7_7 = var5_5.getString(var6_6);
        }
        var3_3.setTitle((CharSequence)var7_7);
        c.c.setMessage((CharSequence)this.a.getString(2131427347));
        c.c.setProgressStyle(1);
        c.c.setCancelable(false);
        c.c.setButton(-2, (CharSequence)this.a.getString(2131427338), new DialogInterface.OnClickListener(){

            public void onClick(DialogInterface dialogInterface, int n10) {
                dialogInterface.dismiss();
                c.this.cancel(true);
            }
        });
        c.c.show();
        if (var1_1 < 19) return;
        c.c.getWindow().getDecorView().setSystemUiVisibility(5894);
        c.c.getWindow().clearFlags(8);
    }

    public void onProgressUpdate(Object[] arrobject) {
        Integer[] arrinteger = (Integer[])arrobject;
        ProgressDialog progressDialog = c;
        if (progressDialog != null) {
            progressDialog.setProgress(arrinteger[0].intValue());
        }
    }

}

