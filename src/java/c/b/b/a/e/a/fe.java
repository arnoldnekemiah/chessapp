/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.a.mf
 *  com.google.android.gms.ads.AdError
 *  com.google.android.gms.ads.FullScreenContentCallback
 *  com.google.android.gms.internal.ads.zzvg
 */
package c.b.b.a.e.a;

import c.b.b.a.e.a.mf;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.internal.ads.zzvg;

public final class fe
extends mf {
    public final FullScreenContentCallback a;

    public fe(FullScreenContentCallback fullScreenContentCallback) {
        this.a = fullScreenContentCallback;
    }

    public final void C0() {
        FullScreenContentCallback fullScreenContentCallback = this.a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    public final void R() {
        FullScreenContentCallback fullScreenContentCallback = this.a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    public final void h(zzvg zzvg2) {
        FullScreenContentCallback fullScreenContentCallback = this.a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzvg2.c());
        }
    }
}

