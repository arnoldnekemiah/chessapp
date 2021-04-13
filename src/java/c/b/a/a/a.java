/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.ads.mediation.AbstractAdViewAdapter
 *  com.google.android.gms.ads.reward.RewardItem
 *  com.google.android.gms.ads.reward.RewardedVideoAdListener
 *  com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
 *  java.lang.Object
 */
package c.b.a.a;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;

public final class a
implements RewardedVideoAdListener {
    public final /* synthetic */ AbstractAdViewAdapter a;

    public a(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.a = abstractAdViewAdapter;
    }

    public final void onRewarded(RewardItem rewardItem) {
        AbstractAdViewAdapter.zza((AbstractAdViewAdapter)this.a).onRewarded((MediationRewardedVideoAdAdapter)this.a, rewardItem);
    }

    public final void onRewardedVideoAdClosed() {
        AbstractAdViewAdapter.zza((AbstractAdViewAdapter)this.a).onAdClosed((MediationRewardedVideoAdAdapter)this.a);
        AbstractAdViewAdapter.zza((AbstractAdViewAdapter)this.a, null);
    }

    public final void onRewardedVideoAdFailedToLoad(int n10) {
        AbstractAdViewAdapter.zza((AbstractAdViewAdapter)this.a).onAdFailedToLoad((MediationRewardedVideoAdAdapter)this.a, n10);
    }

    public final void onRewardedVideoAdLeftApplication() {
        AbstractAdViewAdapter.zza((AbstractAdViewAdapter)this.a).onAdLeftApplication((MediationRewardedVideoAdAdapter)this.a);
    }

    public final void onRewardedVideoAdLoaded() {
        AbstractAdViewAdapter.zza((AbstractAdViewAdapter)this.a).onAdLoaded((MediationRewardedVideoAdAdapter)this.a);
    }

    public final void onRewardedVideoAdOpened() {
        AbstractAdViewAdapter.zza((AbstractAdViewAdapter)this.a).onAdOpened((MediationRewardedVideoAdAdapter)this.a);
    }

    public final void onRewardedVideoCompleted() {
        AbstractAdViewAdapter.zza((AbstractAdViewAdapter)this.a).onVideoCompleted((MediationRewardedVideoAdAdapter)this.a);
    }

    public final void onRewardedVideoStarted() {
        AbstractAdViewAdapter.zza((AbstractAdViewAdapter)this.a).onVideoStarted((MediationRewardedVideoAdAdapter)this.a);
    }
}

