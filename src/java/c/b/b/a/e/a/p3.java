/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.RemoteException
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.cf
 *  c.b.b.a.e.a.gb
 *  c.b.b.a.e.a.he
 *  c.b.b.a.e.a.o3
 *  c.b.b.a.e.a.u2
 *  c.b.b.a.e.a.ve
 *  com.google.android.gms.ads.AdListener
 *  com.google.android.gms.ads.admanager.AdManagerAdView
 *  com.google.android.gms.ads.admanager.AppEventListener
 *  com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener
 *  java.lang.Runnable
 */
package c.b.b.a.e.a;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import c.b.b.a.c.a;
import c.b.b.a.c.b;
import c.b.b.a.e.a.ad;
import c.b.b.a.e.a.cf;
import c.b.b.a.e.a.gb;
import c.b.b.a.e.a.hc;
import c.b.b.a.e.a.he;
import c.b.b.a.e.a.o3;
import c.b.b.a.e.a.u2;
import c.b.b.a.e.a.ve;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;

public final class p3
extends u2 {
    public final OnAdManagerAdViewLoadedListener a;

    public p3(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.a = onAdManagerAdViewLoadedListener;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(ve ve2, a a4) {
        if (ve2 != null) {
            if (a4 == null) {
                return;
            }
            AdManagerAdView adManagerAdView = new AdManagerAdView((Context)b.K(a4));
            try {
                if (ve2.N() instanceof ad) {
                    ad ad2 = (ad)ve2.N();
                    AdListener adListener = ad2 != null ? ad2.a : null;
                    adManagerAdView.setAdListener(adListener);
                }
            }
            catch (RemoteException remoteException) {
                a.c.a.a.a("", remoteException);
            }
            try {
                if (ve2.x0() instanceof hc) {
                    hc hc2 = (hc)ve2.x0();
                    AppEventListener appEventListener = null;
                    if (hc2 != null) {
                        appEventListener = hc2.a;
                    }
                    adManagerAdView.setAppEventListener(appEventListener);
                }
            }
            catch (RemoteException remoteException) {
                a.c.a.a.a("", remoteException);
            }
            gb.a.post((Runnable)new o3(this, adManagerAdView, ve2));
        }
    }
}

