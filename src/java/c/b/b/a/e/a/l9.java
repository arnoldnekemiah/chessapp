/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.e.a.b9
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.j9
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.e.a.b9;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.j9;

public final class l9
extends ec
implements j9 {
    public l9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public final void a(b9 b92) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)b92);
        this.b(5, parcel);
    }

    public final void onRewardedVideoAdClosed() {
        this.b(4, this.Z0());
    }

    public final void onRewardedVideoAdFailedToLoad(int n10) {
        Parcel parcel = this.Z0();
        parcel.writeInt(n10);
        this.b(7, parcel);
    }

    public final void onRewardedVideoAdLeftApplication() {
        this.b(6, this.Z0());
    }

    public final void onRewardedVideoAdLoaded() {
        this.b(1, this.Z0());
    }

    public final void onRewardedVideoAdOpened() {
        this.b(2, this.Z0());
    }

    public final void onRewardedVideoCompleted() {
        this.b(8, this.Z0());
    }

    public final void onRewardedVideoStarted() {
        this.b(3, this.Z0());
    }
}

