/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.y3
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import c.b.b.a.e.a.a4;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.y3;

public abstract class x3
extends gc
implements y3 {
    public static y3 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        if (iInterface instanceof y3) {
            return (y3)iInterface;
        }
        return new a4(iBinder);
    }
}

