/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.a.le
 *  com.google.android.gms.ads.AdLoadCallback
 *  com.google.android.gms.ads.LoadAdError
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.Object
 */
package c.b.b.a.e.a;

import c.b.b.a.e.a.le;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.internal.ads.zzvg;

public final class zc<AdT>
extends le {
    public final AdLoadCallback<AdT> a;
    public final AdT b;

    public zc(AdLoadCallback<AdT> adLoadCallback, AdT AdT) {
        this.a = adLoadCallback;
        this.b = AdT;
    }

    public final void d(zzvg zzvg2) {
        AdLoadCallback<AdT> adLoadCallback = this.a;
        if (adLoadCallback != null) {
            adLoadCallback.onAdFailedToLoad(zzvg2.d());
        }
    }

    public final void onAdLoaded() {
        AdT AdT;
        AdLoadCallback<AdT> adLoadCallback = this.a;
        if (adLoadCallback != null && (AdT = this.b) != null) {
            adLoadCallback.onAdLoaded(AdT);
        }
    }
}

