/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.a.ia
 *  c.b.b.a.e.a.wa
 *  com.google.android.gms.ads.LoadAdError
 *  com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
 *  com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.Object
 */
package c.b.b.a.e.a;

import c.b.b.a.e.a.ia;
import c.b.b.a.e.a.wa;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.internal.ads.zzvg;

public final class ua
extends ia {
    public final RewardedInterstitialAdLoadCallback a;
    public final wa b;

    public ua(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, wa wa2) {
        this.a = rewardedInterstitialAdLoadCallback;
        this.b = wa2;
    }

    public final void e(int n7) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.a;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onRewardedInterstitialAdFailedToLoad(n7);
        }
    }

    public final void f(zzvg zzvg2) {
        if (this.a != null) {
            LoadAdError loadAdError = zzvg2.d();
            this.a.onRewardedInterstitialAdFailedToLoad(loadAdError);
            this.a.onAdFailedToLoad(loadAdError);
        }
    }

    public final void f0() {
        wa wa2;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.a;
        if (rewardedInterstitialAdLoadCallback != null && (wa2 = this.b) != null) {
            rewardedInterstitialAdLoadCallback.onRewardedInterstitialAdLoaded((RewardedInterstitialAd)wa2);
            this.a.onAdLoaded((Object)this.b);
        }
    }
}

