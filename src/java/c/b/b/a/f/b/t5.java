/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  com.google.android.gms.measurement.internal.zzaa
 *  com.google.android.gms.measurement.internal.zzas
 *  com.google.android.gms.measurement.internal.zzkg
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.os.Bundle;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.j6;
import c.b.b.a.f.b.y7;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzkg;

public final class t5
implements Runnable {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ j6 b;

    public t5(j6 j62, Bundle bundle) {
        this.b = j62;
        this.a = bundle;
    }

    public final void run() {
        zzas zzas2;
        j6 j62 = this.b;
        Bundle bundle = this.a;
        j62.g();
        j62.h();
        a.a(bundle);
        a.c(bundle.getString("name"));
        if (!j62.a.i()) {
            j62.a.a().n.a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        zzkg zzkg2 = new zzkg(bundle.getString("name"), 0L, null, null);
        try {
            zzas2 = j62.a.p().a(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), bundle.getLong("creation_timestamp"), true, false);
        }
        catch (IllegalArgumentException illegalArgumentException) {}
        zzaa zzaa2 = new zzaa(bundle.getString("app_id"), bundle.getString("origin"), zzkg2, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), zzas2);
        j62.a.v().a(zzaa2);
    }
}

