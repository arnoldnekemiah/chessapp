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
import c.b.b.a.e.d.nb;
import c.b.b.a.e.d.o3;
import c.b.b.a.e.d.q3;

public final class ob
implements nb {
    public static final q3<Boolean> a = new o3(g3.a("com.google.android.gms.measurement")).a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", true);

    @Override
    public final boolean a() {
        return a.b();
    }
}

