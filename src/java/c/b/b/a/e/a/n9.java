/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  c.b.b.a.e.a.b9
 *  com.google.android.gms.ads.reward.RewardItem
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.os.RemoteException;
import c.b.b.a.e.a.b9;
import com.google.android.gms.ads.reward.RewardItem;

public final class n9
implements RewardItem {
    public final b9 a;

    public n9(b9 b92) {
        this.a = b92;
    }

    public final int getAmount() {
        b9 b92 = this.a;
        if (b92 == null) {
            return 0;
        }
        try {
            int n10 = b92.getAmount();
            return n10;
        }
        catch (RemoteException remoteException) {
            a.b("Could not forward getAmount to RewardItem", remoteException);
            return 0;
        }
    }

    public final String getType() {
        b9 b92 = this.a;
        if (b92 == null) {
            return null;
        }
        try {
            String string = b92.getType();
            return string;
        }
        catch (RemoteException remoteException) {
            a.b("Could not forward getType to RewardItem", remoteException);
            return null;
        }
    }
}

