/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.RemoteException
 *  c.b.b.a.e.d.bc
 *  c.b.b.a.f.b.f3
 *  c.b.b.a.f.b.i5
 *  com.google.android.gms.measurement.internal.AppMeasurementDynamiteService
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.f.b;

import android.os.Bundle;
import android.os.RemoteException;
import c.b.b.a.e.d.bc;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.i5;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class m9
implements i5 {
    public final bc a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public m9(AppMeasurementDynamiteService appMeasurementDynamiteService, bc bc2) {
        this.b = appMeasurementDynamiteService;
        this.a = bc2;
    }

    public final void a(String string, String string2, Bundle bundle, long l6) {
        try {
            this.a.a(string, string2, bundle, l6);
            return;
        }
        catch (RemoteException remoteException) {
            i4 i42 = this.b.a;
            if (i42 != null) {
                i42.a().i.a("Event listener threw exception", (Object)remoteException);
            }
            return;
        }
    }
}

