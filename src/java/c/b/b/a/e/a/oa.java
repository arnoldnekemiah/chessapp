/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.a.ba
 *  c.b.b.a.e.a.la
 *  c.b.b.a.e.a.w9
 *  com.google.android.gms.ads.AdError
 *  com.google.android.gms.ads.FullScreenContentCallback
 *  com.google.android.gms.ads.rewarded.RewardItem
 *  com.google.android.gms.ads.rewarded.RewardedAdCallback
 *  com.google.android.gms.internal.ads.zzvg
 */
package c.b.b.a.e.a;

import c.b.b.a.e.a.ba;
import c.b.b.a.e.a.la;
import c.b.b.a.e.a.w9;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.internal.ads.zzvg;

public final class oa
extends ba {
    public RewardedAdCallback a;
    public FullScreenContentCallback b;

    public final void H0() {
        FullScreenContentCallback fullScreenContentCallback;
        RewardedAdCallback rewardedAdCallback = this.a;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdOpened();
        }
        if ((fullScreenContentCallback = this.b) != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    public final void a(w9 w92) {
        RewardedAdCallback rewardedAdCallback = this.a;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onUserEarnedReward((RewardItem)new la(w92));
        }
    }

    public final void c(int n7) {
        RewardedAdCallback rewardedAdCallback = this.a;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdFailedToShow(n7);
        }
    }

    public final void h0() {
        FullScreenContentCallback fullScreenContentCallback;
        RewardedAdCallback rewardedAdCallback = this.a;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdClosed();
        }
        if ((fullScreenContentCallback = this.b) != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    public final void j(zzvg zzvg2) {
        FullScreenContentCallback fullScreenContentCallback;
        AdError adError = zzvg2.c();
        RewardedAdCallback rewardedAdCallback = this.a;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdFailedToShow(adError);
        }
        if ((fullScreenContentCallback = this.b) != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(adError);
        }
    }
}

