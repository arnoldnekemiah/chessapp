/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.RemoteException
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.cg
 *  c.b.b.a.e.a.lc
 *  c.b.b.a.e.a.tc
 *  com.google.android.gms.ads.FullScreenContentCallback
 *  com.google.android.gms.ads.ResponseInfo
 *  com.google.android.gms.ads.appopen.AppOpenAd
 *  java.lang.String
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.app.Activity;
import android.os.RemoteException;
import c.b.b.a.c.b;
import c.b.b.a.e.a.cg;
import c.b.b.a.e.a.lc;
import c.b.b.a.e.a.mc;
import c.b.b.a.e.a.tc;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;

public final class jc
extends AppOpenAd {
    public final lc a;
    public final String b;
    public final mc c = new mc();
    public FullScreenContentCallback d;

    public jc(lc lc2, String string) {
        this.a = lc2;
        this.b = string;
    }

    public final String getAdUnitId() {
        return this.b;
    }

    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.d;
    }

    public final ResponseInfo getResponseInfo() {
        cg cg2;
        try {
            cg2 = this.a.j();
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            cg2 = null;
        }
        return ResponseInfo.zza((cg)cg2);
    }

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.d = fullScreenContentCallback;
        this.c.a = fullScreenContentCallback;
    }

    public final void setImmersiveMode(boolean bl) {
        try {
            this.a.setImmersiveMode(bl);
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void show(Activity activity) {
        try {
            this.a.a(new b<Activity>(activity), (tc)this.c);
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void show(Activity activity, FullScreenContentCallback fullScreenContentCallback) {
        this.d = fullScreenContentCallback;
        this.c.a = fullScreenContentCallback;
        if (activity == null) {
            a.i("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            this.a.a(new b<Activity>(activity), (tc)this.c);
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }
}

