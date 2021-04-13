/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.b1
 *  c.b.b.a.e.a.p1
 *  com.google.android.gms.ads.formats.UnifiedNativeAdView
 *  java.lang.Object
 */
package c.b.b.a.a.d;

import android.os.RemoteException;
import android.widget.ImageView;
import c.b.b.a.c.a;
import c.b.b.a.c.b;
import c.b.b.a.e.a.b1;
import c.b.b.a.e.a.p1;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;

public final class e
implements b1 {
    public final UnifiedNativeAdView a;

    public e(UnifiedNativeAdView unifiedNativeAdView) {
        this.a = unifiedNativeAdView;
    }

    public final void a(ImageView.ScaleType scaleType) {
        UnifiedNativeAdView unifiedNativeAdView = this.a;
        if (unifiedNativeAdView != null) {
            if (scaleType != null) {
                try {
                    unifiedNativeAdView.b.i(new b<ImageView.ScaleType>(scaleType));
                    return;
                }
                catch (RemoteException remoteException) {
                    a.c.a.a.a("Unable to call setMediaViewImageScaleType on delegate", remoteException);
                }
            }
            return;
        }
        throw null;
    }
}

