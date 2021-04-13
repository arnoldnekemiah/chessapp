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
 *  c.b.b.a.e.a.ca
 *  c.b.b.a.e.a.cg
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fa
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.ka
 *  c.b.b.a.e.a.w9
 *  c.b.b.a.e.a.x9
 *  c.b.b.a.e.a.xf
 *  com.google.android.gms.internal.ads.zzawh
 *  com.google.android.gms.internal.ads.zzvl
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
import c.b.b.a.e.a.bg;
import c.b.b.a.e.a.ca;
import c.b.b.a.e.a.cg;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fa;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.fg;
import c.b.b.a.e.a.ka;
import c.b.b.a.e.a.w9;
import c.b.b.a.e.a.x9;
import c.b.b.a.e.a.xf;
import c.b.b.a.e.a.y9;
import com.google.android.gms.internal.ads.zzawh;
import com.google.android.gms.internal.ads.zzvl;

public final class z9
extends ec
implements x9 {
    public z9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public final w9 R0() {
        IInterface iInterface;
        Parcel parcel = this.a(11, this.Z0());
        IBinder iBinder = parcel.readStrongBinder();
        Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem")) instanceof w9 ? (w9)iInterface : new y9(iBinder));
        parcel.recycle();
        return object;
    }

    public final void a(a a6, boolean bl) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        parcel.writeInt((int)bl);
        this.b(10, parcel);
    }

    public final void a(bg bg2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)bg2);
        this.b(13, parcel);
    }

    public final void a(ca ca2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)ca2);
        this.b(2, parcel);
    }

    public final void a(ka ka2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)ka2);
        this.b(6, parcel);
    }

    public final void a(xf xf2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)xf2);
        this.b(8, parcel);
    }

    public final void a(zzawh zzawh2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzawh2);
        this.b(7, parcel);
    }

    public final void a(zzvl zzvl2, fa fa2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzvl2);
        fc.a((Parcel)parcel, (IInterface)fa2);
        this.b(14, parcel);
    }

    public final void b(zzvl zzvl2, fa fa2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzvl2);
        fc.a((Parcel)parcel, (IInterface)fa2);
        this.b(1, parcel);
    }

    public final void d(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(5, parcel);
    }

    public final Bundle getAdMetadata() {
        Parcel parcel = this.a(9, this.Z0());
        Bundle bundle = (Bundle)fc.a((Parcel)parcel, (Parcelable.Creator)Bundle.CREATOR);
        parcel.recycle();
        return bundle;
    }

    public final String getMediationAdapterClassName() {
        Parcel parcel = this.a(4, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final boolean isLoaded() {
        Parcel parcel = this.a(3, this.Z0());
        boolean bl = fc.a((Parcel)parcel);
        parcel.recycle();
        return bl;
    }

    public final cg j() {
        Parcel parcel = this.a(12, this.Z0());
        cg cg2 = fg.a(parcel.readStrongBinder());
        parcel.recycle();
        return cg2;
    }

    public final void setImmersiveMode(boolean bl) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (boolean)bl);
        this.b(15, parcel);
    }
}

