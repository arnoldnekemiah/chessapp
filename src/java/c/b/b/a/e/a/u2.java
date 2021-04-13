/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.v2
 *  c.b.b.a.e.a.ve
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.c.a;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.v2;
import c.b.b.a.e.a.ve;
import c.b.b.a.e.a.x2;
import c.b.b.a.e.a.ye;

public abstract class u2
extends gc
implements v2 {
    public u2() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static v2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        if (iInterface instanceof v2) {
            return (v2)iInterface;
        }
        return new x2(iBinder);
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 == 1) {
            this.a(ye.a(parcel.readStrongBinder()), a.a.a(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}

