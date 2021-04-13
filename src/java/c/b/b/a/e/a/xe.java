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
 *  c.b.b.a.e.a.bf
 *  c.b.b.a.e.a.bg
 *  c.b.b.a.e.a.cf
 *  c.b.b.a.e.a.cg
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.ge
 *  c.b.b.a.e.a.gg
 *  c.b.b.a.e.a.he
 *  c.b.b.a.e.a.hf
 *  c.b.b.a.e.a.i8
 *  c.b.b.a.e.a.j9
 *  c.b.b.a.e.a.jf
 *  c.b.b.a.e.a.l0
 *  c.b.b.a.e.a.l8
 *  c.b.b.a.e.a.me
 *  c.b.b.a.e.a.pc
 *  c.b.b.a.e.a.ve
 *  com.google.android.gms.internal.ads.zzaau
 *  com.google.android.gms.internal.ads.zzvl
 *  com.google.android.gms.internal.ads.zzvs
 *  com.google.android.gms.internal.ads.zzvx
 *  com.google.android.gms.internal.ads.zzzi
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.c.a;
import c.b.b.a.e.a.bf;
import c.b.b.a.e.a.bg;
import c.b.b.a.e.a.cf;
import c.b.b.a.e.a.cg;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.ef;
import c.b.b.a.e.a.eg;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.ge;
import c.b.b.a.e.a.gg;
import c.b.b.a.e.a.he;
import c.b.b.a.e.a.hf;
import c.b.b.a.e.a.i8;
import c.b.b.a.e.a.ig;
import c.b.b.a.e.a.j9;
import c.b.b.a.e.a.je;
import c.b.b.a.e.a.jf;
import c.b.b.a.e.a.l0;
import c.b.b.a.e.a.l8;
import c.b.b.a.e.a.me;
import c.b.b.a.e.a.pc;
import c.b.b.a.e.a.ve;
import com.google.android.gms.internal.ads.zzaau;
import com.google.android.gms.internal.ads.zzvl;
import com.google.android.gms.internal.ads.zzvs;
import com.google.android.gms.internal.ads.zzvx;
import com.google.android.gms.internal.ads.zzzi;

public final class xe
extends ec
implements ve {
    public xe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public final String A() {
        Parcel parcel = this.a(35, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final he N() {
        IInterface iInterface;
        Parcel parcel = this.a(33, this.Z0());
        IBinder iBinder = parcel.readStrongBinder();
        Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener")) instanceof he ? (he)iInterface : new je(iBinder));
        parcel.recycle();
        return object;
    }

    public final a S0() {
        return c.a.b.a.a.a(this.a(1, this.Z0()));
    }

    public final boolean U() {
        Parcel parcel = this.a(3, this.Z0());
        boolean bl = fc.a((Parcel)parcel);
        parcel.recycle();
        return bl;
    }

    public final zzvs X0() {
        Parcel parcel = this.a(12, this.Z0());
        zzvs zzvs2 = (zzvs)fc.a((Parcel)parcel, (Parcelable.Creator)zzvs.CREATOR);
        parcel.recycle();
        return zzvs2;
    }

    public final void a(bf bf2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)bf2);
        this.b(36, parcel);
    }

    public final void a(bg bg2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)bg2);
        this.b(42, parcel);
    }

    public final void a(cf cf2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)cf2);
        this.b(8, parcel);
    }

    public final void a(ge ge2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)ge2);
        this.b(20, parcel);
    }

    public final void a(hf hf2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)hf2);
        this.b(21, parcel);
    }

    public final void a(i8 i82) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)i82);
        this.b(14, parcel);
    }

    public final void a(j9 j92) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)j92);
        this.b(24, parcel);
    }

    public final void a(jf jf2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)jf2);
        this.b(45, parcel);
    }

    public final void a(l0 l02) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)l02);
        this.b(19, parcel);
    }

    public final void a(l8 l82, String string) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)l82);
        parcel.writeString(string);
        this.b(15, parcel);
    }

    public final void a(pc pc2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)pc2);
        this.b(40, parcel);
    }

    public final void a(zzaau zzaau2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzaau2);
        this.b(29, parcel);
    }

    public final void a(zzvl zzvl2, me me2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzvl2);
        fc.a((Parcel)parcel, (IInterface)me2);
        this.b(43, parcel);
    }

    public final void a(zzvs zzvs2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzvs2);
        this.b(13, parcel);
    }

    public final void a(zzvx zzvx2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzvx2);
        this.b(39, parcel);
    }

    public final void a(zzzi zzzi2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzzi2);
        this.b(30, parcel);
    }

    public final void a0() {
        this.b(10, this.Z0());
    }

    public final void b(he he2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)he2);
        this.b(7, parcel);
    }

    public final boolean b(zzvl zzvl2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzvl2);
        Parcel parcel2 = this.a(4, parcel);
        boolean bl = fc.a((Parcel)parcel2);
        parcel2.recycle();
        return bl;
    }

    public final void d(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(44, parcel);
    }

    public final void d(boolean bl) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (boolean)bl);
        this.b(22, parcel);
    }

    public final void destroy() {
        this.b(2, this.Z0());
    }

    public final void g(String string) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        this.b(38, parcel);
    }

    public final Bundle getAdMetadata() {
        Parcel parcel = this.a(37, this.Z0());
        Bundle bundle = (Bundle)fc.a((Parcel)parcel, (Parcelable.Creator)Bundle.CREATOR);
        parcel.recycle();
        return bundle;
    }

    public final String getMediationAdapterClassName() {
        Parcel parcel = this.a(18, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final gg getVideoController() {
        IInterface iInterface;
        Parcel parcel = this.a(26, this.Z0());
        IBinder iBinder = parcel.readStrongBinder();
        Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController")) instanceof gg ? (gg)iInterface : new ig(iBinder));
        parcel.recycle();
        return object;
    }

    public final String i0() {
        Parcel parcel = this.a(31, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final cg j() {
        IInterface iInterface;
        Parcel parcel = this.a(41, this.Z0());
        IBinder iBinder = parcel.readStrongBinder();
        Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo")) instanceof cg ? (cg)iInterface : new eg(iBinder));
        parcel.recycle();
        return object;
    }

    public final void n0() {
        this.b(11, this.Z0());
    }

    public final void pause() {
        this.b(5, this.Z0());
    }

    public final void resume() {
        this.b(6, this.Z0());
    }

    public final void setImmersiveMode(boolean bl) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (boolean)bl);
        this.b(34, parcel);
    }

    public final void setUserId(String string) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        this.b(25, parcel);
    }

    public final void showInterstitial() {
        this.b(9, this.Z0());
    }

    public final boolean w() {
        Parcel parcel = this.a(23, this.Z0());
        boolean bl = fc.a((Parcel)parcel);
        parcel.recycle();
        return bl;
    }

    public final cf x0() {
        IInterface iInterface;
        Parcel parcel = this.a(32, this.Z0());
        IBinder iBinder = parcel.readStrongBinder();
        Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener")) instanceof cf ? (cf)iInterface : new ef(iBinder));
        parcel.recycle();
        return object;
    }
}

