/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.RemoteException
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.s9
 *  com.google.android.gms.ads.reward.RewardItem
 *  com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
 *  com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
 *  com.google.android.gms.internal.ads.zzavj
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.os.Bundle;
import android.os.RemoteException;
import c.b.b.a.c.b;
import c.b.b.a.e.a.s9;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.internal.ads.zzavj;

public final class t9
implements MediationRewardedVideoAdListener {
    public final s9 a;

    public t9(s9 s92) {
        this.a = s92;
    }

    public final void onAdClicked(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onAdClicked.");
        try {
            this.a.j(new b<MediationRewardedVideoAdAdapter>(mediationRewardedVideoAdAdapter));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdClosed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onAdClosed.");
        try {
            this.a.A(new b<MediationRewardedVideoAdAdapter>(mediationRewardedVideoAdAdapter));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdFailedToLoad(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int n10) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onAdFailedToLoad.");
        try {
            this.a.a(new b<MediationRewardedVideoAdAdapter>(mediationRewardedVideoAdAdapter), n10);
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdLeftApplication(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onAdLeftApplication.");
        try {
            this.a.C(new b<MediationRewardedVideoAdAdapter>(mediationRewardedVideoAdAdapter));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdLoaded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onAdLoaded.");
        try {
            this.a.m(new b<MediationRewardedVideoAdAdapter>(mediationRewardedVideoAdAdapter));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdOpened(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onAdOpened.");
        try {
            this.a.G(new b<MediationRewardedVideoAdAdapter>(mediationRewardedVideoAdAdapter));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onInitializationFailed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int n10) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onInitializationFailed.");
        try {
            this.a.d(new b<MediationRewardedVideoAdAdapter>(mediationRewardedVideoAdAdapter), n10);
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onInitializationSucceeded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onInitializationSucceeded.");
        try {
            this.a.E(new b<MediationRewardedVideoAdAdapter>(mediationRewardedVideoAdAdapter));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void onRewarded(MediationRewardedVideoAdAdapter var1_1, RewardItem var2_2) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onRewarded.");
        if (var2_2 == null) ** GOTO lbl7
        try {
            this.a.a(new b<MediationRewardedVideoAdAdapter>(var1_1), new zzavj(var2_2.getType(), var2_2.getAmount()));
            return;
lbl7: // 1 sources:
            this.a.a(new b<MediationRewardedVideoAdAdapter>(var1_1), new zzavj("", 1));
            return;
        }
        catch (RemoteException var3_3) {
            a.c("#007 Could not call remote method.", var3_3);
            return;
        }
    }

    public final void onVideoCompleted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onVideoCompleted.");
        try {
            this.a.l(new b<MediationRewardedVideoAdAdapter>(mediationRewardedVideoAdAdapter));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onVideoStarted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onVideoStarted.");
        try {
            this.a.p(new b<MediationRewardedVideoAdAdapter>(mediationRewardedVideoAdAdapter));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void zzb(Bundle bundle) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onAdMetadataChanged.");
        try {
            this.a.zzb(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }
}

