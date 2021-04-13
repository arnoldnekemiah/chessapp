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
import c.b.b.a.e.d.d9;
import c.b.b.a.e.d.g3;
import c.b.b.a.e.d.o3;
import c.b.b.a.e.d.q3;

public final class e9
implements d9 {
    public static final q3<Boolean> a;

    public static {
        o3 o32 = new o3(g3.a("com.google.android.gms.measurement"));
        a = o32.a("measurement.sdk.dynamite.allow_remote_dynamite3", true);
        o32.a("measurement.collection.init_params_control_enabled", true);
        o32.a("measurement.sdk.dynamite.use_dynamite3", true);
        o32.a("measurement.id.sdk.dynamite.use_dynamite", 0L);
    }

    @Override
    public final boolean a() {
        return a.b();
    }
}

