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
 *  com.google.android.gms.ads.nativead.NativeAdView
 *  java.lang.Object
 */
package c.b.b.a.a.f;

import android.os.RemoteException;
import android.widget.ImageView;
import c.b.b.a.c.a;
import c.b.b.a.c.b;
import c.b.b.a.e.a.b1;
import c.b.b.a.e.a.p1;
import com.google.android.gms.ads.nativead.NativeAdView;

public final class c
implements b1 {
    public final NativeAdView a;

    public c(NativeAdView nativeAdView) {
        this.a = nativeAdView;
    }

    public final void a(ImageView.ScaleType scaleType) {
        NativeAdView nativeAdView = this.a;
        if (nativeAdView != null) {
            if (scaleType != null) {
                try {
                    nativeAdView.b.i(new b<ImageView.ScaleType>(scaleType));
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

