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
 *  c.b.b.a.e.a.i0
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.c.a;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.i0;

public final class k0
extends ec
implements i0 {
    public k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    public final void I(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(3, parcel);
    }

    public final String O() {
        Parcel parcel = this.a(1, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final String getContent() {
        Parcel parcel = this.a(2, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final void recordClick() {
        this.b(4, this.Z0());
    }

    public final void recordImpression() {
        this.b(5, this.Z0());
    }
}

