/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  c.b.b.a.e.a.b5
 *  c.b.b.a.e.a.sa
 *  c.b.b.a.e.a.w9
 *  com.google.android.gms.ads.AdError
 *  com.google.android.gms.ads.mediation.MediationRewardedAdCallback
 *  com.google.android.gms.ads.rewarded.RewardItem
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c.b.b.a.e.a;

import android.os.RemoteException;
import c.a.b.a.a;
import c.b.b.a.e.a.b5;
import c.b.b.a.e.a.sa;
import c.b.b.a.e.a.w9;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.internal.ads.zzvg;

public final class ta
implements MediationRewardedAdCallback {
    public final b5 a;

    public ta(b5 b52) {
        this.a = b52;
    }

    public final void onAdClosed() {
        a.c.a.a.b("#008 Must be called on the main UI thread.");
        a.c.a.a.g("Adapter called onAdClosed.");
        try {
            this.a.onAdClosed();
            return;
        }
        catch (RemoteException remoteException) {
            a.c.a.a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdFailedToShow(AdError adError) {
        a.c.a.a.b("#008 Must be called on the main UI thread.");
        a.c.a.a.g("Adapter called onAdFailedToShow.");
        int n7 = adError.getCode();
        String string = adError.getMessage();
        String string2 = adError.getDomain();
        StringBuilder stringBuilder = new StringBuilder(a.a(string2, a.a(string, 87)));
        stringBuilder.append("Mediation ad failed to show: Error Code = ");
        stringBuilder.append(n7);
        stringBuilder.append(". Error Message = ");
        stringBuilder.append(string);
        stringBuilder.append(" Error Domain = ");
        stringBuilder.append(string2);
        a.c.a.a.i(stringBuilder.toString());
        try {
            this.a.i(adError.zzdq());
            return;
        }
        catch (RemoteException remoteException) {
            a.c.a.a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdFailedToShow(String string) {
        a.c.a.a.b("#008 Must be called on the main UI thread.");
        a.c.a.a.g("Adapter called onAdFailedToShow.");
        String string2 = String.valueOf((Object)string);
        String string3 = string2.length() != 0 ? "Mediation ad failed to show: ".concat(string2) : new String("Mediation ad failed to show: ");
        a.c.a.a.i(string3);
        try {
            this.a.m(string);
            return;
        }
        catch (RemoteException remoteException) {
            a.c.a.a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdOpened() {
        a.c.a.a.b("#008 Must be called on the main UI thread.");
        a.c.a.a.g("Adapter called onAdOpened.");
        try {
            this.a.onAdOpened();
            return;
        }
        catch (RemoteException remoteException) {
            a.c.a.a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onUserEarnedReward(RewardItem rewardItem) {
        a.c.a.a.b("#008 Must be called on the main UI thread.");
        a.c.a.a.g("Adapter called onUserEarnedReward.");
        try {
            this.a.a((w9)new sa(rewardItem));
            return;
        }
        catch (RemoteException remoteException) {
            a.c.a.a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onVideoComplete() {
        a.c.a.a.b("#008 Must be called on the main UI thread.");
        a.c.a.a.g("Adapter called onVideoComplete.");
        try {
            this.a.z0();
            return;
        }
        catch (RemoteException remoteException) {
            a.c.a.a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onVideoStart() {
        a.c.a.a.b("#008 Must be called on the main UI thread.");
        a.c.a.a.g("Adapter called onVideoStart.");
        try {
            this.a.P();
            return;
        }
        catch (RemoteException remoteException) {
            a.c.a.a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void reportAdClicked() {
        a.c.a.a.b("#008 Must be called on the main UI thread.");
        a.c.a.a.g("Adapter called reportAdClicked.");
        try {
            this.a.onAdClicked();
            return;
        }
        catch (RemoteException remoteException) {
            a.c.a.a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void reportAdImpression() {
        a.c.a.a.b("#008 Must be called on the main UI thread.");
        a.c.a.a.g("Adapter called reportAdImpression.");
        try {
            this.a.onAdImpression();
            return;
        }
        catch (RemoteException remoteException) {
            a.c.a.a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }
}

