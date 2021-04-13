/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.b3
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gc
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.c.a;
import c.b.b.a.e.a.b3;
import c.b.b.a.e.a.d3;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gc;

public abstract class a3
extends gc
implements b3 {
    public a3() {
        super("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    public static b3 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        if (iInterface instanceof b3) {
            return (b3)iInterface;
        }
        return new d3(iBinder);
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 == 2) {
            boolean bl = this.n(a.a.a(parcel.readStrongBinder()));
            parcel2.writeNoException();
            fc.a((Parcel)parcel2, (boolean)bl);
            return true;
        }
        return false;
    }
}

