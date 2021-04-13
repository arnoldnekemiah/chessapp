/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.google.android.gms.measurement.internal.AppMeasurementDynamiteService
 *  com.google.android.gms.measurement.internal.zzas
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import android.content.Context;
import c.b.b.a.b.b;
import c.b.b.a.e.d.zb;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.g9;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.i7;
import c.b.b.a.f.b.y7;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzas;

public final class w6
implements Runnable {
    public final /* synthetic */ zb a;
    public final /* synthetic */ zzas b;
    public final /* synthetic */ String c;
    public final /* synthetic */ AppMeasurementDynamiteService d;

    public w6(AppMeasurementDynamiteService appMeasurementDynamiteService, zb zb2, zzas zzas2, String string) {
        this.d = appMeasurementDynamiteService;
        this.a = zb2;
        this.b = zzas2;
        this.c = string;
    }

    public final void run() {
        y7 y72 = this.d.a.v();
        zb zb2 = this.a;
        zzas zzas2 = this.b;
        String string = this.c;
        y72.g();
        y72.h();
        g9 g92 = y72.a.p();
        if (g92 != null) {
            if (b.b.a(g92.a.a, 12451000) != 0) {
                y72.a.a().i.a("Not bundling data. Service unavailable or out of date");
                y72.a.p().a(zb2, new byte[0]);
                return;
            }
            y72.a(new i7(y72, zzas2, string, zb2));
            return;
        }
        throw null;
    }
}

