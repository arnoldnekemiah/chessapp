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

public final class s5
implements Runnable {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ j6 b;

    public s5(j6 j62, Bundle bundle) {
        this.b = j62;
        this.a = bundle;
    }

    public final void run() {
        zzas zzas2;
        zzas zzas3;
        zzas zzas4;
        j6 j62 = this.b;
        Bundle bundle = this.a;
        j62.g();
        j62.h();
        a.a(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        a.c(string);
        a.c(string2);
        a.a(bundle.get("value"));
        if (!j62.a.i()) {
            j62.a.a().n.a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzkg zzkg2 = new zzkg(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            zzas2 = j62.a.p().a(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, false);
            zzas4 = j62.a.p().a(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, false);
            zzas3 = j62.a.p().a(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, false);
        }
        catch (IllegalArgumentException illegalArgumentException) {}
        zzaa zzaa2 = new zzaa(bundle.getString("app_id"), string2, zzkg2, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), zzas4, bundle.getLong("trigger_timeout"), zzas2, bundle.getLong("time_to_live"), zzas3);
        j62.a.v().a(zzaa2);
    }
}

