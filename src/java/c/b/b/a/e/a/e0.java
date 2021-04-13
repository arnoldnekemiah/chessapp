/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  c.b.b.a.e.a.d0
 *  c.b.b.a.e.a.y0
 *  java.lang.Boolean
 *  java.lang.ClassCastException
 *  java.lang.Double
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.content.SharedPreferences;
import c.b.b.a.e.a.d0;
import c.b.b.a.e.a.y0;

public final class e0
implements y0 {
    public final /* synthetic */ d0 a;

    public e0(d0 d02) {
        this.a = d02;
    }

    public final Boolean a(String string, boolean bl) {
        return this.a.e.getBoolean(string, bl);
    }

    public final Double a(String string, double d10) {
        return this.a.e.getFloat(string, (float)d10);
    }

    public final Long a(String string, long l10) {
        try {
            Long l11 = this.a.e.getLong(string, l10);
            return l11;
        }
        catch (ClassCastException classCastException) {
            return this.a.e.getInt(string, (int)l10);
        }
    }

    public final String a(String string, String string2) {
        return this.a.e.getString(string, string2);
    }
}

