/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  c.b.b.a.e.d.a9
 *  java.lang.Boolean
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.d;

import android.net.Uri;
import c.b.b.a.e.d.a9;
import c.b.b.a.e.d.g3;
import c.b.b.a.e.d.o3;
import c.b.b.a.e.d.q3;

public final class b9
implements a9 {
    public static final q3<Boolean> a;
    public static final q3<Boolean> b;
    public static final q3<Boolean> c;
    public static final q3<Long> d;

    public static {
        o3 o32 = new o3(g3.a("com.google.android.gms.measurement"));
        a = o32.a("measurement.client.consent_state_v1", true);
        b = o32.a("measurement.client.3p_consent_state_v1", false);
        c = o32.a("measurement.service.consent_state_v1_W36", true);
        o32.a("measurement.id.service.consent_state_v1_W36", 0L);
        d = o32.a("measurement.service.storage_consent_support_version", 203590L);
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return a.b();
    }

    public final boolean c() {
        return b.b();
    }

    public final boolean d() {
        return c.b();
    }

    public final long p() {
        return d.b();
    }
}

