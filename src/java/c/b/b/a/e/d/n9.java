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
import c.b.b.a.e.d.m9;
import c.b.b.a.e.d.o3;
import c.b.b.a.e.d.q3;

public final class n9
implements m9 {
    public static final q3<Boolean> a;
    public static final q3<Boolean> b;
    public static final q3<Boolean> c;

    public static {
        o3 o32 = new o3(g3.a("com.google.android.gms.measurement"));
        o32.a("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = o32.a("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = o32.a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = o32.a("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
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

    @Override
    public final boolean d() {
        return c.b();
    }
}

