/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  android.view.View
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.f2
 *  com.google.android.gms.ads.formats.NativeCustomTemplateAd
 *  com.google.android.gms.ads.formats.NativeCustomTemplateAd$DisplayOpenMeasurement
 *  java.lang.Object
 */
package c.b.b.a.e.a;

import a.c.a.a;
import android.os.RemoteException;
import android.view.View;
import c.b.b.a.c.b;
import c.b.b.a.e.a.f2;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

public final class i1
implements NativeCustomTemplateAd.DisplayOpenMeasurement {
    public final f2 a;

    public i1(f2 f22) {
        this.a = f22;
        try {
            f22.r0();
            return;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return;
        }
    }

    public final void setView(View view) {
        try {
            this.a.r(new b<View>(view));
            return;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return;
        }
    }

    public final boolean start() {
        try {
            boolean bl = this.a.J();
            return bl;
        }
        catch (RemoteException remoteException) {
            a.a("", remoteException);
            return false;
        }
    }
}

