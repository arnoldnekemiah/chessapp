/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.w9
 *  com.google.android.gms.ads.rewarded.RewardItem
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.w9;
import c.b.b.a.e.a.y9;
import com.google.android.gms.ads.rewarded.RewardItem;

public final class sa
extends gc
implements w9 {
    public final String a;
    public final int b;

    public sa(RewardItem rewardItem) {
        String string = rewardItem != null ? rewardItem.getType() : "";
        int n10 = rewardItem != null ? rewardItem.getAmount() : 1;
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        this.a = string;
        this.b = n10;
    }

    public static w9 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        if (iInterface instanceof w9) {
            return (w9)iInterface;
        }
        return new y9(iBinder);
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 != 1) {
            if (n10 != 2) {
                return false;
            }
            int n12 = this.getAmount();
            parcel2.writeNoException();
            parcel2.writeInt(n12);
            return true;
        }
        String string = this.getType();
        parcel2.writeNoException();
        parcel2.writeString(string);
        return true;
    }

    public final int getAmount() {
        return this.b;
    }

    public final String getType() {
        return this.a;
    }
}

