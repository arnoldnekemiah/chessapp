/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.a.h4
 *  c.b.b.a.e.a.j4
 *  c.b.b.a.e.a.l4
 *  com.google.android.gms.ads.LoadAdError
 *  com.google.android.gms.ads.instream.InstreamAd
 *  com.google.android.gms.ads.instream.InstreamAd$InstreamAdLoadCallback
 *  com.google.android.gms.internal.ads.zzvg
 */
package c.b.b.a.e.a;

import c.b.b.a.e.a.h4;
import c.b.b.a.e.a.j4;
import c.b.b.a.e.a.l4;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.instream.InstreamAd;
import com.google.android.gms.internal.ads.zzvg;

public final class n4
extends j4 {
    public final InstreamAd.InstreamAdLoadCallback a;

    public n4(InstreamAd.InstreamAdLoadCallback instreamAdLoadCallback) {
        this.a = instreamAdLoadCallback;
    }

    public final void a(h4 h42) {
        this.a.onInstreamAdLoaded((InstreamAd)new l4(h42));
    }

    public final void b(int n7) {
        this.a.onInstreamAdFailedToLoad(n7);
    }

    public final void e(zzvg zzvg2) {
        this.a.onInstreamAdFailedToLoad(zzvg2.d());
    }
}

