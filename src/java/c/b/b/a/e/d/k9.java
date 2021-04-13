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
import c.b.b.a.e.d.j9;
import c.b.b.a.e.d.o3;
import c.b.b.a.e.d.q3;

public final class k9
implements j9 {
    public static final q3<Boolean> a = new o3(g3.a("com.google.android.gms.measurement")).a("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean b() {
        return a.b();
    }
}

