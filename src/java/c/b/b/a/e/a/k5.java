/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.e1
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gg
 *  c.b.b.a.e.a.i5
 *  c.b.b.a.e.a.l1
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package c.b.b.a.e.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.a.b.a.a;
import c.b.b.a.e.a.a1;
import c.b.b.a.e.a.d1;
import c.b.b.a.e.a.e1;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gg;
import c.b.b.a.e.a.i5;
import c.b.b.a.e.a.l1;
import c.b.b.a.e.a.p5;
import java.util.ArrayList;
import java.util.List;

public final class k5
extends ec
implements i5 {
    public k5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final void a(c.b.b.a.c.a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(11, parcel);
    }

    public final void a(c.b.b.a.c.a a6, c.b.b.a.c.a a10, c.b.b.a.c.a a11) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (IInterface)a10);
        fc.a((Parcel)parcel, (IInterface)a11);
        this.b(22, parcel);
    }

    public final void b(c.b.b.a.c.a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(16, parcel);
    }

    public final String d() {
        Parcel parcel = this.a(6, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final String e() {
        Parcel parcel = this.a(2, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final void e(c.b.b.a.c.a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(12, parcel);
    }

    public final Bundle f() {
        Parcel parcel = this.a(15, this.Z0());
        Bundle bundle = (Bundle)fc.a((Parcel)parcel, (Parcelable.Creator)Bundle.CREATOR);
        parcel.recycle();
        return bundle;
    }

    public final e1 g() {
        Parcel parcel = this.a(19, this.Z0());
        e1 e12 = d1.a(parcel.readStrongBinder());
        parcel.recycle();
        return e12;
    }

    public final gg getVideoController() {
        Parcel parcel = this.a(17, this.Z0());
        gg gg2 = p5.a(parcel.readStrongBinder());
        parcel.recycle();
        return gg2;
    }

    public final String h() {
        Parcel parcel = this.a(4, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final List i() {
        Parcel parcel = this.a(3, this.Z0());
        ArrayList arrayList = fc.b((Parcel)parcel);
        parcel.recycle();
        return arrayList;
    }

    public final double k() {
        Parcel parcel = this.a(7, this.Z0());
        double d10 = parcel.readDouble();
        parcel.recycle();
        return d10;
    }

    public final c.b.b.a.c.a l() {
        return a.a(this.a(21, this.Z0()));
    }

    public final l1 m() {
        Parcel parcel = this.a(5, this.Z0());
        l1 l12 = a1.a(parcel.readStrongBinder());
        parcel.recycle();
        return l12;
    }

    public final String o() {
        Parcel parcel = this.a(8, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final String q() {
        Parcel parcel = this.a(9, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final c.b.b.a.c.a r() {
        return a.a(this.a(18, this.Z0()));
    }

    public final void recordImpression() {
        this.b(10, this.Z0());
    }

    public final boolean s() {
        Parcel parcel = this.a(13, this.Z0());
        boolean bl = fc.a((Parcel)parcel);
        parcel.recycle();
        return bl;
    }

    public final boolean t() {
        Parcel parcel = this.a(14, this.Z0());
        boolean bl = fc.a((Parcel)parcel);
        parcel.recycle();
        return bl;
    }

    public final c.b.b.a.c.a u() {
        return a.a(this.a(20, this.Z0()));
    }
}

