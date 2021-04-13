/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable
 *  com.google.android.gms.measurement.internal.zzas
 *  com.google.android.gms.measurement.internal.zzp
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import a.c.a.a;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.x2;
import c.b.b.a.f.b.y7;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzp;

public final class m7
implements Runnable {
    public final /* synthetic */ zzp a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zzas c;
    public final /* synthetic */ y7 d;

    public m7(y7 y72, zzp zzp2, boolean bl, zzas zzas2, String string) {
        this.d = y72;
        this.a = zzp2;
        this.b = bl;
        this.c = zzas2;
    }

    public final void run() {
        y7 y72 = this.d;
        x2 x22 = y72.d;
        if (x22 == null) {
            y72.a.a().f.a("Discarding data. Failed to send event to service");
            return;
        }
        a.a(this.a);
        y7 y73 = this.d;
        zzas zzas2 = this.b ? null : this.c;
        y73.a(x22, (AbstractSafeParcelable)zzas2, this.a);
        this.d.r();
    }
}

