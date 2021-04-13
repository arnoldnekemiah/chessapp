/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.a.ia
 *  com.google.android.gms.ads.LoadAdError
 *  com.google.android.gms.ads.rewarded.RewardedAd
 *  com.google.android.gms.ads.rewarded.RewardedAdLoadCallback
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.Object
 */
package c.b.b.a.e.a;

import c.b.b.a.e.a.ia;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.internal.ads.zzvg;

public final class pa
extends ia {
    public final RewardedAdLoadCallback a;
    public final RewardedAd b;

    public pa(RewardedAdLoadCallback rewardedAdLoadCallback, RewardedAd rewardedAd) {
        this.a = rewardedAdLoadCallback;
        this.b = rewardedAd;
    }

    public final void e(int n7) {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.a;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onRewardedAdFailedToLoad(n7);
        }
    }

    public final void f(zzvg zzvg2) {
        if (this.a != null) {
            LoadAdError loadAdError = zzvg2.d();
            this.a.onRewardedAdFailedToLoad(loadAdError);
            this.a.onAdFailedToLoad(loadAdError);
        }
    }

    public final void f0() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.a;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onRewardedAdLoaded();
            this.a.onAdLoaded((Object)this.b);
        }
    }
}

