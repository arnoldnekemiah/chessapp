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
import c.b.b.a.e.d.ia;
import c.b.b.a.e.d.o3;
import c.b.b.a.e.d.q3;

public final class ja
implements ia {
    public static final q3<Boolean> a;
    public static final q3<Boolean> b;
    public static final q3<Boolean> c;
    public static final q3<Boolean> d;

    public static {
        o3 o32 = new o3(g3.a("com.google.android.gms.measurement"));
        a = o32.a("measurement.sdk.collection.enable_extend_user_property_size", true);
        b = o32.a("measurement.sdk.collection.last_deep_link_referrer2", true);
        c = o32.a("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        d = o32.a("measurement.sdk.collection.last_gclid_from_referrer2", false);
        o32.a("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override
    public final boolean a() {
        return a.b();
    }

    @Override
    public final boolean b() {
        return b.b();
    }

    @Override
    public final boolean c() {
        return c.b();
    }

    @Override
    public final boolean d() {
        return d.b();
    }
}

