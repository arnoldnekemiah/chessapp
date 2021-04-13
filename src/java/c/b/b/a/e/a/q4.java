/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.RemoteException
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.bg
 *  c.b.b.a.e.a.cf
 *  c.b.b.a.e.a.cg
 *  c.b.b.a.e.a.de
 *  c.b.b.a.e.a.gd
 *  c.b.b.a.e.a.jf
 *  c.b.b.a.e.a.me
 *  c.b.b.a.e.a.ng
 *  c.b.b.a.e.a.od
 *  c.b.b.a.e.a.v4
 *  c.b.b.a.e.a.ve
 *  com.google.android.gms.ads.AdError
 *  com.google.android.gms.ads.AdLoadCallback
 *  com.google.android.gms.ads.FullScreenContentCallback
 *  com.google.android.gms.ads.LoadAdError
 *  com.google.android.gms.ads.OnPaidEventListener
 *  com.google.android.gms.ads.ResponseInfo
 *  com.google.android.gms.ads.admanager.AdManagerInterstitialAd
 *  com.google.android.gms.ads.admanager.AppEventListener
 *  com.google.android.gms.internal.ads.zzvl
 *  com.google.android.gms.internal.ads.zzvs
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import c.b.b.a.c.b;
import c.b.b.a.e.a.bg;
import c.b.b.a.e.a.cf;
import c.b.b.a.e.a.cg;
import c.b.b.a.e.a.de;
import c.b.b.a.e.a.fe;
import c.b.b.a.e.a.gd;
import c.b.b.a.e.a.hc;
import c.b.b.a.e.a.jf;
import c.b.b.a.e.a.me;
import c.b.b.a.e.a.ng;
import c.b.b.a.e.a.o;
import c.b.b.a.e.a.od;
import c.b.b.a.e.a.v4;
import c.b.b.a.e.a.ve;
import c.b.b.a.e.a.w4;
import c.b.b.a.e.a.zc;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.internal.ads.zzvl;
import com.google.android.gms.internal.ads.zzvs;

public final class q4<AdT>
extends AdManagerInterstitialAd {
    public final Context a;
    public final ve b;
    public final String c;
    public AppEventListener d;
    public FullScreenContentCallback e;
    public OnPaidEventListener f;

    public q4(Context context, String string) {
        this.a = context;
        this.c = string;
        this.b = de.i.b.a(context, new zzvs(), string, (v4)new w4());
    }

    public final void a(ng ng2, AdLoadCallback<AdT> adLoadCallback) {
        try {
            this.b.a(gd.a((Context)this.a, (ng)ng2), new zc<q4>(adLoadCallback, this));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            LoadAdError loadAdError = new LoadAdError(0, "Internal Error.", "com.google.android.gms.ads", null, null);
            adLoadCallback.onAdFailedToLoad(loadAdError);
            return;
        }
    }

    public final String getAdUnitId() {
        return this.c;
    }

    public final AppEventListener getAppEventListener() {
        return this.d;
    }

    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.e;
    }

    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final ResponseInfo getResponseInfo() {
        cg cg2 = null;
        ve ve2 = this.b;
        cg2 = null;
        if (ve2 == null) return ResponseInfo.zza(cg2);
        try {
            cg2 = this.b.j();
            return ResponseInfo.zza(cg2);
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
        }
        return ResponseInfo.zza(cg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void setAppEventListener(AppEventListener appEventListener) {
        hc hc2;
        ve ve2;
        try {
            this.d = appEventListener;
            ve2 = this.b;
            hc2 = appEventListener != null ? new hc(appEventListener) : null;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
        ve2.a((cf)hc2);
    }

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        try {
            this.e = fullScreenContentCallback;
            this.b.a((jf)new fe(fullScreenContentCallback));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
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

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f = onPaidEventListener;
            this.b.a((bg)new o(onPaidEventListener));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void show(Activity activity) {
        if (activity == null) {
            a.i("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            this.b.d(new b<Activity>(activity));
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }
}

