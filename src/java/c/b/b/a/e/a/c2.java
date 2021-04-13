/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.RemoteException
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.b2
 *  c.b.b.a.e.a.e1
 *  c.b.b.a.e.a.f1
 *  c.b.b.a.e.a.gg
 *  c.b.b.a.e.a.l1
 *  c.b.b.a.e.a.m1
 *  c.b.b.a.e.a.n1
 *  com.google.android.gms.ads.VideoController
 *  com.google.android.gms.ads.formats.NativeAd
 *  com.google.android.gms.ads.formats.NativeAd$AdChoicesInfo
 *  com.google.android.gms.ads.formats.NativeAd$Image
 *  com.google.android.gms.ads.formats.NativeContentAd
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import c.b.b.a.e.a.b2;
import c.b.b.a.e.a.e1;
import c.b.b.a.e.a.f1;
import c.b.b.a.e.a.gg;
import c.b.b.a.e.a.l1;
import c.b.b.a.e.a.m1;
import c.b.b.a.e.a.n1;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import java.util.ArrayList;
import java.util.List;

public final class c2
extends NativeContentAd {
    public final b2 a;
    public final List<NativeAd.Image> b;
    public final m1 c;
    public final VideoController d;
    public final NativeAd.AdChoicesInfo e;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public c2(b2 b22) {
        m1 m12;
        f1 f12;
        block10 : {
            block9 : {
                this.b = new ArrayList();
                this.d = new VideoController();
                this.a = b22;
                f12 = null;
                try {
                    List list = b22.i();
                    if (list != null) {
                        for (Object object : list) {
                            IBinder iBinder;
                            IInterface iInterface;
                            Object object2 = object instanceof IBinder && (iBinder = (IBinder)object) != null ? ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage")) instanceof l1 ? (l1)iInterface : new n1(iBinder)) : null;
                            if (object2 == null) continue;
                            this.b.add((Object)new m1(object2));
                        }
                    }
                }
                catch (RemoteException remoteException) {
                    a.a("", remoteException);
                }
                try {
                    l1 l12 = this.a.C();
                    if (l12 == null) break block9;
                    m12 = new m1(l12);
                    break block10;
                }
                catch (RemoteException remoteException) {
                    a.a("", remoteException);
                }
            }
            m12 = null;
        }
        this.c = m12;
        try {
            e1 e12 = this.a.g();
            f12 = null;
            if (e12 != null) {
                f1 f13;
                f12 = f13 = new f1(this.a.g());
            }
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
        }
        this.e = f12;
    }

    public final /* synthetic */ Object a() {
        try {
            c.b.b.a.c.a a4 = this.a.v();
            return a4;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return null;
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

    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.e;
    }

    public final CharSequence getAdvertiser() {
        try {
            String string = this.a.n();
            return string;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return null;
        }
    }

    public final CharSequence getBody() {
        try {
            String string = this.a.h();
            return string;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return null;
        }
    }

    public final CharSequence getCallToAction() {
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
            return bundle;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return null;
        }
    }

    public final CharSequence getHeadline() {
        try {
            String string = this.a.e();
            return string;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return null;
        }
    }

    public final List<NativeAd.Image> getImages() {
        return this.b;
    }

    public final NativeAd.Image getLogo() {
        return this.c;
    }

    public final CharSequence getMediationAdapterClassName() {
        try {
            String string = this.a.getMediationAdapterClassName();
            return string;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.a.getVideoController() != null) {
                this.d.zza(this.a.getVideoController());
            }
        }
        catch (RemoteException remoteException) {
            a.a("Exception occurred while getting video controller", remoteException);
        }
        return this.d;
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
}

