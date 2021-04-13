/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.c8
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.g9
 *  c.b.b.a.e.a.gf
 *  c.b.b.a.e.a.of
 *  c.b.b.a.e.a.p1
 *  c.b.b.a.e.a.s1
 *  c.b.b.a.e.a.se
 *  c.b.b.a.e.a.v4
 *  c.b.b.a.e.a.ve
 *  c.b.b.a.e.a.x7
 *  c.b.b.a.e.a.x9
 *  c.b.b.a.e.a.za
 *  com.google.android.gms.internal.ads.zzvs
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.c.a;
import c.b.b.a.e.a.aa;
import c.b.b.a.e.a.bb;
import c.b.b.a.e.a.c8;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.f8;
import c.b.b.a.e.a.f9;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.g9;
import c.b.b.a.e.a.gf;
import c.b.b.a.e.a.o1;
import c.b.b.a.e.a.of;
import c.b.b.a.e.a.p1;
import c.b.b.a.e.a.qf;
import c.b.b.a.e.a.s1;
import c.b.b.a.e.a.se;
import c.b.b.a.e.a.ue;
import c.b.b.a.e.a.v1;
import c.b.b.a.e.a.v4;
import c.b.b.a.e.a.ve;
import c.b.b.a.e.a.w7;
import c.b.b.a.e.a.x7;
import c.b.b.a.e.a.x9;
import c.b.b.a.e.a.xe;
import c.b.b.a.e.a.za;
import com.google.android.gms.internal.ads.zzvs;

public final class if
extends ec
implements gf {
    public if(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    public final p1 a(a a6, a a10) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (IInterface)a10);
        Parcel parcel2 = this.a(5, parcel);
        p1 p12 = o1.a(parcel2.readStrongBinder());
        parcel2.recycle();
        return p12;
    }

    public final se a(a a6, String string, v4 v42, int n10) {
        IInterface iInterface;
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        parcel.writeString(string);
        fc.a((Parcel)parcel, (IInterface)v42);
        parcel.writeInt(n10);
        Parcel parcel2 = this.a(3, parcel);
        IBinder iBinder = parcel2.readStrongBinder();
        Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder")) instanceof se ? (se)iInterface : new ue(iBinder));
        parcel2.recycle();
        return object;
    }

    public final ve a(a a6, zzvs zzvs2, String string, int n10) {
        IInterface iInterface;
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (Parcelable)zzvs2);
        parcel.writeString(string);
        parcel.writeInt(n10);
        Parcel parcel2 = this.a(10, parcel);
        IBinder iBinder = parcel2.readStrongBinder();
        Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager")) instanceof ve ? (ve)iInterface : new xe(iBinder));
        parcel2.recycle();
        return object;
    }

    public final ve a(a a6, zzvs zzvs2, String string, v4 v42, int n10) {
        IInterface iInterface;
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (Parcelable)zzvs2);
        parcel.writeString(string);
        fc.a((Parcel)parcel, (IInterface)v42);
        parcel.writeInt(n10);
        Parcel parcel2 = this.a(1, parcel);
        IBinder iBinder = parcel2.readStrongBinder();
        Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager")) instanceof ve ? (ve)iInterface : new xe(iBinder));
        parcel2.recycle();
        return object;
    }

    public final x7 a(a a6, v4 v42, int n10) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (IInterface)v42);
        parcel.writeInt(n10);
        Parcel parcel2 = this.a(15, parcel);
        x7 x72 = w7.a(parcel2.readStrongBinder());
        parcel2.recycle();
        return x72;
    }

    public final s1 b(a a6, a a10, a a11) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (IInterface)a10);
        fc.a((Parcel)parcel, (IInterface)a11);
        Parcel parcel2 = this.a(11, parcel);
        s1 s12 = v1.a(parcel2.readStrongBinder());
        parcel2.recycle();
        return s12;
    }

    public final ve b(a a6, zzvs zzvs2, String string, v4 v42, int n10) {
        IInterface iInterface;
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (Parcelable)zzvs2);
        parcel.writeString(string);
        fc.a((Parcel)parcel, (IInterface)v42);
        parcel.writeInt(n10);
        Parcel parcel2 = this.a(13, parcel);
        IBinder iBinder = parcel2.readStrongBinder();
        Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager")) instanceof ve ? (ve)iInterface : new xe(iBinder));
        parcel2.recycle();
        return object;
    }

    public final of c(a a6, int n10) {
        IInterface iInterface;
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        parcel.writeInt(n10);
        Parcel parcel2 = this.a(9, parcel);
        IBinder iBinder = parcel2.readStrongBinder();
        Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager")) instanceof of ? (of)iInterface : new qf(iBinder));
        parcel2.recycle();
        return object;
    }

    public final ve c(a a6, zzvs zzvs2, String string, v4 v42, int n10) {
        IInterface iInterface;
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (Parcelable)zzvs2);
        parcel.writeString(string);
        fc.a((Parcel)parcel, (IInterface)v42);
        parcel.writeInt(n10);
        Parcel parcel2 = this.a(2, parcel);
        IBinder iBinder = parcel2.readStrongBinder();
        Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager")) instanceof ve ? (ve)iInterface : new xe(iBinder));
        parcel2.recycle();
        return object;
    }

    public final x9 c(a a6, String string, v4 v42, int n10) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        parcel.writeString(string);
        fc.a((Parcel)parcel, (IInterface)v42);
        parcel.writeInt(n10);
        Parcel parcel2 = this.a(12, parcel);
        x9 x92 = aa.a(parcel2.readStrongBinder());
        parcel2.recycle();
        return x92;
    }

    public final za c(a a6, v4 v42, int n10) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (IInterface)v42);
        parcel.writeInt(n10);
        Parcel parcel2 = this.a(14, parcel);
        za za2 = bb.a(parcel2.readStrongBinder());
        parcel2.recycle();
        return za2;
    }

    public final g9 e(a a6, v4 v42, int n10) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (IInterface)v42);
        parcel.writeInt(n10);
        Parcel parcel2 = this.a(6, parcel);
        g9 g92 = f9.a(parcel2.readStrongBinder());
        parcel2.recycle();
        return g92;
    }

    public final c8 g(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        Parcel parcel2 = this.a(8, parcel);
        c8 c82 = f8.a(parcel2.readStrongBinder());
        parcel2.recycle();
        return c82;
    }
}

