/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  c.b.b.a.e.a.b5
 *  c.b.b.a.e.a.sa
 *  c.b.b.a.e.a.w9
 *  com.google.android.gms.ads.AdError
 *  com.google.android.gms.ads.mediation.MediationBannerAdCallback
 *  com.google.android.gms.ads.mediation.MediationInterstitialAdCallback
 *  com.google.android.gms.ads.mediation.MediationNativeAdCallback
 *  com.google.android.gms.ads.mediation.MediationRewardedAdCallback
 *  com.google.android.gms.ads.rewarded.RewardItem
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.os.RemoteException;
import c.b.b.a.e.a.b5;
import c.b.b.a.e.a.sa;
import c.b.b.a.e.a.w9;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.internal.ads.zzvg;

public final class j7
implements MediationBannerAdCallback,
MediationInterstitialAdCallback,
MediationNativeAdCallback,
MediationRewardedAdCallback {
    public b5 a;

    public j7(b5 b52) {
        this.a = b52;
    }

    public final void onAdClosed() {
        try {
            this.a.onAdClosed();
        }
        catch (RemoteException remoteException) {}
    }

    public final void onAdFailedToShow(AdError adError) {
        try {
            int n7 = adError.getCode();
            String string = adError.getMessage();
            String string2 = adError.getDomain();
            StringBuilder stringBuilder = new StringBuilder(86 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length());
            stringBuilder.append("Mediated ad failed to show: Error Code = ");
            stringBuilder.append(n7);
            stringBuilder.append(". Error Message = ");
            stringBuilder.append(string);
            stringBuilder.append(" Error Domain = ");
            stringBuilder.append(string2);
            a.i(stringBuilder.toString());
            this.a.i(adError.zzdq());
        }
        catch (RemoteException remoteException) {}
    }

    public final void onAdFailedToShow(String string) {
        try {
            String string2 = String.valueOf((Object)string);
            String string3 = string2.length() != 0 ? "Mediated ad failed to show: ".concat(string2) : new String("Mediated ad failed to show: ");
            a.i(string3);
            this.a.m(string);
        }
        catch (RemoteException remoteException) {}
    }

    public final void onAdLeftApplication() {
        try {
            this.a.onAdLeftApplication();
        }
        catch (RemoteException remoteException) {}
    }

    public final void onAdOpened() {
        try {
            this.a.onAdOpened();
        }
        catch (RemoteException remoteException) {}
    }

    public final void onUserEarnedReward(RewardItem rewardItem) {
        try {
            this.a.a((w9)new sa(rewardItem));
        }
        catch (RemoteException remoteException) {}
    }

    public final void onVideoComplete() {
        try {
            this.a.D();
        }
        catch (RemoteException remoteException) {}
    }

    public final void onVideoMute() {
    }

    public final void onVideoPause() {
    }

    public final void onVideoPlay() {
        try {
            this.a.onVideoPlay();
        }
        catch (RemoteException remoteException) {}
    }

    public final void onVideoStart() {
        try {
            this.a.P();
        }
        catch (RemoteException remoteException) {}
    }

    public final void onVideoUnmute() {
    }

    public final void reportAdClicked() {
        try {
            this.a.onAdClicked();
        }
        catch (RemoteException remoteException) {}
    }

    public final void reportAdImpression() {
        try {
            this.a.onAdImpression();
        }
        catch (RemoteException remoteException) {}
    }
}

