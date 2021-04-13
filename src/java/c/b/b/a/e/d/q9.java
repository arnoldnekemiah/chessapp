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
import c.b.b.a.e.d.o3;
import c.b.b.a.e.d.p9;
import c.b.b.a.e.d.q3;

public final class q9
implements p9 {
    public static final q3<Boolean> a;

    public static {
        o3 o32 = new o3(g3.a("com.google.android.gms.measurement"));
        a = o32.a("measurement.sdk.referrer.delayed_install_referrer_api", false);
        o32.a("measurement.id.sdk.referrer.delayed_install_referrer_api", 0L);
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean b() {
        return a.b();
    }
}

