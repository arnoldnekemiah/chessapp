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
 *  com.google.android.gms.ads.rewarded.RewardedAd
 *  com.google.android.gms.ads.rewarded.RewardedAdCallback
 *  com.google.android.gms.ads.rewarded.RewardedAdLoadCallback
 *  com.google.android.gms.ads.rewarded.ServerSideVerificationOptions
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
import c.b.b.a.e.a.oa;
import c.b.b.a.e.a.od;
import c.b.b.a.e.a.pa;
import c.b.b.a.e.a.qd;
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
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.internal.ads.zzawh;
import com.google.android.gms.internal.ads.zzvl;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class ma
extends RewardedAd {
    public final String b;
    public final x9 c;
    public final Context d;
    public final va e;
    public final oa f;
    public OnAdMetadataChangedListener g;
    public OnPaidEventListener h;
    public FullScreenContentCallback i;

    public ma(Context context, String string) {
        this.d = context.getApplicationContext();
        this.b = string;
        od od2 = de.i.b;
        w4 w42 = new w4();
        if (od2 != null) {
            this.c = (x9)new qd(od2, context, string, w42).a(context, false);
            this.e = new va();
            this.f = new oa();
            return;
        }
        throw null;
    }

    public final void a(ng ng2, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            this.c.b(gd.a((Context)this.d, (ng)ng2), (fa)new pa(rewardedAdLoadCallback, this));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final Bundle getAdMetadata() {
        try {
            Bundle bundle = this.c.getAdMetadata();
            return bundle;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return new Bundle();
        }
    }

    public final String getAdUnitId() {
        return this.b;
    }

    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.i;
    }

    public final String getMediationAdapterClassName() {
        try {
            String string = this.c.getMediationAdapterClassName();
            return string;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return "";
        }
    }

    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.g;
    }

    public final OnPaidEventListener getOnPaidEventListener() {
        return this.h;
    }

    public final ResponseInfo getResponseInfo() {
        cg cg2;
        try {
            cg2 = this.c.j();
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            cg2 = null;
        }
        return ResponseInfo.zza((cg)cg2);
    }

    public final RewardItem getRewardItem() {
        w9 w92;
        block3 : {
            try {
                w92 = this.c.R0();
                if (w92 != null) break block3;
                return null;
            }
            catch (RemoteException remoteException) {
                a.c("#007 Could not call remote method.", remoteException);
                return null;
            }
        }
        la la2 = new la(w92);
        return la2;
    }

    public final boolean isLoaded() {
        try {
            boolean bl = this.c.isLoaded();
            return bl;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return false;
        }
    }

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.i = fullScreenContentCallback;
        this.e.a = fullScreenContentCallback;
        this.f.b = fullScreenContentCallback;
    }

    public final void setImmersiveMode(boolean bl) {
        try {
            this.c.setImmersiveMode(bl);
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.g = onAdMetadataChangedListener;
            this.c.a((xf)new m(onAdMetadataChangedListener));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.h = onPaidEventListener;
            this.c.a((bg)new o(onPaidEventListener));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            this.c.a(new zzawh(serverSideVerificationOptions));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.e.b = onUserEarnedRewardListener;
        if (activity == null) {
            a.i("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            this.c.a((ca)this.e);
            this.c.d(new b<Activity>(activity));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void show(Activity activity, RewardedAdCallback rewardedAdCallback) {
        oa oa2 = this.f;
        oa2.a = rewardedAdCallback;
        try {
            this.c.a((ca)oa2);
            this.c.d(new b<Activity>(activity));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void show(Activity activity, RewardedAdCallback rewardedAdCallback, boolean bl) {
        oa oa2 = this.f;
        oa2.a = rewardedAdCallback;
        try {
            this.c.a((ca)oa2);
            this.c.a(new b<Activity>(activity), bl);
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }
}

