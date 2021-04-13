/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  c.b.b.a.e.a.d0
 *  c.b.b.a.e.a.xb
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.content.SharedPreferences;
import c.b.b.a.e.a.d0;
import c.b.b.a.e.a.xb;

public final class f0
implements xb {
    public final d0 a;

    public f0(d0 d02) {
        this.a = d02;
    }

    public final Object get() {
        return this.a.e.getString("flag_configuration", "{}");
    }
}

