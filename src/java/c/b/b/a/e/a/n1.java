/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.l1
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c.a.b.a.a;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.l1;

public final class n1
extends ec
implements l1 {
    public n1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public final Uri E0() {
        Parcel parcel = this.a(2, this.Z0());
        Uri uri = (Uri)fc.a((Parcel)parcel, (Parcelable.Creator)Uri.CREATOR);
        parcel.recycle();
        return uri;
    }

    public final double L() {
        Parcel parcel = this.a(3, this.Z0());
        double d10 = parcel.readDouble();
        parcel.recycle();
        return d10;
    }

    public final c.b.b.a.c.a P0() {
        return a.a(this.a(1, this.Z0()));
    }

    public final int g0() {
        Parcel parcel = this.a(4, this.Z0());
        int n10 = parcel.readInt();
        parcel.recycle();
        return n10;
    }

    public final int k0() {
        Parcel parcel = this.a(5, this.Z0());
        int n10 = parcel.readInt();
        parcel.recycle();
        return n10;
    }
}

