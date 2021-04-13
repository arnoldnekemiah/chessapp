/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  c.b.b.a.f.b.a9
 *  com.google.android.gms.measurement.internal.zzaq
 *  com.google.android.gms.measurement.internal.zzas
 *  com.google.android.gms.measurement.internal.zzp
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import android.os.Bundle;
import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.b5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import com.google.android.gms.measurement.internal.zzaq;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzp;

public final class t4
implements Runnable {
    public final /* synthetic */ zzas a;
    public final /* synthetic */ zzp b;
    public final /* synthetic */ b5 c;

    public t4(b5 b52, zzas zzas2, zzp zzp2) {
        this.c = b52;
        this.a = zzas2;
        this.b = zzp2;
    }

    public final void run() {
        b5 b52 = this.c;
        zzas zzas2 = this.a;
        if (b52 != null) {
            zzaq zzaq2;
            String string;
            if ("_cmp".equals((Object)zzas2.a) && (zzaq2 = zzas2.b) != null && zzaq2.a.size() != 0 && ("referrer broadcast".equals((Object)(string = zzas2.b.a.getString("_cis"))) || "referrer API".equals((Object)string))) {
                zzas zzas3;
                b52.a.a().l.a("Event has been filtered ", zzas2.toString());
                zzas2 = zzas3 = new zzas("_cmpx", zzas2.b, zzas2.c, zzas2.d);
            }
            this.c.a.h();
            this.c.a.b(zzas2, this.b);
            return;
        }
        throw null;
    }
}

