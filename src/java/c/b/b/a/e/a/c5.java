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
 *  c.b.b.a.e.a.a5
 *  c.b.b.a.e.a.b5
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.f2
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gg
 *  c.b.b.a.e.a.i5
 *  c.b.b.a.e.a.j5
 *  c.b.b.a.e.a.o5
 *  c.b.b.a.e.a.s9
 *  c.b.b.a.e.a.y3
 *  com.google.android.gms.internal.ads.zzaeh
 *  com.google.android.gms.internal.ads.zzajr
 *  com.google.android.gms.internal.ads.zzapy
 *  com.google.android.gms.internal.ads.zzvl
 *  com.google.android.gms.internal.ads.zzvs
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package c.b.b.a.e.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.c.a;
import c.b.b.a.e.a.a5;
import c.b.b.a.e.a.b5;
import c.b.b.a.e.a.e2;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.f2;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gg;
import c.b.b.a.e.a.i5;
import c.b.b.a.e.a.j5;
import c.b.b.a.e.a.k5;
import c.b.b.a.e.a.l5;
import c.b.b.a.e.a.o5;
import c.b.b.a.e.a.p5;
import c.b.b.a.e.a.q5;
import c.b.b.a.e.a.s9;
import c.b.b.a.e.a.y3;
import com.google.android.gms.internal.ads.zzaeh;
import com.google.android.gms.internal.ads.zzajr;
import com.google.android.gms.internal.ads.zzapy;
import com.google.android.gms.internal.ads.zzvl;
import com.google.android.gms.internal.ads.zzvs;
import java.util.List;

public final class c5
extends ec
implements a5 {
    public c5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public final zzapy B() {
        Parcel parcel = this.a(34, this.Z0());
        zzapy zzapy2 = (zzapy)fc.a((Parcel)parcel, (Parcelable.Creator)zzapy.CREATOR);
        parcel.recycle();
        return zzapy2;
    }

    public final j5 E() {
        IInterface iInterface;
        Parcel parcel = this.a(16, this.Z0());
        IBinder iBinder = parcel.readStrongBinder();
        Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper")) instanceof j5 ? (j5)iInterface : new l5(iBinder));
        parcel.recycle();
        return object;
    }

    public final o5 F0() {
        IInterface iInterface;
        Parcel parcel = this.a(27, this.Z0());
        IBinder iBinder = parcel.readStrongBinder();
        Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper")) instanceof o5 ? (o5)iInterface : new q5(iBinder));
        parcel.recycle();
        return object;
    }

    public final a K() {
        return c.a.b.a.a.a(this.a(2, this.Z0()));
    }

    public final Bundle W0() {
        Parcel parcel = this.a(19, this.Z0());
        Bundle bundle = (Bundle)fc.a((Parcel)parcel, (Parcelable.Creator)Bundle.CREATOR);
        parcel.recycle();
        return bundle;
    }

    public final f2 Y() {
        Parcel parcel = this.a(24, this.Z0());
        f2 f22 = e2.a(parcel.readStrongBinder());
        parcel.recycle();
        return f22;
    }

    public final void a(a a6, s9 s92, List<String> list) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (IInterface)s92);
        parcel.writeStringList(list);
        this.b(23, parcel);
    }

    public final void a(a a6, y3 y32, List<zzajr> list) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (IInterface)y32);
        parcel.writeTypedList(list);
        this.b(31, parcel);
    }

    public final void a(a a6, zzvl zzvl2, String string, b5 b52) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (Parcelable)zzvl2);
        parcel.writeString(string);
        fc.a((Parcel)parcel, (IInterface)b52);
        this.b(28, parcel);
    }

    public final void a(a a6, zzvl zzvl2, String string, s9 s92, String string2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (Parcelable)zzvl2);
        parcel.writeString(string);
        fc.a((Parcel)parcel, (IInterface)s92);
        parcel.writeString(string2);
        this.b(10, parcel);
    }

    public final void a(a a6, zzvl zzvl2, String string, String string2, b5 b52) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (Parcelable)zzvl2);
        parcel.writeString(string);
        parcel.writeString(string2);
        fc.a((Parcel)parcel, (IInterface)b52);
        this.b(7, parcel);
    }

    public final void a(a a6, zzvl zzvl2, String string, String string2, b5 b52, zzaeh zzaeh2, List<String> list) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (Parcelable)zzvl2);
        parcel.writeString(string);
        parcel.writeString(string2);
        fc.a((Parcel)parcel, (IInterface)b52);
        fc.a((Parcel)parcel, (Parcelable)zzaeh2);
        parcel.writeStringList(list);
        this.b(14, parcel);
    }

    public final void a(a a6, zzvs zzvs2, zzvl zzvl2, String string, b5 b52) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (Parcelable)zzvs2);
        fc.a((Parcel)parcel, (Parcelable)zzvl2);
        parcel.writeString(string);
        fc.a((Parcel)parcel, (IInterface)b52);
        this.b(1, parcel);
    }

    public final void a(a a6, zzvs zzvs2, zzvl zzvl2, String string, String string2, b5 b52) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (Parcelable)zzvs2);
        fc.a((Parcel)parcel, (Parcelable)zzvl2);
        parcel.writeString(string);
        parcel.writeString(string2);
        fc.a((Parcel)parcel, (IInterface)b52);
        this.b(6, parcel);
    }

    public final void a(zzvl zzvl2, String string) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzvl2);
        parcel.writeString(string);
        this.b(11, parcel);
    }

    public final void a(zzvl zzvl2, String string, String string2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzvl2);
        parcel.writeString(string);
        parcel.writeString(string2);
        this.b(20, parcel);
    }

    public final void b(a a6, zzvl zzvl2, String string, b5 b52) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (Parcelable)zzvl2);
        parcel.writeString(string);
        fc.a((Parcel)parcel, (IInterface)b52);
        this.b(32, parcel);
    }

    public final void c(a a6, zzvl zzvl2, String string, b5 b52) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (Parcelable)zzvl2);
        parcel.writeString(string);
        fc.a((Parcel)parcel, (IInterface)b52);
        this.b(3, parcel);
    }

    public final void destroy() {
        this.b(5, this.Z0());
    }

    public final Bundle getInterstitialAdapterInfo() {
        Parcel parcel = this.a(18, this.Z0());
        Bundle bundle = (Bundle)fc.a((Parcel)parcel, (Parcelable.Creator)Bundle.CREATOR);
        parcel.recycle();
        return bundle;
    }

    public final gg getVideoController() {
        Parcel parcel = this.a(26, this.Z0());
        gg gg2 = p5.a(parcel.readStrongBinder());
        parcel.recycle();
        return gg2;
    }

    public final void h(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(21, parcel);
    }

    public final boolean isInitialized() {
        Parcel parcel = this.a(13, this.Z0());
        boolean bl = fc.a((Parcel)parcel);
        parcel.recycle();
        return bl;
    }

    public final boolean l0() {
        Parcel parcel = this.a(22, this.Z0());
        boolean bl = fc.a((Parcel)parcel);
        parcel.recycle();
        return bl;
    }

    public final void pause() {
        this.b(8, this.Z0());
    }

    public final void resume() {
        this.b(9, this.Z0());
    }

    public final i5 s0() {
        IInterface iInterface;
        Parcel parcel = this.a(15, this.Z0());
        IBinder iBinder = parcel.readStrongBinder();
        Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper")) instanceof i5 ? (i5)iInterface : new k5(iBinder));
        parcel.recycle();
        return object;
    }

    public final void setImmersiveMode(boolean bl) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (boolean)bl);
        this.b(25, parcel);
    }

    public final void showInterstitial() {
        this.b(4, this.Z0());
    }

    public final void showVideo() {
        this.b(12, this.Z0());
    }

    public final void u(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(30, parcel);
    }

    public final zzapy x() {
        Parcel parcel = this.a(33, this.Z0());
        zzapy zzapy2 = (zzapy)fc.a((Parcel)parcel, (Parcelable.Creator)zzapy.CREATOR);
        parcel.recycle();
        return zzapy2;
    }

    public final Bundle zzux() {
        Parcel parcel = this.a(17, this.Z0());
        Bundle bundle = (Bundle)fc.a((Parcel)parcel, (Parcelable.Creator)Bundle.CREATOR);
        parcel.recycle();
        return bundle;
    }
}

