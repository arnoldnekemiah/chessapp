/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.f.b.a9
 *  com.google.android.gms.measurement.internal.zzp
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import a.c.a.a;
import c.b.b.a.f.b.a9;
import c.b.b.a.f.b.b5;
import c.b.b.a.f.b.f4;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.x4;
import com.google.android.gms.measurement.internal.zzp;

public final class r4
implements Runnable {
    public final /* synthetic */ zzp a;
    public final /* synthetic */ b5 b;

    public r4(b5 b52, zzp zzp2) {
        this.b = b52;
        this.a = zzp2;
    }

    public final void run() {
        this.b.a.h();
        a9 a92 = this.b.a;
        zzp zzp2 = this.a;
        a92.j.d().g();
        a92.t();
        a.c(zzp2.a);
        a92.c(zzp2);
    }
}

