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
 *  c.b.b.a.e.a.bg
 *  c.b.b.a.e.a.c3
 *  c.b.b.a.e.a.cg
 *  c.b.b.a.e.a.e1
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.f3
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gg
 *  c.b.b.a.e.a.h1
 *  c.b.b.a.e.a.l1
 *  c.b.b.a.e.a.rf
 *  c.b.b.a.e.a.tf
 *  java.lang.Object
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
import c.b.b.a.c.a;
import c.b.b.a.e.a.bg;
import c.b.b.a.e.a.c3;
import c.b.b.a.e.a.cg;
import c.b.b.a.e.a.e1;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.f3;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.fg;
import c.b.b.a.e.a.g1;
import c.b.b.a.e.a.gg;
import c.b.b.a.e.a.h1;
import c.b.b.a.e.a.j1;
import c.b.b.a.e.a.l1;
import c.b.b.a.e.a.n1;
import c.b.b.a.e.a.p5;
import c.b.b.a.e.a.rf;
import c.b.b.a.e.a.tf;
import java.util.ArrayList;
import java.util.List;

public final class h3
extends ec
implements f3 {
    public h3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    public final void D0() {
        this.b(28, this.Z0());
    }

    public final boolean T0() {
        Parcel parcel = this.a(30, this.Z0());
        boolean bl = fc.a((Parcel)parcel);
        parcel.recycle();
        return bl;
    }

    public final boolean V() {
        Parcel parcel = this.a(24, this.Z0());
        boolean bl = fc.a((Parcel)parcel);
        parcel.recycle();
        return bl;
    }

    public final void V0() {
        this.b(27, this.Z0());
    }

    public final void a(bg bg2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)bg2);
        this.b(32, parcel);
    }

    public final void a(c3 c32) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)c32);
        this.b(21, parcel);
    }

    public final void a(rf rf2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)rf2);
        this.b(26, parcel);
    }

    public final void a(tf tf2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)tf2);
        this.b(25, parcel);
    }

    public final boolean a(Bundle bundle) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)bundle);
        Parcel parcel2 = this.a(16, parcel);
        boolean bl = fc.a((Parcel)parcel2);
        parcel2.recycle();
        return bl;
    }

    public final void b(Bundle bundle) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)bundle);
        this.b(17, parcel);
    }

    public final void c(Bundle bundle) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)bundle);
        this.b(15, parcel);
    }

    public final String d() {
        Parcel parcel = this.a(6, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final void destroy() {
        this.b(13, this.Z0());
    }

    public final String e() {
        Parcel parcel = this.a(2, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final Bundle f() {
        Parcel parcel = this.a(20, this.Z0());
        Bundle bundle = (Bundle)fc.a((Parcel)parcel, (Parcelable.Creator)Bundle.CREATOR);
        parcel.recycle();
        return bundle;
    }

    public final e1 g() {
        IInterface iInterface;
        Parcel parcel = this.a(14, this.Z0());
        IBinder iBinder = parcel.readStrongBinder();
        Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo")) instanceof e1 ? (e1)iInterface : new g1(iBinder));
        parcel.recycle();
        return object;
    }

    public final String getMediationAdapterClassName() {
        Parcel parcel = this.a(12, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final gg getVideoController() {
        Parcel parcel = this.a(11, this.Z0());
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

    public final cg j() {
        Parcel parcel = this.a(31, this.Z0());
        cg cg2 = fg.a(parcel.readStrongBinder());
        parcel.recycle();
        return cg2;
    }

    public final List j0() {
        Parcel parcel = this.a(23, this.Z0());
        ArrayList arrayList = fc.b((Parcel)parcel);
        parcel.recycle();
        return arrayList;
    }

    public final double k() {
        Parcel parcel = this.a(8, this.Z0());
        double d10 = parcel.readDouble();
        parcel.recycle();
        return d10;
    }

    public final a l() {
        return c.a.b.a.a.a(this.a(19, this.Z0()));
    }

    public final l1 m() {
        IInterface iInterface;
        Parcel parcel = this.a(5, this.Z0());
        IBinder iBinder = parcel.readStrongBinder();
        Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage")) instanceof l1 ? (l1)iInterface : new n1(iBinder));
        parcel.recycle();
        return object;
    }

    public final String n() {
        Parcel parcel = this.a(7, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final String o() {
        Parcel parcel = this.a(9, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final String q() {
        Parcel parcel = this.a(10, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final a v() {
        return c.a.b.a.a.a(this.a(18, this.Z0()));
    }

    public final void v0() {
        this.b(22, this.Z0());
    }

    public final h1 z() {
        IInterface iInterface;
        Parcel parcel = this.a(29, this.Z0());
        IBinder iBinder = parcel.readStrongBinder();
        Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent")) instanceof h1 ? (h1)iInterface : new j1(iBinder));
        parcel.recycle();
        return object;
    }
}

