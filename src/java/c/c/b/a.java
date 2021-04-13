/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  java.lang.Double
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 */
package c.c.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import c.c.b.i.f;
import c.c.b.i.g;
import c.c.b.i.j;
import com.jetstartgames.chess.MainActivity;
import com.jetstartgames.logic.ChessBoardPlay;
import java.util.ArrayList;

public abstract class a
extends View {
    public static int L;
    public static int M;
    public static int N;
    public static Matrix O;
    public static Paint P;
    public static Bitmap Q;
    public static Bitmap R;
    public static Bitmap S;
    public static Bitmap T;
    public static Bitmap U;
    public static Bitmap V;
    public static Bitmap W;
    public static Bitmap a0;
    public static Bitmap b0;
    public static Bitmap c0;
    public static Bitmap d0;
    public static Bitmap e0;
    public static int f0;
    public static ArrayList<f> g0;
    public boolean A;
    public boolean B;
    public boolean C;
    public Paint D;
    public Paint E;
    public Paint F;
    public Paint G;
    public ArrayList<Paint> H;
    public boolean I = false;
    public a J;
    public b K;
    public j a;
    public Paint b = new Paint();
    public Paint c = new Paint();
    public Paint d = new Paint();
    public Paint e = new Paint();
    public Paint f = new Paint();
    public Paint g = new Paint();
    public Bitmap h = null;
    public int i = -1;
    public int j = 0;
    public int k = 0;
    public boolean l = false;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public float q;
    public float r;
    public boolean s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public boolean y;
    public boolean z;

    public static {
        P = new Paint();
        Q = null;
        R = null;
        S = null;
        T = null;
        U = null;
        V = null;
        W = null;
        a0 = null;
        b0 = null;
        c0 = null;
        d0 = null;
        e0 = null;
        f0 = 0;
    }

    public a(Context context, AttributeSet attributeSet) {
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        Paint paint5;
        super(context, attributeSet);
        new Handler();
        this.J = new a();
        this.K = null;
        this.a = new j();
        this.I = MainActivity.j0.equals((Object)"50");
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = false;
        this.r = 0.0f;
        this.q = 0.0f;
        this.s = false;
        this.v = 0.0f;
        this.u = 0.0f;
        this.t = 0.0f;
        this.x = -1.0f;
        this.w = -1.0f;
        this.y = false;
        this.z = false;
        this.A = false;
        this.B = true;
        this.C = false;
        new Paint();
        new Paint();
        this.b = paint5 = new Paint();
        paint5.setAntiAlias(true);
        this.b.setColor(Color.argb((int)200, (int)220, (int)0, (int)20));
        this.c.setColor(Color.argb((int)255, (int)249, (int)238, (int)77));
        this.c.setAntiAlias(true);
        this.c.setFilterBitmap(true);
        this.c.setDither(true);
        this.d.setColor(Color.argb((int)255, (int)52, (int)122, (int)27));
        this.d.setAntiAlias(true);
        this.d.setFilterBitmap(true);
        this.d.setDither(true);
        this.e.setColor(Color.argb((int)255, (int)42, (int)175, (int)247));
        this.e.setAntiAlias(true);
        this.e.setFilterBitmap(true);
        this.e.setDither(true);
        this.f.setColor(Color.argb((int)255, (int)52, (int)122, (int)27));
        this.f.setAntiAlias(true);
        this.f.setFilterBitmap(true);
        this.f.setDither(true);
        this.g.setColor(Color.argb((int)255, (int)42, (int)175, (int)247));
        this.g.setAntiAlias(true);
        this.g.setFilterBitmap(true);
        this.g.setDither(true);
        this.D = paint3 = new Paint();
        paint3.setAntiAlias(true);
        this.E = paint = new Paint();
        paint.setAntiAlias(true);
        this.F = paint4 = new Paint();
        paint4.setAntiAlias(true);
        this.G = paint2 = new Paint();
        paint2.setAntiAlias(true);
        this.H = new ArrayList();
        for (int i10 = 0; i10 < 6; ++i10) {
            Paint paint6 = new Paint();
            paint6.setStyle(Paint.Style.FILL);
            paint6.setAntiAlias(true);
            this.H.add((Object)paint6);
        }
        if (this.isInEditMode()) {
            return;
        }
        Typeface typeface = Typeface.createFromAsset((AssetManager)this.getContext().getAssets(), (String)"fonts/ChessCases.ttf");
        this.D.setTypeface(typeface);
        this.E.setTypeface(typeface);
        this.F.setTypeface(typeface);
        this.G.setTypeface(typeface);
        this.G.setStyle(Paint.Style.STROKE);
        this.G.setStrokeWidth(1.0f);
        this.G.setColor(-1);
        this.b();
        this.a();
        P.setAntiAlias(true);
        P.setFilterBitmap(true);
        P.setDither(true);
        L = MainActivity.e0;
        M = MainActivity.f0;
        N = L;
        if (MainActivity.d0 && !this.I) {
            Matrix matrix;
            int n10;
            int n11 = L;
            N = n10 = n11 + (int)(0.27f * (float)n11);
            int n12 = n10 + n10 / 4;
            int n13 = M;
            if (n12 > n13) {
                N = n11 + (n13 - n11) / 2;
            }
            O = matrix = new Matrix();
            float[] arrf = new float[8];
            int n14 = N;
            arrf[0] = (float)n14 / 8.25f;
            int n15 = L;
            arrf[1] = (int)((float)n15 - (float)n14 / 1.32f);
            arrf[2] = (float)n14 - (float)n14 / 8.25f;
            arrf[3] = (int)((float)n15 - (float)n14 / 1.32f);
            arrf[4] = n14;
            arrf[5] = n15 - n14 / 30;
            arrf[6] = 0.0f;
            arrf[7] = n15 - n14 / 30;
            float[] arrf2 = new float[]{0.0f, 0.0f, n14, 0.0f, n14, n14, 0.0f, n14};
            matrix.setPolyToPoly(arrf2, 0, arrf, 0, 4);
            this.d();
        }
    }

    public abstract float a(int var1);

    public int a(MotionEvent motionEvent) {
        int n10 = (int)motionEvent.getX();
        int n11 = (int)motionEvent.getY();
        if (MainActivity.d0 && !this.I) {
            Matrix matrix = new Matrix();
            O.invert(matrix);
            float[] arrf = new float[]{motionEvent.getX(), motionEvent.getY()};
            matrix.mapPoints(arrf);
            n10 = (int)arrf[0];
            n11 = (int)arrf[1];
        }
        int n12 = -1;
        if (this.v > 0.0f) {
            ChessBoardPlay chessBoardPlay = (ChessBoardPlay)this;
            int n13 = (int)(((float)n10 - chessBoardPlay.t) / chessBoardPlay.v);
            if (chessBoardPlay.y) {
                n13 = 7 - n13;
            }
            int n14 = (int)(((float)n11 - chessBoardPlay.u) / chessBoardPlay.v);
            if (!chessBoardPlay.y) {
                n14 = 7 - n14;
            }
            if (n13 >= 0 && n13 < 8 && n14 >= 0 && n14 < 8) {
                n12 = j.b(n13, n14);
            }
        }
        return n12;
    }

    public void a() {
        if (!MainActivity.X) {
            Matrix matrix = new Matrix();
            matrix.setRotate(180.0f);
            Bitmap bitmap = this.h;
            if (bitmap != null) {
                this.h = Bitmap.createBitmap((Bitmap)bitmap, (int)0, (int)0, (int)bitmap.getWidth(), (int)this.h.getHeight(), (Matrix)matrix, (boolean)false);
            }
        }
    }

    public final void a(Canvas canvas, float f10, float f11, int n10) {
        Bitmap bitmap;
        String string;
        boolean bl;
        String string2;
        block37 : {
            if (this.C) {
                return;
            }
            switch (n10) {
                default: {
                    bitmap = null;
                    string2 = null;
                    string = null;
                    break;
                }
                case 12: {
                    bitmap = W;
                    string = "v";
                    bl = true;
                    string2 = "S";
                    break block37;
                }
                case 11: {
                    bitmap = e0;
                    string = "u";
                    bl = true;
                    string2 = "R";
                    break block37;
                }
                case 10: {
                    bitmap = d0;
                    string = "t";
                    bl = true;
                    string2 = "Q";
                    break block37;
                }
                case 9: {
                    bitmap = a0;
                    string = "s";
                    bl = true;
                    string2 = "P";
                    break block37;
                }
                case 8: {
                    bitmap = c0;
                    string = "r";
                    bl = true;
                    string2 = "O";
                    break block37;
                }
                case 7: {
                    bitmap = b0;
                    string = "q";
                    bl = true;
                    string2 = "N";
                    break block37;
                }
                case 6: {
                    bitmap = Q;
                    string2 = "M";
                    string = "p";
                    break;
                }
                case 5: {
                    bitmap = V;
                    string2 = "L";
                    string = "o";
                    break;
                }
                case 4: {
                    bitmap = U;
                    string2 = "K";
                    string = "n";
                    break;
                }
                case 3: {
                    bitmap = R;
                    string2 = "J";
                    string = "m";
                    break;
                }
                case 2: {
                    bitmap = T;
                    string2 = "I";
                    string = "l";
                    break;
                }
                case 1: {
                    bitmap = S;
                    string = "k";
                    string2 = "H";
                    bl = false;
                    break block37;
                }
            }
            bl = false;
        }
        if (string2 != null) {
            RectF rectF;
            Bitmap bitmap2;
            if (this.w < 0.0f) {
                Rect rect = new Rect();
                bitmap2 = bitmap;
                this.E.getTextBounds("H", 0, 1, rect);
                float f12 = this.v;
                this.w = (f12 - (float)(rect.left + rect.right)) / 2.0f;
                this.x = (f12 - (float)(rect.top + rect.bottom)) / 2.0f;
            } else {
                bitmap2 = bitmap;
            }
            boolean bl2 = bl ^ this.y;
            if (!this.l) {
                bl2 = false;
            }
            if (bl2) {
                canvas.save();
                float f13 = 0.5f * this.v;
                canvas.rotate(180.0f, f13 + f10, f13 + f11);
            }
            float f14 = f10 + this.w;
            float f15 = f11 + this.x;
            if (MainActivity.d0 && !this.I) {
                RectF rectF2;
                float[] arrf = new float[]{f14, f15};
                O.mapPoints(arrf);
                float[] arrf2 = new float[]{f14 + this.v, f15};
                O.mapPoints(arrf2);
                float f16 = (int)arrf[0];
                float f17 = (int)arrf[1];
                float f18 = (float)((int)arrf2[0]) - f16;
                int n11 = (int)f18;
                double d10 = f18;
                Double.isNaN((double)d10);
                Double.isNaN((double)d10);
                int n12 = (int)(d10 * 1.2);
                float f19 = n12 / 10;
                float f20 = (n12 - n11) / 2;
                float f21 = n12 / 5;
                if (n10 != 12 && n10 != 6) {
                    float f22 = f21 + (f16 - f20);
                    float f23 = n12;
                    rectF2 = new RectF(f22, f17 - f23, f23 + f16 - f20 - f21, f17);
                } else {
                    float f24 = f21 + (f16 - f20);
                    float f25 = n12;
                    rectF2 = new RectF(f24, f19 + (f17 - f25), f25 + f16 - f20 - f21, f17 - f19);
                }
                rectF = rectF2;
            } else {
                Paint paint;
                canvas.drawText(string, f14, f15, this.D);
                if (!(string2.equals((Object)"S") || string2.equals((Object)"O") || string2.equals((Object)"P") || string2.equals((Object)"Q") || string2.equals((Object)"R") || string2.equals((Object)"N"))) {
                    paint = this.F;
                } else {
                    canvas.drawText(string2, f14, f15, this.E);
                    paint = this.G;
                }
                canvas.drawText(string2, f14, f15, paint);
                rectF = null;
            }
            int n13 = (int)(f10 + this.v / 2.0f);
            ChessBoardPlay chessBoardPlay = (ChessBoardPlay)this;
            int n14 = (int)(((float)n13 - chessBoardPlay.t) / chessBoardPlay.v);
            if (chessBoardPlay.y) {
                n14 = 7 - n14;
            }
            if (MainActivity.d0 && !this.I && bitmap2 != null) {
                int n15;
                float f26 = rectF.left;
                float f27 = rectF.top;
                float f28 = rectF.right;
                float f29 = rectF.bottom;
                Matrix matrix = new Matrix();
                float[] arrf = new float[]{f26, f27, f28, f27, f28, f29, f26, f29};
                float[] arrf3 = new float[]{0.0f, 0.0f, bitmap2.getWidth(), 0.0f, bitmap2.getWidth(), bitmap2.getHeight(), 0.0f, bitmap2.getHeight()};
                matrix.setPolyToPoly(arrf3, 0, arrf, 0, 4);
                if (!MainActivity.X) {
                    n14 = 7 - n14;
                }
                if (n14 == 0) {
                    int n16 = bitmap2.getWidth();
                    n15 = 2;
                    matrix.preRotate(-10.0f, (float)(n16 / n15), (float)(bitmap2.getHeight() / n15));
                } else {
                    n15 = 2;
                }
                if (n14 == 1) {
                    matrix.preRotate(-5.0f, (float)(bitmap2.getWidth() / n15), (float)(bitmap2.getHeight() / n15));
                }
                if (n14 == n15) {
                    matrix.preRotate(-2.5f, (float)(bitmap2.getWidth() / n15), (float)(bitmap2.getHeight() / n15));
                }
                if (n14 == 5) {
                    matrix.preRotate(2.5f, (float)(bitmap2.getWidth() / n15), (float)(bitmap2.getHeight() / n15));
                }
                if (n14 == 6) {
                    matrix.preRotate(5.0f, (float)(bitmap2.getWidth() / n15), (float)(bitmap2.getHeight() / n15));
                }
                if (n14 == 7) {
                    matrix.preRotate(10.0f, (float)(bitmap2.getWidth() / n15), (float)(bitmap2.getHeight() / n15));
                }
                Paint paint = P;
                canvas.drawBitmap(bitmap2, matrix, paint);
            }
            if (bl2) {
                canvas.restore();
            }
        }
    }

    public abstract float b(int var1);

    public void b() {
        if (a.c.a.a.e("Themes.xml")) {
            String string = a.c.a.a.a("Themes.xml");
            if (string.equals((Object)"0")) {
                this.c();
                return;
            }
            if (string.equals((Object)"1")) {
                Bitmap bitmap;
                Bitmap bitmap2;
                this.h = bitmap2 = c.c.a.b.a(this.getContext(), "/themes/", "board800x800.jpg");
                int n10 = MainActivity.e0;
                this.h = bitmap = Bitmap.createScaledBitmap((Bitmap)bitmap2, (int)n10, (int)n10, (boolean)true);
                this.h = c.c.a.b.a(bitmap);
                this.E.setColor(Color.argb((int)255, (int)79, (int)42, (int)20));
                this.F.setColor(Color.argb((int)255, (int)79, (int)42, (int)20));
                this.D.setColor(-1);
                Q = c.c.a.b.a(this.getResources().getDrawable(2131099728));
                R = c.a.b.a.a.a(this, 2131099733);
                S = c.a.b.a.a.a(this, 2131099698);
                T = c.a.b.a.a.a(this, 2131099730);
                U = c.a.b.a.a.a(this, 2131099655);
                V = c.a.b.a.a.a(this, 2131099700);
                W = c.a.b.a.a.a(this, 2131099664, 1.0f, -50.0f, 0.8f);
                a0 = c.a.b.a.a.a(this, 2131099668, 1.0f, -50.0f, 0.8f);
                b0 = c.a.b.a.a.a(this, 2131099657, 1.0f, -50.0f, 0.8f);
                c0 = c.a.b.a.a.a(this, 2131099666, 1.0f, -50.0f, 0.8f);
                d0 = c.a.b.a.a.a(this, 2131099649, 1.0f, -50.0f, 0.8f);
                e0 = c.a.b.a.a.a(this, 2131099659, 1.0f, -50.0f, 0.8f);
                return;
            }
            if (string.equals((Object)"2")) {
                Bitmap bitmap;
                Bitmap bitmap3;
                this.h = bitmap = c.c.a.b.a(this.getContext(), "/themes/", "board800x800.jpg");
                int n11 = MainActivity.e0;
                this.h = bitmap3 = Bitmap.createScaledBitmap((Bitmap)bitmap, (int)n11, (int)n11, (boolean)true);
                this.h = c.c.a.b.a(bitmap3);
                this.E.setColor(-16777216);
                this.F.setColor(-16777216);
                this.D.setColor(-1);
                Q = c.c.a.b.a(this.getResources().getDrawable(2131099728));
                R = c.a.b.a.a.a(this, 2131099733);
                S = c.a.b.a.a.a(this, 2131099698);
                T = c.a.b.a.a.a(this, 2131099730);
                U = c.a.b.a.a.a(this, 2131099655);
                V = c.a.b.a.a.a(this, 2131099700);
                W = c.a.b.a.a.a(this, 2131099664, 1.2f, -90.0f, 0.0f);
                a0 = c.a.b.a.a.a(this, 2131099668, 1.2f, -90.0f, 0.0f);
                b0 = c.a.b.a.a.a(this, 2131099657, 1.2f, -90.0f, 0.0f);
                c0 = c.a.b.a.a.a(this, 2131099666, 1.2f, -90.0f, 0.0f);
                d0 = c.a.b.a.a.a(this, 2131099649, 1.2f, -90.0f, 0.0f);
                e0 = c.a.b.a.a.a(this, 2131099659, 1.2f, -90.0f, 0.0f);
                return;
            }
            if (string.equals((Object)"3")) {
                Bitmap bitmap;
                Bitmap bitmap4;
                this.h = bitmap4 = c.c.a.b.a(this.getContext(), "/themes/", "board800x800.jpg");
                int n12 = MainActivity.e0;
                this.h = bitmap = Bitmap.createScaledBitmap((Bitmap)bitmap4, (int)n12, (int)n12, (boolean)true);
                this.h = c.c.a.b.a(bitmap);
                this.E.setColor(Color.argb((int)255, (int)79, (int)42, (int)20));
                this.F.setColor(Color.argb((int)255, (int)79, (int)42, (int)20));
                this.D.setColor(Color.argb((int)255, (int)255, (int)250, (int)235));
                Q = c.c.a.b.a(c.c.a.b.a(this.getResources().getDrawable(2131099728)), 1.0f, 0.0f, 0.8f);
                R = c.a.b.a.a.a(this, 2131099733, 1.0f, 0.0f, 0.8f);
                S = c.a.b.a.a.a(this, 2131099698, 1.0f, 0.0f, 0.8f);
                T = c.a.b.a.a.a(this, 2131099730, 1.0f, 0.0f, 0.8f);
                U = c.a.b.a.a.a(this, 2131099655, 1.0f, 0.0f, 0.8f);
                V = c.a.b.a.a.a(this, 2131099700, 1.0f, 0.0f, 0.8f);
                W = c.a.b.a.a.a(this, 2131099664, 1.0f, -50.0f, 0.8f);
                a0 = c.a.b.a.a.a(this, 2131099668, 1.0f, -50.0f, 0.8f);
                b0 = c.a.b.a.a.a(this, 2131099657, 1.0f, -50.0f, 0.8f);
                c0 = c.a.b.a.a.a(this, 2131099666, 1.0f, -50.0f, 0.8f);
                d0 = c.a.b.a.a.a(this, 2131099649, 1.0f, -50.0f, 0.8f);
                e0 = c.a.b.a.a.a(this, 2131099659, 1.0f, -50.0f, 0.8f);
                return;
            }
            if (string.equals((Object)"4")) {
                Bitmap bitmap;
                Bitmap bitmap5;
                this.h = bitmap5 = c.c.a.b.a(this.getContext(), "/themes/", "board800x800.jpg");
                int n13 = MainActivity.e0;
                this.h = bitmap = Bitmap.createScaledBitmap((Bitmap)bitmap5, (int)n13, (int)n13, (boolean)true);
                this.h = c.c.a.b.a(bitmap);
                this.E.setColor(-16777216);
                this.F.setColor(-16777216);
                this.D.setColor(-1);
                MainActivity.Y0 = -16777216;
                Q = c.a.b.a.a.a(this, 2131099728, 1.0f, 30.0f, 0.5f);
                R = c.a.b.a.a.a(this, 2131099733, 1.0f, 30.0f, 0.5f);
                S = c.a.b.a.a.a(this, 2131099698, 1.0f, 30.0f, 0.5f);
                T = c.a.b.a.a.a(this, 2131099730, 1.0f, 30.0f, 0.5f);
                U = c.a.b.a.a.a(this, 2131099655, 1.0f, 30.0f, 0.5f);
                V = c.a.b.a.a.a(this, 2131099700, 1.0f, 30.0f, 0.5f);
                W = c.a.b.a.a.a(this, 2131099664, 1.2f, -100.0f, 0.0f);
                a0 = c.a.b.a.a.a(this, 2131099668, 1.2f, -100.0f, 0.0f);
                b0 = c.a.b.a.a.a(this, 2131099657, 1.2f, -100.0f, 0.0f);
                c0 = c.a.b.a.a.a(this, 2131099666, 1.2f, -100.0f, 0.0f);
                d0 = c.a.b.a.a.a(this, 2131099649, 1.2f, -100.0f, 0.0f);
                e0 = c.a.b.a.a.a(this, 2131099659, 1.2f, -100.0f, 0.0f);
                return;
            }
            if (string.equals((Object)"5")) {
                Bitmap bitmap;
                Bitmap bitmap6;
                this.h = bitmap = c.c.a.b.a(this.getContext(), "/themes/", "board800x800.jpg");
                int n14 = MainActivity.e0;
                this.h = bitmap6 = Bitmap.createScaledBitmap((Bitmap)bitmap, (int)n14, (int)n14, (boolean)true);
                this.h = c.c.a.b.a(bitmap6);
                this.E.setColor(Color.argb((int)255, (int)79, (int)42, (int)20));
                this.F.setColor(Color.argb((int)255, (int)79, (int)42, (int)20));
                this.D.setColor(Color.argb((int)255, (int)255, (int)255, (int)255));
                Q = c.c.a.b.a(this.getResources().getDrawable(2131099728));
                R = c.a.b.a.a.a(this, 2131099733);
                S = c.a.b.a.a.a(this, 2131099698);
                T = c.a.b.a.a.a(this, 2131099730);
                U = c.a.b.a.a.a(this, 2131099655);
                V = c.a.b.a.a.a(this, 2131099700);
                W = c.a.b.a.a.a(this, 2131099664, 1.0f, -50.0f, 0.8f);
                a0 = c.a.b.a.a.a(this, 2131099668, 1.0f, -50.0f, 0.8f);
                b0 = c.a.b.a.a.a(this, 2131099657, 1.0f, -50.0f, 0.8f);
                c0 = c.a.b.a.a.a(this, 2131099666, 1.0f, -50.0f, 0.8f);
                d0 = c.a.b.a.a.a(this, 2131099649, 1.0f, -50.0f, 0.8f);
                e0 = c.a.b.a.a.a(this, 2131099659, 1.0f, -50.0f, 0.8f);
                return;
            }
            if (string.equals((Object)"6")) {
                Bitmap bitmap;
                Bitmap bitmap7;
                this.h = bitmap = c.c.a.b.a(this.getContext(), "/themes/", "board800x800.jpg");
                int n15 = MainActivity.e0;
                this.h = bitmap7 = Bitmap.createScaledBitmap((Bitmap)bitmap, (int)n15, (int)n15, (boolean)true);
                this.h = c.c.a.b.a(bitmap7);
                this.E.setColor(Color.rgb((int)112, (int)11, (int)11));
                this.F.setColor(-16777216);
                this.D.setColor(-1);
                MainActivity.Y0 = -7829368;
                Q = c.a.b.a.a.a(this, 2131099728, 1.0f, 10.0f, 0.7f);
                R = c.a.b.a.a.a(this, 2131099733, 1.0f, 10.0f, 0.7f);
                S = c.a.b.a.a.a(this, 2131099698, 1.0f, 10.0f, 0.7f);
                T = c.a.b.a.a.a(this, 2131099730, 1.0f, 10.0f, 0.7f);
                U = c.a.b.a.a.a(this, 2131099655, 1.0f, 10.0f, 0.7f);
                V = c.a.b.a.a.a(this, 2131099700, 1.0f, 10.0f, 0.7f);
                W = c.c.a.b.b(c.c.a.b.a(this.getResources().getDrawable(2131099664)), 1.0f, -100.0f, 0.2f);
                a0 = c.c.a.b.b(c.c.a.b.a(this.getResources().getDrawable(2131099668)), 1.0f, -100.0f, 0.2f);
                b0 = c.c.a.b.b(c.c.a.b.a(this.getResources().getDrawable(2131099657)), 1.0f, -100.0f, 0.2f);
                c0 = c.c.a.b.b(c.c.a.b.a(this.getResources().getDrawable(2131099666)), 1.0f, -100.0f, 0.2f);
                d0 = c.c.a.b.b(c.c.a.b.a(this.getResources().getDrawable(2131099649)), 1.0f, -100.0f, 0.2f);
                e0 = c.c.a.b.b(c.c.a.b.a(this.getResources().getDrawable(2131099659)), 1.0f, -100.0f, 0.2f);
                return;
            }
            if (string.equals((Object)"7")) {
                Bitmap bitmap;
                Bitmap bitmap8;
                this.h = bitmap8 = c.c.a.b.a(this.getContext(), "/themes/", "board800x800.jpg");
                int n16 = MainActivity.e0;
                this.h = bitmap = Bitmap.createScaledBitmap((Bitmap)bitmap8, (int)n16, (int)n16, (boolean)true);
                this.h = c.c.a.b.a(bitmap);
                this.E.setColor(-16777216);
                this.F.setColor(-16777216);
                this.D.setColor(-1);
                this.d.setColor(Color.argb((int)255, (int)125, (int)173, (int)144));
                this.f.setColor(Color.argb((int)255, (int)125, (int)173, (int)144));
                MainActivity.Y0 = -7829368;
                Q = c.a.b.a.a.a(this, 2131099728, 1.0f, 0.0f, 0.8f);
                R = c.a.b.a.a.a(this, 2131099733, 1.0f, 0.0f, 0.8f);
                S = c.a.b.a.a.a(this, 2131099698, 1.0f, 0.0f, 0.8f);
                T = c.a.b.a.a.a(this, 2131099730, 1.0f, 0.0f, 0.8f);
                U = c.a.b.a.a.a(this, 2131099655, 1.0f, 0.0f, 0.8f);
                V = c.a.b.a.a.a(this, 2131099700, 1.0f, 0.0f, 0.8f);
                W = c.a.b.a.a.a(this, 2131099664, 1.2f, -100.0f, 0.0f);
                a0 = c.a.b.a.a.a(this, 2131099668, 1.2f, -100.0f, 0.0f);
                b0 = c.a.b.a.a.a(this, 2131099657, 1.2f, -100.0f, 0.0f);
                c0 = c.a.b.a.a.a(this, 2131099666, 1.2f, -100.0f, 0.0f);
                d0 = c.a.b.a.a.a(this, 2131099649, 1.2f, -100.0f, 0.0f);
                e0 = c.a.b.a.a.a(this, 2131099659, 1.2f, -100.0f, 0.0f);
            }
            return;
        }
        this.c();
    }

    public abstract f c(int var1);

    public void c() {
        Bitmap bitmap;
        Bitmap bitmap2;
        this.h = bitmap2 = c.a.b.a.a.a(this, 2131099661);
        int n10 = MainActivity.e0;
        this.h = bitmap = Bitmap.createScaledBitmap((Bitmap)bitmap2, (int)n10, (int)n10, (boolean)true);
        this.h = c.c.a.b.a(bitmap);
        this.E.setColor(-16777216);
        this.F.setColor(-16777216);
        this.D.setColor(-1);
        MainActivity.Y0 = -7829368;
        Q = c.a.b.a.a.a(this, 2131099728, 1.0f, 0.0f, 0.8f);
        R = c.a.b.a.a.a(this, 2131099733, 1.0f, 0.0f, 0.8f);
        S = c.a.b.a.a.a(this, 2131099698, 1.0f, 0.0f, 0.8f);
        T = c.a.b.a.a.a(this, 2131099730, 1.0f, 0.0f, 0.8f);
        U = c.a.b.a.a.a(this, 2131099655, 1.0f, 0.0f, 0.8f);
        V = c.a.b.a.a.a(this, 2131099700, 1.0f, 0.0f, 0.8f);
        W = c.a.b.a.a.a(this, 2131099664, 1.2f, -100.0f, 0.0f);
        a0 = c.a.b.a.a.a(this, 2131099668, 1.2f, -100.0f, 0.0f);
        b0 = c.a.b.a.a.a(this, 2131099657, 1.2f, -100.0f, 0.0f);
        c0 = c.a.b.a.a.a(this, 2131099666, 1.2f, -100.0f, 0.0f);
        d0 = c.a.b.a.a.a(this, 2131099649, 1.2f, -100.0f, 0.0f);
        e0 = c.a.b.a.a.a(this, 2131099659, 1.2f, -100.0f, 0.0f);
    }

    public void d() {
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            float f10;
            float f11;
            float f12;
            Matrix matrix = new Matrix();
            float[] arrf = new float[8];
            int n10 = N;
            float f13 = n10;
            arrf[0] = f12 = f13 / 8.25f;
            int n11 = L;
            arrf[1] = f10 = (float)n11 - f13 / 1.32f;
            arrf[2] = f13 - f12;
            arrf[3] = f10;
            arrf[4] = f13;
            arrf[5] = f11 = (float)(n11 - n10 / 30);
            arrf[6] = 0.0f;
            arrf[7] = f11;
            float[] arrf2 = new float[]{0.0f, 0.0f, bitmap.getWidth(), 0.0f, bitmap.getWidth(), bitmap.getHeight(), 0.0f, bitmap.getHeight()};
            matrix.setPolyToPoly(arrf2, 0, arrf, 0, 4);
            this.h = Bitmap.createBitmap((Bitmap)bitmap, (int)0, (int)0, (int)bitmap.getWidth(), (int)bitmap.getHeight(), (Matrix)matrix, (boolean)true);
        }
    }

    public abstract int getMaxHeightPercentage();

    public abstract int getMaxWidthPercentage();

    public void onDraw(Canvas canvas) {
        block48 : {
            block58 : {
                a a10;
                block49 : {
                    float f10;
                    float f11;
                    float f12;
                    float f13;
                    int n10;
                    block54 : {
                        double d10;
                        int n11;
                        int n12;
                        float f14;
                        int n13;
                        int n14;
                        int n15;
                        float f15;
                        int n16;
                        float f16;
                        int n17;
                        float f17;
                        int n18;
                        int n19;
                        int n20;
                        int n21;
                        int n22;
                        block50 : {
                            int n23;
                            float f18;
                            a a11 = this.J;
                            if (a11 == null) break block48;
                            a11.e = System.currentTimeMillis();
                            if (a11.a()) {
                                this.invalidate();
                            }
                            int n24 = this.getWidth();
                            int n25 = this.getHeight();
                            float f19 = n24;
                            double d11 = f19;
                            Double.isNaN((double)d11);
                            Double.isNaN((double)d11);
                            Double.isNaN((double)d11);
                            float f20 = (float)(d11 / 8.321);
                            float f21 = n25;
                            double d12 = f21;
                            Double.isNaN((double)d12);
                            Double.isNaN((double)d12);
                            Double.isNaN((double)d12);
                            this.v = f18 = Math.min((float)f20, (float)((float)(d12 / 8.321)));
                            this.E.setTextSize(f18);
                            this.D.setTextSize(this.v);
                            this.F.setTextSize(this.v);
                            this.G.setTextSize(this.v);
                            ChessBoardPlay chessBoardPlay = (ChessBoardPlay)this;
                            float f22 = 8.0f * chessBoardPlay.v;
                            chessBoardPlay.t = (f19 - f22) / 2.0f;
                            chessBoardPlay.u = (f21 - f22) / 2.0f;
                            int n26 = Math.min((int)n24, (int)n25);
                            if (MainActivity.d0 && !this.I) {
                                this.j = (n24 - n26) / 2;
                                n23 = (n25 - n26) / 2 + (int)((float)L - (float)N / 1.32f);
                            } else {
                                this.j = (n24 - n26) / 2;
                                n23 = (n25 - n26) / 2;
                            }
                            this.k = n23;
                            int n27 = this.j;
                            float f23 = n27;
                            int n28 = this.k;
                            RectF rectF = new RectF(f23, (float)n28, (float)(n27 + n26), (float)(n28 + n26));
                            Bitmap bitmap = this.h;
                            if (bitmap != null) {
                                if (MainActivity.d0 && !this.I) {
                                    canvas.drawBitmap(bitmap, (float)this.j, (float)this.k, P);
                                } else {
                                    canvas.drawBitmap(this.h, null, rectF, P);
                                }
                            }
                            if (!(a10 = this.J).a()) break block49;
                            long l10 = a10.e;
                            long l11 = a10.c;
                            double d13 = l10 - l11;
                            double d14 = a10.d - l11;
                            Double.isNaN((double)d13);
                            Double.isNaN((double)d14);
                            Double.isNaN((double)d13);
                            Double.isNaN((double)d14);
                            Double.isNaN((double)d13);
                            Double.isNaN((double)d14);
                            d10 = d13 / d14;
                            a10.a(canvas);
                            int n29 = a10.f;
                            n12 = a10.g;
                            n14 = a10.h;
                            n13 = a10.j;
                            int n30 = a10.k;
                            n16 = a10.l;
                            float f24 = a10.a.this.a(j.f(n12));
                            a a12 = a10.a.this;
                            n21 = n12 >> 3;
                            float f25 = a12.b(n21);
                            a a13 = a10.a.this;
                            n15 = n14 & 7;
                            f11 = a13.a(n15);
                            a a14 = a10.a.this;
                            n22 = n29;
                            n20 = n14 >> 3;
                            f13 = a14.b(n20);
                            double d15 = f11 - f24;
                            Double.isNaN((double)d15);
                            Double.isNaN((double)d15);
                            Double.isNaN((double)d15);
                            Double.isNaN((double)d15);
                            float f26 = f24 + (float)((int)Math.round((double)(d15 * d10)));
                            double d16 = f13 - f25;
                            Double.isNaN((double)d16);
                            Double.isNaN((double)d16);
                            Double.isNaN((double)d16);
                            Double.isNaN((double)d16);
                            float f27 = f25 + (float)((int)Math.round((double)(d16 * d10)));
                            a a15 = a10.a.this;
                            n19 = n30 & 7;
                            float f28 = a15.a(n19);
                            a a16 = a10.a.this;
                            n17 = n30 >> 3;
                            float f29 = a16.b(n17);
                            a a17 = a10.a.this;
                            f16 = f26;
                            n18 = n16 & 7;
                            float f30 = a17.a(n18);
                            f14 = f27;
                            a a18 = a10.a.this;
                            n11 = n16 >> 3;
                            float f31 = a18.b(n11);
                            double d17 = f30 - f28;
                            Double.isNaN((double)d17);
                            Double.isNaN((double)d17);
                            Double.isNaN((double)d17);
                            Double.isNaN((double)d17);
                            f15 = f28 + (float)((int)Math.round((double)(d17 * d10)));
                            double d18 = f31 - f29;
                            Double.isNaN((double)d18);
                            Double.isNaN((double)d18);
                            Double.isNaN((double)d18);
                            Double.isNaN((double)d18);
                            f17 = f29 + (float)((int)Math.round((double)(d18 * d10)));
                            if (!MainActivity.X) break block50;
                            int n31 = 8;
                            int n32 = 0;
                            while (n32 < n31) {
                                int n33 = 7;
                                while (n33 >= 0) {
                                    int n34;
                                    float f32;
                                    int n35;
                                    float f33;
                                    int n36;
                                    int n37;
                                    int n38;
                                    float f34;
                                    block53 : {
                                        block52 : {
                                            block51 : {
                                                float f35 = a10.a.this.a(n32);
                                                float f36 = f17;
                                                float f37 = a10.a.this.b(n33);
                                                int n39 = n33 * 8;
                                                n35 = n33;
                                                int n40 = n39 + n32;
                                                n38 = n32;
                                                a a19 = a10.a.this;
                                                float f38 = f15;
                                                int n41 = a19.a.a[n40];
                                                if (n41 != 0 && n40 != n14 && n40 != n16) {
                                                    a19.a(canvas, f35, f37, n41);
                                                }
                                                double d19 = n18 - n19;
                                                Double.isNaN((double)d19);
                                                Double.isNaN((double)d19);
                                                Double.isNaN((double)d19);
                                                Double.isNaN((double)d19);
                                                int n42 = n19 + (int)Math.round((double)(d19 * d10));
                                                double d20 = n11 - n17;
                                                Double.isNaN((double)d20);
                                                Double.isNaN((double)d20);
                                                Double.isNaN((double)d20);
                                                Double.isNaN((double)d20);
                                                if (n40 == n42 + 8 * (n17 + (int)Math.round((double)(d20 * d10))) && n13 != 0) {
                                                    a a20 = a10.a.this;
                                                    f32 = f36;
                                                    f15 = f38;
                                                    a20.a(canvas, f15, f32, n13);
                                                } else {
                                                    f32 = f36;
                                                    f15 = f38;
                                                }
                                                int n43 = a10.a.this.J.f;
                                                if (n43 == 11 || n43 == 5) break block51;
                                                int n44 = n12 & 7;
                                                int n45 = n15 - n44;
                                                n37 = n13;
                                                n36 = n17;
                                                double d21 = n45;
                                                Double.isNaN((double)d21);
                                                Double.isNaN((double)d21);
                                                Double.isNaN((double)d21);
                                                Double.isNaN((double)d21);
                                                int n46 = n44 + (int)Math.round((double)(d21 * d10));
                                                double d22 = n20 - n21;
                                                Double.isNaN((double)d22);
                                                Double.isNaN((double)d22);
                                                Double.isNaN((double)d22);
                                                Double.isNaN((double)d22);
                                                if (n40 != n46 + 8 * (n21 + (int)Math.round((double)(d22 * d10))) || n22 == 0) break block52;
                                                a a21 = a10.a.this;
                                                n34 = n22;
                                                f34 = f16;
                                                f33 = f14;
                                                a21.a(canvas, f34, f33, n34);
                                                break block53;
                                            }
                                            n37 = n13;
                                            n36 = n17;
                                        }
                                        n34 = n22;
                                        f34 = f16;
                                        f33 = f14;
                                    }
                                    int n47 = n35 - 1;
                                    n22 = n34;
                                    f16 = f34;
                                    f14 = f33;
                                    n32 = n38;
                                    n13 = n37;
                                    n17 = n36;
                                    n33 = n47;
                                    f17 = f32;
                                }
                                float f39 = f17;
                                int n48 = n32;
                                int n49 = n13;
                                int n50 = n48 + 1;
                                n13 = n49;
                                n31 = 8;
                                n32 = n50;
                                f17 = f39;
                            }
                            n10 = n22;
                            f12 = f16;
                            f10 = f14;
                            break block54;
                        }
                        float f40 = f17;
                        int n51 = n13;
                        int n52 = n17;
                        int n53 = n22;
                        float f41 = f16;
                        float f42 = f14;
                        int n54 = 0;
                        int n55 = 8;
                        while (n54 < n55) {
                            float f43 = f41;
                            int n56 = 0;
                            while (n56 < n55) {
                                float f44;
                                int n57;
                                float f45;
                                int n58;
                                float f46;
                                int n59;
                                int n60;
                                int n61;
                                block57 : {
                                    float f47;
                                    int n62;
                                    block56 : {
                                        block55 : {
                                            float f48 = a10.a.this.a(n54);
                                            f47 = f42;
                                            float f49 = a10.a.this.b(n56);
                                            int n63 = n56 * 8;
                                            n59 = n56;
                                            int n64 = n63 + n54;
                                            n60 = n54;
                                            a a22 = a10.a.this;
                                            n62 = n53;
                                            int n65 = a22.a.a[n64];
                                            if (n65 != 0 && n64 != n14 && n64 != n16) {
                                                a22.a(canvas, f48, f49, n65);
                                            }
                                            double d23 = n18 - n19;
                                            Double.isNaN((double)d23);
                                            Double.isNaN((double)d23);
                                            Double.isNaN((double)d23);
                                            Double.isNaN((double)d23);
                                            int n66 = n19 + (int)Math.round((double)(d23 * d10));
                                            double d24 = n11 - n52;
                                            Double.isNaN((double)d24);
                                            Double.isNaN((double)d24);
                                            Double.isNaN((double)d24);
                                            Double.isNaN((double)d24);
                                            if (n64 == n66 + 8 * (n52 + (int)Math.round((double)(d24 * d10))) && n51 != 0) {
                                                a a23 = a10.a.this;
                                                n58 = n51;
                                                a23.a(canvas, f15, f40, n58);
                                            } else {
                                                n58 = n51;
                                            }
                                            int n67 = a10.a.this.J.f;
                                            if (n67 == 11 || n67 == 5) break block55;
                                            int n68 = n12 & 7;
                                            int n69 = n15 - n68;
                                            f44 = f15;
                                            n61 = n19;
                                            double d25 = n69;
                                            Double.isNaN((double)d25);
                                            Double.isNaN((double)d25);
                                            Double.isNaN((double)d25);
                                            Double.isNaN((double)d25);
                                            int n70 = n68 + (int)Math.round((double)(d25 * d10));
                                            double d26 = n20 - n21;
                                            Double.isNaN((double)d26);
                                            Double.isNaN((double)d26);
                                            Double.isNaN((double)d26);
                                            Double.isNaN((double)d26);
                                            if (n64 != n70 + 8 * (n21 + (int)Math.round((double)(d26 * d10))) || n62 == 0) break block56;
                                            a a24 = a10.a.this;
                                            f45 = f43;
                                            f46 = f47;
                                            n57 = n62;
                                            a24.a(canvas, f45, f46, n57);
                                            break block57;
                                        }
                                        f44 = f15;
                                        n61 = n19;
                                    }
                                    f45 = f43;
                                    f46 = f47;
                                    n57 = n62;
                                }
                                int n71 = n59 + 1;
                                n22 = n57;
                                f43 = f45;
                                f42 = f46;
                                n19 = n61;
                                n55 = 8;
                                n56 = n71;
                                f15 = f44;
                                n54 = n60;
                                n51 = n58;
                                n53 = n22;
                            }
                            int n72 = n54;
                            int n73 = n19;
                            float f50 = f43;
                            int n74 = n51;
                            float f51 = f15;
                            int n75 = n53;
                            n54 = n72 + 1;
                            f41 = f50;
                            n19 = n73;
                            n55 = 8;
                            n53 = n75;
                            f15 = f51;
                            n51 = n74;
                        }
                        f12 = f41;
                        f10 = f42;
                        n10 = n22;
                    }
                    int n76 = a10.a.this.J.f;
                    if ((n76 == 11 || n76 == 5) && n10 != 0) {
                        a10.a.this.a(canvas, f12, f10, n10);
                    }
                    if (f11 == f12 && f13 == f10) {
                        a10.e = System.currentTimeMillis();
                        a10.a();
                        return;
                    }
                    break block58;
                }
                boolean bl = a10.a();
                float f52 = 1.0f;
                int n77 = 1;
                if (!bl) {
                    a a25 = a10.a.this;
                    int n78 = a25.m;
                    if (n78 != -1) {
                        float f53;
                        float f54;
                        (ChessBoardPlay)a25;
                        int n79 = j.f(n78);
                        a a26 = a10.a.this;
                        int n80 = a26.m;
                        (ChessBoardPlay)a26;
                        int n81 = n80 >> 3;
                        float f55 = a26.a(n79);
                        float f56 = a10.a.this.b(n81);
                        float f57 = a10.a.this.v;
                        RectF rectF = new RectF(f55, f56, f55 + f57, f57 + f56);
                        rectF.left = f53 = rectF.left - f52;
                        rectF.top -= f52;
                        rectF.right = f54 = f52 + rectF.right;
                        rectF.bottom = f52 + rectF.bottom;
                        float f58 = (f54 - f53) / 15.0f;
                        float f59 = rectF.left;
                        float f60 = f58 / 2.0f;
                        RectF rectF2 = new RectF(f59 + f60, f60 + rectF.top, rectF.right - f60, rectF.bottom - f60);
                        if (MainActivity.d0 && !a10.a.this.I) {
                            float f61;
                            float f62;
                            float f63;
                            float f64;
                            float[] arrf = new float[8];
                            arrf[0] = f63 = rectF2.left;
                            arrf[n77] = f61 = rectF2.top;
                            arrf[2] = f62 = rectF2.right;
                            arrf[3] = f61;
                            arrf[4] = f62;
                            arrf[5] = f64 = rectF2.bottom;
                            arrf[6] = f63;
                            arrf[7] = f64;
                            O.mapPoints(arrf);
                            float f65 = arrf[0];
                            float f66 = arrf[n77];
                            float f67 = arrf[2];
                            float f68 = arrf[3];
                            float f69 = arrf[4];
                            float f70 = arrf[5];
                            float f71 = arrf[6];
                            float f72 = arrf[7];
                            Path path = new Path();
                            path.moveTo(f65, f66);
                            path.lineTo(f67, f68);
                            path.lineTo(f69, f70);
                            path.lineTo(f71, f72);
                            path.lineTo(f65, f66);
                            path.close();
                            a10.a.this.d.setStyle(Paint.Style.STROKE);
                            float f73 = (f67 - f65) / 15.0f;
                            a10.a.this.d.setStrokeWidth(f73);
                            canvas.drawPath(path, a10.a.this.d);
                        } else {
                            a10.a.this.d.setStyle(Paint.Style.STROKE);
                            a10.a.this.d.setStrokeWidth(f58);
                            canvas.drawRect(rectF2, a10.a.this.d);
                        }
                    }
                }
                a10.a(canvas);
                if (!a10.a()) {
                    a a27 = a10.a.this;
                    int n82 = a27.o;
                    if (n82 != -1) {
                        float f74;
                        float f75;
                        (ChessBoardPlay)a27;
                        int n83 = j.f(n82);
                        a a28 = a10.a.this;
                        int n84 = a28.o;
                        (ChessBoardPlay)a28;
                        int n85 = n84 >> 3;
                        float f76 = a28.a(n83);
                        float f77 = a10.a.this.b(n85);
                        float f78 = a10.a.this.v;
                        RectF rectF = new RectF(f76, f77, f76 + f78, f78 + f77);
                        rectF.left = f75 = rectF.left - f52;
                        rectF.top -= f52;
                        rectF.right = f74 = f52 + rectF.right;
                        rectF.bottom = f52 + rectF.bottom;
                        float f79 = (f74 - f75) / 15.0f;
                        float f80 = rectF.left;
                        float f81 = f79 / 2.0f;
                        RectF rectF3 = new RectF(f80 + f81, f81 + rectF.top, rectF.right - f81, rectF.bottom - f81);
                        if (MainActivity.d0 && !a10.a.this.I) {
                            float f82;
                            float f83;
                            float f84;
                            float f85;
                            float[] arrf = new float[8];
                            arrf[0] = f83 = rectF3.left;
                            arrf[n77] = f85 = rectF3.top;
                            arrf[2] = f82 = rectF3.right;
                            arrf[3] = f85;
                            arrf[4] = f82;
                            arrf[5] = f84 = rectF3.bottom;
                            arrf[6] = f83;
                            arrf[7] = f84;
                            O.mapPoints(arrf);
                            float f86 = arrf[0];
                            float f87 = arrf[n77];
                            float f88 = arrf[2];
                            float f89 = arrf[3];
                            float f90 = arrf[4];
                            float f91 = arrf[5];
                            float f92 = arrf[6];
                            float f93 = arrf[7];
                            Path path = new Path();
                            path.moveTo(f86, f87);
                            path.lineTo(f88, f89);
                            path.lineTo(f90, f91);
                            path.lineTo(f92, f93);
                            path.lineTo(f86, f87);
                            path.close();
                            a10.a.this.e.setStyle(Paint.Style.STROKE);
                            float f94 = (f88 - f86) / 15.0f;
                            a10.a.this.e.setStrokeWidth(f94);
                            canvas.drawPath(path, a10.a.this.e);
                        } else {
                            a10.a.this.e.setStyle(Paint.Style.STROKE);
                            a10.a.this.e.setStrokeWidth(f79);
                            canvas.drawRect(rectF3, a10.a.this.e);
                        }
                    }
                }
                if (!a10.a()) {
                    a a29 = a10.a.this;
                    int n86 = a29.i;
                    if (n86 != -1 && a29.m != n86 && MainActivity.g0) {
                        float f95;
                        float f96;
                        (ChessBoardPlay)a29;
                        int n87 = j.f(n86);
                        a a30 = a10.a.this;
                        int n88 = a30.i;
                        (ChessBoardPlay)a30;
                        int n89 = n88 >> 3;
                        float f97 = a30.a(n87);
                        float f98 = a10.a.this.b(n89);
                        float f99 = a10.a.this.v;
                        RectF rectF = new RectF(f97, f98, f97 + f99, f99 + f98);
                        rectF.left = f95 = rectF.left - f52;
                        rectF.top -= f52;
                        rectF.right = f96 = f52 + rectF.right;
                        rectF.bottom = f52 + rectF.bottom;
                        float f100 = (f96 - f95) / 15.0f;
                        float f101 = rectF.left;
                        float f102 = f100 / 2.0f;
                        RectF rectF4 = new RectF(f101 + f102, f102 + rectF.top, rectF.right - f102, rectF.bottom - f102);
                        if (MainActivity.d0 && !a10.a.this.I) {
                            float f103;
                            float f104;
                            float f105;
                            float f106;
                            float[] arrf = new float[8];
                            arrf[0] = f104 = rectF4.left;
                            arrf[n77] = f105 = rectF4.top;
                            arrf[2] = f106 = rectF4.right;
                            arrf[3] = f105;
                            arrf[4] = f106;
                            arrf[5] = f103 = rectF4.bottom;
                            arrf[6] = f104;
                            arrf[7] = f103;
                            O.mapPoints(arrf);
                            float f107 = arrf[0];
                            float f108 = arrf[n77];
                            float f109 = arrf[2];
                            float f110 = arrf[3];
                            float f111 = arrf[4];
                            float f112 = arrf[5];
                            float f113 = arrf[6];
                            float f114 = arrf[7];
                            Path path = new Path();
                            path.moveTo(f107, f108);
                            path.lineTo(f109, f110);
                            path.lineTo(f111, f112);
                            path.lineTo(f113, f114);
                            path.lineTo(f107, f108);
                            path.close();
                            a10.a.this.b.setStyle(Paint.Style.STROKE);
                            float f115 = (f109 - f107) / 15.0f;
                            a10.a.this.b.setStrokeWidth(f115);
                            canvas.drawPath(path, a10.a.this.b);
                        } else {
                            a10.a.this.b.setStyle(Paint.Style.STROKE);
                            a10.a.this.b.setStrokeWidth(f100);
                            canvas.drawRect(rectF4, a10.a.this.b);
                        }
                    }
                }
                if (g0 != null && MainActivity.g0) {
                    for (f f116 : g0) {
                        a a31 = a10.a.this;
                        int n90 = f116.b;
                        if ((ChessBoardPlay)a31 != null) {
                            int n91 = j.f(n90);
                            a a32 = a10.a.this;
                            int n92 = f116.b;
                            if ((ChessBoardPlay)a32 != null) {
                                float f117;
                                float f118;
                                int n93 = n92 >> 3;
                                float f119 = a32.a(n91);
                                float f120 = a10.a.this.b(n93);
                                float f121 = a10.a.this.v;
                                RectF rectF = new RectF(f119, f120, f119 + f121, f121 + f120);
                                rectF.left = f118 = rectF.left - f52;
                                rectF.top -= f52;
                                rectF.right = f117 = f52 + rectF.right;
                                rectF.bottom = f52 + rectF.bottom;
                                a a33 = a10.a.this;
                                j j10 = a33.a;
                                int n94 = f116.a;
                                int[] arrn = j10.a;
                                int n95 = arrn[n94];
                                int n96 = f116.b;
                                int n97 = arrn[n96];
                                int n98 = n96 - n94;
                                if (n97 == 0) {
                                    if (MainActivity.d0 && !a33.I) {
                                        float f122;
                                        float f123;
                                        float f124;
                                        float f125;
                                        float f126 = a33.v;
                                        float f127 = (f119 + (f119 + f126)) / 2.0f;
                                        float f128 = (f120 + (f120 + f126)) / 2.0f;
                                        float f129 = f126 / 11.0f;
                                        RectF rectF5 = new RectF(f127 - f129, f128 - f129, f127 + f129, f128 + f129);
                                        float[] arrf = new float[8];
                                        arrf[0] = f122 = rectF5.left;
                                        arrf[n77] = f125 = rectF5.top;
                                        arrf[2] = f123 = rectF5.right;
                                        arrf[3] = f125;
                                        arrf[4] = f123;
                                        arrf[5] = f124 = rectF5.bottom;
                                        arrf[6] = f122;
                                        arrf[7] = f124;
                                        O.mapPoints(arrf);
                                        float f130 = arrf[0];
                                        float f131 = arrf[n77];
                                        float f132 = arrf[2];
                                        float f133 = arrf[3];
                                        float f134 = arrf[4];
                                        float f135 = arrf[5];
                                        float f136 = arrf[6];
                                        float f137 = arrf[7];
                                        RectF rectF6 = new RectF((f130 + f136) / 2.0f, (f131 + f133) / 2.0f, (f132 + f134) / 2.0f, (f135 + f137) / 2.0f);
                                        Paint paint = n95 != n77 && n95 != 7 || n98 != 2 && n98 != -2 ? a10.a.this.f : a10.a.this.g;
                                        canvas.drawOval(rectF6, paint);
                                    } else {
                                        float f138;
                                        float f139;
                                        Paint paint;
                                        float f140;
                                        if (n95 != n77 && n95 != 7 || n98 != 2 && n98 != -2) {
                                            a10.a.this.d.setStyle(Paint.Style.FILL);
                                            f140 = rectF.centerX();
                                            f139 = rectF.centerY();
                                            f138 = rectF.width() / 10.0f;
                                            paint = a10.a.this.d;
                                        } else {
                                            a10.a.this.e.setStyle(Paint.Style.FILL);
                                            f140 = rectF.centerX();
                                            f139 = rectF.centerY();
                                            f138 = rectF.width() / 10.0f;
                                            paint = a10.a.this.e;
                                        }
                                        canvas.drawCircle(f140, f139, f138, paint);
                                    }
                                } else {
                                    float f141 = (f117 - f118) / 15.0f;
                                    float f142 = rectF.left;
                                    float f143 = f141 / 2.0f;
                                    RectF rectF7 = new RectF(f142 + f143, f143 + rectF.top, rectF.right - f143, rectF.bottom - f143);
                                    if (MainActivity.d0 && !a10.a.this.I) {
                                        float f144;
                                        float f145;
                                        float f146;
                                        float f147;
                                        float[] arrf = new float[8];
                                        arrf[0] = f147 = rectF7.left;
                                        arrf[n77] = f145 = rectF7.top;
                                        arrf[2] = f146 = rectF7.right;
                                        arrf[3] = f145;
                                        arrf[4] = f146;
                                        arrf[5] = f144 = rectF7.bottom;
                                        arrf[6] = f147;
                                        arrf[7] = f144;
                                        O.mapPoints(arrf);
                                        float f148 = arrf[0];
                                        float f149 = arrf[n77];
                                        float f150 = arrf[2];
                                        float f151 = arrf[3];
                                        float f152 = arrf[4];
                                        float f153 = arrf[5];
                                        float f154 = arrf[6];
                                        float f155 = arrf[7];
                                        Path path = new Path();
                                        path.moveTo(f148, f149);
                                        path.lineTo(f150, f151);
                                        path.lineTo(f152, f153);
                                        path.lineTo(f154, f155);
                                        path.lineTo(f148, f149);
                                        path.close();
                                        a10.a.this.c.setStyle(Paint.Style.STROKE);
                                        float f156 = (f150 - f148) / 15.0f;
                                        a10.a.this.c.setStrokeWidth(f156);
                                        canvas.drawPath(path, a10.a.this.c);
                                    } else {
                                        a10.a.this.c.setStyle(Paint.Style.STROKE);
                                        a10.a.this.c.setStrokeWidth(f141);
                                        canvas.drawRect(rectF7, a10.a.this.c);
                                    }
                                }
                                f52 = 1.0f;
                                n77 = 1;
                                continue;
                            }
                            throw null;
                        }
                        throw null;
                    }
                }
                if (MainActivity.X) {
                    int n99 = 8;
                    for (int i10 = 0; i10 < n99; ++i10) {
                        for (int i11 = 7; i11 >= 0; --i11) {
                            float f157 = a10.a.this.a(i10);
                            float f158 = a10.a.this.b(i11);
                            int n100 = j.b(i10, i11);
                            if (a10.a() && a10.a.this.J.a(n100)) continue;
                            a a34 = a10.a.this;
                            a34.a(canvas, f157, f158, a34.a.a[n100]);
                        }
                        n99 = 8;
                    }
                } else {
                    for (int i12 = 0; i12 < 8; ++i12) {
                        for (int i13 = 0; i13 < 8; ++i13) {
                            float f159 = a10.a.this.a(i12);
                            float f160 = a10.a.this.b(i13);
                            int n101 = j.b(i12, i13);
                            if (a10.a() && a10.a.this.J.a(n101)) continue;
                            a a35 = a10.a.this;
                            a35.a(canvas, f159, f160, a35.a.a[n101]);
                        }
                    }
                }
            }
            return;
        }
        throw null;
    }

    public void onMeasure(int n10, int n11) {
        super.onMeasure(n10, n11);
        this.x = -1.0f;
        this.w = -1.0f;
        int n12 = N;
        this.setMeasuredDimension(n12, n12);
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        b b10 = this.K;
        if (b10 != null) {
            b10.a(motionEvent);
            return true;
        }
        return false;
    }

    public final void setBlindMode(boolean bl) {
        if (this.C != bl) {
            this.C = bl;
            this.invalidate();
        }
    }

    public final void setDrawSquareLabels(boolean bl) {
        if (this.z != bl) {
            this.z = bl;
            this.invalidate();
        }
    }

    public final void setFlipped(boolean bl) {
        if (this.y != bl) {
            this.y = bl;
            this.invalidate();
        }
    }

    public final void setHintTo(int n10) {
        if (n10 != this.o) {
            this.o = n10;
            this.invalidate();
        }
    }

    public final void setOnTrackballListener(b b10) {
        this.K = b10;
    }

    public final void setPosition(j j10) {
        a a10 = this.J;
        a10.a = true;
        a10.a = false;
        if (!this.a.equals(j10)) {
            this.i = -1;
            if (g.b(j10)) {
                this.i = j10.a(j10.b);
            }
            this.a = new j(j10);
        }
        this.invalidate();
    }

    public void setRotate(boolean bl) {
        this.l = bl;
        this.invalidate();
    }

    public final void setSelection(int n10) {
        if (n10 != this.m) {
            this.m = n10;
            this.setSelectionLastMove(-1);
            this.invalidate();
        }
        this.p = true;
    }

    public final void setSelectionLastMove(int n10) {
        if (n10 != this.n) {
            this.n = n10;
            this.invalidate();
        }
        this.p = true;
    }

    public final class a {
        public boolean a;
        public long b;
        public long c = -1L;
        public long d;
        public long e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;

        public final void a(Canvas canvas) {
            a a10 = a.this;
            int n10 = a10.n;
            if (n10 != -1 && MainActivity.g0) {
                if ((ChessBoardPlay)a10 != null) {
                    int n11 = j.f(n10);
                    a a11 = a.this;
                    int n12 = a11.n;
                    if ((ChessBoardPlay)a11 != null) {
                        float f10;
                        float f11;
                        int n13 = j.g(n12);
                        float f12 = a.this.a(n11);
                        float f13 = a.this.b(n13);
                        float f14 = a.this.v;
                        RectF rectF = new RectF(f12, f13, f12 + f14, f14 + f13);
                        rectF.left = f10 = rectF.left - 1.0f;
                        rectF.top -= 1.0f;
                        rectF.right = f11 = 1.0f + rectF.right;
                        rectF.bottom = 1.0f + rectF.bottom;
                        float f15 = (f11 - f10) / 6.0f;
                        float f16 = 0.41f * (f11 - f10);
                        RectF rectF2 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
                        float[] arrf = new float[24];
                        float f17 = rectF2.left;
                        arrf[0] = f17 + f15;
                        float f18 = rectF2.top;
                        arrf[1] = f18 + f16;
                        arrf[2] = f17 + f16;
                        arrf[3] = f18 + f16;
                        arrf[4] = f17 + f16;
                        arrf[5] = f18 + f15;
                        float f19 = rectF2.right;
                        arrf[6] = f19 - f15;
                        arrf[7] = f18 + f16;
                        arrf[8] = f19 - f16;
                        arrf[9] = f18 + f16;
                        arrf[10] = f19 - f16;
                        arrf[11] = f18 + f15;
                        arrf[12] = f17 + f15;
                        float f20 = rectF2.bottom;
                        arrf[13] = f20 - f16;
                        arrf[14] = f17 + f16;
                        arrf[15] = f20 - f16;
                        arrf[16] = f17 + f16;
                        arrf[17] = f20 - f15;
                        arrf[18] = f19 - f15;
                        arrf[19] = f20 - f16;
                        arrf[20] = f19 - f16;
                        arrf[21] = f20 - f16;
                        arrf[22] = f19 - f16;
                        arrf[23] = f20 - f15;
                        if (MainActivity.d0 && !a.this.I) {
                            a.O.mapPoints(arrf);
                        }
                        Path path = new Path();
                        path.moveTo(arrf[0], arrf[1]);
                        path.lineTo(arrf[2], arrf[3]);
                        path.lineTo(arrf[4], arrf[5]);
                        path.moveTo(arrf[6], arrf[7]);
                        path.lineTo(arrf[8], arrf[9]);
                        path.lineTo(arrf[10], arrf[11]);
                        path.moveTo(arrf[12], arrf[13]);
                        path.lineTo(arrf[14], arrf[15]);
                        path.lineTo(arrf[16], arrf[17]);
                        path.moveTo(arrf[18], arrf[19]);
                        path.lineTo(arrf[20], arrf[21]);
                        path.lineTo(arrf[22], arrf[23]);
                        a.this.d.setStyle(Paint.Style.STROKE);
                        float f21 = (arrf[2] - arrf[0]) / 5.0f;
                        a.this.d.setStrokeWidth(f21);
                        canvas.drawPath(path, a.this.d);
                        return;
                    }
                    throw null;
                }
                throw null;
            }
        }

        public final boolean a() {
            return !this.a && this.c >= 0L && this.e < this.d && this.b == a.this.a.g;
            {
            }
        }

        public final boolean a(int n10) {
            boolean bl;
            block5 : {
                block4 : {
                    if (!this.a()) {
                        return false;
                    }
                    if (n10 == this.i) break block4;
                    int n11 = this.m;
                    bl = false;
                    if (n10 != n11) break block5;
                }
                bl = true;
            }
            return bl;
        }
    }

    public static class b {
        public void a(MotionEvent motionEvent) {
            throw null;
        }
    }

}

