/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Log
 *  c.b.b.a.f.b.e3
 *  c.b.b.a.f.b.f3
 *  c.b.b.a.f.b.g3
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  org.checkerframework.checker.nullness.qual.EnsuresNonNull
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.text.TextUtils;
import android.util.Log;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.d5;
import c.b.b.a.f.b.e3;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.g3;
import c.b.b.a.f.b.i4;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class h3
extends d5 {
    public char c = '\u0000';
    public long d = -1L;
    public String e;
    public final f3 f = new f3(this, 6, false, false);
    public final f3 g = new f3(this, 6, true, false);
    public final f3 h = new f3(this, 6, false, true);
    public final f3 i = new f3(this, 5, false, false);
    public final f3 j = new f3(this, 5, true, false);
    public final f3 k = new f3(this, 5, false, true);
    public final f3 l = new f3(this, 4, false, false);
    public final f3 m = new f3(this, 3, false, false);
    public final f3 n = new f3(this, 2, false, false);

    public h3(i4 i42) {
        super(i42);
    }

    public static Object a(String string) {
        if (string == null) {
            return null;
        }
        return new g3(string);
    }

    public static String a(boolean bl, Object object) {
        String string = "";
        if (object == null) {
            return string;
        }
        if (object instanceof Integer) {
            object = (long)((Integer)object).intValue();
        }
        boolean bl2 = object instanceof Long;
        if (bl2) {
            if (!bl) {
                return String.valueOf((Object)object);
            }
            Long l6 = (Long)object;
            if (Math.abs((long)l6) < 100L) {
                return String.valueOf((Object)object);
            }
            if (String.valueOf((Object)object).charAt(0) == '-') {
                string = "-";
            }
            String string2 = String.valueOf((long)Math.abs((long)l6));
            long l7 = Math.round((double)Math.pow((double)10.0, (double)(-1 + string2.length())));
            long l10 = Math.round((double)(-1.0 + Math.pow((double)10.0, (double)string2.length())));
            int n7 = string.length();
            StringBuilder stringBuilder = new StringBuilder(string.length() + (n7 + 43));
            stringBuilder.append(string);
            stringBuilder.append(l7);
            stringBuilder.append("...");
            stringBuilder.append(string);
            stringBuilder.append(l10);
            return stringBuilder.toString();
        }
        if (object instanceof Boolean) {
            return String.valueOf((Object)object);
        }
        if (object instanceof Throwable) {
            Throwable throwable = (Throwable)object;
            String string3 = bl ? throwable.getClass().getName() : throwable.toString();
            StringBuilder stringBuilder = new StringBuilder(string3);
            String string4 = h3.b(i4.class.getCanonicalName());
            for (StackTraceElement stackTraceElement : throwable.getStackTrace()) {
                String string5;
                if (stackTraceElement.isNativeMethod() || (string5 = stackTraceElement.getClassName()) == null || !h3.b(string5).equals((Object)string4)) continue;
                stringBuilder.append(": ");
                stringBuilder.append((Object)stackTraceElement);
                break;
            }
            return stringBuilder.toString();
        }
        if (object instanceof g3) {
            return ((g3)object).a;
        }
        if (bl) {
            return "-";
        }
        return String.valueOf((Object)object);
    }

    public static String a(boolean bl, String string, Object object, Object object2, Object object3) {
        String string2 = "";
        if (string == null) {
            string = string2;
        }
        String string3 = h3.a(bl, object);
        String string4 = h3.a(bl, object2);
        String string5 = h3.a(bl, object3);
        StringBuilder stringBuilder = new StringBuilder();
        if (!TextUtils.isEmpty((CharSequence)string)) {
            stringBuilder.append(string);
            string2 = ": ";
        }
        boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
        String string6 = ", ";
        if (!bl2) {
            stringBuilder.append(string2);
            stringBuilder.append(string3);
            string2 = string6;
        }
        if (!TextUtils.isEmpty((CharSequence)string4)) {
            stringBuilder.append(string2);
            stringBuilder.append(string4);
        } else {
            string6 = string2;
        }
        if (!TextUtils.isEmpty((CharSequence)string5)) {
            stringBuilder.append(string6);
            stringBuilder.append(string5);
        }
        return stringBuilder.toString();
    }

    public static String b(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return "";
        }
        int n7 = string.lastIndexOf(46);
        if (n7 == -1) {
            return string;
        }
        return string.substring(0, n7);
    }

    public final void a(int n7, boolean bl, boolean bl2, String string, Object object, Object object2, Object object3) {
        if (!bl && Log.isLoggable((String)this.s(), (int)n7)) {
            String string2 = h3.a(false, string, object, object2, object3);
            Log.println((int)n7, (String)this.s(), (String)string2);
        }
        if (!bl2 && n7 >= 5) {
            a.a(string);
            f4 f42 = this.a.j;
            if (f42 == null) {
                Log.println((int)6, (String)this.s(), (String)"Scheduler not set. Not logging error/warn");
                return;
            }
            if (!f42.j()) {
                Log.println((int)6, (String)this.s(), (String)"Scheduler not initialized. Not logging error/warn");
                return;
            }
            int n9 = n7 >= 9 ? 8 : n7;
            e3 e32 = new e3(this, n9, string, object, object2, object3);
            f42.a((Runnable)e32);
        }
    }

    @Override
    public final boolean h() {
        return false;
    }

    public final f3 n() {
        return this.f;
    }

    public final f3 o() {
        return this.i;
    }

    public final f3 p() {
        return this.k;
    }

    public final f3 q() {
        return this.m;
    }

    public final f3 r() {
        return this.n;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @EnsuresNonNull(value={"logTagDoNotUseDirectly"})
    public final String s() {
        h3 h32 = this;
        synchronized (h32) {
            if (this.e == null) {
                String string = this.a.d != null ? this.a.d : "FA";
                this.e = string;
            }
            a.a(this.e);
            return this.e;
        }
    }
}

