/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  c.b.b.a.e.a.ca
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.w9
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.a.ca;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.w9;
import com.google.android.gms.internal.ads.zzvg;

public final class ea
extends ec
implements ca {
    public ea(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    public final void H0() {
        this.b(1, this.Z0());
    }

    public final void a(w9 w92) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)w92);
        this.b(3, parcel);
    }

    public final void c(int n10) {
        Parcel parcel = this.Z0();
        parcel.writeInt(n10);
        this.b(4, parcel);
    }

    public final void h0() {
        this.b(2, this.Z0());
    }

    public final void j(zzvg zzvg2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzvg2);
        this.b(5, parcel);
    }
}

