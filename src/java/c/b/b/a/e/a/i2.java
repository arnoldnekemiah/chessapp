/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.j2
 *  c.b.b.a.e.a.y1
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.e.a.a2;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.j2;
import c.b.b.a.e.a.l2;
import c.b.b.a.e.a.y1;

public abstract class i2
extends gc
implements j2 {
    public i2() {
        super("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    public static j2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        if (iInterface instanceof j2) {
            return (j2)iInterface;
        }
        return new l2(iBinder);
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 == 1) {
            IInterface iInterface;
            IBinder iBinder = parcel.readStrongBinder();
            Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd")) instanceof y1 ? (y1)iInterface : new a2(iBinder));
            this.a(object);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}

