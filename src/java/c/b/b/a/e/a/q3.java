/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.a.b2
 *  c.b.b.a.e.a.n2
 *  com.google.android.gms.ads.formats.NativeContentAd
 *  com.google.android.gms.ads.formats.NativeContentAd$OnContentAdLoadedListener
 */
package c.b.b.a.e.a;

import c.b.b.a.e.a.b2;
import c.b.b.a.e.a.c2;
import c.b.b.a.e.a.n2;
import com.google.android.gms.ads.formats.NativeContentAd;

public final class q3
extends n2 {
    public final NativeContentAd.OnContentAdLoadedListener a;

    public q3(NativeContentAd.OnContentAdLoadedListener onContentAdLoadedListener) {
        this.a = onContentAdLoadedListener;
    }

    public final void a(b2 b22) {
        this.a.onContentAdLoaded((NativeContentAd)new c2(b22));
    }
}

