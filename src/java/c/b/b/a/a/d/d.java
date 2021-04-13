/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  c.b.b.a.e.a.h1
 *  c.b.b.a.e.a.p1
 *  c.b.b.a.e.a.z0
 *  com.google.android.gms.ads.MediaContent
 *  com.google.android.gms.ads.formats.UnifiedNativeAdView
 *  java.lang.Object
 */
package c.b.b.a.a.d;

import a.c.a.a;
import android.os.RemoteException;
import c.b.b.a.e.a.h1;
import c.b.b.a.e.a.p1;
import c.b.b.a.e.a.xg;
import c.b.b.a.e.a.z0;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;

public final class d
implements z0 {
    public final UnifiedNativeAdView a;

    public d(UnifiedNativeAdView unifiedNativeAdView) {
        this.a = unifiedNativeAdView;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(MediaContent mediaContent) {
        UnifiedNativeAdView unifiedNativeAdView = this.a;
        if (unifiedNativeAdView == null) {
            throw null;
        }
        try {
            if (mediaContent instanceof xg) {
                unifiedNativeAdView.b.a(((xg)mediaContent).a);
                return;
            }
            if (mediaContent == null) {
                unifiedNativeAdView.b.a(null);
                return;
            }
            a.g("Use MediaContent provided by UnifiedNativeAd.getMediaContent");
            return;
        }
        catch (RemoteException remoteException) {
            a.a("Unable to call setMediaContent on delegate", remoteException);
            return;
        }
    }
}

