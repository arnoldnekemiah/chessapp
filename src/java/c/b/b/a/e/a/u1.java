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
 *  c.b.b.a.e.a.s1
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.c.a;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.s1;

public final class u1
extends ec
implements s1 {
    public u1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public final void F() {
        this.b(2, this.Z0());
    }

    public final void c(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(3, parcel);
    }

    public final void f(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(1, parcel);
    }
}

