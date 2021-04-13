/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gg
 *  c.b.b.a.e.a.h1
 *  c.b.b.a.e.a.h4
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.c.a;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gg;
import c.b.b.a.e.a.h1;
import c.b.b.a.e.a.h4;
import c.b.b.a.e.a.k1;
import c.b.b.a.e.a.p5;

public final class i4
extends ec
implements h4 {
    public i4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    public final void destroy() {
        this.b(4, this.Z0());
    }

    public final gg getVideoController() {
        Parcel parcel = this.a(3, this.Z0());
        gg gg2 = p5.a(parcel.readStrongBinder());
        parcel.recycle();
        return gg2;
    }

    public final void x(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(6, parcel);
    }

    public final h1 z() {
        Parcel parcel = this.a(7, this.Z0());
        h1 h12 = k1.a(parcel.readStrongBinder());
        parcel.recycle();
        return h12;
    }
}

