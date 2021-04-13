/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.e.a.f3
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.w2
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.e.a.f3;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.h3;
import c.b.b.a.e.a.w2;
import c.b.b.a.e.a.y2;

public abstract class z2
extends gc
implements w2 {
    public z2() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static w2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        if (iInterface instanceof w2) {
            return (w2)iInterface;
        }
        return new y2(iBinder);
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 == 1) {
            IInterface iInterface;
            IBinder iBinder = parcel.readStrongBinder();
            Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd")) instanceof f3 ? (f3)iInterface : new h3(iBinder));
            this.a(object);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}

