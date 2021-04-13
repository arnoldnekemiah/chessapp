/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  android.os.Bundle
 *  android.os.RemoteException
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.a7
 *  c.b.b.a.e.a.b5
 *  c.b.b.a.e.a.d7
 *  c.b.b.a.e.a.f7
 *  c.b.b.a.e.a.g7
 *  c.b.b.a.e.a.gb
 *  c.b.b.a.e.a.gg
 *  c.b.b.a.e.a.h7
 *  c.b.b.a.e.a.i7
 *  c.b.b.a.e.a.o6
 *  c.b.b.a.e.a.r6
 *  c.b.b.a.e.a.s6
 *  c.b.b.a.e.a.v6
 *  c.b.b.a.e.a.z6
 *  com.google.android.gms.ads.AdFormat
 *  com.google.android.gms.ads.AdSize
 *  com.google.android.gms.ads.mediation.MediationAdLoadCallback
 *  com.google.android.gms.ads.mediation.MediationBannerAdConfiguration
 *  com.google.android.gms.ads.mediation.MediationConfiguration
 *  com.google.android.gms.ads.mediation.MediationInterstitialAd
 *  com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration
 *  com.google.android.gms.ads.mediation.MediationNativeAdConfiguration
 *  com.google.android.gms.ads.mediation.MediationRewardedAd
 *  com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration
 *  com.google.android.gms.ads.mediation.VersionInfo
 *  com.google.android.gms.ads.mediation.rtb.RtbAdapter
 *  com.google.android.gms.ads.mediation.rtb.RtbSignalData
 *  com.google.android.gms.ads.mediation.rtb.SignalCallbacks
 *  com.google.android.gms.ads.mediation.zza
 *  com.google.android.gms.ads.zza
 *  com.google.android.gms.internal.ads.zzapy
 *  com.google.android.gms.internal.ads.zzvl
 *  com.google.android.gms.internal.ads.zzvs
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import c.b.b.a.c.b;
import c.b.b.a.e.a.a7;
import c.b.b.a.e.a.b5;
import c.b.b.a.e.a.d7;
import c.b.b.a.e.a.f7;
import c.b.b.a.e.a.g7;
import c.b.b.a.e.a.gb;
import c.b.b.a.e.a.gg;
import c.b.b.a.e.a.h7;
import c.b.b.a.e.a.i7;
import c.b.b.a.e.a.o6;
import c.b.b.a.e.a.r6;
import c.b.b.a.e.a.s6;
import c.b.b.a.e.a.v6;
import c.b.b.a.e.a.z6;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.internal.ads.zzapy;
import com.google.android.gms.internal.ads.zzvl;
import com.google.android.gms.internal.ads.zzvs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class e7
extends z6 {
    public final RtbAdapter a;
    public MediationInterstitialAd b;
    public MediationRewardedAd c;
    public String d = "";

    public e7(RtbAdapter rtbAdapter) {
        this.a = rtbAdapter;
    }

    public static boolean d(zzvl zzvl2) {
        return zzvl2.f || gb.a();
        {
        }
    }

    public static Bundle q(String string) {
        Bundle bundle;
        block4 : {
            String string2 = String.valueOf((Object)string);
            String string3 = string2.length() != 0 ? "Server parameters: ".concat(string2) : new String("Server parameters: ");
            a.i(string3);
            bundle = new Bundle();
            if (string == null) break block4;
            try {
                JSONObject jSONObject = new JSONObject(string);
                Bundle bundle2 = new Bundle();
                Iterator iterator = jSONObject.keys();
                while (iterator.hasNext()) {
                    String string4 = (String)iterator.next();
                    bundle2.putString(string4, jSONObject.getString(string4));
                }
                bundle = bundle2;
            }
            catch (JSONException jSONException) {
                a.a("", jSONException);
                RemoteException remoteException = new RemoteException();
                throw remoteException;
            }
        }
        return bundle;
    }

    public final zzapy B() {
        return zzapy.a((VersionInfo)this.a.getSDKVersionInfo());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(c.b.b.a.c.a a4, String string, Bundle bundle, Bundle bundle2, zzvs zzvs2, a7 a72) {
        try {
            AdFormat adFormat;
            i7 i72 = new i7(a72);
            RtbAdapter rtbAdapter = this.a;
            int n7 = -1;
            switch (string.hashCode()) {
                case 1911491517: {
                    if (!string.equals((Object)"rewarded_interstitial")) break;
                    n7 = 3;
                    break;
                }
                case 604727084: {
                    if (!string.equals((Object)"interstitial")) break;
                    n7 = 1;
                    break;
                }
                case -239580146: {
                    if (!string.equals((Object)"rewarded")) break;
                    n7 = 2;
                    break;
                }
                case -1052618729: {
                    if (!string.equals((Object)"native")) break;
                    n7 = 4;
                    break;
                }
                case -1396342996: {
                    if (!string.equals((Object)"banner")) break;
                    n7 = 0;
                    break;
                }
                default: {
                    break;
                }
            }
            if (n7 != 0) {
                if (n7 != 1) {
                    if (n7 != 2) {
                        if (n7 != 3) {
                            if (n7 != 4) {
                                throw new IllegalArgumentException("Internal Error");
                            }
                            adFormat = AdFormat.NATIVE;
                        } else {
                            adFormat = AdFormat.REWARDED_INTERSTITIAL;
                        }
                    } else {
                        adFormat = AdFormat.REWARDED;
                    }
                } else {
                    adFormat = AdFormat.INTERSTITIAL;
                }
            } else {
                adFormat = AdFormat.BANNER;
            }
            MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add((Object)mediationConfiguration);
            rtbAdapter.collectSignals(new RtbSignalData((Context)b.K(a4), (List)arrayList, bundle, com.google.android.gms.ads.zza.zza((int)zzvs2.e, (int)zzvs2.b, (String)zzvs2.a)), (SignalCallbacks)i72);
            return;
        }
        catch (Throwable throwable) {
            throw c.a.b.a.a.a("Error generating signals for RTB", throwable);
        }
    }

    public final void a(String string, String string2, zzvl zzvl2, c.b.b.a.c.a a4, o6 o62, b5 b52, zzvs zzvs2) {
        Bundle bundle;
        String string3;
        int n7;
        Location location;
        d7 d72;
        int n9;
        Context context;
        boolean bl;
        RtbAdapter rtbAdapter;
        Bundle bundle2;
        try {
            String string4;
            d72 = new d7(o62, b52);
            rtbAdapter = this.a;
            context = (Context)b.K(a4);
            bundle = e7.q(string2);
            bundle2 = this.c(zzvl2);
            bl = e7.d(zzvl2);
            location = zzvl2.k;
            n9 = zzvl2.g;
            n7 = zzvl2.t;
            string4 = zzvl2.u;
            try {
                string4 = new JSONObject(string2).getString("max_ad_content_rating");
            }
            catch (JSONException jSONException) {}
            string3 = string4;
        }
        catch (Throwable throwable) {
            throw c.a.b.a.a.a("Adapter failed to render banner ad.", throwable);
        }
        MediationBannerAdConfiguration mediationBannerAdConfiguration = new MediationBannerAdConfiguration(context, string, bundle, bundle2, bl, location, n9, n7, string3, com.google.android.gms.ads.zza.zza((int)zzvs2.e, (int)zzvs2.b, (String)zzvs2.a), this.d);
        rtbAdapter.loadBannerAd(mediationBannerAdConfiguration, (MediationAdLoadCallback)d72);
    }

    public final void a(String string, String string2, zzvl zzvl2, c.b.b.a.c.a a4, r6 r62, b5 b52) {
        Bundle bundle;
        String string3;
        Bundle bundle2;
        g7 g72;
        int n7;
        Context context;
        RtbAdapter rtbAdapter;
        int n9;
        Location location;
        boolean bl;
        try {
            String string4;
            g72 = new g7(this, r62, b52);
            rtbAdapter = this.a;
            context = (Context)b.K(a4);
            bundle2 = e7.q(string2);
            bundle = this.c(zzvl2);
            bl = e7.d(zzvl2);
            location = zzvl2.k;
            n7 = zzvl2.g;
            n9 = zzvl2.t;
            string4 = zzvl2.u;
            try {
                string4 = new JSONObject(string2).getString("max_ad_content_rating");
            }
            catch (JSONException jSONException) {}
            string3 = string4;
        }
        catch (Throwable throwable) {
            throw c.a.b.a.a.a("Adapter failed to render interstitial ad.", throwable);
        }
        MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration = new MediationInterstitialAdConfiguration(context, string, bundle2, bundle, bl, location, n7, n9, string3, this.d);
        rtbAdapter.loadInterstitialAd(mediationInterstitialAdConfiguration, (MediationAdLoadCallback)g72);
    }

    public final void a(String string, String string2, zzvl zzvl2, c.b.b.a.c.a a4, s6 s62, b5 b52) {
        Bundle bundle;
        String string3;
        Bundle bundle2;
        f7 f72;
        int n7;
        Context context;
        RtbAdapter rtbAdapter;
        int n9;
        Location location;
        boolean bl;
        try {
            String string4;
            f72 = new f7(s62, b52);
            rtbAdapter = this.a;
            context = (Context)b.K(a4);
            bundle2 = e7.q(string2);
            bundle = this.c(zzvl2);
            bl = e7.d(zzvl2);
            location = zzvl2.k;
            n7 = zzvl2.g;
            n9 = zzvl2.t;
            string4 = zzvl2.u;
            try {
                string4 = new JSONObject(string2).getString("max_ad_content_rating");
            }
            catch (JSONException jSONException) {}
            string3 = string4;
        }
        catch (Throwable throwable) {
            throw c.a.b.a.a.a("Adapter failed to render rewarded ad.", throwable);
        }
        MediationNativeAdConfiguration mediationNativeAdConfiguration = new MediationNativeAdConfiguration(context, string, bundle2, bundle, bl, location, n7, n9, string3, this.d);
        rtbAdapter.loadNativeAd(mediationNativeAdConfiguration, (MediationAdLoadCallback)f72);
    }

    public final void a(String string, String string2, zzvl zzvl2, c.b.b.a.c.a a4, v6 v62, b5 b52) {
        Bundle bundle;
        String string3;
        Bundle bundle2;
        int n7;
        Context context;
        RtbAdapter rtbAdapter;
        h7 h72;
        int n9;
        Location location;
        boolean bl;
        try {
            String string4;
            h72 = new h7(this, v62, b52);
            rtbAdapter = this.a;
            context = (Context)b.K(a4);
            bundle2 = e7.q(string2);
            bundle = this.c(zzvl2);
            bl = e7.d(zzvl2);
            location = zzvl2.k;
            n7 = zzvl2.g;
            n9 = zzvl2.t;
            string4 = zzvl2.u;
            try {
                string4 = new JSONObject(string2).getString("max_ad_content_rating");
            }
            catch (JSONException jSONException) {}
            string3 = string4;
        }
        catch (Throwable throwable) {
            throw c.a.b.a.a.a("Adapter failed to render rewarded interstitial ad.", throwable);
        }
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration = new MediationRewardedAdConfiguration(context, string, bundle2, bundle, bl, location, n7, n9, string3, this.d);
        rtbAdapter.loadRewardedInterstitialAd(mediationRewardedAdConfiguration, (MediationAdLoadCallback)h72);
    }

    public final void a(String[] arrstring, Bundle[] arrbundle) {
    }

    public final void b(String string) {
        this.d = string;
    }

    public final void b(String string, String string2, zzvl zzvl2, c.b.b.a.c.a a4, v6 v62, b5 b52) {
        Bundle bundle;
        String string3;
        Bundle bundle2;
        int n7;
        Context context;
        RtbAdapter rtbAdapter;
        h7 h72;
        int n9;
        Location location;
        boolean bl;
        try {
            String string4;
            h72 = new h7(this, v62, b52);
            rtbAdapter = this.a;
            context = (Context)b.K(a4);
            bundle2 = e7.q(string2);
            bundle = this.c(zzvl2);
            bl = e7.d(zzvl2);
            location = zzvl2.k;
            n7 = zzvl2.g;
            n9 = zzvl2.t;
            string4 = zzvl2.u;
            try {
                string4 = new JSONObject(string2).getString("max_ad_content_rating");
            }
            catch (JSONException jSONException) {}
            string3 = string4;
        }
        catch (Throwable throwable) {
            throw c.a.b.a.a.a("Adapter failed to render rewarded ad.", throwable);
        }
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration = new MediationRewardedAdConfiguration(context, string, bundle2, bundle, bl, location, n7, n9, string3, this.d);
        rtbAdapter.loadRewardedAd(mediationRewardedAdConfiguration, (MediationAdLoadCallback)h72);
    }

    public final Bundle c(zzvl zzvl2) {
        Bundle bundle;
        Bundle bundle2 = zzvl2.m;
        if (bundle2 != null && (bundle = bundle2.getBundle(this.a.getClass().getName())) != null) {
            return bundle;
        }
        return new Bundle();
    }

    public final gg getVideoController() {
        RtbAdapter rtbAdapter = this.a;
        if (!(rtbAdapter instanceof zza)) {
            return null;
        }
        try {
            gg gg2 = ((zza)rtbAdapter).getVideoController();
            return gg2;
        }
        catch (Throwable throwable) {
            a.a("", throwable);
            return null;
        }
    }

    public final void k(c.b.b.a.c.a a4) {
    }

    public final boolean o(c.b.b.a.c.a a4) {
        MediationInterstitialAd mediationInterstitialAd = this.b;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context)b.K(a4));
        }
        catch (Throwable throwable) {
            a.a("", throwable);
        }
        return true;
    }

    public final boolean w(c.b.b.a.c.a a4) {
        MediationRewardedAd mediationRewardedAd = this.c;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context)b.K(a4));
        }
        catch (Throwable throwable) {
            a.a("", throwable);
        }
        return true;
    }

    public final zzapy x() {
        return zzapy.a((VersionInfo)this.a.getVersionInfo());
    }
}

