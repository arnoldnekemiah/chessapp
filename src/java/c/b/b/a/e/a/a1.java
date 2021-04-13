/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gc
 *  c.b.b.a.e.a.l1
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.c.a;
import c.b.b.a.c.b;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gc;
import c.b.b.a.e.a.l1;
import c.b.b.a.e.a.n1;

public final class a1
extends gc
implements l1 {
    public final Drawable a;
    public final Uri b;
    public final double c;
    public final int d;
    public final int e;

    public a1(Drawable drawable, Uri uri, double d6, int n10, int n11) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        this.a = drawable;
        this.b = uri;
        this.c = d6;
        this.d = n10;
        this.e = n11;
    }

    public static l1 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        if (iInterface instanceof l1) {
            return (l1)iInterface;
        }
        return new n1(iBinder);
    }

    public final Uri E0() {
        return this.b;
    }

    public final double L() {
        return this.c;
    }

    public final a P0() {
        return new b<Drawable>(this.a);
    }

    public final boolean a(int n10, Parcel parcel, Parcel parcel2, int n11) {
        if (n10 != 1) {
            if (n10 != 2) {
                if (n10 != 3) {
                    int n12;
                    if (n10 != 4) {
                        if (n10 != 5) {
                            return false;
                        }
                        n12 = this.k0();
                    } else {
                        n12 = this.g0();
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(n12);
                    return true;
                }
                double d6 = this.L();
                parcel2.writeNoException();
                parcel2.writeDouble(d6);
                return true;
            }
            Uri uri = this.E0();
            parcel2.writeNoException();
            fc.b((Parcel)parcel2, (Parcelable)uri);
            return true;
        }
        a a5 = this.P0();
        parcel2.writeNoException();
        fc.a((Parcel)parcel2, (IInterface)a5);
        return true;
    }

    public final int g0() {
        return this.d;
    }

    public final int k0() {
        return this.e;
    }
}

