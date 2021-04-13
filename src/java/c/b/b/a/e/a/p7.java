/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.RemoteException
 *  c.b.b.a.e.a.bg
 *  c.b.b.a.e.a.c3
 *  c.b.b.a.e.a.cg
 *  c.b.b.a.e.a.e1
 *  c.b.b.a.e.a.f3
 *  c.b.b.a.e.a.h1
 *  c.b.b.a.e.a.l1
 *  c.b.b.a.e.a.rf
 *  c.b.b.a.e.a.tf
 *  com.google.android.gms.ads.MediaContent
 *  com.google.android.gms.ads.MuteThisAdListener
 *  com.google.android.gms.ads.MuteThisAdReason
 *  com.google.android.gms.ads.OnPaidEventListener
 *  com.google.android.gms.ads.ResponseInfo
 *  com.google.android.gms.ads.nativead.NativeAd
 *  com.google.android.gms.ads.nativead.NativeAd$AdChoicesInfo
 *  com.google.android.gms.ads.nativead.NativeAd$Image
 *  com.google.android.gms.ads.nativead.NativeAd$UnconfirmedClickListener
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import c.b.b.a.e.a.a1;
import c.b.b.a.e.a.bg;
import c.b.b.a.e.a.c3;
import c.b.b.a.e.a.cg;
import c.b.b.a.e.a.e1;
import c.b.b.a.e.a.f3;
import c.b.b.a.e.a.h1;
import c.b.b.a.e.a.l1;
import c.b.b.a.e.a.l7;
import c.b.b.a.e.a.m7;
import c.b.b.a.e.a.o;
import c.b.b.a.e.a.rf;
import c.b.b.a.e.a.tf;
import c.b.b.a.e.a.u7;
import c.b.b.a.e.a.uf;
import c.b.b.a.e.a.wf;
import c.b.b.a.e.a.xg;
import c.b.b.a.e.a.yf;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

public final class p7
extends NativeAd {
    public final f3 a;
    public final List<NativeAd.Image> b;
    public final m7 c;
    public final NativeAd.AdChoicesInfo d;
    public final List<MuteThisAdReason> e;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public p7(f3 f32) {
        m7 m72;
        l7 l72;
        block14 : {
            block13 : {
                this.b = new ArrayList();
                this.e = new ArrayList();
                this.a = f32;
                l72 = null;
                try {
                    List list = f32.i();
                    if (list != null) {
                        for (Object object : list) {
                            l1 l12 = object instanceof IBinder ? a1.a((IBinder)object) : null;
                            if (l12 == null) continue;
                            this.b.add((Object)new m7(l12));
                        }
                    }
                }
                catch (RemoteException remoteException) {
                    a.a("", remoteException);
                }
                try {
                    List list = this.a.j0();
                    if (list != null) {
                        for (Object object : list) {
                            tf tf2 = object instanceof IBinder ? wf.a((IBinder)object) : null;
                            if (tf2 == null) continue;
                            this.e.add((Object)new yf(tf2));
                        }
                    }
                }
                catch (RemoteException remoteException) {
                    a.a("", remoteException);
                }
                try {
                    l1 l13 = this.a.m();
                    if (l13 == null) break block13;
                    m72 = new m7(l13);
                    break block14;
                }
                catch (RemoteException remoteException) {
                    a.a("", remoteException);
                }
            }
            m72 = null;
        }
        this.c = m72;
        try {
            e1 e12 = this.a.g();
            l72 = null;
            if (e12 != null) {
                l7 l73;
                l72 = l73 = new l7(this.a.g());
            }
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
        }
        this.d = l72;
    }

    public final void cancelUnconfirmedClick() {
        try {
            this.a.v0();
            return;
        }
        catch (RemoteException remoteException) {
            a.a("Failed to cancelUnconfirmedClick", remoteException);
            return;
        }
    }

    public final void destroy() {
        try {
            this.a.destroy();
            return;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return;
        }
    }

    public final void enableCustomClickGesture() {
        try {
            this.a.V0();
            return;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return;
        }
    }

    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.d;
    }

    public final String getAdvertiser() {
        try {
            String string = this.a.n();
            return string;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return null;
        }
    }

    public final String getBody() {
        try {
            String string = this.a.h();
            return string;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return null;
        }
    }

    public final String getCallToAction() {
        try {
            String string = this.a.d();
            return string;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            Bundle bundle = this.a.f();
            if (bundle != null) {
                return bundle;
            }
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
        }
        return new Bundle();
    }

    public final String getHeadline() {
        try {
            String string = this.a.e();
            return string;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return null;
        }
    }

    public final NativeAd.Image getIcon() {
        return this.c;
    }

    public final List<NativeAd.Image> getImages() {
        return this.b;
    }

    public final MediaContent getMediaContent() {
        try {
            if (this.a.z() != null) {
                xg xg2 = new xg(this.a.z());
                return xg2;
            }
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
        }
        return null;
    }

    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.e;
    }

    public final String getPrice() {
        try {
            String string = this.a.q();
            return string;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return null;
        }
    }

    public final ResponseInfo getResponseInfo() {
        cg cg2;
        try {
            cg2 = this.a.j();
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            cg2 = null;
        }
        return ResponseInfo.zza((cg)cg2);
    }

    public final Double getStarRating() {
        double d10;
        block3 : {
            try {
                d10 = this.a.k();
                if (d10 != -1.0) break block3;
                return null;
            }
            catch (RemoteException remoteException) {
                a.a("", remoteException);
                return null;
            }
        }
        Double d11 = d10;
        return d11;
    }

    public final String getStore() {
        try {
            String string = this.a.o();
            return string;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return null;
        }
    }

    public final boolean isCustomClickGestureEnabled() {
        try {
            boolean bl = this.a.T0();
            return bl;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return false;
        }
    }

    public final boolean isCustomMuteThisAdEnabled() {
        try {
            boolean bl = this.a.V();
            return bl;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return false;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void muteThisAd(MuteThisAdReason var1_1) {
        try {
            var4_2 = this.a.V();
            ** GOTO lbl8
        }
        catch (RemoteException var2_3) {
            try {
                a.a("", var2_3);
                var4_2 = false;
lbl8: // 2 sources:
                if (!var4_2) {
                    a.h("Ad is not custom mute enabled");
                    return;
                }
                if (var1_1 == null) {
                    this.a.a(null);
                    return;
                }
                if (var1_1 instanceof yf) {
                    this.a.a(((yf)var1_1).b);
                    return;
                }
                a.h("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                return;
            }
            catch (RemoteException var3_4) {
                a.a("", var3_4);
                return;
            }
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.a.c(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return;
        }
    }

    public final void recordCustomClickGesture() {
        try {
            this.a.D0();
            return;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return;
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            boolean bl = this.a.a(bundle);
            return bl;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.a.b(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return;
        }
    }

    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.a.a((rf)new uf(muteThisAdListener));
            return;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return;
        }
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.a.a((bg)new o(onPaidEventListener));
            return;
        }
        catch (RemoteException remoteException) {
            a.a("Failed to setOnPaidEventListener", remoteException);
            return;
        }
    }

    public final void setUnconfirmedClickListener(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.a.a((c3)new u7(unconfirmedClickListener));
            return;
        }
        catch (RemoteException remoteException) {
            a.a("Failed to setUnconfirmedClickListener", remoteException);
            return;
        }
    }
}

