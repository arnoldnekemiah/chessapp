/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.RemoteException
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.l1
 *  com.google.android.gms.ads.formats.NativeAd
 *  com.google.android.gms.ads.formats.NativeAd$Image
 */
package c.b.b.a.e.a;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import c.b.b.a.c.a;
import c.b.b.a.c.b;
import c.b.b.a.e.a.l1;
import com.google.android.gms.ads.formats.NativeAd;

public final class m1
extends NativeAd.Image {
    public final l1 a;
    public final Drawable b;
    public final Uri c;
    public final double d;
    public final int e;
    public final int f;

    public m1(l1 l12) {
        int n10;
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
        int n11 = -1;
        try {
            n10 = this.a.g0();
        }
        catch (RemoteException remoteException) {
            a.c.a.a.a("", remoteException);
            n10 = -1;
        }
        this.e = n10;
        try {
            n11 = this.a.k0();
        }
        catch (RemoteException remoteException) {
            a.c.a.a.a("", remoteException);
        }
        this.f = n11;
    }

    public final Drawable getDrawable() {
        return this.b;
    }

    public final int getHeight() {
        return this.f;
    }

    public final double getScale() {
        return this.d;
    }

    public final Uri getUri() {
        return this.c;
    }

    public final int getWidth() {
        return this.e;
    }
}

