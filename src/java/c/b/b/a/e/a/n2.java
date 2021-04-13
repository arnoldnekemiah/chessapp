/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.e.a.b2
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.k2
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.e.a.b2;
import c.b.b.a.e.a.d2;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.k2;
import c.b.b.a.e.a.m2;

public abstract class n2
extends gc
implements k2 {
    public n2() {
        super("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public static k2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        if (iInterface instanceof k2) {
            return (k2)iInterface;
        }
        return new m2(iBinder);
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 == 1) {
            IInterface iInterface;
            IBinder iBinder = parcel.readStrongBinder();
            Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd")) instanceof b2 ? (b2)iInterface : new d2(iBinder));
            this.a(object);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}

