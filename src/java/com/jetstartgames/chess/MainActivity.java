/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Align
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.media.SoundPool
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.text.SpannableStringBuilder
 *  android.text.style.BackgroundColorSpan
 *  android.text.style.LeadingMarginSpan
 *  android.text.style.LeadingMarginSpan$Standard
 *  android.text.style.StyleSpan
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.view.animation.Animation
 *  android.view.animation.AnimationUtils
 *  android.widget.Button
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  android.widget.Toast
 *  c.c.a.a
 *  c.c.a.b
 *  c.c.a.e
 *  c.c.a.f
 *  c.c.a.g
 *  c.c.a.h
 *  c.c.a.o
 *  c.c.a.t
 *  c.c.a.x
 *  c.c.b.a
 *  c.c.b.a$a
 *  c.c.b.b
 *  c.c.b.c
 *  c.c.b.c$a
 *  c.c.b.c$b
 *  c.c.b.d
 *  c.c.b.e
 *  c.c.b.e$c
 *  c.c.b.f
 *  c.c.b.f$a
 *  c.c.b.g.a
 *  c.c.b.i.b
 *  c.c.b.i.d
 *  c.c.b.i.d$b
 *  c.c.b.i.e
 *  c.c.b.i.e$c
 *  c.c.b.i.f
 *  c.c.b.i.g
 *  c.c.b.i.h
 *  c.c.b.i.i
 *  c.c.b.i.j
 *  c.c.b.i.l
 *  c.c.b.i.n
 *  c.c.b.i.o
 *  com.google.android.gms.ads.AdListener
 *  com.google.android.gms.ads.AdRequest
 *  com.google.android.gms.ads.AdRequest$Builder
 *  com.google.android.gms.ads.AdView
 *  com.google.android.gms.ads.InterstitialAd
 *  com.google.android.gms.ads.rewarded.RewardedAd
 *  com.google.android.gms.ads.rewarded.RewardedAdLoadCallback
 *  com.google.firebase.analytics.FirebaseAnalytics
 *  com.jetstartgames.chess.MainActivity$a
 *  com.jetstartgames.chess.MainActivity$b
 *  com.jetstartgames.chess.MainActivity$c
 *  com.jetstartgames.chess.MainActivity$d
 *  com.jetstartgames.chess.MainActivity$e
 *  com.jetstartgames.chess.MainActivity$e0
 *  com.jetstartgames.chess.MainActivity$f0
 *  com.jetstartgames.chess.MainActivity$g0
 *  com.jetstartgames.chess.MainActivity$i0
 *  com.jetstartgames.chess.MainActivity$j0
 *  com.jetstartgames.chess.MainActivity$k0
 *  com.jetstartgames.chess.MainActivity$l0
 *  com.jetstartgames.chess.MainActivity$m0
 *  com.jetstartgames.chess.MainActivity$n0$a
 *  com.jetstartgames.chess.MainActivity$n0$b
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Calendar
 *  java.util.HashMap
 *  java.util.List
 *  java.util.TimeZone
 */
package com.jetstartgames.chess;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.StyleSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import c.c.a.t;
import c.c.a.x;
import c.c.b.a;
import c.c.b.c;
import c.c.b.e;
import c.c.b.f;
import c.c.b.i.d;
import c.c.b.i.e;
import c.c.b.i.f;
import c.c.b.i.g;
import c.c.b.i.h;
import c.c.b.i.i;
import c.c.b.i.j;
import c.c.b.i.l;
import c.c.b.i.n;
import c.c.b.i.o;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.jetstartgames.chess.MainActivity;
import com.jetstartgames.logic.ChessBoardPlay;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;

public class MainActivity
extends Activity
implements c.c.b.c {
    public static int A0 = 1;
    public static int B0 = 0;
    public static MainActivity C0;
    public static int[] D0;
    public static c.c.b.i.b E0;
    public static int F0 = 0;
    public static boolean G0 = false;
    public static boolean H0 = false;
    public static boolean I0 = false;
    public static int J0 = 0;
    public static RelativeLayout K0;
    public static RelativeLayout L0;
    public static SoundPool M0;
    public static int N0 = 0;
    public static int O0 = 0;
    public static int P0 = 0;
    public static int Q0 = 0;
    public static boolean R = false;
    public static int R0 = 0;
    public static boolean S = false;
    public static int S0 = 0;
    public static boolean T = false;
    public static int T0 = 0;
    public static int U = 0;
    public static int U0 = 0;
    public static int V = 0;
    public static int V0 = 0;
    public static int W = 0;
    public static int W0 = 0;
    public static boolean X = true;
    public static int X0 = 0;
    public static Typeface Y;
    public static int Y0 = -7829368;
    public static t Z;
    public static boolean Z0 = false;
    public static t a0;
    public static boolean a1 = false;
    public static boolean b0 = false;
    public static String c0 = "";
    public static boolean d0 = true;
    public static int e0 = 0;
    public static int f0 = 0;
    public static boolean g0 = true;
    public static Bitmap h0;
    public static String i0 = "";
    public static String j0 = "0";
    public static String k0 = "0";
    public static InterstitialAd l0;
    public static InterstitialAd m0;
    public static AdView n0;
    public static RewardedAd o0;
    public static RewardedAd p0;
    public static int q0 = 0;
    public static int r0 = 0;
    public static int s0 = 0;
    public static int t0 = 0;
    public static int u0 = 0;
    public static String v0 = "";
    public static String w0 = "";
    public static String x0 = "";
    public static String y0 = "";
    public static boolean z0;
    public boolean A;
    public boolean B;
    public boolean C;
    public c.c.b.e D = new c.c.b.e();
    public String E;
    public SharedPreferences F;
    public SharedPreferences.Editor G;
    public boolean H;
    public String I;
    public String J;
    public String K;
    public boolean L;
    public boolean M;
    public boolean N;
    public String O;
    public String P;
    public String Q;
    public int a;
    public FirebaseAnalytics b;
    public int c;
    public ImageView d;
    public InterstitialAd e;
    public RewardedAd f;
    public int g = 0;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public int k = 0;
    public boolean l = false;
    public boolean m = false;
    public int n = 3;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public c.c.b.g.a t = new c.c.b.g.a();
    public ChessBoardPlay u;
    public boolean v;
    public c.c.b.b w = new c.c.b.b();
    public c.c.b.d x;
    public n0 y;
    public Handler z = new Handler();

    public MainActivity() {
        new ArrayList();
        this.I = "";
        this.J = "";
        this.K = "";
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = "ca-app-pub-2725968421316486/4429350043";
        this.P = "ca-app-pub-2725968421316486/1428454942";
        this.Q = "ca-app-pub-2725968421316486/7972714703";
    }

    public final int a(String string, int n9) {
        SharedPreferences sharedPreferences = this.F;
        Object[] arrobject = new Object[]{n9};
        return Integer.parseInt((String)sharedPreferences.getString(string, String.format((String)"%d", (Object[])arrobject)));
    }

    public final String a(byte[] arrby) {
        StringBuilder stringBuilder = new StringBuilder(32768);
        for (int n9 : arrby) {
            if (n9 < 0) {
                n9 += 256;
            }
            char c8 = (char)(65 + (n9 & 15));
            stringBuilder.append((char)(65 + n9 / 16));
            stringBuilder.append(c8);
        }
        return stringBuilder.toString();
    }

    public void a() {
        Button button;
        if (!this.L && (button = (Button)this.findViewById(2131165234)) != null) {
            button.setBackgroundResource(2131099674);
        }
    }

    public void a(int n9) {
        this.u.setHintTo(n9);
    }

    /*
     * Exception decompiling
     */
    @SuppressLint(value={"NewApi"})
    public void a(int var1, int var2) {
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

    public void a(int n9, int n10, int n11) {
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(Dialog dialog) {
        block4 : {
            j0 j02;
            Button button;
            block3 : {
                RewardedAd rewardedAd;
                block2 : {
                    if (dialog == null || !S) break block2;
                    ((RelativeLayout)dialog.findViewById(2131165373)).setVisibility(0);
                    ((ImageView)dialog.findViewById(2131165311)).setVisibility(8);
                    button = (Button)dialog.findViewById(2131165372);
                    button.setText(2131427345);
                    j02 = new j0(this, dialog);
                    break block3;
                }
                if (dialog == null || (rewardedAd = this.f) == null || !rewardedAd.isLoaded()) break block4;
                ((RelativeLayout)dialog.findViewById(2131165373)).setVisibility(0);
                button = (Button)dialog.findViewById(2131165372);
                button.setText(2131427345);
                j02 = new k0(this, dialog);
            }
            button.setOnClickListener((View.OnClickListener)j02);
            return;
        }
    }

    public void a(Dialog dialog, int n9) {
        RewardedAd rewardedAd;
        if (dialog != null && (rewardedAd = this.f) != null && rewardedAd.isLoaded() && !S) {
            ((RelativeLayout)dialog.findViewById(2131165373)).setVisibility(0);
            Button button = (Button)dialog.findViewById(2131165372);
            button.setText(2131427342);
            button.setOnClickListener((View.OnClickListener)new i0(this, dialog, n9));
        }
    }

    public void a(TextView textView, TextView textView2, int n9) {
        if (textView != null) {
            textView.setGravity(0);
            textView.setVisibility(0);
            textView.setTextSize(1, 65.0f);
            textView.setTypeface(Y);
            textView.setTextColor(Color.argb((int)255, (int)255, (int)255, (int)255));
            textView.setText((CharSequence)c.c.a.b.b((int)n9));
        }
        if (textView2 != null) {
            textView2.setGravity(0);
            textView2.setVisibility(0);
            textView2.setTextSize(1, 65.0f);
            textView2.setTypeface(Y);
            textView2.setTextColor(Color.argb((int)255, (int)0, (int)0, (int)0));
            textView2.setText((CharSequence)c.c.a.b.a((int)n9));
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void a(c.a var1_1) {
        block63 : {
            block64 : {
                block62 : {
                    this.k = var1_1.b;
                    MainActivity.c0 = "...";
                    MainActivity.s0 = 2131427354;
                    var2_2 = MainActivity.D0;
                    if (var2_2 != null) break block62;
                    var2_2 = new int[d.b.values().length];
                    try {
                        var2_2[0] = 1;
                    }
                    catch (NoSuchFieldError v0) {}
                    try {
                        var2_2[2] = 3;
                    }
                    catch (NoSuchFieldError v1) {}
                    try {
                        var2_2[4] = 5;
                    }
                    catch (NoSuchFieldError v2) {}
                    try {
                        var2_2[6] = 7;
                    }
                    catch (NoSuchFieldError v3) {}
                    try {
                        var2_2[8] = 9;
                        ** GOTO lbl-1000
                    }
                    catch (NoSuchFieldError v4) {
                        try lbl-1000: // 2 sources:
                        {
                            var2_2[7] = 8;
                            ** GOTO lbl-1000
                        }
                        catch (NoSuchFieldError v5) {
                            try lbl-1000: // 2 sources:
                            {
                                var2_2[5] = 6;
                            }
                            catch (NoSuchFieldError v6) {}
                        }
                    }
                    try {
                        var2_2[10] = 11;
                        ** GOTO lbl-1000
                    }
                    catch (NoSuchFieldError v7) {
                        try lbl-1000: // 2 sources:
                        {
                            var2_2[9] = 10;
                            ** GOTO lbl-1000
                        }
                        catch (NoSuchFieldError v8) {
                            try lbl-1000: // 2 sources:
                            {
                                var2_2[1] = 2;
                                ** GOTO lbl-1000
                            }
                            catch (NoSuchFieldError v9) {
                                try lbl-1000: // 2 sources:
                                {
                                    var2_2[3] = 4;
                                }
                                catch (NoSuchFieldError v10) {}
                            }
                        }
                    }
                    MainActivity.D0 = var2_2;
                }
                MainActivity.q0 = var3_3 = var2_2[var1_1.a.ordinal()];
                switch (var3_3) {
                    default: {
                        throw new RuntimeException();
                    }
                    case 11: {
                        MainActivity.s0 = 2131427438;
                        MainActivity.c0 = this.getString(2131427438);
                        if (MainActivity.F0 == 1) ** GOTO lbl-1000
                        ** GOTO lbl-1000
                    }
                    case 10: {
                        MainActivity.s0 = 2131427439;
                        MainActivity.c0 = this.getString(2131427439);
                        if (MainActivity.F0 == 1) ** GOTO lbl-1000
                        ** GOTO lbl-1000
                    }
                    case 9: {
                        MainActivity.s0 = 2131427352;
                        MainActivity.c0 = this.getString(2131427352);
                        if (MainActivity.F0 == 1) ** GOTO lbl-1000
                        ** GOTO lbl-1000
                    }
                    case 8: {
                        MainActivity.s0 = 2131427353;
                        MainActivity.c0 = this.getString(2131427353);
                        if (MainActivity.F0 == 1) ** GOTO lbl-1000
                        ** GOTO lbl-1000
                    }
                    case 7: {
                        MainActivity.s0 = 2131427351;
                        MainActivity.c0 = this.getString(2131427351);
                        if (MainActivity.F0 == 1) {
                            this.d("remis");
                        } else {
                            this.e("remis");
                        }
                        if (var1_1.c.length() <= 0) break block63;
                        var20_4 = new StringBuilder(String.valueOf((Object)MainActivity.c0));
                        ** GOTO lbl102
                    }
                    case 6: {
                        MainActivity.s0 = 2131427354;
                        MainActivity.c0 = this.getString(2131427354);
                        if (MainActivity.F0 == 1) {
                            this.d("remis");
                        } else {
                            this.e("remis");
                        }
                        if (var1_1.c.length() <= 0) break block63;
                        var20_4 = new StringBuilder(String.valueOf((Object)MainActivity.c0));
lbl102: // 2 sources:
                        var20_4.append(" [");
                        var20_4.append(var1_1.c);
                        var20_4.append("]");
                        break block64;
                    }
                    case 4: 
                    case 5: {
                        MainActivity.s0 = 2131427471;
                        MainActivity.c0 = this.getString(2131427470);
                        if (MainActivity.F0 != 1) lbl-1000: // 3 sources:
                        {
                            this.e("remis");
                        } else lbl-1000: // 3 sources:
                        {
                            this.d("remis");
                        }
                        break block63;
                    }
                    case 3: {
                        MainActivity.s0 = 2131427332;
                        MainActivity.c0 = this.getString(2131427332);
                        if (MainActivity.F0 != 1) lbl-1000: // 2 sources:
                        {
                            this.e("black_win");
                        } else lbl-1000: // 2 sources:
                        {
                            this.d("black_win");
                        }
                        break block63;
                    }
                    case 2: {
                        MainActivity.s0 = 2131427475;
                        MainActivity.c0 = this.getString(2131427475);
                        if (MainActivity.F0 != 1) lbl-1000: // 2 sources:
                        {
                            this.e("white_win");
                        } else lbl-1000: // 2 sources:
                        {
                            this.d("white_win");
                        }
                        break block63;
                    }
                    case 1: 
                }
                MainActivity.c0 = Integer.valueOf((int)var1_1.b).toString();
                var4_5 = MainActivity.X;
                var5_6 = "... ";
                var6_7 = ". ";
                if (!var4_5) {
                    var7_8 = var5_6;
                    var5_6 = var6_7;
                } else {
                    var7_8 = var6_7;
                }
                if (MainActivity.F0 == 2) {
                    var7_8 = var6_7;
                } else {
                    var6_7 = var5_6;
                }
                if (var1_1.d) {
                    var8_9 = new StringBuilder(String.valueOf((Object)MainActivity.c0));
                    var8_9.append(var7_8);
                    var8_9.append(this.getString(2131427476));
                    var11_10 = var8_9.toString();
                } else {
                    var29_11 = new StringBuilder(String.valueOf((Object)MainActivity.c0));
                    var29_11.append(var6_7);
                    var29_11.append(this.getString(2131427333));
                    var11_10 = var29_11.toString();
                }
                MainActivity.c0 = var11_10;
                if (var1_1.e) {
                    var12_12 = new StringBuilder(String.valueOf((Object)MainActivity.c0));
                    var12_12.append(" (");
                    var12_12.append(this.getString(2131427427));
                    var12_12.append(")");
                    MainActivity.c0 = var12_12.toString();
                }
                if (var1_1.f) {
                    var16_13 = new StringBuilder(String.valueOf((Object)MainActivity.c0));
                    var16_13.append(" (");
                    var16_13.append(this.getString(2131427473));
                    var16_13.append(")");
                    MainActivity.c0 = var16_13.toString();
                }
                if (!var1_1.g) break block63;
                var20_4 = new StringBuilder(String.valueOf((Object)MainActivity.c0));
                var20_4.append(" (");
                var20_4.append(this.getString(2131427329));
                var20_4.append(")");
            }
            MainActivity.c0 = var20_4.toString();
        }
        this.b(MainActivity.c0);
        var24_14 = MainActivity.q0;
        if (var24_14 != 1) {
            MainActivity.r0 = var24_14;
            MainActivity.t0 = MainActivity.s0;
            MainActivity.u0 = MainActivity.E0.r;
            this.z.postDelayed((Runnable)new l0(this), (long)c.c.b.a.f0);
            return;
        }
        if (MainActivity.G0 == false) return;
        var25_15 = MainActivity.B0;
        if (var25_15 < 0) return;
        if (var25_15 >= x.b.length) return;
        if (Integer.valueOf((int)var1_1.b) <= x.b[MainActivity.B0]) return;
        MainActivity.t0 = MainActivity.s0;
        MainActivity.u0 = MainActivity.E0.r;
        this.z.postDelayed((Runnable)new m0(this), (long)(200 + c.c.b.a.f0));
        var27_16 = this.u;
        if (var27_16 == null) return;
        var27_16.setEnabled(false);
    }

    public void a(c.b b6) {
    }

    public void a(f.a a8) {
    }

    public void a(f f10) {
        Object[] arrobject = new Object[]{this.getString(2131427371), l.c((int)f10.a), l.c((int)f10.b)};
        Toast.makeText((Context)this, (CharSequence)String.format((String)"%s %s-%s", (Object[])arrobject), (int)0).show();
    }

    public void a(j j10, f f10, boolean bl) {
        block11 : {
            block12 : {
                int n9;
                block15 : {
                    int n10;
                    ChessBoardPlay chessBoardPlay;
                    int n11;
                    int n12;
                    boolean bl2;
                    a.a a8;
                    block17 : {
                        int n13;
                        int n14;
                        block16 : {
                            int n15;
                            int n16;
                            block13 : {
                                int n17;
                                boolean bl3;
                                int n18;
                                block14 : {
                                    int n19;
                                    int n20;
                                    int n21;
                                    if (!this.s || f10 == null) break block11;
                                    chessBoardPlay = this.u;
                                    Context context = this.getApplicationContext();
                                    if (chessBoardPlay == null) break block12;
                                    R = false;
                                    a.a a10 = chessBoardPlay.J;
                                    a10.c = -1L;
                                    a10.a = true;
                                    if (bl) {
                                        j j11 = new j(j10);
                                        if (j11.a(f10, new o())) {
                                            Toast.makeText((Context)context, (CharSequence)context.getString(2131427355), (int)0).show();
                                        }
                                        chessBoardPlay.J.b = j11.g;
                                    } else {
                                        a10.b = j10.g;
                                    }
                                    int n22 = j.f((int)f10.b);
                                    int n23 = f10.a;
                                    int n24 = n22 - (n23 & 7);
                                    int n25 = f10.b;
                                    n11 = 3;
                                    int n26 = (n25 >> n11) - (n23 >> n11);
                                    c.c.b.a.f0 = n19 = (int)Math.round((double)(250.0 * Math.sqrt((double)Math.sqrt((double)(n24 * n24 + n26 * n26)))));
                                    if (n19 <= 0) break block11;
                                    chessBoardPlay.J.c = System.currentTimeMillis();
                                    a.a a11 = chessBoardPlay.J;
                                    a11.d = a11.c + (long)c.c.b.a.f0;
                                    a11.j = 0;
                                    a11.k = -1;
                                    a11.l = -1;
                                    a11.m = -1;
                                    if (!bl) break block13;
                                    int n27 = f10.a;
                                    int[] arrn = j10.a;
                                    a11.f = n20 = arrn[n27];
                                    a11.g = n27;
                                    a11.h = n21 = f10.b;
                                    a11.i = n21;
                                    int n28 = arrn[n21];
                                    if (n28 != 0) {
                                        a11.j = n28;
                                        a11.k = n21;
                                        a11.l = n21;
                                        return;
                                    }
                                    if (n20 != 1 && n20 != 7) break block11;
                                    bl3 = a.c.a.a.f(n20);
                                    n18 = f10.b;
                                    n17 = f10.a;
                                    if (n18 != n17 + 2) break block14;
                                    R = true;
                                    a.a a12 = chessBoardPlay.J;
                                    if (!bl3) {
                                        n11 = 9;
                                    }
                                    a12.j = n11;
                                    a8 = chessBoardPlay.J;
                                    int n29 = f10.b;
                                    a8.k = n29 + 1;
                                    n9 = n29 - 1;
                                    break block15;
                                }
                                if (n18 != n17 - 2) break block11;
                                R = true;
                                a.a a13 = chessBoardPlay.J;
                                if (!bl3) {
                                    n11 = 9;
                                }
                                a13.j = n11;
                                a8 = chessBoardPlay.J;
                                n13 = f10.b;
                                n14 = n13 - 2;
                                break block16;
                            }
                            int n30 = f10.a;
                            a11.f = n16 = j10.a[n30];
                            if (f10.c != 0) {
                                int n31 = a.c.a.a.f(n16) ? 6 : 12;
                                a11.f = n31;
                            }
                            a.a a14 = chessBoardPlay.J;
                            a14.g = f10.b;
                            a14.h = n15 = f10.a;
                            a14.i = n15;
                            if (n16 != 1 && n16 != 7) break block11;
                            bl2 = a.c.a.a.f(n16);
                            n12 = f10.b;
                            n10 = f10.a;
                            if (n12 != n10 + 2) break block17;
                            R = true;
                            a.a a15 = chessBoardPlay.J;
                            if (!bl2) {
                                n11 = 9;
                            }
                            a15.j = n11;
                            a8 = chessBoardPlay.J;
                            n13 = f10.b;
                            n14 = n13 - 1;
                        }
                        a8.k = n14;
                        n9 = n13 + 1;
                        break block15;
                    }
                    if (n12 != n10 - 2) break block11;
                    R = true;
                    a.a a16 = chessBoardPlay.J;
                    if (!bl2) {
                        n11 = 9;
                    }
                    a16.j = n11;
                    a8 = chessBoardPlay.J;
                    int n32 = f10.b;
                    a8.k = n32 + 1;
                    n9 = n32 - 2;
                }
                a8.l = n9;
                a8.m = n9;
                return;
                break block11;
            }
            throw null;
        }
    }

    public void a(j j10, String string, ArrayList<f> arrayList) {
        this.K = string;
        this.u.setPosition(j10);
        this.t();
        this.x();
    }

    public void a(Runnable runnable) {
        this.runOnUiThread(runnable);
    }

    public void a(String string) {
    }

    public void b() {
        this.w();
    }

    public void b(int n9) {
        this.u.setSelection(n9);
        this.u.p = true;
    }

    /*
     * Exception decompiling
     */
    @SuppressLint(value={"NewApi"})
    public void b(int var1, int var2) {
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

    public final void b(String string) {
        TextView textView;
        if (this.d != null) {
            String string2 = i0;
            if (G0) {
                if (x.b[B0] == 1) {
                    string2 = C0.getString(2131427421);
                }
                if (x.b[B0] == 2) {
                    string2 = C0.getString(2131427422);
                }
                if (x.b[B0] == 3) {
                    string2 = C0.getString(2131427423);
                }
                if (x.b[B0] == 4) {
                    string2 = C0.getString(2131427424);
                }
            }
            ImageView imageView = this.d;
            Paint paint = new Paint();
            int n9 = 1 + this.c / 30;
            float f10 = n9;
            paint.setTextSize(0.7f * f10);
            paint.setColor(Y0);
            paint.setTextAlign(Paint.Align.CENTER);
            Rect rect = new Rect();
            paint.getTextBounds(string2, 0, string2.length(), rect);
            int n10 = rect.height();
            Bitmap bitmap = Bitmap.createBitmap((int)this.c, (int)n9, (Bitmap.Config)Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            canvas.drawBitmap(h0, null, new RectF(0.0f, 0.0f, (float)this.c, f10), paint);
            float f11 = 3 * this.c / 4;
            float f12 = n9 - (n9 - n10) / 2;
            canvas.drawText(string, f11, f12, paint);
            canvas.drawText(string2, (float)(this.c / 4), f12, paint);
            Matrix matrix = new Matrix();
            float[] arrf = new float[]{0.0f, 0.0f, bitmap.getWidth(), 0.0f, bitmap.getWidth(), bitmap.getHeight(), 0.0f, bitmap.getHeight()};
            float[] arrf2 = new float[]{0.0f, 0.0f, bitmap.getWidth(), 0.0f, bitmap.getWidth() + bitmap.getWidth() / 50, bitmap.getHeight(), 0 - bitmap.getWidth() / 50, bitmap.getHeight()};
            matrix.setPolyToPoly(arrf2, 0, arrf, 0, 4);
            imageView.setImageBitmap(Bitmap.createBitmap((Bitmap)bitmap, (int)0, (int)0, (int)bitmap.getWidth(), (int)bitmap.getHeight(), (Matrix)matrix, (boolean)true));
        }
        if ((textView = (TextView)this.findViewById(2131165400)) != null) {
            textView.setText((CharSequence)string);
        }
    }

    public void backClicked(View view) {
        SoundPool soundPool;
        if (H0 && (soundPool = M0) != null) {
            soundPool.autoPause();
            M0.play(T0, 1.0f, 1.0f, 1, 0, 1.0f);
        }
        if (z0) {
            z0 = false;
            Button button = (Button)this.findViewById(2131165231);
            if (button != null) {
                button.clearAnimation();
                button.setBackgroundResource(2131099789);
            }
        }
        c.c.b.a.g0 = new ArrayList();
        this.u.setHintTo(-1);
        E0.j();
        U = 1 + U;
    }

    public void c() {
        Button button;
        if (!this.L && (button = (Button)this.findViewById(2131165234)) != null) {
            c.c.a.b.a((Context)this, (Button)button, (int)2131099671);
        }
    }

    public void c(int n9) {
        this.u.setSelection(n9);
        this.u.p = false;
    }

    public final byte[] c(String string) {
        int n9 = string.length() / 2;
        byte[] arrby = new byte[n9];
        for (int i10 = 0; i10 < n9; ++i10) {
            int n10 = i10 * 2;
            arrby[i10] = (byte)(-65 + string.charAt(n10 + 1) + 16 * (-65 + string.charAt(n10)));
        }
        return arrby;
    }

    public String d() {
        return this.E;
    }

    public void d(int n9) {
        this.u.setSelectionLastMove(n9);
        this.u.p = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void d(String string) {
        SharedPreferences.Editor editor;
        SharedPreferences sharedPreferences;
        String string2;
        String string3 = this.F.getString("difficulty", "easy");
        String string4 = this.F.getString("playas", "white");
        String string5 = string4.equals((Object)"white") && string.equals((Object)"white_win") || string4.equals((Object)"black") && string.equals((Object)"black_win") ? "ME" : "NOT_ME";
        if (string3.equals((Object)"easy")) {
            if (string.equals((Object)"remis")) {
                editor = this.G;
                sharedPreferences = this.F;
                string2 = "easy_draw";
            } else if (string5.equals((Object)"ME")) {
                editor = this.G;
                sharedPreferences = this.F;
                string2 = "easy_win";
            } else {
                editor = this.G;
                sharedPreferences = this.F;
                string2 = "easy_loss";
            }
        } else if (string3.equals((Object)"medium")) {
            if (string.equals((Object)"remis")) {
                editor = this.G;
                sharedPreferences = this.F;
                string2 = "medium_draw";
            } else if (string5.equals((Object)"ME")) {
                editor = this.G;
                sharedPreferences = this.F;
                string2 = "medium_win";
            } else {
                editor = this.G;
                sharedPreferences = this.F;
                string2 = "medium_loss";
            }
        } else if (string3.equals((Object)"hard")) {
            if (string.equals((Object)"remis")) {
                editor = this.G;
                sharedPreferences = this.F;
                string2 = "hard_draw";
            } else if (string5.equals((Object)"ME")) {
                editor = this.G;
                sharedPreferences = this.F;
                string2 = "hard_win";
            } else {
                editor = this.G;
                sharedPreferences = this.F;
                string2 = "hard_loss";
            }
        } else {
            if (!string3.equals((Object)"expert")) {
                return;
            }
            if (string.equals((Object)"remis")) {
                editor = this.G;
                sharedPreferences = this.F;
                string2 = "expert_draw";
            } else if (string5.equals((Object)"ME")) {
                editor = this.G;
                sharedPreferences = this.F;
                string2 = "expert_win";
            } else {
                editor = this.G;
                sharedPreferences = this.F;
                string2 = "expert_loss";
            }
        }
        editor.putInt(string2, 1 + sharedPreferences.getInt(string2, 0));
        this.G.commit();
    }

    public void e() {
        SoundPool soundPool;
        if (H0 && (soundPool = M0) != null) {
            soundPool.autoPause();
            M0.play(V0, 1.0f, 1.0f, 1, 0, 1.0f);
        }
    }

    public final void e(int n9) {
        if (n9 == 2) {
            String[] arrstring = "\ue055 \ue054 \ue053 \ue052 \ue051 \ue050".split(" ");
            if (arrstring.length == 6) {
                l.a = arrstring;
                return;
            }
        } else {
            String[] arrstring = this.getString(2131427426).split(" ");
            if (arrstring.length == 6) {
                l.a = arrstring;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void e(String string) {
        block5 : {
            SharedPreferences.Editor editor;
            String string2;
            SharedPreferences sharedPreferences;
            block3 : {
                block4 : {
                    block2 : {
                        if (!string.equals((Object)"remis")) break block2;
                        this.G.putInt("white_draw", 1 + this.F.getInt("white_draw", 0));
                        editor = this.G;
                        sharedPreferences = this.F;
                        string2 = "black_draw";
                        break block3;
                    }
                    if (!string.equals((Object)"white_win")) break block4;
                    this.G.putInt("white_win", 1 + this.F.getInt("white_win", 0));
                    editor = this.G;
                    sharedPreferences = this.F;
                    string2 = "black_loss";
                    break block3;
                }
                if (!string.equals((Object)"black_win")) break block5;
                this.G.putInt("black_win", 1 + this.F.getInt("black_win", 0));
                editor = this.G;
                sharedPreferences = this.F;
                string2 = "white_loss";
            }
            editor.putInt(string2, 1 + sharedPreferences.getInt(string2, 0));
        }
        this.G.commit();
    }

    public boolean f() {
        return this.C;
    }

    public void g() {
    }

    public void h() {
        block7 : {
            t t10;
            SoundPool soundPool;
            block8 : {
                RelativeLayout relativeLayout;
                RelativeLayout relativeLayout2;
                TextView textView;
                int n9;
                RelativeLayout relativeLayout3;
                TextView textView2;
                RelativeLayout relativeLayout4;
                block9 : {
                    Bitmap bitmap;
                    View view;
                    block11 : {
                        View view2;
                        View view3;
                        View view4;
                        block10 : {
                            if (I0) break block7;
                            I0 = true;
                            J0 = 9;
                            t10 = new t((Context)C0);
                            t10.requestWindowFeature(1);
                            t10.setContentView(2131296271);
                            Window window = t10.getWindow();
                            if (window != null) {
                                window.setBackgroundDrawableResource(17170445);
                            }
                            t10.setCancelable(true);
                            t10.setOnCancelListener((DialogInterface.OnCancelListener)new c.c.a.o(this));
                            a0 = t10;
                            TextView textView3 = (TextView)t10.findViewById(2131165411);
                            textView3.setGravity(1);
                            textView3.setVisibility(0);
                            textView3.setTextSize(1, 22.0f);
                            textView3.setText(2131427431);
                            LinearLayout linearLayout = (LinearLayout)t10.findViewById(2131165326);
                            LinearLayout linearLayout2 = (LinearLayout)t10.findViewById(2131165327);
                            LinearLayout linearLayout3 = (LinearLayout)t10.findViewById(2131165328);
                            LinearLayout linearLayout4 = (LinearLayout)t10.findViewById(2131165329);
                            if (linearLayout != null && linearLayout2 != null && linearLayout3 != null && linearLayout4 != null) {
                                linearLayout.setOnClickListener((View.OnClickListener)new c.c.a.e(this, t10));
                                linearLayout2.setOnClickListener((View.OnClickListener)new c.c.a.f(this, t10));
                                linearLayout3.setOnClickListener((View.OnClickListener)new c.c.a.g(this, t10));
                                linearLayout4.setOnClickListener((View.OnClickListener)new c.c.a.h(this, t10));
                            }
                            view2 = t10.findViewById(2131165358);
                            view4 = t10.findViewById(2131165359);
                            view3 = t10.findViewById(2131165364);
                            view = t10.findViewById(2131165365);
                            relativeLayout2 = (RelativeLayout)t10.findViewById(2131165360);
                            relativeLayout3 = (RelativeLayout)t10.findViewById(2131165361);
                            relativeLayout4 = (RelativeLayout)t10.findViewById(2131165362);
                            relativeLayout = (RelativeLayout)t10.findViewById(2131165363);
                            if (view2 == null || view4 == null || view3 == null || view == null || relativeLayout2 == null || relativeLayout3 == null || relativeLayout4 == null || relativeLayout == null) break block8;
                            if (!d0 || F0 != 1) break block9;
                            view2.setVisibility(0);
                            view4.setVisibility(0);
                            view3.setVisibility(0);
                            view.setVisibility(0);
                            if (!this.u.a.b) break block10;
                            if (c.c.b.a.T == null || c.c.b.a.R == null || c.c.b.a.U == null || c.c.b.a.V == null) break block8;
                            view2.setBackground(c.c.a.b.a((Context)this, (Bitmap)c.c.b.a.T));
                            view4.setBackground(c.c.a.b.a((Context)this, (Bitmap)c.c.b.a.R));
                            view3.setBackground(c.c.a.b.a((Context)this, (Bitmap)c.c.b.a.U));
                            bitmap = c.c.b.a.V;
                            break block11;
                        }
                        if (c.c.b.a.c0 == null || c.c.b.a.a0 == null || c.c.b.a.d0 == null || c.c.b.a.e0 == null) break block8;
                        view2.setBackground(c.c.a.b.a((Context)this, (Bitmap)c.c.b.a.c0));
                        view4.setBackground(c.c.a.b.a((Context)this, (Bitmap)c.c.b.a.a0));
                        view3.setBackground(c.c.a.b.a((Context)this, (Bitmap)c.c.b.a.d0));
                        bitmap = c.c.b.a.e0;
                    }
                    view.setBackground(c.c.a.b.a((Context)this, (Bitmap)bitmap));
                    break block8;
                }
                relativeLayout2.setVisibility(0);
                relativeLayout3.setVisibility(0);
                relativeLayout4.setVisibility(0);
                relativeLayout.setVisibility(0);
                if (this.u.a.b) {
                    this.a((TextView)t10.findViewById(2131165401), (TextView)t10.findViewById(2131165406), 2);
                    this.a((TextView)t10.findViewById(2131165402), (TextView)t10.findViewById(2131165407), 3);
                    this.a((TextView)t10.findViewById(2131165403), (TextView)t10.findViewById(2131165408), 4);
                    textView = (TextView)t10.findViewById(2131165404);
                    textView2 = (TextView)t10.findViewById(2131165409);
                    n9 = 5;
                } else {
                    this.a((TextView)t10.findViewById(2131165401), (TextView)t10.findViewById(2131165406), 8);
                    this.a((TextView)t10.findViewById(2131165402), (TextView)t10.findViewById(2131165407), 9);
                    this.a((TextView)t10.findViewById(2131165403), (TextView)t10.findViewById(2131165408), 10);
                    textView = (TextView)t10.findViewById(2131165404);
                    textView2 = (TextView)t10.findViewById(2131165409);
                    n9 = 11;
                }
                this.a(textView, textView2, n9);
            }
            if (H0 && (soundPool = M0) != null) {
                soundPool.autoPause();
                M0.play(X0, 0.3f, 0.3f, 1, 0, 1.0f);
            }
            t10.show();
        }
    }

    /*
     * Exception decompiling
     */
    public void hintPressed(View var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl157.1 : NEW : trying to set 1 previously set to 0
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

    public Context i() {
        return this.getApplicationContext();
    }

    public void infoPressed(View view) {
        block8 : {
            int n9;
            ArrayList arrayList;
            block9 : {
                v0 = "";
                w0 = "";
                x0 = "";
                y0 = "";
                c.c.b.i.d d6 = MainActivity.E0.e;
                if (d6 == null) break block8;
                arrayList = new ArrayList();
                h h6 = d6.b.b();
                List list = (List)h6.a;
                int n10 = (Integer)h6.b;
                n9 = 0;
                if (list == null) break block9;
                int n11 = 0;
                do {
                    block12 : {
                        Integer n12;
                        block11 : {
                            o o10;
                            block10 : {
                                n9 = 0;
                                if (n11 >= n10) break;
                                e.c c8 = (e.c)list.get(n11);
                                o10 = c8.d;
                                int n13 = o10.a;
                                if (n13 == 0) break block10;
                                n12 = n13;
                                break block11;
                            }
                            int n14 = o10.e;
                            if (n14 == 0) break block12;
                            n12 = n14;
                        }
                        arrayList.add((Object)n12);
                    }
                    ++n11;
                } while (true);
            }
            while (n9 < arrayList.size()) {
                int n15 = (Integer)arrayList.get(n9);
                String string = c.c.a.b.a((int)n15);
                String string2 = c.c.a.b.b((int)n15);
                if (n15 < 7) {
                    v0 = c.a.b.a.a.a(new StringBuilder(), v0, string, " ");
                    x0 = c.a.b.a.a.a(new StringBuilder(), x0, string2, " ");
                } else {
                    w0 = c.a.b.a.a.a(new StringBuilder(), w0, string, " ");
                    y0 = c.a.b.a.a.a(new StringBuilder(), y0, string2, " ");
                }
                ++n9;
            }
            if (!I0) {
                c.c.a.a.a((Context)this);
            }
            return;
        }
        throw null;
    }

    public void j() {
    }

    public boolean k() {
        return this.v;
    }

    public void l() {
    }

    public void m() {
        this.w();
    }

    public void menuClicked(View view) {
        this.n();
    }

    @SuppressLint(value={"NewApi"})
    public void n() {
        if (this.k >= 3 && !G0) {
            if (!I0) {
                I0 = true;
                J0 = 5;
                t t10 = new t((Context)C0);
                t10.requestWindowFeature(1);
                t10.setContentView(2131296262);
                Window window = t10.getWindow();
                if (window != null) {
                    window.setBackgroundDrawableResource(17170445);
                }
                t10.setCancelable(true);
                a0 = t10;
                t10.getWindow().setFlags(32, 32);
                t10.setOnCancelListener((DialogInterface.OnCancelListener)new b(this));
                RelativeLayout relativeLayout = (RelativeLayout)t10.findViewById(2131165412);
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(8);
                }
                TextView textView = (TextView)t10.findViewById(2131165398);
                textView.setGravity(17);
                textView.setTextSize(1, 20.0f);
                textView.setText(2131427387);
                t10.getWindow().clearFlags(2);
                RelativeLayout relativeLayout2 = K0;
                if (relativeLayout2 != null) {
                    relativeLayout2.setVisibility(0);
                }
                ImageView imageView = (ImageView)t10.findViewById(2131165313);
                imageView.setVisibility(0);
                imageView.setImageResource(2131099715);
                LinearLayout linearLayout = new LinearLayout((Context)this);
                linearLayout.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-2, -2));
                linearLayout.setGravity(17);
                imageView.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams((int)TypedValue.applyDimension((int)1, (float)50.0f, (DisplayMetrics)this.getResources().getDisplayMetrics()), (int)TypedValue.applyDimension((int)1, (float)50.0f, (DisplayMetrics)this.getResources().getDisplayMetrics())));
                Button button = (Button)t10.findViewById(2131165340);
                button.setText(2131427346);
                button.setVisibility(0);
                button.setOnClickListener((View.OnClickListener)new c(this, t10));
                button.setBackgroundResource(2131099794);
                Button button2 = (Button)t10.findViewById(2131165341);
                button2.setText(2131427344);
                button2.setVisibility(0);
                button2.setOnClickListener((View.OnClickListener)new d(this, t10));
                button2.setBackgroundResource(2131099796);
                Button button3 = (Button)t10.findViewById(2131165351);
                button3.setText(2131427338);
                button3.setVisibility(0);
                button3.setOnClickListener((View.OnClickListener)new e(this, t10));
                button3.setBackgroundResource(2131099792);
                t10.show();
                return;
            }
        } else {
            this.l = true;
            this.finish();
        }
    }

    @SuppressLint(value={"NewApi"})
    public void newGamePressed(View view) {
        if (!I0) {
            I0 = true;
            J0 = 3;
            t t10 = new t((Context)C0);
            t10.requestWindowFeature(1);
            t10.setContentView(2131296262);
            Window window = t10.getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(17170445);
            }
            t10.setCancelable(true);
            a0 = t10;
            t10.getWindow().setFlags(32, 32);
            t10.setOnCancelListener((DialogInterface.OnCancelListener)new e0(this));
            RelativeLayout relativeLayout = (RelativeLayout)t10.findViewById(2131165412);
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            TextView textView = (TextView)t10.findViewById(2131165411);
            textView.setText(2131427334);
            textView.setGravity(1);
            textView.setTextSize(1, 24.0f);
            textView.setTextColor(Color.argb((int)255, (int)255, (int)255, (int)255));
            textView.setVisibility(0);
            TextView textView2 = (TextView)t10.findViewById(2131165398);
            textView2.setGravity(17);
            textView2.setTextSize(1, 15.0f);
            textView2.setText(2131427440);
            textView2.setTextColor(Color.argb((int)150, (int)255, (int)255, (int)255));
            t10.getWindow().clearFlags(2);
            RelativeLayout relativeLayout2 = K0;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(0);
            }
            ImageView imageView = (ImageView)t10.findViewById(2131165313);
            imageView.setVisibility(0);
            imageView.setImageResource(2131099732);
            LinearLayout linearLayout = new LinearLayout((Context)this);
            linearLayout.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-2, -2));
            linearLayout.setGravity(17);
            imageView.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams((int)TypedValue.applyDimension((int)1, (float)50.0f, (DisplayMetrics)this.getResources().getDisplayMetrics()), (int)TypedValue.applyDimension((int)1, (float)50.0f, (DisplayMetrics)this.getResources().getDisplayMetrics())));
            Button button = (Button)t10.findViewById(2131165351);
            button.setText(2131427349);
            button.setVisibility(0);
            button.setOnClickListener((View.OnClickListener)new f0(this, t10));
            button.setBackgroundResource(2131099793);
            Button button2 = (Button)t10.findViewById(2131165340);
            button2.setText(2131427338);
            button2.setVisibility(0);
            button2.setOnClickListener((View.OnClickListener)new g0(this, t10));
            button2.setBackgroundResource(2131099791);
            t10.show();
        }
    }

    public RewardedAd o() {
        RewardedAd rewardedAd = new RewardedAd((Context)this, this.P);
        RewardedAdLoadCallback rewardedAdLoadCallback = new RewardedAdLoadCallback(){

            public void onRewardedAdFailedToLoad(int n9) {
            }

            public void onRewardedAdLoaded() {
                MainActivity mainActivity = MainActivity.C0;
                if (mainActivity != null && !MainActivity.this.N) {
                    mainActivity.q();
                }
            }
        };
        rewardedAd.loadAd(new AdRequest.Builder().build(), rewardedAdLoadCallback);
        return rewardedAd;
    }

    public void onBackPressed() {
        if (!b0) {
            this.n();
            return;
        }
        this.y();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int n9 = Build.VERSION.SDK_INT;
        if (configuration.orientation == 1 && F0 == 2 && d0 && n9 >= 18) {
            Z0 = true;
            this.setRequestedOrientation(6);
        }
    }

    /*
     * Exception decompiling
     */
    @SuppressLint(value={"NewApi"})
    public void onCreate(Bundle var1) {
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

    public void onDestroy() {
        SoundPool soundPool;
        c.c.b.i.b b6 = E0;
        if (b6 != null) {
            b6.e();
        }
        if ((soundPool = M0) != null) {
            soundPool.release();
            M0 = null;
        }
        super.onDestroy();
    }

    /*
     * Exception decompiling
     */
    public void onPause() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl11.1 : GETSTATIC : trying to set 1 previously set to 0
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

    public void onResume() {
        c.c.b.i.b b6;
        RelativeLayout relativeLayout;
        ChessBoardPlay chessBoardPlay;
        super.onResume();
        int n9 = Build.VERSION.SDK_INT;
        if (Z0 && F0 == 2 && d0 && n9 >= 18) {
            Z0 = false;
            this.setRequestedOrientation(14);
        }
        if ((chessBoardPlay = this.u) != null) {
            chessBoardPlay.setEnabled(true);
        }
        if ((relativeLayout = K0) != null && !I0) {
            relativeLayout.setBackgroundColor(Color.argb((int)160, (int)0, (int)0, (int)0));
            K0.setVisibility(8);
            AdView adView = n0;
            if (adView != null && !S) {
                adView.setVisibility(0);
            }
        }
        if ((b6 = E0) != null) {
            b6.b(false);
        }
        this.b(c0);
        c.c.a.b.a((FirebaseAnalytics)this.b, (SharedPreferences)this.F, (SharedPreferences.Editor)this.G);
        if (this.i) {
            String[] arrstring;
            int n10;
            if (j0.equals((Object)"100")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.getString(2131427397));
                stringBuilder.append(" ");
                stringBuilder.append(1 + B0);
                stringBuilder.append("/");
                stringBuilder.append(100);
                i0 = stringBuilder.toString();
            }
            if (j0.equals((Object)"50")) {
                i0 = this.getString(2131427414);
            }
            if (j0.equals((Object)"0")) {
                i0 = this.getString(2131427408);
            }
            if (j0.equals((Object)"1")) {
                i0 = this.getString(2131427409);
            }
            if (j0.equals((Object)"2")) {
                i0 = this.getString(2131427410);
            }
            if (j0.equals((Object)"3")) {
                i0 = this.getString(2131427411);
            }
            if (j0.equals((Object)"4")) {
                i0 = this.getString(2131427412);
            }
            if (j0.equals((Object)"5")) {
                i0 = this.getString(2131427413);
            }
            if (j0.equals((Object)"6")) {
                i0 = this.getString(2131427415);
            }
            if (j0.equals((Object)"7")) {
                i0 = this.getString(2131427416);
            }
            if (j0.equals((Object)"8")) {
                i0 = this.getString(2131427417);
            }
            if (j0.equals((Object)"9")) {
                i0 = this.getString(2131427418);
            }
            this.v();
            boolean bl = this.j;
            this.k = 0;
            c.c.b.a.g0 = new ArrayList();
            this.u.setHintTo(-1);
            n n11 = new n();
            n11.a(this.o, this.q, this.r);
            a1 = false;
            z0 = false;
            E0.a(this.x, n11);
            U = 0;
            V = 0;
            this.N = false;
            if (bl) {
                SharedPreferences sharedPreferences = this.F;
                StringBuilder stringBuilder = c.a.b.a.a.a("gameState");
                stringBuilder.append(this.g);
                String string = sharedPreferences.getString(stringBuilder.toString(), null);
                SharedPreferences sharedPreferences2 = this.F;
                StringBuilder stringBuilder2 = c.a.b.a.a.a("gameStateAsWhite");
                stringBuilder2.append(this.g);
                Integer n12 = sharedPreferences2.getInt(stringBuilder2.toString(), 100);
                SharedPreferences sharedPreferences3 = this.F;
                StringBuilder stringBuilder3 = c.a.b.a.a.a("gameStateCountUndo");
                stringBuilder3.append(this.g);
                String string2 = sharedPreferences3.getString(stringBuilder3.toString(), null);
                SharedPreferences sharedPreferences4 = this.F;
                StringBuilder stringBuilder4 = c.a.b.a.a.a("gameStateCountHint");
                stringBuilder4.append(this.g);
                String string3 = sharedPreferences4.getString(stringBuilder4.toString(), null);
                SharedPreferences sharedPreferences5 = this.F;
                StringBuilder stringBuilder5 = c.a.b.a.a.a("hasBonus");
                stringBuilder5.append(this.g);
                boolean bl2 = sharedPreferences5.getBoolean(stringBuilder5.toString(), false);
                byte[] arrby = null;
                if (string != null) {
                    arrby = this.c(string);
                }
                if (arrby != null && n12 != 100 && string2 != null && string3 != null) {
                    E0.a(arrby, this.n);
                    boolean bl3 = n12 != 0;
                    X = bl3;
                    U = Integer.valueOf((String)string2);
                    V = Integer.valueOf((String)string3);
                    this.N = bl2;
                }
            }
            if (T) {
                T = false;
                ChessBoardPlay chessBoardPlay2 = this.u;
                if (chessBoardPlay2 != null) {
                    chessBoardPlay2.b();
                    this.u.a();
                    if (d0 && F0 != 2) {
                        this.u.d();
                    }
                }
            }
            this.p();
            E0.a(this.x);
            E0.f();
            this.t();
            if (G0 && (n10 = B0) >= 0 && n10 < (arrstring = x.a).length) {
                E0.b(arrstring[B0]);
            }
            this.u();
            this.j = false;
            this.i = false;
        }
        this.q();
        if (z0) {
            Button button = (Button)this.findViewById(2131165231);
            Animation animation = AnimationUtils.loadAnimation((Context)this, (int)2130771968);
            if (button != null && animation != null) {
                button.startAnimation(animation);
                button.setBackgroundResource(2131099790);
            }
        } else if (!I0 && (d0 || c.c.a.b.a((Activity)this, (int)f0, (int)e0))) {
            c.c.a.a.a((MainActivity)this);
        }
        if (!d0) {
            String string;
            TextView textView;
            TextView textView2 = (TextView)this.findViewById(2131165423);
            if (textView2 != null) {
                if (G0) {
                    String string4 = C0.getString(2131427425);
                    if (x.b[B0] == 1) {
                        string4 = C0.getString(2131427421);
                    }
                    if (x.b[B0] == 2) {
                        string4 = C0.getString(2131427422);
                    }
                    if (x.b[B0] == 3) {
                        string4 = C0.getString(2131427423);
                    }
                    if (x.b[B0] == 4) {
                        string4 = C0.getString(2131427424);
                    }
                    textView2.setText((CharSequence)string4);
                } else {
                    textView2.setText(2131427425);
                }
            }
            if ((textView = (TextView)this.findViewById(2131165321)) != null && (string = i0) != null && !string.equals((Object)"")) {
                textView.setText((CharSequence)i0);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @SuppressLint(value={"NewApi"})
    public void onWindowFocusChanged(boolean bl) {
        super.onWindowFocusChanged(bl);
        if (this.a >= 19 && bl) {
            this.getWindow().getDecorView().setSystemUiVisibility(5894);
        }
    }

    public void p() {
        int n9 = F0;
        int n10 = 1;
        if (n9 == 2) {
            this.u.setRotate((boolean)n10);
            n10 = 3;
        } else if (!X) {
            n10 = 2;
        }
        this.x = new c.c.b.d(n10);
    }

    public void q() {
        int n9 = this.g;
        if (n9 != 0 && n9 != 50 && n9 != 100) {
            SharedPreferences sharedPreferences = this.F;
            StringBuilder stringBuilder = c.a.b.a.a.a("chess_fullUnlocked_");
            stringBuilder.append(this.g - 1);
            Boolean bl = sharedPreferences.getBoolean(stringBuilder.toString(), false);
            SharedPreferences sharedPreferences2 = this.F;
            StringBuilder stringBuilder2 = c.a.b.a.a.a("chess_fullUnlocked_");
            stringBuilder2.append(this.g);
            Boolean bl2 = sharedPreferences2.getBoolean(stringBuilder2.toString(), false);
            Button button = (Button)this.findViewById(2131165234);
            if (button != null) {
                int n10;
                if (!(bl2.booleanValue() || bl.booleanValue() || S || this.N)) {
                    SharedPreferences sharedPreferences3 = this.F;
                    SharedPreferences.Editor editor = this.G;
                    boolean bl3 = false;
                    if (sharedPreferences3 != null) {
                        bl3 = false;
                        if (editor != null) {
                            boolean bl4 = sharedPreferences3.getBoolean("hasDailyReward", false);
                            int n11 = Calendar.getInstance((TimeZone)TimeZone.getDefault()).get(5);
                            int n12 = sharedPreferences3.getInt("chess_lastday", 0);
                            if (n12 == 0 || n12 != n11) {
                                editor.putInt("chess_lastday", n11);
                                editor.putBoolean("hasDailyReward", true);
                                editor.commit();
                                bl3 = true;
                            } else {
                                bl3 = bl4;
                            }
                        }
                    }
                    a1 = bl3;
                    this.L = true;
                    RewardedAd rewardedAd = this.f;
                    n10 = rewardedAd != null && rewardedAd.isLoaded() && !S ? 2131099670 : 2131099672;
                } else {
                    this.L = false;
                    n10 = 2131099671;
                }
                c.c.a.b.a((Context)this, (Button)button, (int)n10);
            }
        }
    }

    /*
     * Exception decompiling
     */
    public final void r() {
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

    public void s() {
        RelativeLayout relativeLayout = K0;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(Color.argb((int)200, (int)0, (int)0, (int)0));
            AdView adView = n0;
            if (adView != null && !S) {
                adView.setVisibility(8);
            }
        }
    }

    public final void t() {
        boolean bl = true ^ X;
        SharedPreferences.Editor editor = this.F.edit();
        editor.putBoolean("boardFlipped", bl);
        editor.commit();
        this.u.setFlipped(bl);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void u() {
        block2 : {
            int n9;
            block4 : {
                block13 : {
                    String string;
                    block12 : {
                        block11 : {
                            block10 : {
                                block9 : {
                                    block8 : {
                                        block7 : {
                                            block6 : {
                                                block5 : {
                                                    block3 : {
                                                        if (F0 != 1) break block2;
                                                        string = this.F.getString("difficulty", "easy");
                                                        if (!string.equals((Object)"begginer")) break block3;
                                                        n9 = 20;
                                                        break block4;
                                                    }
                                                    if (!string.equals((Object)"easy")) break block5;
                                                    n9 = 50;
                                                    break block4;
                                                }
                                                if (!string.equals((Object)"medium")) break block6;
                                                n9 = 90;
                                                break block4;
                                            }
                                            if (!string.equals((Object)"hard")) break block7;
                                            n9 = 180;
                                            break block4;
                                        }
                                        if (!string.equals((Object)"advanced")) break block8;
                                        n9 = 240;
                                        break block4;
                                    }
                                    if (!string.equals((Object)"expert")) break block9;
                                    n9 = 300;
                                    break block4;
                                }
                                if (!string.equals((Object)"candidate")) break block10;
                                n9 = 400;
                                break block4;
                            }
                            if (!string.equals((Object)"master")) break block11;
                            n9 = 550;
                            break block4;
                        }
                        if (!string.equals((Object)"grandmaster")) break block12;
                        n9 = 800;
                        break block4;
                    }
                    if (string.equals((Object)"champion")) break block13;
                    boolean bl = string.equals((Object)"training");
                    n9 = 0;
                    if (!bl) break block4;
                }
                n9 = 1000;
            }
            E0.a("chessprince", n9);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void v() {
        block2 : {
            block11 : {
                block9 : {
                    block3 : {
                        String string;
                        block16 : {
                            int n9;
                            block15 : {
                                block14 : {
                                    block13 : {
                                        block12 : {
                                            block10 : {
                                                block8 : {
                                                    int n10;
                                                    block5 : {
                                                        block7 : {
                                                            block6 : {
                                                                block4 : {
                                                                    if (F0 != 1) break block2;
                                                                    string = this.F.getString("difficulty", "easy");
                                                                    if (string.equals((Object)"begginer")) break block3;
                                                                    if (!string.equals((Object)"easy")) break block4;
                                                                    n10 = 50000;
                                                                    break block5;
                                                                }
                                                                if (!string.equals((Object)"medium")) break block6;
                                                                n10 = 60000;
                                                                break block5;
                                                            }
                                                            if (!string.equals((Object)"hard")) break block7;
                                                            n10 = 70000;
                                                            break block5;
                                                        }
                                                        if (!string.equals((Object)"advanced")) break block8;
                                                        n10 = 80000;
                                                    }
                                                    this.o = n10;
                                                    break block9;
                                                }
                                                if (!string.equals((Object)"expert")) break block10;
                                                this.o = 90000;
                                                this.p = 110000;
                                                break block11;
                                            }
                                            if (!string.equals((Object)"candidate")) break block12;
                                            this.o = 100000;
                                            this.p = 120000;
                                            break block11;
                                        }
                                        if (!string.equals((Object)"master")) break block13;
                                        this.o = 110000;
                                        this.p = 130000;
                                        break block11;
                                    }
                                    if (!string.equals((Object)"grandmaster")) break block14;
                                    this.o = 120000;
                                    n9 = 150000;
                                    break block15;
                                }
                                if (!string.equals((Object)"champion")) break block16;
                                this.o = 130000;
                                n9 = 170000;
                            }
                            this.p = n9;
                            break block11;
                        }
                        if (!string.equals((Object)"training")) break block2;
                    }
                    this.o = 40000;
                }
                this.p = 100000;
            }
            this.q = 60;
            return;
        }
    }

    public void viewPressed(View view) {
        if (b0) {
            this.y();
        }
    }

    public void w() {
        block2 : {
            block5 : {
                SoundPool soundPool;
                int n9;
                block4 : {
                    block3 : {
                        if (!H0) break block2;
                        if (!g.b((j)this.u.a) || q0 != 1) break block3;
                        SoundPool soundPool2 = M0;
                        if (soundPool2 == null) break block2;
                        soundPool2.autoPause();
                        soundPool = M0;
                        n9 = S0;
                        break block4;
                    }
                    if (!R) break block5;
                    SoundPool soundPool3 = M0;
                    if (soundPool3 == null) break block2;
                    soundPool3.autoPause();
                    soundPool = M0;
                    n9 = U0;
                }
                soundPool.play(n9, 1.0f, 1.0f, 1, 0, 1.0f);
                return;
            }
            this.z.postDelayed((Runnable)new a(this), (long)c.c.b.a.f0);
        }
    }

    /*
     * Exception decompiling
     */
    public void waitPressed(View var1) {
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

    public final void x() {
        boolean bl = this.B;
        boolean bl2 = true;
        if (bl) {
            String string = this.I;
            if (string.length() > 0) {
                bl2 = false;
            }
            if (this.A) {
                if (!bl2) {
                    StringBuilder stringBuilder = new StringBuilder(string);
                    stringBuilder.append("\n");
                    string = stringBuilder.toString();
                }
                StringBuilder stringBuilder = new StringBuilder(String.valueOf((Object)string));
                stringBuilder.append(this.J);
                if (stringBuilder.toString().length() <= 0) {
                    // empty if block
                }
            }
        }
        if (this.H) {
            this.K.indexOf(32);
        }
    }

    /*
     * Exception decompiling
     */
    public void y() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl11.1 : GETSTATIC : trying to set 1 previously set to 0
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
     * Exception performing whole class analysis.
     */
    public static class n0
    implements i {
        public BackgroundColorSpan a;
        public boolean b;
        public int c;
        public int d;
        public HashMap<e.c, b> e;
        public c.c.b.e f;
        public boolean g;
        public int h;
        public int i;
        public boolean j;
        public int k;
        public SpannableStringBuilder l;
        public boolean m;

        public n0(c.c.b.e e10) {
            this.a = new BackgroundColorSpan(-7829368);
            this.b = true;
            this.c = 0;
            this.d = 0;
            this.e = new HashMap();
            this.g = false;
            this.h = 0;
            this.i = 0;
            this.j = false;
            this.k = 11;
            this.l = new SpannableStringBuilder();
            this.m = false;
            this.f = e10;
        }

        public void a() {
            this.l.clear();
            this.k = 11;
            this.d = 0;
            this.b = true;
            this.c = 0;
            this.e.clear();
            this.i = 0;
            this.h = 0;
            this.g = false;
            this.j = false;
            this.m = false;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public void a(e.c var1_1, int var2_2, String var3_3) {
            block45 : {
                if (this.k == 5 && var2_2 != 4) {
                    if (this.f.a.d) {
                        this.b = false;
                        this.a(false);
                    } else {
                        this.l.clear();
                        this.g = false;
                    }
                }
                if (this.j && var2_2 != 7) {
                    this.a(false);
                    this.j = false;
                }
                switch (var2_2) {
                    default: {
                        break block45;
                    }
                    case 11: {
                        this.a(true);
                        this.m = true;
                        break block45;
                    }
                    case 10: {
                        var21_4 = this.k;
                        if (var21_4 != 5) {
                            var24_5 = this.d;
                            if (var24_5 == 0) {
                                this.d = var24_5 + 1;
                                this.a(false);
                                --this.d;
                            } else if (var21_4 != 6 && !this.b) {
                                this.l.append(' ');
                            }
                        }
                        this.l.length();
                        this.l.append((CharSequence)var3_3.replaceAll("[ \t\r\n]+", " ").trim());
                        this.b = false;
                        if (this.d == 0) {
                            this.a(false);
                        }
                        break block45;
                    }
                    case 9: {
                        var15_6 = this.k;
                        if (var15_6 != 5 && var15_6 != 4 && !this.b) {
                            this.l.append(' ');
                        }
                        var16_7 = this.l.length();
                        this.l.append((CharSequence)var3_3);
                        var18_8 = this.l.length();
                        this.e.put((Object)var1_1, (Object)new /* Unavailable Anonymous Inner Class!! */);
                        this.l.setSpan((Object)new /* Unavailable Anonymous Inner Class!! */, var16_7, var18_8, 33);
                        if (this.c < var16_7) {
                            this.c = var16_7;
                        }
                        this.b = false;
                        if (this.d == 0) {
                            this.g = true;
                        }
                        break block45;
                    }
                    case 8: {
                        var8_9 = this.l;
                        switch (Integer.parseInt((String)var3_3)) {
                            default: {
                                var3_3 = "";
                                ** break;
                            }
                            case 19: {
                                var3_3 = " -+";
                                ** break;
                            }
                            case 18: {
                                var3_3 = " +-";
                                ** break;
                            }
                            case 17: {
                                var3_3 = " -/+";
                                ** break;
                            }
                            case 16: {
                                var3_3 = " +/-";
                                ** break;
                            }
                            case 15: {
                                var3_3 = " =/+";
                                ** break;
                            }
                            case 14: {
                                var3_3 = " +/=";
                                ** break;
                            }
                            case 13: {
                                var3_3 = " \u221e";
                                ** break;
                            }
                            case 11: {
                                var3_3 = " =";
                                ** break;
                            }
                            case 6: {
                                var3_3 = "?!";
                                ** break;
                            }
                            case 5: {
                                var3_3 = "!?";
                                ** break;
                            }
                            case 4: {
                                var3_3 = "??";
                                ** break;
                            }
                            case 3: {
                                var3_3 = "!!";
                                ** break;
                            }
                            case 2: {
                                var3_3 = "?";
                                ** break;
                            }
                            case 1: 
                        }
                        var3_3 = "!";
                        ** break;
lbl98: // 15 sources:
                        ** GOTO lbl136
                    }
                    case 7: {
                        this.l.append(')');
                        --this.d;
                        this.j = true;
                        break block45;
                    }
                    case 6: {
                        this.d = 1 + this.d;
                        if (this.b) {
                            this.h = 1 + this.h;
                        }
                        this.a(false);
                        var11_10 = this.l;
                        var12_11 = 40;
                        ** GOTO lbl127
                    }
                    case 5: {
                        var8_9 = this.l;
                        var3_3 = "]\n";
                        ** GOTO lbl136
                    }
                    case 4: {
                        var11_10 = this.l;
                        var12_11 = 91;
                        ** GOTO lbl127
                    }
                    case 3: {
                        var8_9 = this.l;
                        var3_3 = " *";
                        ** GOTO lbl136
                    }
                    case 2: {
                        var11_10 = this.l;
                        var12_11 = 46;
lbl127: // 3 sources:
                        var11_10.append((char)var12_11);
lbl128: // 2 sources:
                        do {
                            this.b = false;
                            break block45;
                            break;
                        } while (true);
                    }
                    case 1: {
                        var7_12 = this.k;
                        if (var7_12 != 6 && var7_12 != 5 && !this.b) {
                            this.l.append(' ');
                        }
                        var8_9 = this.l;
lbl136: // 4 sources:
                        var8_9.append((CharSequence)var3_3);
                        ** continue;
                    }
                    case 0: 
                }
                this.l.append((CharSequence)" \"");
                this.l.append((CharSequence)var3_3);
                this.l.append('\"');
            }
            this.k = var2_2;
        }

        public final void a(boolean bl) {
            if (!this.b) {
                if (this.h > 0) {
                    this.l.setSpan((Object)new LeadingMarginSpan.Standard(15 * this.h), this.i, this.l.length(), 33);
                }
                if (this.g) {
                    this.l.setSpan((Object)new StyleSpan(1), this.i, this.l.length(), 33);
                }
                if (!bl) {
                    this.l.append('\n');
                }
                this.i = this.l.length();
                this.h = this.d;
                this.g = false;
            }
            this.b = true;
        }
    }

}

