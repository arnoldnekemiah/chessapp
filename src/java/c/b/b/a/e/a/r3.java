/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.a.i2
 *  c.b.b.a.e.a.y1
 *  com.google.android.gms.ads.formats.NativeAppInstallAd
 *  com.google.android.gms.ads.formats.NativeAppInstallAd$OnAppInstallAdLoadedListener
 */
package c.b.b.a.e.a;

import c.b.b.a.e.a.i2;
import c.b.b.a.e.a.y1;
import c.b.b.a.e.a.z1;
import com.google.android.gms.ads.formats.NativeAppInstallAd;

public final class r3
extends i2 {
    public final NativeAppInstallAd.OnAppInstallAdLoadedListener a;

    public r3(NativeAppInstallAd.OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
        this.a = onAppInstallAdLoadedListener;
    }

    public final void a(y1 y12) {
        this.a.onAppInstallAdLoaded((NativeAppInstallAd)new z1(y12));
    }
}

