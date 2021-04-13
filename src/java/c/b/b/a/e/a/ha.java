/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fa
 *  c.b.b.a.e.a.fc
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fa;
import c.b.b.a.e.a.fc;
import com.google.android.gms.internal.ads.zzvg;

public final class ha
extends ec
implements fa {
    public ha(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    public final void e(int n10) {
        Parcel parcel = this.Z0();
        parcel.writeInt(n10);
        this.b(2, parcel);
    }

    public final void f(zzvg zzvg2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzvg2);
        this.b(3, parcel);
    }

    public final void f0() {
        this.b(1, this.Z0());
    }
}

