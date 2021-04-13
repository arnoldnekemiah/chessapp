/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  c.b.b.a.e.a.w9
 *  com.google.android.gms.ads.rewarded.RewardItem
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.os.RemoteException;
import c.b.b.a.e.a.w9;
import com.google.android.gms.ads.rewarded.RewardItem;

public final class la
implements RewardItem {
    public final w9 a;

    public la(w9 w92) {
        this.a = w92;
    }

    public final int getAmount() {
        w9 w92 = this.a;
        if (w92 == null) {
            return 0;
        }
        try {
            int n10 = w92.getAmount();
            return n10;
        }
        catch (RemoteException remoteException) {
            a.b("Could not forward getAmount to RewardItem", remoteException);
            return 0;
        }
    }

    public final String getType() {
        w9 w92 = this.a;
        if (w92 == null) {
            return null;
        }
        try {
            String string = w92.getType();
            return string;
        }
        catch (RemoteException remoteException) {
            a.b("Could not forward getType to RewardItem", remoteException);
            return null;
        }
    }
}

