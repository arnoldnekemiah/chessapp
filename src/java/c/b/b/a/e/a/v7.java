/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.a.f3
 *  c.b.b.a.e.a.p7
 *  c.b.b.a.e.a.z2
 *  com.google.android.gms.ads.nativead.NativeAd
 *  com.google.android.gms.ads.nativead.NativeAd$OnNativeAdLoadedListener
 */
package c.b.b.a.e.a;

import c.b.b.a.e.a.f3;
import c.b.b.a.e.a.p7;
import c.b.b.a.e.a.z2;
import com.google.android.gms.ads.nativead.NativeAd;

public final class v7
extends z2 {
    public final NativeAd.OnNativeAdLoadedListener a;

    public v7(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.a = onNativeAdLoadedListener;
    }

    public final void a(f3 f32) {
        this.a.onNativeAdLoaded((NativeAd)new p7(f32));
    }
}

