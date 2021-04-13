/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Boolean
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.d;

import android.net.Uri;
import c.b.b.a.e.d.g3;
import c.b.b.a.e.d.la;
import c.b.b.a.e.d.o3;
import c.b.b.a.e.d.q3;

public final class ma
implements la {
    public static final q3<Boolean> a;
    public static final q3<Boolean> b;

    public static {
        o3 o32 = new o3(g3.a("com.google.android.gms.measurement"));
        o32.a("measurement.id.lifecycle.app_in_background_parameter", 0L);
        a = o32.a("measurement.lifecycle.app_backgrounded_engagement", false);
        o32.a("measurement.lifecycle.app_backgrounded_tracking", true);
        b = o32.a("measurement.lifecycle.app_in_background_parameter", false);
        o32.a("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override
    public final boolean a() {
        return a.b();
    }

    @Override
    public final boolean b() {
        return b.b();
    }
}

