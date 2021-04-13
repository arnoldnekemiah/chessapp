/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.RemoteException
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.l1
 *  com.google.android.gms.ads.nativead.NativeAd
 *  com.google.android.gms.ads.nativead.NativeAd$Image
 */
package c.b.b.a.e.a;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import c.b.b.a.c.a;
import c.b.b.a.c.b;
import c.b.b.a.e.a.l1;
import com.google.android.gms.ads.nativead.NativeAd;

public final class m7
extends NativeAd.Image {
    public final l1 a;
    public final Drawable b;
    public final Uri c;
    public final double d;

    public m7(l1 l12) {
        Uri uri;
        Drawable drawable;
        block12 : {
            block11 : {
                this.a = l12;
                uri = null;
                a a6 = l12.P0();
                if (a6 == null) break block11;
                try {
                    drawable = (Drawable)b.K(a6);
                    break block12;
                }
                catch (RemoteException remoteException) {
                    a.c.a.a.a("", remoteException);
                }
            }
            drawable = null;
        }
        this.b = drawable;
        try {
            uri = this.a.E0();
        }
        catch (RemoteException remoteException) {
            a.c.a.a.a("", remoteException);
        }
        this.c = uri;
        double d10 = 1.0;
        try {
            d10 = this.a.L();
        }
        catch (RemoteException remoteException) {
            a.c.a.a.a("", remoteException);
        }
        this.d = d10;
        try {
            this.a.g0();
        }
        catch (RemoteException remoteException) {
            a.c.a.a.a("", remoteException);
        }
        try {
            this.a.k0();
            return;
        }
        catch (RemoteException remoteException) {
            a.c.a.a.a("", remoteException);
            return;
        }
    }

    public final Drawable getDrawable() {
        return this.b;
    }

    public final double getScale() {
        return this.d;
    }

    public final Uri getUri() {
        return this.c;
    }
}

