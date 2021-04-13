/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.e.a.f2
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.p2
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.e.a.f2;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.h2;
import c.b.b.a.e.a.p2;
import c.b.b.a.e.a.r2;

public abstract class o2
extends gc
implements p2 {
    public o2() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static p2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        if (iInterface instanceof p2) {
            return (p2)iInterface;
        }
        return new r2(iBinder);
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 == 1) {
            IInterface iInterface;
            IBinder iBinder = parcel.readStrongBinder();
            Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd")) instanceof f2 ? (f2)iInterface : new h2(iBinder));
            this.a(object, parcel.readString());
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}

