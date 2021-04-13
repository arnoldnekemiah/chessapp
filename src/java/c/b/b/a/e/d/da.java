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
import c.b.b.a.e.d.ca;
import c.b.b.a.e.d.g3;
import c.b.b.a.e.d.o3;
import c.b.b.a.e.d.q3;

public final class da
implements ca {
    public static final q3<Boolean> a = new o3(g3.a("com.google.android.gms.measurement")).a("measurement.collection.firebase_global_collection_flag_enabled", true);

    @Override
    public final boolean a() {
        return a.b();
    }
}

