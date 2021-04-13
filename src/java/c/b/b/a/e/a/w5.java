/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  c.b.b.a.e.a.b5
 *  c.b.b.a.e.a.f2
 *  c.b.b.a.e.a.gg
 *  com.google.ads.mediation.admob.AdMobAdapter
 *  com.google.android.gms.ads.AdError
 *  com.google.android.gms.ads.VideoController
 *  com.google.android.gms.ads.formats.NativeCustomTemplateAd
 *  com.google.android.gms.ads.mediation.MediationBannerAdapter
 *  com.google.android.gms.ads.mediation.MediationBannerListener
 *  com.google.android.gms.ads.mediation.MediationInterstitialAdapter
 *  com.google.android.gms.ads.mediation.MediationInterstitialListener
 *  com.google.android.gms.ads.mediation.MediationNativeAdapter
 *  com.google.android.gms.ads.mediation.MediationNativeListener
 *  com.google.android.gms.ads.mediation.NativeAdMapper
 *  com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.os.RemoteException;
import c.b.b.a.e.a.b5;
import c.b.b.a.e.a.f2;
import c.b.b.a.e.a.g2;
import c.b.b.a.e.a.gg;
import c.b.b.a.e.a.p5;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.internal.ads.zzvg;

public final class w5
implements MediationBannerListener,
MediationInterstitialListener,
MediationNativeListener {
    public final b5 a;
    public NativeAdMapper b;
    public UnifiedNativeAdMapper c;
    public NativeCustomTemplateAd d;

    public w5(b5 b52) {
        this.a = b52;
    }

    public static void a(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper, NativeAdMapper nativeAdMapper) {
        if (mediationNativeAdapter instanceof AdMobAdapter) {
            return;
        }
        VideoController videoController = new VideoController();
        videoController.zza((gg)new p5());
        if (unifiedNativeAdMapper != null && unifiedNativeAdMapper.hasVideoContent()) {
            unifiedNativeAdMapper.zza(videoController);
        }
        if (nativeAdMapper != null && nativeAdMapper.hasVideoContent()) {
            nativeAdMapper.zza(videoController);
        }
    }

    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onAdClicked.");
        try {
            this.a.onAdClicked();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onAdClicked.");
        try {
            this.a.onAdClicked();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        a.b("#008 Must be called on the main UI thread.");
        NativeAdMapper nativeAdMapper = this.b;
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.c;
        if (this.d == null) {
            if (nativeAdMapper == null && unifiedNativeAdMapper == null) {
                a.c("#007 Could not call remote method.", null);
                return;
            }
            if (unifiedNativeAdMapper != null && !unifiedNativeAdMapper.getOverrideClickHandling()) {
                a.g("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
            if (nativeAdMapper != null && !nativeAdMapper.getOverrideClickHandling()) {
                a.g("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        a.g("Adapter called onAdClicked.");
        try {
            this.a.onAdClicked();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onAdClosed.");
        try {
            this.a.onAdClosed();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onAdClosed.");
        try {
            this.a.onAdClosed();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onAdClosed.");
        try {
            this.a.onAdClosed();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int n10) {
        a.b("#008 Must be called on the main UI thread.");
        StringBuilder stringBuilder = new StringBuilder(55);
        stringBuilder.append("Adapter called onAdFailedToLoad with error. ");
        stringBuilder.append(n10);
        a.g(stringBuilder.toString());
        try {
            this.a.onAdFailedToLoad(n10);
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, AdError adError) {
        a.b("#008 Must be called on the main UI thread.");
        int n10 = adError.getCode();
        String string = adError.getMessage();
        String string2 = adError.getDomain();
        StringBuilder stringBuilder = new StringBuilder(c.a.b.a.a.a(string2, c.a.b.a.a.a(string, 97)));
        stringBuilder.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        stringBuilder.append(n10);
        stringBuilder.append(". ErrorMessage: ");
        stringBuilder.append(string);
        stringBuilder.append(". ErrorDomain: ");
        stringBuilder.append(string2);
        a.g(stringBuilder.toString());
        try {
            this.a.b(adError.zzdq());
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int n10) {
        a.b("#008 Must be called on the main UI thread.");
        StringBuilder stringBuilder = new StringBuilder(55);
        stringBuilder.append("Adapter called onAdFailedToLoad with error ");
        stringBuilder.append(n10);
        stringBuilder.append(".");
        a.g(stringBuilder.toString());
        try {
            this.a.onAdFailedToLoad(n10);
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, AdError adError) {
        a.b("#008 Must be called on the main UI thread.");
        int n10 = adError.getCode();
        String string = adError.getMessage();
        String string2 = adError.getDomain();
        StringBuilder stringBuilder = new StringBuilder(c.a.b.a.a.a(string2, c.a.b.a.a.a(string, 97)));
        stringBuilder.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        stringBuilder.append(n10);
        stringBuilder.append(". ErrorMessage: ");
        stringBuilder.append(string);
        stringBuilder.append(". ErrorDomain: ");
        stringBuilder.append(string2);
        a.g(stringBuilder.toString());
        try {
            this.a.b(adError.zzdq());
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int n10) {
        a.b("#008 Must be called on the main UI thread.");
        StringBuilder stringBuilder = new StringBuilder(55);
        stringBuilder.append("Adapter called onAdFailedToLoad with error ");
        stringBuilder.append(n10);
        stringBuilder.append(".");
        a.g(stringBuilder.toString());
        try {
            this.a.onAdFailedToLoad(n10);
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, AdError adError) {
        a.b("#008 Must be called on the main UI thread.");
        int n10 = adError.getCode();
        String string = adError.getMessage();
        String string2 = adError.getDomain();
        StringBuilder stringBuilder = new StringBuilder(c.a.b.a.a.a(string2, c.a.b.a.a.a(string, 97)));
        stringBuilder.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        stringBuilder.append(n10);
        stringBuilder.append(". ErrorMessage: ");
        stringBuilder.append(string);
        stringBuilder.append(". ErrorDomain: ");
        stringBuilder.append(string2);
        a.g(stringBuilder.toString());
        try {
            this.a.b(adError.zzdq());
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        a.b("#008 Must be called on the main UI thread.");
        NativeAdMapper nativeAdMapper = this.b;
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.c;
        if (this.d == null) {
            if (nativeAdMapper == null && unifiedNativeAdMapper == null) {
                a.c("#007 Could not call remote method.", null);
                return;
            }
            if (unifiedNativeAdMapper != null && !unifiedNativeAdMapper.getOverrideImpressionRecording()) {
                a.g("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
            if (nativeAdMapper != null && !nativeAdMapper.getOverrideImpressionRecording()) {
                a.g("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        a.g("Adapter called onAdImpression.");
        try {
            this.a.onAdImpression();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onAdLeftApplication.");
        try {
            this.a.onAdLeftApplication();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onAdLeftApplication.");
        try {
            this.a.onAdLeftApplication();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onAdLeftApplication.");
        try {
            this.a.onAdLeftApplication();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onAdLoaded.");
        try {
            this.a.onAdLoaded();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onAdLoaded.");
        try {
            this.a.onAdLoaded();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, NativeAdMapper nativeAdMapper) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onAdLoaded.");
        this.b = nativeAdMapper;
        this.c = null;
        w5.a(mediationNativeAdapter, null, nativeAdMapper);
        try {
            this.a.onAdLoaded();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onAdLoaded.");
        this.c = unifiedNativeAdMapper;
        this.b = null;
        w5.a(mediationNativeAdapter, unifiedNativeAdMapper, null);
        try {
            this.a.onAdLoaded();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onAdOpened.");
        try {
            this.a.onAdOpened();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onAdOpened.");
        try {
            this.a.onAdOpened();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onAdOpened.");
        try {
            this.a.onAdOpened();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onVideoEnd.");
        try {
            this.a.D();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void zza(MediationBannerAdapter mediationBannerAdapter, String string, String string2) {
        a.b("#008 Must be called on the main UI thread.");
        a.g("Adapter called onAppEvent.");
        try {
            this.a.onAppEvent(string, string2);
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd) {
        a.b("#008 Must be called on the main UI thread.");
        String string = String.valueOf((Object)nativeCustomTemplateAd.getCustomTemplateId());
        String string2 = string.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(string) : new String("Adapter called onAdLoaded with template id ");
        a.g(string2);
        this.d = nativeCustomTemplateAd;
        try {
            this.a.onAdLoaded();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd, String string) {
        if (nativeCustomTemplateAd instanceof g2) {
            try {
                this.a.a(((g2)nativeCustomTemplateAd).a, string);
                return;
            }
            catch (RemoteException remoteException) {
                a.c("#007 Could not call remote method.", remoteException);
                return;
            }
        }
        a.i("Unexpected native custom template ad type.");
    }
}

