/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.he
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.he;
import com.google.android.gms.internal.ads.zzvg;

public final class je
extends ec
implements he {
    public je(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    public final void b(zzvg zzvg2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzvg2);
        this.b(8, parcel);
    }

    public final void onAdClicked() {
        this.b(6, this.Z0());
    }

    public final void onAdClosed() {
        this.b(1, this.Z0());
    }

    public final void onAdFailedToLoad(int n10) {
        Parcel parcel = this.Z0();
        parcel.writeInt(n10);
        this.b(2, parcel);
    }

    public final void onAdImpression() {
        this.b(7, this.Z0());
    }

    public final void onAdLeftApplication() {
        this.b(3, this.Z0());
    }

    public final void onAdLoaded() {
        this.b(4, this.Z0());
    }

    public final void onAdOpened() {
        this.b(5, this.Z0());
    }
}

