/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.e.a.a5
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.v4
 *  c.b.b.a.e.a.w6
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.e.a.a5;
import c.b.b.a.e.a.c5;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.v4;
import c.b.b.a.e.a.w6;
import c.b.b.a.e.a.z6;

public final class x4
extends ec
implements v4 {
    public x4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public final boolean d(String string) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        Parcel parcel2 = this.a(2, parcel);
        boolean bl = fc.a((Parcel)parcel2);
        parcel2.recycle();
        return bl;
    }

    public final a5 n(String string) {
        IInterface iInterface;
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        Parcel parcel2 = this.a(1, parcel);
        IBinder iBinder = parcel2.readStrongBinder();
        Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter")) instanceof a5 ? (a5)iInterface : new c5(iBinder));
        parcel2.recycle();
        return object;
    }

    public final w6 p(String string) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        Parcel parcel2 = this.a(3, parcel);
        w6 w62 = z6.a(parcel2.readStrongBinder());
        parcel2.recycle();
        return w62;
    }
}

