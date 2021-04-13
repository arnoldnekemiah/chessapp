/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.v4
 *  c.b.b.a.e.a.x7
 *  c.b.b.a.e.a.y7
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.c.a;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.v4;
import c.b.b.a.e.a.x7;
import c.b.b.a.e.a.y7;
import c.b.b.a.e.a.z7;

public final class a8
extends ec
implements y7 {
    public a8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    public final x7 a(a a5, v4 v42, int n10) {
        IInterface iInterface;
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a5);
        fc.a((Parcel)parcel, (IInterface)v42);
        parcel.writeInt(204204000);
        Parcel parcel2 = this.a(1, parcel);
        IBinder iBinder = parcel2.readStrongBinder();
        Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils")) instanceof x7 ? (x7)iInterface : new z7(iBinder));
        parcel2.recycle();
        return object;
    }
}

