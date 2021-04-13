/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.measurement.internal.AppMeasurementDynamiteService
 *  com.google.android.gms.measurement.internal.zzp
 *  java.lang.Object
 *  java.lang.Runnable
 */
package c.b.b.a.f.b;

import c.b.b.a.e.d.zb;
import c.b.b.a.f.b.d7;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.y7;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzp;

public final class v5
implements Runnable {
    public final /* synthetic */ zb a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public v5(AppMeasurementDynamiteService appMeasurementDynamiteService, zb zb2) {
        this.b = appMeasurementDynamiteService;
        this.a = zb2;
    }

    public final void run() {
        y7 y72 = this.b.a.v();
        zb zb2 = this.a;
        y72.g();
        y72.h();
        y72.a(new d7(y72, y72.a(false), zb2));
    }
}

