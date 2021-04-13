/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.a.ba
 *  c.b.b.a.e.a.la
 *  c.b.b.a.e.a.w9
 *  com.google.android.gms.ads.AdError
 *  com.google.android.gms.ads.FullScreenContentCallback
 *  com.google.android.gms.ads.OnUserEarnedRewardListener
 *  com.google.android.gms.ads.rewarded.RewardItem
 *  com.google.android.gms.internal.ads.zzvg
 */
package c.b.b.a.e.a;

import c.b.b.a.e.a.ba;
import c.b.b.a.e.a.la;
import c.b.b.a.e.a.w9;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.internal.ads.zzvg;

public final class va
extends ba {
    public FullScreenContentCallback a;
    public OnUserEarnedRewardListener b;

    public final void H0() {
        FullScreenContentCallback fullScreenContentCallback = this.a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    public final void a(w9 w92) {
        OnUserEarnedRewardListener onUserEarnedRewardListener = this.b;
        if (onUserEarnedRewardListener != null) {
            onUserEarnedRewardListener.onUserEarnedReward((RewardItem)new la(w92));
        }
    }

    public final void c(int n7) {
    }

    public final void h0() {
        FullScreenContentCallback fullScreenContentCallback = this.a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    public final void j(zzvg zzvg2) {
        FullScreenContentCallback fullScreenContentCallback = this.a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzvg2.c());
        }
    }
}

