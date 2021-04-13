/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.drawable.Drawable
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.RemoteException
 *  c.b.b.a.c.a
 *  c.b.b.a.c.a$a
 *  c.c.a.b
 *  c.c.b.a
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package c.a.b.a;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c.b.b.a.c.a;
import c.c.a.b;

public class a {
    public static int a(long l2, int n2, int n3) {
        return n3 + n2 * Long.bitCount((long)l2);
    }

    public static int a(String string, int n2) {
        return n2 + String.valueOf((Object)string).length();
    }

    public static Bitmap a(c.c.b.a a2, int n2) {
        return b.a((Drawable)a2.getResources().getDrawable(n2));
    }

    public static Bitmap a(c.c.b.a a2, int n2, float f2, float f4, float f5) {
        return b.a((Bitmap)b.a((Drawable)a2.getResources().getDrawable(n2)), (float)f2, (float)f4, (float)f5);
    }

    public static RemoteException a(String string, Throwable throwable) {
        a.c.a.a.a(string, throwable);
        return new RemoteException();
    }

    public static c.b.b.a.c.a a(Parcel parcel) {
        c.b.b.a.c.a a2 = a.a.a((IBinder)parcel.readStrongBinder());
        parcel.recycle();
        return a2;
    }

    public static String a(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(StringBuilder stringBuilder, String string, String string2) {
        stringBuilder.append(string);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(StringBuilder stringBuilder, String string, String string2, String string3) {
        stringBuilder.append(string);
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    public static StringBuilder a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        return stringBuilder;
    }

    public static boolean a(SharedPreferences sharedPreferences, String string, boolean bl) {
        return sharedPreferences.getBoolean(string, bl);
    }
}

