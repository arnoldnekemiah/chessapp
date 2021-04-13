/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.e.a.cf
 *  c.b.b.a.e.a.gc
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.e.a.cf;
import c.b.b.a.e.a.ef;
import c.b.b.a.e.a.gc;

public abstract class ff
extends gc
implements cf {
    public ff() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static cf a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        if (iInterface instanceof cf) {
            return (cf)iInterface;
        }
        return new ef(iBinder);
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 == 1) {
            this.onAppEvent(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}

