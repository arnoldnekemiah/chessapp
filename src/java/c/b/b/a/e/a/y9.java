/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.w9
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.Parcel;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.w9;

public final class y9
extends ec
implements w9 {
    public y9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public final int getAmount() {
        Parcel parcel = this.a(2, this.Z0());
        int n10 = parcel.readInt();
        parcel.recycle();
        return n10;
    }

    public final String getType() {
        Parcel parcel = this.a(1, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }
}

