/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  android.os.Bundle
 *  android.os.RemoteException
 *  android.view.View
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.b5
 *  c.b.b.a.e.a.f2
 *  c.b.b.a.e.a.g2
 *  c.b.b.a.e.a.gb
 *  c.b.b.a.e.a.gg
 *  c.b.b.a.e.a.i5
 *  c.b.b.a.e.a.j5
 *  c.b.b.a.e.a.o5
 *  c.b.b.a.e.a.s5
 *  c.b.b.a.e.a.s9
 *  c.b.b.a.e.a.t5
 *  c.b.b.a.e.a.t9
 *  c.b.b.a.e.a.u5
 *  c.b.b.a.e.a.w5
 *  c.b.b.a.e.a.y3
 *  c.b.b.a.e.a.z4
 *  com.google.ads.mediation.admob.AdMobAdapter
 *  com.google.android.gms.ads.AdFormat
 *  com.google.android.gms.ads.formats.NativeCustomTemplateAd
 *  com.google.android.gms.ads.mediation.Adapter
 *  com.google.android.gms.ads.mediation.InitializationCompleteCallback
 *  com.google.android.gms.ads.mediation.MediationAdLoadCallback
 *  com.google.android.gms.ads.mediation.MediationAdRequest
 *  com.google.android.gms.ads.mediation.MediationAdapter
 *  com.google.android.gms.ads.mediation.MediationBannerAdapter
 *  com.google.android.gms.ads.mediation.MediationConfiguration
 *  com.google.android.gms.ads.mediation.MediationInterstitialAdapter
 *  com.google.android.gms.ads.mediation.MediationInterstitialListener
 *  com.google.android.gms.ads.mediation.MediationNativeAdapter
 *  com.google.android.gms.ads.mediation.MediationNativeListener
 *  com.google.android.gms.ads.mediation.MediationRewardedAd
 *  com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration
 *  com.google.android.gms.ads.mediation.NativeAdMapper
 *  com.google.android.gms.ads.mediation.NativeAppInstallAdMapper
 *  com.google.android.gms.ads.mediation.NativeContentAdMapper
 *  com.google.android.gms.ads.mediation.NativeMediationAdRequest
 *  com.google.android.gms.ads.mediation.OnContextChangedListener
 *  com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener
 *  com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
 *  com.google.android.gms.ads.mediation.VersionInfo
 *  com.google.android.gms.ads.mediation.zza
 *  com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter
 *  com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
 *  com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
 *  com.google.android.gms.internal.ads.zzaeh
 *  com.google.android.gms.internal.ads.zzajr
 *  com.google.android.gms.internal.ads.zzapy
 *  com.google.android.gms.internal.ads.zzbfz
 *  com.google.android.gms.internal.ads.zzbga
 *  com.google.android.gms.internal.ads.zzvl
 *  com.google.android.gms.internal.ads.zzvs
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Date
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package c.b.b.a.e.a;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import c.b.b.a.c.a;
import c.b.b.a.c.b;
import c.b.b.a.e.a.a6;
import c.b.b.a.e.a.b5;
import c.b.b.a.e.a.f2;
import c.b.b.a.e.a.g2;
import c.b.b.a.e.a.gb;
import c.b.b.a.e.a.gg;
import c.b.b.a.e.a.i5;
import c.b.b.a.e.a.j5;
import c.b.b.a.e.a.o5;
import c.b.b.a.e.a.p6;
import c.b.b.a.e.a.s5;
import c.b.b.a.e.a.s9;
import c.b.b.a.e.a.t5;
import c.b.b.a.e.a.t9;
import c.b.b.a.e.a.u5;
import c.b.b.a.e.a.v5;
import c.b.b.a.e.a.w5;
import c.b.b.a.e.a.x5;
import c.b.b.a.e.a.y3;
import c.b.b.a.e.a.y5;
import c.b.b.a.e.a.z4;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.internal.ads.zzaeh;
import com.google.android.gms.internal.ads.zzajr;
import com.google.android.gms.internal.ads.zzapy;
import com.google.android.gms.internal.ads.zzbfz;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzvl;
import com.google.android.gms.internal.ads.zzvs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class r5
extends z4 {
    public final Object a;
    public w5 b;
    public s9 c;
    public a d;
    public MediationRewardedAd e;

    public r5(Adapter adapter) {
        this.a = adapter;
    }

    public r5(MediationAdapter mediationAdapter) {
        this.a = mediationAdapter;
    }

    public static boolean d(zzvl zzvl2) {
        return zzvl2.f || gb.a();
        {
        }
    }

    public final zzapy B() {
        Object object = this.a;
        if (!(object instanceof Adapter)) {
            return null;
        }
        return zzapy.a((VersionInfo)((Adapter)object).getSDKVersionInfo());
    }

    public final j5 E() {
        NativeAdMapper nativeAdMapper = this.b.b;
        if (nativeAdMapper instanceof NativeContentAdMapper) {
            return new x5((NativeContentAdMapper)nativeAdMapper);
        }
        return null;
    }

    public final o5 F0() {
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.b.c;
        if (unifiedNativeAdMapper != null) {
            return new p6(unifiedNativeAdMapper);
        }
        return null;
    }

    public final a K() {
        Object object = this.a;
        if (object instanceof MediationBannerAdapter) {
            try {
                b<View> b6 = new b<View>(((MediationBannerAdapter)object).getBannerView());
                return b6;
            }
            catch (Throwable throwable) {
                throw c.a.b.a.a.a("", throwable);
            }
        }
        String string = MediationBannerAdapter.class.getCanonicalName();
        String string2 = this.a.getClass().getCanonicalName();
        StringBuilder stringBuilder = new StringBuilder(c.a.b.a.a.a(string2, c.a.b.a.a.a(string, 22)));
        stringBuilder.append(string);
        stringBuilder.append(" #009 Class mismatch: ");
        stringBuilder.append(string2);
        a.c.a.a.i(stringBuilder.toString());
        throw new RemoteException();
    }

    public final Bundle W0() {
        return new Bundle();
    }

    public final f2 Y() {
        NativeCustomTemplateAd nativeCustomTemplateAd = this.b.d;
        if (nativeCustomTemplateAd instanceof g2) {
            return ((g2)nativeCustomTemplateAd).a;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Bundle a(String string, zzvl zzvl2, String string2) {
        Bundle bundle;
        block5 : {
            Bundle bundle2;
            String string3 = String.valueOf((Object)string);
            String string4 = string3.length() != 0 ? "Server parameters: ".concat(string3) : new String("Server parameters: ");
            a.c.a.a.g(string4);
            try {
                bundle = new Bundle();
                if (string == null) break block5;
                JSONObject jSONObject = new JSONObject(string);
                bundle2 = new Bundle();
                Iterator iterator = jSONObject.keys();
                while (iterator.hasNext()) {
                    String string5 = (String)iterator.next();
                    bundle2.putString(string5, jSONObject.getString(string5));
                }
            }
            catch (Throwable throwable) {
                RemoteException remoteException = c.a.b.a.a.a("", throwable);
                throw remoteException;
            }
            bundle = bundle2;
        }
        if (this.a instanceof AdMobAdapter) {
            bundle.putString("adJson", string2);
            if (zzvl2 != null) {
                bundle.putInt("tagForChildDirectedTreatment", zzvl2.g);
            }
        }
        bundle.remove("max_ad_content_rating");
        return bundle;
    }

    public final void a(a a4, s9 s92, List<String> list) {
        RemoteException remoteException;
        if (this.a instanceof InitializableMediationRewardedVideoAdAdapter) {
            a.c.a.a.g("Initialize rewarded video adapter.");
            try {
                InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter)this.a;
                ArrayList arrayList = new ArrayList();
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    arrayList.add((Object)this.a((String)iterator.next(), null, null));
                }
                initializableMediationRewardedVideoAdAdapter.initialize((Context)b.K(a4), (MediationRewardedVideoAdListener)new t9(s92), (List)arrayList);
                return;
            }
            catch (Throwable throwable) {
                a.c.a.a.b("Could not initialize rewarded video adapter.", throwable);
                throw new RemoteException();
            }
        }
        String string = InitializableMediationRewardedVideoAdAdapter.class.getCanonicalName();
        String string2 = this.a.getClass().getCanonicalName();
        StringBuilder stringBuilder = new StringBuilder(c.a.b.a.a.a(string2, c.a.b.a.a.a(string, 22)));
        stringBuilder.append(string);
        stringBuilder.append(" #009 Class mismatch: ");
        stringBuilder.append(string2);
        a.c.a.a.i(stringBuilder.toString());
        remoteException = new RemoteException();
        throw remoteException;
    }

    public final void a(a a4, y3 y32, List<zzajr> list) {
        RemoteException remoteException;
        if (this.a instanceof Adapter) {
            u5 u52 = new u5(y32);
            ArrayList arrayList = new ArrayList();
            for (zzajr zzajr2 : list) {
                String string = zzajr2.a;
                int n7 = -1;
                switch (string.hashCode()) {
                    default: {
                        break;
                    }
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
                    }
                }
                Object object = n7 != 0 ? (n7 != 1 ? (n7 != 2 ? (n7 != 3 ? (n7 != 4 ? null : AdFormat.NATIVE) : AdFormat.REWARDED_INTERSTITIAL) : AdFormat.REWARDED) : AdFormat.INTERSTITIAL) : AdFormat.BANNER;
                if (object == null) continue;
                arrayList.add((Object)new MediationConfiguration(object, zzajr2.b));
            }
            ((Adapter)this.a).initialize((Context)b.K(a4), (InitializationCompleteCallback)u52, (List)arrayList);
            return;
        }
        remoteException = new RemoteException();
        throw remoteException;
    }

    public final void a(a a4, zzvl zzvl2, String string, b5 b52) {
        if (this.a instanceof Adapter) {
            String string2;
            t5 t52;
            Bundle bundle;
            Location location;
            Adapter adapter;
            Bundle bundle2;
            boolean bl;
            int n7;
            int n9;
            Context context;
            a.c.a.a.g("Requesting rewarded ad from adapter.");
            try {
                String string3;
                adapter = (Adapter)this.a;
                t52 = new t5(this, b52);
                context = (Context)b.K(a4);
                bundle2 = this.a(string, zzvl2, null);
                bundle = this.c(zzvl2);
                bl = r5.d(zzvl2);
                location = zzvl2.k;
                n7 = zzvl2.g;
                n9 = zzvl2.t;
                string3 = zzvl2.u;
                try {
                    string3 = new JSONObject(string).getString("max_ad_content_rating");
                }
                catch (JSONException jSONException) {}
                string2 = string3;
            }
            catch (Exception exception) {
                a.c.a.a.a("", exception);
                throw new RemoteException();
            }
            MediationRewardedAdConfiguration mediationRewardedAdConfiguration = new MediationRewardedAdConfiguration(context, "", bundle2, bundle, bl, location, n7, n9, string2, "");
            adapter.loadRewardedAd(mediationRewardedAdConfiguration, (MediationAdLoadCallback)t52);
            return;
        }
        String string4 = Adapter.class.getCanonicalName();
        String string5 = this.a.getClass().getCanonicalName();
        StringBuilder stringBuilder = new StringBuilder(c.a.b.a.a.a(string5, c.a.b.a.a.a(string4, 22)));
        stringBuilder.append(string4);
        stringBuilder.append(" #009 Class mismatch: ");
        stringBuilder.append(string5);
        a.c.a.a.i(stringBuilder.toString());
        throw new RemoteException();
    }

    /*
     * Exception decompiling
     */
    public final void a(a var1, zzvl var2, String var3, s9 var4, String var5) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl81 : ALOAD : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(a a4, zzvl zzvl2, String string, String string2, b5 b52) {
        s5 s52;
        MediationInterstitialAdapter mediationInterstitialAdapter;
        Bundle bundle;
        if (!(this.a instanceof MediationInterstitialAdapter)) {
            String string3 = MediationInterstitialAdapter.class.getCanonicalName();
            String string4 = this.a.getClass().getCanonicalName();
            StringBuilder stringBuilder = new StringBuilder(c.a.b.a.a.a(string4, c.a.b.a.a.a(string3, 22)));
            stringBuilder.append(string3);
            stringBuilder.append(" #009 Class mismatch: ");
            stringBuilder.append(string4);
            a.c.a.a.i(stringBuilder.toString());
            RemoteException remoteException = new RemoteException();
            throw remoteException;
        }
        a.c.a.a.g("Requesting interstitial ad from adapter.");
        try {
            boolean bl;
            Location location;
            HashSet hashSet;
            int n7;
            int n9;
            boolean bl2;
            Date date;
            String string5;
            int n10;
            mediationInterstitialAdapter = (MediationInterstitialAdapter)this.a;
            HashSet hashSet2 = zzvl2.e != null ? new HashSet((Collection)zzvl2.e) : null;
            hashSet = hashSet2;
            Date date2 = zzvl2.b == -1L ? null : new Date(zzvl2.b);
            date = date2;
            n7 = zzvl2.d;
            location = zzvl2.k;
            bl2 = r5.d(zzvl2);
            n9 = zzvl2.g;
            bl = zzvl2.r;
            n10 = zzvl2.t;
            string5 = zzvl2.u;
            try {
                string5 = new JSONObject(string).getString("max_ad_content_rating");
            }
            catch (JSONException jSONException) {}
            String string6 = string5;
            s52 = new s5(date, n7, (Set)hashSet, location, bl2, n9, bl, n10, string6);
            bundle = zzvl2.m != null ? zzvl2.m.getBundle(mediationInterstitialAdapter.getClass().getName()) : null;
        }
        catch (Throwable throwable) {
            throw c.a.b.a.a.a("", throwable);
        }
        Bundle bundle2 = bundle;
        mediationInterstitialAdapter.requestInterstitialAd((Context)b.K(a4), (MediationInterstitialListener)new w5(b52), this.a(string, zzvl2, string2), (MediationAdRequest)s52, bundle2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(a a4, zzvl zzvl2, String string, String string2, b5 b52, zzaeh zzaeh2, List<String> list) {
        Bundle bundle;
        MediationNativeAdapter mediationNativeAdapter;
        a6 a62;
        Object object = this.a;
        if (!(object instanceof MediationNativeAdapter)) {
            String string3 = MediationNativeAdapter.class.getCanonicalName();
            String string4 = this.a.getClass().getCanonicalName();
            StringBuilder stringBuilder = new StringBuilder(c.a.b.a.a.a(string4, c.a.b.a.a.a(string3, 22)));
            stringBuilder.append(string3);
            stringBuilder.append(" #009 Class mismatch: ");
            stringBuilder.append(string4);
            a.c.a.a.i(stringBuilder.toString());
            RemoteException remoteException = new RemoteException();
            throw remoteException;
        }
        try {
            boolean bl;
            Date date;
            String string5;
            Location location;
            int n7;
            int n9;
            boolean bl2;
            int n10;
            HashSet hashSet;
            mediationNativeAdapter = (MediationNativeAdapter)object;
            HashSet hashSet2 = zzvl2.e != null ? new HashSet((Collection)zzvl2.e) : null;
            hashSet = hashSet2;
            Date date2 = zzvl2.b == -1L ? null : new Date(zzvl2.b);
            date = date2;
            n7 = zzvl2.d;
            location = zzvl2.k;
            bl = r5.d(zzvl2);
            n10 = zzvl2.g;
            bl2 = zzvl2.r;
            n9 = zzvl2.t;
            string5 = zzvl2.u;
            try {
                string5 = new JSONObject(string).getString("max_ad_content_rating");
            }
            catch (JSONException jSONException) {}
            String string6 = string5;
            a62 = new a6(date, n7, (Set<String>)hashSet, location, bl, n10, zzaeh2, list, bl2, n9, string6);
            bundle = zzvl2.m != null ? zzvl2.m.getBundle(mediationNativeAdapter.getClass().getName()) : null;
        }
        catch (Throwable throwable) {
            throw c.a.b.a.a.a("", throwable);
        }
        this.b = new w5(b52);
        mediationNativeAdapter.requestNativeAd((Context)b.K(a4), (MediationNativeListener)this.b, this.a(string, zzvl2, string2), (NativeMediationAdRequest)a62, bundle);
    }

    public final void a(a a4, zzvs zzvs2, zzvl zzvl2, String string, b5 b52) {
        this.a(a4, zzvs2, zzvl2, string, null, b52);
    }

    /*
     * Exception decompiling
     */
    public final void a(a var1, zzvs var2, zzvl var3, String var4, String var5, b5 var6) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl77 : ALOAD : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public final void a(zzvl zzvl2, String string) {
        this.a(zzvl2, string, null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void a(zzvl var1_1, String var2_2, String var3_3) {
        var4_4 = this.a;
        if (!(var4_4 instanceof MediationRewardedVideoAdAdapter)) ** GOTO lbl10
        a.c.a.a.g("Requesting rewarded video ad from adapter.");
        try {
            block7 : {
                var16_5 = (MediationRewardedVideoAdAdapter)this.a;
                var17_6 = var1_1.e != null ? new HashSet((Collection)var1_1.e) : null;
                var18_7 = var17_6;
                var19_8 = var1_1.b == -1L ? null : new Date(var1_1.b);
                break block7;
lbl10: // 1 sources:
                if (var4_4 instanceof Adapter) {
                    this.a(this.d, var1_1, var2_2, (b5)new v5((Adapter)var4_4, this.c));
                    return;
                }
                var5_21 = MediationRewardedVideoAdAdapter.class.getCanonicalName();
                var6_22 = Adapter.class.getCanonicalName();
                var7_23 = this.a.getClass().getCanonicalName();
                var8_24 = new StringBuilder(c.a.b.a.a.a(var7_23, c.a.b.a.a.a(var6_22, c.a.b.a.a.a(var5_21, 26))));
                var8_24.append(var5_21);
                var8_24.append(" or ");
                var8_24.append(var6_22);
                var8_24.append(" #009 Class mismatch: ");
                var8_24.append(var7_23);
                a.c.a.a.i(var8_24.toString());
                var14_25 = new RemoteException();
                throw var14_25;
            }
            var20_9 = var19_8;
            var21_10 = var1_1.d;
            var22_11 = var1_1.k;
            var23_12 = r5.d(var1_1);
            var24_13 = var1_1.g;
            var25_14 = var1_1.r;
            var26_15 = var1_1.t;
            var27_16 = var1_1.u;
            try {
                var27_16 = new JSONObject(var2_2).getString("max_ad_content_rating");
            }
            catch (JSONException v0) {}
            var29_17 = var27_16;
            var30_18 = new s5(var20_9, var21_10, (Set)var18_7, var22_11, var23_12, var24_13, var25_14, var26_15, var29_17);
            var31_19 = var1_1.m != null ? var1_1.m.getBundle(var16_5.getClass().getName()) : null;
        }
        catch (Throwable var15_20) {
            throw c.a.b.a.a.a("", var15_20);
        }
        var16_5.loadAd((MediationAdRequest)var30_18, this.a(var2_2, var1_1, var3_3), var31_19);
    }

    public final void b(a a4, zzvl zzvl2, String string, b5 b52) {
        if (this.a instanceof Adapter) {
            String string2;
            t5 t52;
            Bundle bundle;
            Location location;
            Adapter adapter;
            Bundle bundle2;
            boolean bl;
            int n7;
            int n9;
            Context context;
            a.c.a.a.g("Requesting rewarded interstitial ad from adapter.");
            try {
                String string3;
                adapter = (Adapter)this.a;
                t52 = new t5(this, b52);
                context = (Context)b.K(a4);
                bundle2 = this.a(string, zzvl2, null);
                bundle = this.c(zzvl2);
                bl = r5.d(zzvl2);
                location = zzvl2.k;
                n7 = zzvl2.g;
                n9 = zzvl2.t;
                string3 = zzvl2.u;
                try {
                    string3 = new JSONObject(string).getString("max_ad_content_rating");
                }
                catch (JSONException jSONException) {}
                string2 = string3;
            }
            catch (Exception exception) {
                a.c.a.a.a("", exception);
                throw new RemoteException();
            }
            MediationRewardedAdConfiguration mediationRewardedAdConfiguration = new MediationRewardedAdConfiguration(context, "", bundle2, bundle, bl, location, n7, n9, string2, "");
            adapter.loadRewardedInterstitialAd(mediationRewardedAdConfiguration, (MediationAdLoadCallback)t52);
            return;
        }
        String string4 = Adapter.class.getCanonicalName();
        String string5 = this.a.getClass().getCanonicalName();
        StringBuilder stringBuilder = new StringBuilder(c.a.b.a.a.a(string5, c.a.b.a.a.a(string4, 22)));
        stringBuilder.append(string4);
        stringBuilder.append(" #009 Class mismatch: ");
        stringBuilder.append(string5);
        a.c.a.a.i(stringBuilder.toString());
        throw new RemoteException();
    }

    public final Bundle c(zzvl zzvl2) {
        Bundle bundle;
        Bundle bundle2 = zzvl2.m;
        if (bundle2 != null && (bundle = bundle2.getBundle(this.a.getClass().getName())) != null) {
            return bundle;
        }
        return new Bundle();
    }

    public final void c(a a4, zzvl zzvl2, String string, b5 b52) {
        this.a(a4, zzvl2, string, null, b52);
    }

    public final void destroy() {
        Object object = this.a;
        if (!(object instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter)object).onDestroy();
            return;
        }
        catch (Throwable throwable) {
            throw c.a.b.a.a.a("", throwable);
        }
    }

    public final Bundle getInterstitialAdapterInfo() {
        Object object = this.a;
        if (!(object instanceof zzbga)) {
            String string = zzbga.class.getCanonicalName();
            String string2 = this.a.getClass().getCanonicalName();
            StringBuilder stringBuilder = new StringBuilder(c.a.b.a.a.a(string2, c.a.b.a.a.a(string, 22)));
            stringBuilder.append(string);
            stringBuilder.append(" #009 Class mismatch: ");
            stringBuilder.append(string2);
            a.c.a.a.i(stringBuilder.toString());
            return new Bundle();
        }
        return ((zzbga)object).getInterstitialAdapterInfo();
    }

    public final gg getVideoController() {
        Object object = this.a;
        if (!(object instanceof zza)) {
            return null;
        }
        try {
            gg gg2 = ((zza)object).getVideoController();
            return gg2;
        }
        catch (Throwable throwable) {
            a.c.a.a.a("", throwable);
            return null;
        }
    }

    public final void h(a a4) {
        Context context = (Context)b.K(a4);
        Object object = this.a;
        if (object instanceof OnContextChangedListener) {
            ((OnContextChangedListener)object).onContextChanged(context);
        }
    }

    public final boolean isInitialized() {
        Object object = this.a;
        if (object instanceof MediationRewardedVideoAdAdapter) {
            a.c.a.a.g("Check if adapter is initialized.");
            try {
                boolean bl = ((MediationRewardedVideoAdAdapter)this.a).isInitialized();
                return bl;
            }
            catch (Throwable throwable) {
                throw c.a.b.a.a.a("", throwable);
            }
        }
        if (object instanceof Adapter) {
            return this.c != null;
        }
        String string = MediationRewardedVideoAdAdapter.class.getCanonicalName();
        String string2 = Adapter.class.getCanonicalName();
        String string3 = this.a.getClass().getCanonicalName();
        StringBuilder stringBuilder = new StringBuilder(c.a.b.a.a.a(string3, c.a.b.a.a.a(string2, c.a.b.a.a.a(string, 26))));
        stringBuilder.append(string);
        stringBuilder.append(" or ");
        stringBuilder.append(string2);
        stringBuilder.append(" #009 Class mismatch: ");
        stringBuilder.append(string3);
        a.c.a.a.i(stringBuilder.toString());
        throw new RemoteException();
    }

    public final boolean l0() {
        return this.a instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    public final void pause() {
        Object object = this.a;
        if (!(object instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter)object).onPause();
            return;
        }
        catch (Throwable throwable) {
            throw c.a.b.a.a.a("", throwable);
        }
    }

    public final void resume() {
        Object object = this.a;
        if (!(object instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter)object).onResume();
            return;
        }
        catch (Throwable throwable) {
            throw c.a.b.a.a.a("", throwable);
        }
    }

    public final i5 s0() {
        NativeAdMapper nativeAdMapper = this.b.b;
        if (nativeAdMapper instanceof NativeAppInstallAdMapper) {
            return new y5((NativeAppInstallAdMapper)nativeAdMapper);
        }
        return null;
    }

    public final void setImmersiveMode(boolean bl) {
        Object object = this.a;
        if (!(object instanceof OnImmersiveModeUpdatedListener)) {
            String string = OnImmersiveModeUpdatedListener.class.getCanonicalName();
            String string2 = this.a.getClass().getCanonicalName();
            StringBuilder stringBuilder = new StringBuilder(c.a.b.a.a.a(string2, c.a.b.a.a.a(string, 22)));
            stringBuilder.append(string);
            stringBuilder.append(" #009 Class mismatch: ");
            stringBuilder.append(string2);
            a.c.a.a.g(stringBuilder.toString());
            return;
        }
        try {
            ((OnImmersiveModeUpdatedListener)object).onImmersiveModeUpdated(bl);
            return;
        }
        catch (Throwable throwable) {
            a.c.a.a.a("", throwable);
            return;
        }
    }

    public final void showInterstitial() {
        if (this.a instanceof MediationInterstitialAdapter) {
            a.c.a.a.g("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter)this.a).showInterstitial();
                return;
            }
            catch (Throwable throwable) {
                throw c.a.b.a.a.a("", throwable);
            }
        }
        String string = MediationInterstitialAdapter.class.getCanonicalName();
        String string2 = this.a.getClass().getCanonicalName();
        StringBuilder stringBuilder = new StringBuilder(c.a.b.a.a.a(string2, c.a.b.a.a.a(string, 22)));
        stringBuilder.append(string);
        stringBuilder.append(" #009 Class mismatch: ");
        stringBuilder.append(string2);
        a.c.a.a.i(stringBuilder.toString());
        throw new RemoteException();
    }

    public final void showVideo() {
        Object object = this.a;
        if (object instanceof MediationRewardedVideoAdAdapter) {
            a.c.a.a.g("Show rewarded video ad from adapter.");
            try {
                ((MediationRewardedVideoAdAdapter)this.a).showVideo();
                return;
            }
            catch (Throwable throwable) {
                throw c.a.b.a.a.a("", throwable);
            }
        }
        if (object instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.e;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context)b.K(this.d));
                return;
            }
            a.c.a.a.h("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        String string = MediationRewardedVideoAdAdapter.class.getCanonicalName();
        String string2 = Adapter.class.getCanonicalName();
        String string3 = this.a.getClass().getCanonicalName();
        StringBuilder stringBuilder = new StringBuilder(c.a.b.a.a.a(string3, c.a.b.a.a.a(string2, c.a.b.a.a.a(string, 26))));
        stringBuilder.append(string);
        stringBuilder.append(" or ");
        stringBuilder.append(string2);
        stringBuilder.append(" #009 Class mismatch: ");
        stringBuilder.append(string3);
        a.c.a.a.i(stringBuilder.toString());
        throw new RemoteException();
    }

    public final void u(a a4) {
        if (this.a instanceof Adapter) {
            a.c.a.a.g("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.e;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context)b.K(a4));
                return;
            }
            a.c.a.a.h("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        String string = Adapter.class.getCanonicalName();
        String string2 = this.a.getClass().getCanonicalName();
        StringBuilder stringBuilder = new StringBuilder(c.a.b.a.a.a(string2, c.a.b.a.a.a(string, 22)));
        stringBuilder.append(string);
        stringBuilder.append(" #009 Class mismatch: ");
        stringBuilder.append(string2);
        a.c.a.a.i(stringBuilder.toString());
        throw new RemoteException();
    }

    public final zzapy x() {
        Object object = this.a;
        if (!(object instanceof Adapter)) {
            return null;
        }
        return zzapy.a((VersionInfo)((Adapter)object).getVersionInfo());
    }

    public final Bundle zzux() {
        Object object = this.a;
        if (!(object instanceof zzbfz)) {
            String string = zzbfz.class.getCanonicalName();
            String string2 = this.a.getClass().getCanonicalName();
            StringBuilder stringBuilder = new StringBuilder(c.a.b.a.a.a(string2, c.a.b.a.a.a(string, 22)));
            stringBuilder.append(string);
            stringBuilder.append(" #009 Class mismatch: ");
            stringBuilder.append(string2);
            a.c.a.a.i(stringBuilder.toString());
            return new Bundle();
        }
        return ((zzbfz)object).zzux();
    }
}

