/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.a.e3
 *  com.google.android.gms.ads.formats.UnifiedNativeAd
 *  com.google.android.gms.ads.formats.UnifiedNativeAd$UnconfirmedClickListener
 *  java.lang.String
 */
package c.b.b.a.e.a;

import c.b.b.a.e.a.e3;
import com.google.android.gms.ads.formats.UnifiedNativeAd;

public final class u3
extends e3 {
    public final UnifiedNativeAd.UnconfirmedClickListener a;

    public u3(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.a = unconfirmedClickListener;
    }

    public final void onUnconfirmedClickCancelled() {
        this.a.onUnconfirmedClickCancelled();
    }

    public final void onUnconfirmedClickReceived(String string) {
        this.a.onUnconfirmedClickReceived(string);
    }
}

