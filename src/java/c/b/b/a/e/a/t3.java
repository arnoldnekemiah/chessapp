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
 *  c.b.b.a.e.a.s3
 *  c.b.b.a.e.a.u2
 *  c.b.b.a.e.a.ve
 *  com.google.android.gms.ads.AdListener
 *  com.google.android.gms.ads.doubleclick.AppEventListener
 *  com.google.android.gms.ads.doubleclick.PublisherAdView
 *  com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener
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
import c.b.b.a.e.a.he;
import c.b.b.a.e.a.kd;
import c.b.b.a.e.a.s3;
import c.b.b.a.e.a.u2;
import c.b.b.a.e.a.ve;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;

public final class t3
extends u2 {
    public final OnPublisherAdViewLoadedListener a;

    public t3(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener) {
        this.a = onPublisherAdViewLoadedListener;
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
            PublisherAdView publisherAdView = new PublisherAdView((Context)b.K(a4));
            try {
                if (ve2.N() instanceof ad) {
                    ad ad2 = (ad)ve2.N();
                    AdListener adListener = ad2 != null ? ad2.a : null;
                    publisherAdView.setAdListener(adListener);
                }
            }
            catch (RemoteException remoteException) {
                a.c.a.a.a("", remoteException);
            }
            try {
                if (ve2.x0() instanceof kd) {
                    kd kd2 = (kd)ve2.x0();
                    AppEventListener appEventListener = null;
                    if (kd2 != null) {
                        appEventListener = kd2.a;
                    }
                    publisherAdView.setAppEventListener(appEventListener);
                }
            }
            catch (RemoteException remoteException) {
                a.c.a.a.a("", remoteException);
            }
            gb.a.post((Runnable)new s3(this, publisherAdView, ve2));
        }
    }
}

