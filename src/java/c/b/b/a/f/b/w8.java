/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.measurement.internal.AppMeasurementDynamiteService
 *  java.lang.Object
 *  java.lang.Runnable
 */
package c.b.b.a.f.b;

import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.j6;
import c.b.b.a.f.b.l9;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class w8
implements Runnable {
    public final /* synthetic */ l9 a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public w8(AppMeasurementDynamiteService appMeasurementDynamiteService, l9 l92) {
        this.b = appMeasurementDynamiteService;
        this.a = l92;
    }

    public final void run() {
        this.b.a.o().a(this.a);
    }
}

