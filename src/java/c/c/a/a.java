/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.res.Resources
 *  android.graphics.Color
 *  android.graphics.Paint
 *  android.graphics.Paint$Join
 *  android.graphics.Typeface
 *  android.os.Handler
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.c.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c.c.a.t;
import c.c.a.x;
import com.jetstartgames.chess.CustomTextView;
import com.jetstartgames.chess.MainActivity;

public class a {
    public static t a;

    public static void a(Context context) {
        MainActivity.I0 = true;
        MainActivity.J0 = 2;
        String string = MainActivity.i0;
        if (string != null) {
            String string2;
            if (string.equals((Object)"")) {
                return;
            }
            final t t9 = new t(context, 2131492867);
            t9.requestWindowFeature(1);
            t9.setContentView(2131296264);
            t9.getWindow().setBackgroundDrawableResource(17170445);
            t9.setCancelable(true);
            t9.getWindow().getDecorView().setSystemUiVisibility(1280);
            TextView textView = (TextView)t9.findViewById(2131165411);
            TextView textView2 = (TextView)t9.findViewById(2131165398);
            textView.setGravity(17);
            textView2.setGravity(17);
            textView.setTextSize(1, 22.0f);
            textView2.setTextSize(1, 18.0f);
            textView.setTextColor(Color.argb((int)255, (int)255, (int)255, (int)255));
            if (MainActivity.G0) {
                String string3 = context.getString(2131427425);
                if (x.b[MainActivity.B0] == 1) {
                    string3 = context.getString(2131427421);
                }
                if (x.b[MainActivity.B0] == 2) {
                    string3 = context.getString(2131427422);
                }
                if (x.b[MainActivity.B0] == 3) {
                    string3 = context.getString(2131427423);
                }
                textView.setText((CharSequence)string3);
            } else {
                textView.setText(2131427425);
            }
            textView2.setText((CharSequence)MainActivity.i0);
            t9.getWindow().clearFlags(2);
            ImageView imageView = (ImageView)t9.findViewById(2131165313);
            imageView.setVisibility(0);
            imageView.setImageResource(2131099687);
            int n10 = c.c.a.b.a(context, MainActivity.d0, MainActivity.f0, MainActivity.e0);
            RelativeLayout relativeLayout = (RelativeLayout)t9.findViewById(2131165285);
            relativeLayout.getLayoutParams().width = n10;
            c.c.a.b.a((RelativeLayout.LayoutParams)relativeLayout.getLayoutParams(), MainActivity.d0, MainActivity.f0, MainActivity.e0, n10);
            int n11 = (int)TypedValue.applyDimension((int)1, (float)100.0f, (DisplayMetrics)context.getResources().getDisplayMetrics());
            int n12 = (int)TypedValue.applyDimension((int)1, (float)66.0f, (DisplayMetrics)context.getResources().getDisplayMetrics());
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = n12;
            layoutParams.width = n11;
            imageView.setLayoutParams(layoutParams);
            ((RelativeLayout)t9.findViewById(2131165223)).setOnClickListener(new View.OnClickListener(){

                public void onClick(View view) {
                    t t92 = t9;
                    if (t92 != null && t92.isShowing()) {
                        t9.cancel();
                    }
                    MainActivity.I0 = false;
                }
            });
            t9.setOnCancelListener(new DialogInterface.OnCancelListener(){

                public void onCancel(DialogInterface dialogInterface) {
                    MainActivity.I0 = false;
                }
            });
            String string4 = MainActivity.v0;
            if (string4 != null && !string4.isEmpty() || (string2 = MainActivity.w0) != null && !string2.isEmpty()) {
                ((RelativeLayout)t9.findViewById(2131165229)).setVisibility(0);
                CustomTextView customTextView = (CustomTextView)t9.findViewById(2131165400);
                CustomTextView customTextView2 = (CustomTextView)t9.findViewById(2131165402);
                TextView textView3 = (TextView)t9.findViewById(2131165405);
                TextView textView4 = (TextView)t9.findViewById(2131165407);
                if (!MainActivity.X) {
                    customTextView = (CustomTextView)t9.findViewById(2131165402);
                    customTextView2 = (CustomTextView)t9.findViewById(2131165400);
                    textView3 = (TextView)t9.findViewById(2131165407);
                    textView4 = (TextView)t9.findViewById(2131165405);
                }
                customTextView.setGravity(0);
                customTextView.setVisibility(0);
                customTextView.setTextSize(1, 28.0f);
                customTextView.setTypeface(MainActivity.Y);
                customTextView.setTextColor(Color.argb((int)255, (int)255, (int)255, (int)255));
                customTextView.setText((CharSequence)MainActivity.v0);
                customTextView2.setGravity(0);
                customTextView2.setVisibility(0);
                customTextView2.setTextSize(1, 28.0f);
                customTextView2.setTypeface(MainActivity.Y);
                customTextView2.setTextColor(Color.argb((int)255, (int)0, (int)0, (int)0));
                int n13 = Color.argb((int)255, (int)255, (int)255, (int)255);
                Paint.Join join = Paint.Join.MITER;
                customTextView2.a = 1.0f;
                customTextView2.b = n13;
                customTextView2.c = join;
                customTextView2.d = 0.0f;
                customTextView2.setText((CharSequence)MainActivity.w0);
                textView3.setGravity(0);
                textView3.setVisibility(0);
                textView3.setTextSize(1, 28.0f);
                textView3.setTypeface(MainActivity.Y);
                textView3.setTextColor(Color.argb((int)255, (int)150, (int)150, (int)150));
                textView3.setText((CharSequence)MainActivity.x0);
                textView4.setGravity(0);
                textView4.setVisibility(0);
                textView4.setTextSize(1, 28.0f);
                textView4.setTypeface(MainActivity.Y);
                textView4.setTextColor(Color.argb((int)255, (int)255, (int)255, (int)255));
                textView4.setText((CharSequence)MainActivity.y0);
            }
            t9.show();
        }
    }

    @SuppressLint(value={"NewApi"})
    public static void a(final MainActivity mainActivity) {
        String string;
        if (mainActivity != null && (string = MainActivity.i0) != null) {
            t t9;
            if (string.equals((Object)"")) {
                return;
            }
            MainActivity.I0 = true;
            MainActivity.J0 = 1;
            a = t9 = new t((Context)mainActivity, 2131492867);
            t9.requestWindowFeature(1);
            a.setContentView(2131296264);
            a.getWindow().setBackgroundDrawableResource(17170445);
            a.setCancelable(true);
            a.getWindow().getDecorView().setSystemUiVisibility(1280);
            TextView textView = (TextView)a.findViewById(2131165411);
            TextView textView2 = (TextView)a.findViewById(2131165398);
            textView.setGravity(17);
            textView2.setGravity(17);
            textView.setTextSize(1, 22.0f);
            textView2.setTextSize(1, 18.0f);
            textView.setTextColor(Color.argb((int)255, (int)255, (int)255, (int)255));
            if (MainActivity.G0) {
                String string2 = mainActivity.getString(2131427425);
                if (x.b[MainActivity.B0] == 1) {
                    string2 = mainActivity.getString(2131427421);
                }
                if (x.b[MainActivity.B0] == 2) {
                    string2 = mainActivity.getString(2131427422);
                }
                if (x.b[MainActivity.B0] == 3) {
                    string2 = mainActivity.getString(2131427423);
                }
                if (x.b[MainActivity.B0] == 4) {
                    string2 = mainActivity.getString(2131427424);
                }
                textView.setText((CharSequence)string2);
            } else {
                textView.setText(2131427425);
            }
            textView2.setText((CharSequence)MainActivity.i0);
            a.getWindow().clearFlags(2);
            ImageView imageView = (ImageView)a.findViewById(2131165313);
            imageView.setVisibility(0);
            imageView.setImageResource(2131099687);
            int n10 = c.c.a.b.a((Context)mainActivity, MainActivity.d0, MainActivity.f0, MainActivity.e0);
            RelativeLayout relativeLayout = (RelativeLayout)a.findViewById(2131165285);
            relativeLayout.getLayoutParams().width = n10;
            c.c.a.b.a((RelativeLayout.LayoutParams)relativeLayout.getLayoutParams(), MainActivity.d0, MainActivity.f0, MainActivity.e0, n10);
            int n11 = (int)TypedValue.applyDimension((int)1, (float)100.0f, (DisplayMetrics)mainActivity.getResources().getDisplayMetrics());
            int n12 = (int)TypedValue.applyDimension((int)1, (float)66.0f, (DisplayMetrics)mainActivity.getResources().getDisplayMetrics());
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = n12;
            layoutParams.width = n11;
            imageView.setLayoutParams(layoutParams);
            ((RelativeLayout)a.findViewById(2131165223)).setOnClickListener(new View.OnClickListener(){

                public void onClick(View view) {
                    t t9 = a.a;
                    if (t9 != null && t9.isShowing()) {
                        a.a.cancel();
                    }
                    MainActivity.I0 = false;
                }
            });
            a.setOnCancelListener(new DialogInterface.OnCancelListener(){

                public void onCancel(DialogInterface dialogInterface) {
                    MainActivity.I0 = false;
                }
            });
            new Handler().postDelayed(new Runnable(){

                public void run() {
                    try {
                        a.a.show();
                    }
                    catch (Exception exception) {}
                }
            }, 200L);
            Handler handler = new Handler();
            Runnable runnable = new Runnable(){

                /*
                 * Exception decompiling
                 */
                public void run() {
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
                    // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
                    // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
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
            };
            long l10 = MainActivity.G0 ? 2900L : 1700L;
            handler.postDelayed(runnable, l10);
        }
    }

}

