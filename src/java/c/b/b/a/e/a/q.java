/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.a3
 *  com.google.android.gms.ads.formats.ShouldDelayBannerRenderingListener
 *  java.lang.Runnable
 */
package c.b.b.a.e.a;

import c.b.b.a.c.a;
import c.b.b.a.c.b;
import c.b.b.a.e.a.a3;
import com.google.android.gms.ads.formats.ShouldDelayBannerRenderingListener;

public final class q
extends a3 {
    public final ShouldDelayBannerRenderingListener a;

    public q(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
        this.a = shouldDelayBannerRenderingListener;
    }

    public final boolean n(a a4) {
        return this.a.shouldDelayBannerRendering((Runnable)b.K(a4));
    }
}

