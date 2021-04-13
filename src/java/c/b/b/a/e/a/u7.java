/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.a.e3
 *  com.google.android.gms.ads.nativead.NativeAd
 *  com.google.android.gms.ads.nativead.NativeAd$UnconfirmedClickListener
 *  java.lang.String
 */
package c.b.b.a.e.a;

import c.b.b.a.e.a.e3;
import com.google.android.gms.ads.nativead.NativeAd;

public final class u7
extends e3 {
    public final NativeAd.UnconfirmedClickListener a;

    public u7(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.a = unconfirmedClickListener;
    }

    public final void onUnconfirmedClickCancelled() {
        this.a.onUnconfirmedClickCancelled();
    }

    public final void onUnconfirmedClickReceived(String string) {
        this.a.onUnconfirmedClickReceived(string);
    }
}

