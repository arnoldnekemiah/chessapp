/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.ob
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.ob;
import c.b.b.a.e.a.qb;

public abstract class rb
extends gc
implements ob {
    public static ob a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        if (iInterface instanceof ob) {
            return (ob)iInterface;
        }
        return new qb(iBinder);
    }
}

