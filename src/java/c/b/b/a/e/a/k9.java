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
 *  c.b.b.a.e.a.h9
 *  c.b.b.a.e.a.v4
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.c.a;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.h9;
import c.b.b.a.e.a.v4;

public final class k9
extends ec
implements h9 {
    public k9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
    }

    public final IBinder d(a a6, v4 v42, int n10) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (IInterface)v42);
        parcel.writeInt(204204000);
        Parcel parcel2 = this.a(1, parcel);
        IBinder iBinder = parcel2.readStrongBinder();
        parcel2.recycle();
        return iBinder;
    }
}

