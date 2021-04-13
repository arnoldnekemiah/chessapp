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
 *  c.b.b.a.e.a.h1
 *  c.b.b.a.e.a.p1
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.a.b.a.a;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.h1;
import c.b.b.a.e.a.p1;

public final class r1
extends ec
implements p1 {
    public r1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public final void B(c.b.b.a.c.a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(7, parcel);
    }

    public final void a(h1 h12) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)h12);
        this.b(8, parcel);
    }

    public final void a(String string, c.b.b.a.c.a a6) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(1, parcel);
    }

    public final void b(c.b.b.a.c.a a6, int n10) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        parcel.writeInt(n10);
        this.b(5, parcel);
    }

    public final void c(c.b.b.a.c.a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(6, parcel);
    }

    public final void destroy() {
        this.b(4, this.Z0());
    }

    public final void f(c.b.b.a.c.a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(3, parcel);
    }

    public final c.b.b.a.c.a h(String string) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        return a.a(this.a(2, parcel));
    }

    public final void i(c.b.b.a.c.a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(9, parcel);
    }
}

