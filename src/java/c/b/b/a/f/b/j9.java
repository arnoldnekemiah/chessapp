/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.measurement.internal.AppMeasurementDynamiteService
 *  com.google.android.gms.measurement.internal.zzp
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import c.b.b.a.e.d.zb;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.p7;
import c.b.b.a.f.b.y7;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzp;

public final class j9
implements Runnable {
    public final /* synthetic */ zb a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ AppMeasurementDynamiteService d;

    public j9(AppMeasurementDynamiteService appMeasurementDynamiteService, zb zb2, String string, String string2) {
        this.d = appMeasurementDynamiteService;
        this.a = zb2;
        this.b = string;
        this.c = string2;
    }

    public final void run() {
        y7 y72 = this.d.a.v();
        zb zb2 = this.a;
        String string = this.b;
        String string2 = this.c;
        y72.g();
        y72.h();
        zzp zzp2 = y72.a(false);
        p7 p72 = new p7(y72, string, string2, zzp2, zb2);
        y72.a(p72);
    }
}

