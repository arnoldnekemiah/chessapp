/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  com.google.android.gms.measurement.internal.zzp
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.os.RemoteException;
import c.b.b.a.f.b.c5;
import c.b.b.a.f.b.f3;
import c.b.b.a.f.b.h3;
import c.b.b.a.f.b.i4;
import c.b.b.a.f.b.x2;
import c.b.b.a.f.b.y7;
import com.google.android.gms.measurement.internal.zzp;

public final class k7
implements Runnable {
    public final /* synthetic */ zzp a;
    public final /* synthetic */ y7 b;

    public k7(y7 y72, zzp zzp2) {
        this.b = y72;
        this.a = zzp2;
    }

    public final void run() {
        y7 y72 = this.b;
        x2 x22 = y72.d;
        if (x22 == null) {
            y72.a.a().f.a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            a.a(this.a);
            x22.c(this.a);
            this.b.r();
            return;
        }
        catch (RemoteException remoteException) {
            this.b.a.a().f.a("Failed to send measurementEnabled to the service", (Object)remoteException);
            return;
        }
    }
}

