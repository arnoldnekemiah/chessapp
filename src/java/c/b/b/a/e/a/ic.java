/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.a.jc
 *  c.b.b.a.e.a.lc
 *  c.b.b.a.e.a.oc
 *  com.google.android.gms.ads.LoadAdError
 *  com.google.android.gms.ads.appopen.AppOpenAd
 *  com.google.android.gms.ads.appopen.AppOpenAd$AppOpenAdLoadCallback
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import c.b.b.a.e.a.jc;
import c.b.b.a.e.a.lc;
import c.b.b.a.e.a.oc;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.internal.ads.zzvg;

public final class ic
extends oc {
    public final AppOpenAd.AppOpenAdLoadCallback a;
    public final String b;

    public ic(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String string) {
        this.a = appOpenAdLoadCallback;
        this.b = string;
    }

    public final void a(int n7) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.a;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAppOpenAdFailedToLoad(n7);
        }
    }

    public final void a(lc lc2) {
        if (this.a != null) {
            jc jc2 = new jc(lc2, this.b);
            this.a.onAppOpenAdLoaded((AppOpenAd)jc2);
            this.a.onAdLoaded((Object)jc2);
        }
    }

    public final void c(zzvg zzvg2) {
        if (this.a != null) {
            LoadAdError loadAdError = zzvg2.d();
            this.a.onAppOpenAdFailedToLoad(loadAdError);
            this.a.onAdFailedToLoad(loadAdError);
        }
    }
}

