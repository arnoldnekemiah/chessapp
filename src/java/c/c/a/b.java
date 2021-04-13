/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.ColorMatrix
 *  android.graphics.ColorMatrixColorFilter
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.RippleDrawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.widget.Button
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  com.google.firebase.analytics.FirebaseAnalytics
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c.c.a;

import a.c.a.a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.jetstartgames.chess.MainActivity;
import java.io.File;

public class b {
    public static long a = 0L;
    public static long b = 0L;
    public static String c = "";

    public static int a(Context context, int n10) {
        return (int)((float)n10 * ((float)context.getResources().getDisplayMetrics().densityDpi / 160.0f));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(Context context, boolean bl, int n10, int n11) {
        float f10;
        int n12 = (int)TypedValue.applyDimension((int)1, (float)400.0f, (DisplayMetrics)context.getResources().getDisplayMetrics());
        if (bl) {
            float f11 = n12;
            f10 = 0.65f * (float)n10;
            if (!(f11 > f10)) return n12;
            do {
                return (int)f10;
                break;
            } while (true);
        }
        float f12 = n12;
        f10 = 0.9f * (float)n11;
        if (!(f12 > f10)) return n12;
        if (n11 <= 480) return n11;
        return (int)f10;
    }

    public static Bitmap a(Context context, String string, String string2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getFilesDir().getPath());
        stringBuilder.append(string);
        stringBuilder.append(string2);
        return BitmapFactory.decodeFile((String)stringBuilder.toString(), (BitmapFactory.Options)options);
    }

    public static Bitmap a(Bitmap bitmap) {
        Bitmap bitmap2 = Bitmap.createBitmap((int)bitmap.getWidth(), (int)bitmap.getHeight(), (Bitmap.Config)bitmap.getConfig());
        Canvas canvas = new Canvas(bitmap2);
        Paint paint = new Paint();
        canvas.drawColor(0);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        bitmap.recycle();
        return bitmap2;
    }

    public static Bitmap a(Bitmap bitmap, float f10, float f11, float f12) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(f12);
        float[] arrf = colorMatrix.getArray();
        float[] arrf2 = new float[]{f10 * arrf[0], f10 * arrf[1], f10 * arrf[2], f10 * arrf[3], f11 + f10 * arrf[4], f10 * arrf[5], f10 * arrf[6], f10 * arrf[7], f10 * arrf[8], f11 + f10 * arrf[9], f10 * arrf[10], f10 * arrf[11], f10 * arrf[12], f10 * arrf[13], f11 + f10 * arrf[14], f10 * arrf[15], f10 * arrf[16], f10 * arrf[17], f10 * arrf[18], f10 * arrf[19]};
        colorMatrix.set(arrf2);
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
        Paint paint = new Paint();
        paint.setColorFilter((ColorFilter)colorMatrixColorFilter);
        int n10 = bitmap.getHeight();
        Bitmap bitmap2 = Bitmap.createBitmap((int)bitmap.getWidth(), (int)n10, (Bitmap.Config)bitmap.getConfig());
        new Canvas(bitmap2).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmap2;
    }

    public static Bitmap a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable)drawable).getBitmap();
        }
        Bitmap bitmap = Bitmap.createBitmap((int)drawable.getIntrinsicWidth(), (int)drawable.getIntrinsicHeight(), (Bitmap.Config)Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmap;
    }

    public static Drawable a(Context context, Bitmap bitmap) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public static String a(int n10) {
        switch (n10) {
            default: {
                return null;
            }
            case 12: {
                return "S";
            }
            case 11: {
                return "R";
            }
            case 10: {
                return "Q";
            }
            case 9: {
                return "P";
            }
            case 8: {
                return "O";
            }
            case 7: {
                return "N";
            }
            case 6: {
                return "M";
            }
            case 5: {
                return "L";
            }
            case 4: {
                return "K";
            }
            case 3: {
                return "J";
            }
            case 2: {
                return "I";
            }
            case 1: 
        }
        return "H";
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a() {
        String string;
        int n10 = MainActivity.A0;
        if (n10 == 2) {
            MainActivity.A0 = 3;
            MainActivity.X = false;
            string = String.valueOf((int)3);
        } else {
            if (n10 != 3) {
                return;
            }
            MainActivity.A0 = 2;
            MainActivity.X = true;
            string = String.valueOf((int)2);
        }
        a.a("Move.xml", string);
        MainActivity.T = true;
    }

    public static void a(Context context, Button button, int n10) {
        if (button != null) {
            Drawable drawable = Build.VERSION.SDK_INT >= 21 ? context.getResources().getDrawable(n10, context.getTheme()) : context.getResources().getDrawable(n10);
            if (Build.VERSION.SDK_INT >= 21) {
                drawable = new RippleDrawable(ColorStateList.valueOf((int)-16777216), drawable, null);
            }
            button.setBackground(drawable);
        }
    }

    public static void a(RelativeLayout.LayoutParams layoutParams, boolean bl, int n10, int n11, int n12) {
        if (bl) {
            n10 - n12;
            layoutParams.addRule(14, -1);
            layoutParams.topMargin = n11 / 20;
            return;
        }
        n11 - n12;
        layoutParams.addRule(14, -1);
        layoutParams.topMargin = (int)(0.26f * (float)n10);
    }

    /*
     * Exception decompiling
     */
    public static void a(FirebaseAnalytics var0, SharedPreferences var1, SharedPreferences.Editor var2) {
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

    public static void a(File file) {
        if (file.isDirectory()) {
            File[] arrfile = file.listFiles();
            int n10 = arrfile.length;
            for (int i10 = 0; i10 < n10; ++i10) {
                b.a(arrfile[i10]);
            }
        }
        file.delete();
    }

    @SuppressLint(value={"NewApi"})
    public static boolean a(Activity activity, int n10, int n11) {
        boolean bl;
        block6 : {
            block5 : {
                if (n10 > n11) {
                    int n12 = n11;
                    n11 = n10;
                    n10 = n12;
                }
                if (n10 <= 320) break block5;
                int n13 = n10 + n10 / 4;
                bl = false;
                if (n13 < n11) break block6;
            }
            bl = true;
        }
        if (Build.VERSION.SDK_INT >= 24 && activity.isInMultiWindowMode()) {
            return true;
        }
        return bl;
    }

    public static int b(Context context, int n10) {
        return (int)((float)n10 / ((float)context.getResources().getDisplayMetrics().densityDpi / 160.0f));
    }

    public static Bitmap b(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.postRotate(-90.0f);
        return Bitmap.createBitmap((Bitmap)bitmap, (int)0, (int)0, (int)bitmap.getWidth(), (int)bitmap.getHeight(), (Matrix)matrix, (boolean)true);
    }

    public static Bitmap b(Bitmap bitmap, float f10, float f11, float f12) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(f12);
        float[] arrf = colorMatrix.getArray();
        float[] arrf2 = new float[]{2.2f * (f10 * arrf[0]), 1.2f * (f10 * arrf[1]), 1.2f * (f10 * arrf[2]), f10 * arrf[3], f11 + f10 * arrf[4], f10 * arrf[5], f10 * arrf[6], f10 * arrf[7], f10 * arrf[8], f11 + f10 * arrf[9], f10 * arrf[10], f10 * arrf[11], f10 * arrf[12], f10 * arrf[13], f11 + f10 * arrf[14], f10 * arrf[15], f10 * arrf[16], f10 * arrf[17], f10 * arrf[18], f10 * arrf[19]};
        colorMatrix.set(arrf2);
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
        Paint paint = new Paint();
        paint.setColorFilter((ColorFilter)colorMatrixColorFilter);
        int n10 = bitmap.getHeight();
        Bitmap bitmap2 = Bitmap.createBitmap((int)bitmap.getWidth(), (int)n10, (Bitmap.Config)bitmap.getConfig());
        new Canvas(bitmap2).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmap2;
    }

    public static String b(int n10) {
        switch (n10) {
            default: {
                return null;
            }
            case 12: {
                return "v";
            }
            case 11: {
                return "u";
            }
            case 10: {
                return "t";
            }
            case 9: {
                return "s";
            }
            case 8: {
                return "r";
            }
            case 7: {
                return "q";
            }
            case 6: {
                return "p";
            }
            case 5: {
                return "o";
            }
            case 4: {
                return "n";
            }
            case 3: {
                return "m";
            }
            case 2: {
                return "l";
            }
            case 1: 
        }
        return "k";
    }
}

