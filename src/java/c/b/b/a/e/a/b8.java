/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.y7
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import c.b.b.a.e.a.a8;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.y7;

public abstract class b8
extends gc
implements y7 {
    public static y7 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        if (iInterface instanceof y7) {
            return (y7)iInterface;
        }
        return new a8(iBinder);
    }
}

