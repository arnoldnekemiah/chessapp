/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  android.os.RemoteException
 *  android.view.View
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.b5
 *  c.b.b.a.e.a.c6
 *  c.b.b.a.e.a.f2
 *  c.b.b.a.e.a.gb
 *  c.b.b.a.e.a.gg
 *  c.b.b.a.e.a.i5
 *  c.b.b.a.e.a.j5
 *  c.b.b.a.e.a.o5
 *  c.b.b.a.e.a.s9
 *  c.b.b.a.e.a.y3
 *  c.b.b.a.e.a.z4
 *  com.google.ads.AdSize
 *  com.google.ads.mediation.MediationAdRequest
 *  com.google.ads.mediation.MediationAdapter
 *  com.google.ads.mediation.MediationBannerAdapter
 *  com.google.ads.mediation.MediationBannerListener
 *  com.google.ads.mediation.MediationInterstitialAdapter
 *  com.google.ads.mediation.MediationInterstitialListener
 *  com.google.ads.mediation.MediationServerParameters
 *  com.google.ads.mediation.NetworkExtras
 *  com.google.android.gms.ads.AdSize
 *  com.google.android.gms.ads.zza
 *  com.google.android.gms.internal.ads.zzaeh
 *  com.google.android.gms.internal.ads.zzajr
 *  com.google.android.gms.internal.ads.zzapy
 *  com.google.android.gms.internal.ads.zzvl
 *  com.google.android.gms.internal.ads.zzvs
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  org.json.JSONObject
 */
package c.b.b.a.e.a;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import c.b.b.a.c.a;
import c.b.b.a.c.b;
import c.b.b.a.e.a.b5;
import c.b.b.a.e.a.c6;
import c.b.b.a.e.a.f2;
import c.b.b.a.e.a.gb;
import c.b.b.a.e.a.gg;
import c.b.b.a.e.a.i5;
import c.b.b.a.e.a.j5;
import c.b.b.a.e.a.o5;
import c.b.b.a.e.a.s9;
import c.b.b.a.e.a.y3;
import c.b.b.a.e.a.z4;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.zza;
import com.google.android.gms.internal.ads.zzaeh;
import com.google.android.gms.internal.ads.zzajr;
import com.google.android.gms.internal.ads.zzapy;
import com.google.android.gms.internal.ads.zzvl;
import com.google.android.gms.internal.ads.zzvs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class z5<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters>
extends z4 {
    public final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> a;
    public final NETWORK_EXTRAS b;

    public z5(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter, NETWORK_EXTRAS NETWORK_EXTRAS) {
        this.a = mediationAdapter;
        this.b = NETWORK_EXTRAS;
    }

    public static boolean c(zzvl zzvl2) {
        return zzvl2.f || gb.a();
        {
        }
    }

    public final zzapy B() {
        return null;
    }

    public final j5 E() {
        return null;
    }

    public final o5 F0() {
        return null;
    }

    public final a K() {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.a;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String string = String.valueOf((Object)mediationAdapter.getClass().getCanonicalName());
            String string2 = string.length() != 0 ? "Not a MediationBannerAdapter: ".concat(string) : new String("Not a MediationBannerAdapter: ");
            a.c.a.a.i(string2);
            throw new RemoteException();
        }
        try {
            b<View> b6 = new b<View>(((MediationBannerAdapter)mediationAdapter).getBannerView());
            return b6;
        }
        catch (Throwable throwable) {
            throw c.a.b.a.a.a("", throwable);
        }
    }

    public final Bundle W0() {
        return new Bundle();
    }

    public final f2 Y() {
        return null;
    }

    public final void a(a a4, s9 s92, List<String> list) {
    }

    public final void a(a a4, y3 y32, List<zzajr> list) {
    }

    public final void a(a a4, zzvl zzvl2, String string, b5 b52) {
    }

    public final void a(a a4, zzvl zzvl2, String string, s9 s92, String string2) {
    }

    public final void a(a a4, zzvl zzvl2, String string, String string2, b5 b52) {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.a;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String string3 = String.valueOf((Object)mediationAdapter.getClass().getCanonicalName());
            String string4 = string3.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(string3) : new String("Not a MediationInterstitialAdapter: ");
            a.c.a.a.i(string4);
            throw new RemoteException();
        }
        a.c.a.a.g("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter)this.a).requestInterstitialAd((MediationInterstitialListener)new c6(b52), (Activity)b.K(a4), this.q(string), a.c.a.a.a(zzvl2, z5.c(zzvl2)), this.b);
            return;
        }
        catch (Throwable throwable) {
            throw c.a.b.a.a.a("", throwable);
        }
    }

    public final void a(a a4, zzvl zzvl2, String string, String string2, b5 b52, zzaeh zzaeh2, List<String> list) {
    }

    public final void a(a a4, zzvs zzvs2, zzvl zzvl2, String string, b5 b52) {
        this.a(a4, zzvs2, zzvl2, string, null, b52);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(a a4, zzvs zzvs2, zzvl zzvl2, String string, String string2, b5 b52) {
        AdSize[] arradSize;
        Activity activity;
        c6 c62;
        int n7;
        MediationBannerAdapter mediationBannerAdapter;
        SERVER_PARAMETERS SERVER_PARAMETERS;
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.a;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String string3 = String.valueOf((Object)mediationAdapter.getClass().getCanonicalName());
            String string4 = string3.length() != 0 ? "Not a MediationBannerAdapter: ".concat(string3) : new String("Not a MediationBannerAdapter: ");
            a.c.a.a.i(string4);
            throw new RemoteException();
        }
        a.c.a.a.g("Requesting banner ad from adapter.");
        try {
            mediationBannerAdapter = (MediationBannerAdapter)this.a;
            c62 = new c6(b52);
            activity = (Activity)b.K(a4);
            SERVER_PARAMETERS = this.q(string);
            arradSize = new AdSize[6];
            AdSize adSize = AdSize.SMART_BANNER;
            n7 = 0;
            arradSize[0] = adSize;
            arradSize[1] = AdSize.BANNER;
            arradSize[2] = AdSize.IAB_MRECT;
            arradSize[3] = AdSize.IAB_BANNER;
            arradSize[4] = AdSize.IAB_LEADERBOARD;
            arradSize[5] = AdSize.IAB_WIDE_SKYSCRAPER;
        }
        catch (Throwable throwable) {
            RemoteException remoteException = c.a.b.a.a.a("", throwable);
            throw remoteException;
        }
        do {
            block5 : {
                AdSize adSize;
                block6 : {
                    block4 : {
                        if (n7 >= 6) break block4;
                        if (arradSize[n7].getWidth() != zzvs2.e || arradSize[n7].getHeight() != zzvs2.b) break block5;
                        adSize = arradSize[n7];
                        break block6;
                    }
                    adSize = new AdSize(zza.zza((int)zzvs2.e, (int)zzvs2.b, (String)zzvs2.a));
                }
                mediationBannerAdapter.requestBannerAd((MediationBannerListener)c62, activity, SERVER_PARAMETERS, adSize, a.c.a.a.a(zzvl2, z5.c(zzvl2)), this.b);
                return;
            }
            ++n7;
        } while (true);
    }

    public final void a(zzvl zzvl2, String string) {
    }

    public final void a(zzvl zzvl2, String string, String string2) {
    }

    public final void b(a a4, zzvl zzvl2, String string, b5 b52) {
    }

    public final void c(a a4, zzvl zzvl2, String string, b5 b52) {
        this.a(a4, zzvl2, string, null, b52);
    }

    public final void destroy() {
        try {
            this.a.destroy();
            return;
        }
        catch (Throwable throwable) {
            throw c.a.b.a.a.a("", throwable);
        }
    }

    public final Bundle getInterstitialAdapterInfo() {
        return new Bundle();
    }

    public final gg getVideoController() {
        return null;
    }

    public final void h(a a4) {
    }

    public final boolean isInitialized() {
        return true;
    }

    public final boolean l0() {
        return false;
    }

    public final void pause() {
        throw new RemoteException();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final SERVER_PARAMETERS q(String var1_1) {
        if (var1_1 == null) ** GOTO lbl11
        try {
            block3 : {
                var7_2 = new JSONObject(var1_1);
                var2_3 = new HashMap(var7_2.length());
                var8_4 = var7_2.keys();
                while (var8_4.hasNext()) {
                    var9_5 = (String)var8_4.next();
                    var2_3.put((Object)var9_5, (Object)var7_2.getString(var9_5));
                }
                break block3;
lbl11: // 1 sources:
                var2_3 = new HashMap(0);
            }
            var5_6 = this.a.getServerParametersType();
            var6_7 = null;
            if (var5_6 == null) return (SERVER_PARAMETERS)var6_7;
            var6_7 = (MediationServerParameters)var5_6.newInstance();
            var6_7.load((Map)var2_3);
        }
        catch (Throwable var3_8) {
            var4_9 = c.a.b.a.a.a("", var3_8);
            throw var4_9;
        }
        return (SERVER_PARAMETERS)var6_7;
    }

    public final void resume() {
        throw new RemoteException();
    }

    public final i5 s0() {
        return null;
    }

    public final void setImmersiveMode(boolean bl) {
    }

    public final void showInterstitial() {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.a;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String string = String.valueOf((Object)mediationAdapter.getClass().getCanonicalName());
            String string2 = string.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(string) : new String("Not a MediationInterstitialAdapter: ");
            a.c.a.a.i(string2);
            throw new RemoteException();
        }
        a.c.a.a.g("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter)this.a).showInterstitial();
            return;
        }
        catch (Throwable throwable) {
            throw c.a.b.a.a.a("", throwable);
        }
    }

    public final void showVideo() {
    }

    public final void u(a a4) {
    }

    public final zzapy x() {
        return null;
    }

    public final Bundle zzux() {
        return new Bundle();
    }
}

