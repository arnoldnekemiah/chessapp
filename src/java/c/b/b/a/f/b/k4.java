/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.f.b.a9
 *  com.google.android.gms.measurement.internal.zzaa
 *  com.google.android.gms.measurement.internal.zzkg
 *  com.google.android.gms.measurement.internal.zzp
 *  java.lang.Object
 *  java.lang.Runnable
 */
package c.b.b.a.f.b;

import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.b5;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzkg;
import com.google.android.gms.measurement.internal.zzp;

public final class k4
implements Runnable {
    public final /* synthetic */ zzaa a;
    public final /* synthetic */ zzp b;
    public final /* synthetic */ b5 c;

    public k4(b5 b52, zzaa zzaa2, zzp zzp2) {
        this.c = b52;
        this.a = zzaa2;
        this.b = zzp2;
    }

    public final void run() {
        this.c.a.h();
        if (this.a.c.a() == null) {
            this.c.a.b(this.a, this.b);
            return;
        }
        this.c.a.a(this.a, this.b);
    }
}

