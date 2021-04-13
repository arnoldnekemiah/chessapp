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
import c.b.b.a.e.d.q3;
import c.b.b.a.e.d.s9;

public final class t9
implements s9 {
    public static final q3<Boolean> a;

    public static {
        o3 o32 = new o3(g3.a("com.google.android.gms.measurement"));
        o32.a("measurement.id.service.use_appinfo_modified", 0L);
        a = o32.a("measurement.service.use_appinfo_modified", false);
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

