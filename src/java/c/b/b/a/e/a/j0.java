/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  android.view.View
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.i0
 *  com.google.android.gms.ads.doubleclick.CustomRenderedAd
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.os.RemoteException;
import android.view.View;
import c.b.b.a.c.b;
import c.b.b.a.e.a.i0;
import com.google.android.gms.ads.doubleclick.CustomRenderedAd;

public final class j0
implements CustomRenderedAd {
    public final i0 a;

    public j0(i0 i02) {
        this.a = i02;
    }

    public final String getBaseUrl() {
        try {
            String string = this.a.O();
            return string;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return null;
        }
    }

    public final String getContent() {
        try {
            String string = this.a.getContent();
            return string;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onAdRendered(View view) {
        i0 i02;
        b<View> b7;
        try {
            i02 = this.a;
            b7 = view != null ? new b<View>(view) : null;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
        i02.I(b7);
    }

    public final void recordClick() {
        try {
            this.a.recordClick();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }

    public final void recordImpression() {
        try {
            this.a.recordImpression();
            return;
        }
        catch (RemoteException remoteException) {
            a.c("#007 Could not call remote method.", remoteException);
            return;
        }
    }
}

