/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.b.b.a.e.a.gg
 *  c.b.b.a.e.a.pg
 *  com.google.android.gms.ads.AdListener
 *  com.google.android.gms.ads.LoadAdError
 *  com.google.android.gms.ads.VideoController
 *  java.lang.Object
 */
package c.b.b.a.e.a;

import c.b.b.a.e.a.gg;
import c.b.b.a.e.a.pg;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.VideoController;

public final class og
extends AdListener {
    public final Object a = new Object();
    public AdListener b;
    public final /* synthetic */ pg c;

    public og(pg pg2) {
        this.c = pg2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a() {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            if (this.b != null) {
                this.b.onAdClosed();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(int n10) {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            if (this.b != null) {
                this.b.onAdFailedToLoad(n10);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(LoadAdError loadAdError) {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            if (this.b != null) {
                this.b.onAdFailedToLoad(loadAdError);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void b() {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            if (this.b != null) {
                this.b.onAdImpression();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void b(AdListener adListener) {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            this.b = adListener;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void c() {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            if (this.b != null) {
                this.b.onAdLeftApplication();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void d() {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            if (this.b != null) {
                this.b.onAdLoaded();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void e() {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            if (this.b != null) {
                this.b.onAdOpened();
            }
            return;
        }
    }

    public final void onAdFailedToLoad(int n10) {
        pg pg2 = this.c;
        pg2.c.zza(pg2.j());
        this.a(n10);
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        pg pg2 = this.c;
        pg2.c.zza(pg2.j());
        this.a(loadAdError);
    }

    public final void onAdLoaded() {
        pg pg2 = this.c;
        pg2.c.zza(pg2.j());
        this.d();
    }
}

