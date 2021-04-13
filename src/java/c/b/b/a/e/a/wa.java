/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.RemoteException
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.bg
 *  c.b.b.a.e.a.ca
 *  c.b.b.a.e.a.cg
 *  c.b.b.a.e.a.de
 *  c.b.b.a.e.a.fa
 *  c.b.b.a.e.a.gd
 *  c.b.b.a.e.a.ng
 *  c.b.b.a.e.a.od
 *  c.b.b.a.e.a.v4
 *  c.b.b.a.e.a.w9
 *  c.b.b.a.e.a.x9
 *  c.b.b.a.e.a.xf
 *  com.google.android.gms.ads.FullScreenContentCallback
 *  com.google.android.gms.ads.OnPaidEventListener
 *  com.google.android.gms.ads.OnUserEarnedRewardListener
 *  com.google.android.gms.ads.ResponseInfo
 *  com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
 *  com.google.android.gms.ads.rewarded.RewardItem
 *  com.google.android.gms.ads.rewarded.ServerSideVerificationOptions
 *  com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
 *  com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback
 *  com.google.android.gms.internal.ads.zzawh
 *  com.google.android.gms.internal.ads.zzvl
 *  java.lang.Object
 *  java.lang.String
 *  javax.annotation.ParametersAreNonnullByDefault
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import c.b.b.a.c.b;
import c.b.b.a.e.a.bg;
import c.b.b.a.e.a.ca;
import c.b.b.a.e.a.cg;
import c.b.b.a.e.a.de;
import c.b.b.a.e.a.fa;
import c.b.b.a.e.a.gd;
import c.b.b.a.e.a.la;
import c.b.b.a.e.a.m;
import c.b.b.a.e.a.ng;
import c.b.b.a.e.a.o;
import c.b.b.a.e.a.od;
import c.b.b.a.e.a.qd;
import c.b.b.a.e.a.ua;
import c.b.b.a.e.a.v4;
import c.b.b.a.e.a.va;
import c.b.b.a.e.a.w4;
import c.b.b.a.e.a.w9;
import c.b.b.a.e.a.x9;
import c.b.b.a.e.a.xf;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.internal.ads.zzawh;
import com.google.android.gms.internal.ads.zzvl;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class wa
extends RewardedInterstitialAd {
    public final String a;
    public final x9 b;
    public final Context c;
    public final va d;
    public FullScreenContentCallback e;
    public OnAdMetadataChangedListener f;
    public OnPaidEventListener g;

    public wa(Context context, String string) {
        this.a = string;
        this.c = context.getApplicationContext();
        od od2 = de.i.b;
        w4 w42 = new w4();
        if (od2 != null) {
            this.b = (x9)new qd(od2, context, string, w42).a(context, false);
            this.d = new va();
            return;
        }
        throw null;
    }

    public final void a(ng ng2, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            this.b.a(gd.a((Context)this.c, (ng)ng2), (fa)new ua(rewardedInterstitialAdLoadCallback, this));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final Bundle getAdMetadata() {
        try {
            Bundle bundle = this.b.getAdMetadata();
            return bundle;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return new Bundle();
        }
    }

    public final String getAdUnitId() {
        return this.a;
    }

    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.e;
    }

    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.f;
    }

    public final OnPaidEventListener getOnPaidEventListener() {
        return this.g;
    }

    public final ResponseInfo getResponseInfo() {
        cg cg2;
        try {
            cg2 = this.b.j();
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            cg2 = null;
        }
        return ResponseInfo.zza((cg)cg2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final RewardItem getRewardItem() {
        w9 w92 = this.b.R0();
        if (w92 == null) return RewardItem.DEFAULT_REWARD;
        try {
            return new la(w92);
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.e = fullScreenContentCallback;
        this.d.a = fullScreenContentCallback;
    }

    public final void setImmersiveMode(boolean bl) {
        try {
            this.b.setImmersiveMode(bl);
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.f = onAdMetadataChangedListener;
        try {
            this.b.a((xf)new m(onAdMetadataChangedListener));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.g = onPaidEventListener;
        try {
            this.b.a((bg)new o(onPaidEventListener));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            this.b.a(new zzawh(serverSideVerificationOptions));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        va va2 = this.d;
        va2.b = onUserEarnedRewardListener;
        try {
            this.b.a((ca)va2);
            this.b.d(new b<Activity>(activity));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }
}

