/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.d.i;

import android.content.Context;
import android.content.SharedPreferences;

public class d {
    public static d b;
    public final SharedPreferences a;

    public d(Context context) {
        this.a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    public static d a(Context context) {
        Class<d> class_ = d.class;
        synchronized (d.class) {
            if (b == null) {
                b = new d(context);
            }
            d d10 = b;
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return d10;
        }
    }

    public boolean a(long l10) {
        d d10 = this;
        synchronized (d10) {
            boolean bl = this.a("fire-global", l10);
            return bl;
        }
    }

    public boolean a(String string, long l10) {
        d d10 = this;
        synchronized (d10) {
            if (this.a.contains(string)) {
                if (l10 - this.a.getLong(string, -1L) >= 86400000L) {
                    this.a.edit().putLong(string, l10).apply();
                    return true;
                }
                return false;
            }
            this.a.edit().putLong(string, l10).apply();
            return true;
        }
    }
}

