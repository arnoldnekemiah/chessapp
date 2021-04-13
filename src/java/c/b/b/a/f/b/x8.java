/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  c.b.b.a.b.j.c
 *  c.b.b.a.f.b.a9
 *  com.google.android.gms.measurement.internal.zzas
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 */
package c.b.b.a.f.b;

import android.os.Bundle;
import c.b.b.a.b.j.b;
import c.b.b.a.b.j.c;
import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.y8;
import com.google.android.gms.measurement.internal.zzas;

public final class x8
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ y8 c;

    public x8(y8 y82, String string, Bundle bundle) {
        this.c = y82;
        this.a = string;
        this.b = bundle;
    }

    public final void run() {
        g9 g92 = this.c.a.j.p();
        String string = this.a;
        Bundle bundle = this.b;
        if ((c)this.c.a.j.n != null) {
            zzas zzas2 = g92.a(string, "_err", bundle, "auto", System.currentTimeMillis(), false, false);
            this.c.a.a(zzas2, this.a);
            return;
        }
        throw null;
    }
}

