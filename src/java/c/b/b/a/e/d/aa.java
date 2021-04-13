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
import c.b.b.a.e.d.z9;

public final class aa
implements z9 {
    public static final q3<Boolean> a;

    public static {
        o3 o32 = new o3(g3.a("com.google.android.gms.measurement"));
        o32.a("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        a = o32.a("measurement.collection.redundant_engagement_removal_enabled", false);
        o32.a("measurement.id.collection.redundant_engagement_removal_enabled", 0L);
    }

    @Override
    public final boolean a() {
        return a.b();
    }
}

