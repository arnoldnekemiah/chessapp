/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.a.f3
 *  c.b.b.a.e.a.g3
 *  c.b.b.a.e.a.z2
 *  com.google.android.gms.ads.formats.UnifiedNativeAd
 *  com.google.android.gms.ads.formats.UnifiedNativeAd$OnUnifiedNativeAdLoadedListener
 */
package c.b.b.a.e.a;

import c.b.b.a.e.a.f3;
import c.b.b.a.e.a.g3;
import c.b.b.a.e.a.z2;
import com.google.android.gms.ads.formats.UnifiedNativeAd;

public final class v3
extends z2 {
    public final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener a;

    public v3(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.a = onUnifiedNativeAdLoadedListener;
    }

    public final void a(f3 f32) {
        this.a.onUnifiedNativeAdLoaded((UnifiedNativeAd)new g3(f32));
    }
}

