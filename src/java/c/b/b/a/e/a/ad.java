/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.a.ke
 *  com.google.android.gms.ads.AdListener
 *  com.google.android.gms.ads.LoadAdError
 *  com.google.android.gms.internal.ads.zzvg
 */
package c.b.b.a.e.a;

import c.b.b.a.e.a.ke;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.internal.ads.zzvg;

public final class ad
extends ke {
    public final AdListener a;

    public ad(AdListener adListener) {
        this.a = adListener;
    }

    public final void b(zzvg zzvg2) {
        this.a.onAdFailedToLoad(zzvg2.d());
    }

    public final void onAdClicked() {
        this.a.onAdClicked();
    }

    public final void onAdClosed() {
        this.a.onAdClosed();
    }

    public final void onAdFailedToLoad(int n7) {
        this.a.onAdFailedToLoad(n7);
    }

    public final void onAdImpression() {
        this.a.onAdImpression();
    }

    public final void onAdLeftApplication() {
        this.a.onAdLeftApplication();
    }

    public final void onAdLoaded() {
        this.a.onAdLoaded();
    }

    public final void onAdOpened() {
        this.a.onAdOpened();
    }
}

