/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.RemoteException
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.bf
 *  c.b.b.a.e.a.cg
 *  c.b.b.a.e.a.g9
 *  c.b.b.a.e.a.gd
 *  c.b.b.a.e.a.j9
 *  c.b.b.a.e.a.ng
 *  com.google.android.gms.ads.AdRequest
 *  com.google.android.gms.ads.ResponseInfo
 *  com.google.android.gms.ads.doubleclick.PublisherAdRequest
 *  com.google.android.gms.ads.reward.AdMetadataListener
 *  com.google.android.gms.ads.reward.RewardedVideoAd
 *  com.google.android.gms.ads.reward.RewardedVideoAdListener
 *  com.google.android.gms.internal.ads.zzava
 *  com.google.android.gms.internal.ads.zzvl
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import c.b.b.a.c.b;
import c.b.b.a.e.a.bf;
import c.b.b.a.e.a.cg;
import c.b.b.a.e.a.dd;
import c.b.b.a.e.a.g9;
import c.b.b.a.e.a.gd;
import c.b.b.a.e.a.j9;
import c.b.b.a.e.a.k;
import c.b.b.a.e.a.ng;
import c.b.b.a.e.a.o9;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.internal.ads.zzava;
import com.google.android.gms.internal.ads.zzvl;

public final class p9
implements RewardedVideoAd {
    public final g9 a;
    public final Context b;
    public final Object c = new Object();
    public final o9 d = new o9(null);
    public String e;
    public String f;

    public p9(Context context, g9 g92) {
        if (g92 == null) {
            g92 = new k();
        }
        this.a = g92;
        this.b = context.getApplicationContext();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String string, ng ng2) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            if (this.a == null) {
                return;
            }
            try {
                this.a.a(new zzava(gd.a((Context)this.b, (ng)ng2), string));
            }
            catch (RemoteException remoteException) {
                a.c("#007 Could not call remote method.", remoteException);
            }
            return;
        }
    }

    public final void destroy() {
        this.destroy(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void destroy(Context context) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            this.d.a = null;
            if (this.a == null) {
                return;
            }
            try {
                this.a.D(new b<Context>(context));
            }
            catch (RemoteException remoteException) {
                a.c("#007 Could not call remote method.", remoteException);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Bundle getAdMetadata() {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            g9 g92 = this.a;
            if (g92 == null) return new Bundle();
            try {
                return this.a.getAdMetadata();
            }
            catch (RemoteException remoteException) {
                a.c("#007 Could not call remote method.", remoteException);
            }
            return new Bundle();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String getCustomData() {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            return this.f;
        }
    }

    public final String getMediationAdapterClassName() {
        try {
            if (this.a != null) {
                String string = this.a.getMediationAdapterClassName();
                return string;
            }
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final ResponseInfo getResponseInfo() {
        cg cg2 = null;
        g9 g92 = this.a;
        cg2 = null;
        if (g92 == null) return ResponseInfo.zza(cg2);
        try {
            cg2 = this.a.j();
            return ResponseInfo.zza(cg2);
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
        }
        return ResponseInfo.zza(cg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final RewardedVideoAdListener getRewardedVideoAdListener() {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            return this.d.a;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String getUserId() {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            return this.e;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean isLoaded() {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            if (this.a == null) {
                return false;
            }
            try {
                return this.a.isLoaded();
            }
            catch (RemoteException remoteException) {
                a.c("#007 Could not call remote method.", remoteException);
                return false;
            }
        }
    }

    public final void loadAd(String string, AdRequest adRequest) {
        this.a(string, adRequest.zzds());
    }

    public final void loadAd(String string, PublisherAdRequest publisherAdRequest) {
        this.a(string, publisherAdRequest.zzds());
    }

    public final void pause() {
        this.pause(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void pause(Context context) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            if (this.a == null) {
                return;
            }
            try {
                this.a.F(new b<Context>(context));
            }
            catch (RemoteException remoteException) {
                a.c("#007 Could not call remote method.", remoteException);
            }
            return;
        }
    }

    public final void resume() {
        this.resume(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void resume(Context context) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            if (this.a == null) {
                return;
            }
            try {
                this.a.q(new b<Context>(context));
            }
            catch (RemoteException remoteException) {
                a.c("#007 Could not call remote method.", remoteException);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            g9 g92 = this.a;
            if (g92 != null) {
                try {
                    this.a.a((bf)new dd(adMetadataListener));
                }
                catch (RemoteException remoteException) {
                    a.c("#007 Could not call remote method.", remoteException);
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void setCustomData(String string) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            g9 g92 = this.a;
            if (g92 != null) {
                try {
                    this.a.setCustomData(string);
                    this.f = string;
                }
                catch (RemoteException remoteException) {
                    a.c("#007 Could not call remote method.", remoteException);
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void setImmersiveMode(boolean bl) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            g9 g92 = this.a;
            if (g92 != null) {
                try {
                    this.a.setImmersiveMode(bl);
                }
                catch (RemoteException remoteException) {
                    a.c("#007 Could not call remote method.", remoteException);
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            this.d.a = rewardedVideoAdListener;
            g9 g92 = this.a;
            if (g92 != null) {
                try {
                    this.a.a((j9)this.d);
                }
                catch (RemoteException remoteException) {
                    a.c("#007 Could not call remote method.", remoteException);
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void setUserId(String string) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            this.e = string;
            g9 g92 = this.a;
            if (g92 != null) {
                try {
                    this.a.setUserId(string);
                }
                catch (RemoteException remoteException) {
                    a.c("#007 Could not call remote method.", remoteException);
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void show() {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            if (this.a == null) {
                return;
            }
            try {
                this.a.show();
            }
            catch (RemoteException remoteException) {
                a.c("#007 Could not call remote method.", remoteException);
            }
            return;
        }
    }
}

