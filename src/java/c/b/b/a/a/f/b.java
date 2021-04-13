/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  c.b.b.a.e.a.h1
 *  c.b.b.a.e.a.p1
 *  c.b.b.a.e.a.z0
 *  com.google.android.gms.ads.MediaContent
 *  com.google.android.gms.ads.nativead.NativeAdView
 *  java.lang.Object
 */
package c.b.b.a.a.f;

import a.c.a.a;
import android.os.RemoteException;
import c.b.b.a.e.a.h1;
import c.b.b.a.e.a.p1;
import c.b.b.a.e.a.xg;
import c.b.b.a.e.a.z0;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.nativead.NativeAdView;

public final class b
implements z0 {
    public final NativeAdView a;

    public b(NativeAdView nativeAdView) {
        this.a = nativeAdView;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(MediaContent mediaContent) {
        NativeAdView nativeAdView = this.a;
        if (nativeAdView == null) {
            throw null;
        }
        try {
            if (mediaContent instanceof xg) {
                nativeAdView.b.a(((xg)mediaContent).a);
                return;
            }
            if (mediaContent == null) {
                nativeAdView.b.a(null);
                return;
            }
            a.g("Use MediaContent provided by NativeAd.getMediaContent");
            return;
        }
        catch (RemoteException remoteException) {
            a.a("Unable to call setMediaContent on delegate", remoteException);
            return;
        }
    }
}

