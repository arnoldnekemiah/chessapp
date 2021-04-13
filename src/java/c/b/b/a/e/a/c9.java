/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  c.b.b.a.e.a.b9
 *  c.b.b.a.e.a.ec
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.Parcel;
import c.b.b.a.e.a.b9;
import c.b.b.a.e.a.ec;

public final class c9
extends ec
implements b9 {
    public c9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
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

