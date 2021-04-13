/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.d;

import android.net.Uri;
import c.b.b.a.e.d.g3;
import c.b.b.a.e.d.o3;
import c.b.b.a.e.d.oa;
import c.b.b.a.e.d.q3;

public final class pa
implements oa {
    public static final q3<Boolean> a;
    public static final q3<Boolean> b;

    public static {
        o3 o32 = new o3(g3.a("com.google.android.gms.measurement"));
        a = o32.a("measurement.sdk.screen.manual_screen_view_logging", true);
        b = o32.a("measurement.sdk.screen.disabling_automatic_reporting", true);
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean b() {
        return a.b();
    }

    @Override
    public final boolean c() {
        return b.b();
    }
}

