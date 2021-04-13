/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.measurement.internal.AppMeasurementDynamiteService
 *  java.lang.Object
 *  java.lang.Runnable
 */
package c.b.b.a.f.b;

import c.b.b.a.e.d.zb;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.i4;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class k9
implements Runnable {
    public final /* synthetic */ zb a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public k9(AppMeasurementDynamiteService appMeasurementDynamiteService, zb zb2) {
        this.b = appMeasurementDynamiteService;
        this.a = zb2;
    }

    public final void run() {
        this.b.a.p().a(this.a, this.b.a.h());
    }
}

