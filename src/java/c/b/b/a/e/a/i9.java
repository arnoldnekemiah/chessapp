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
 *  c.b.b.a.e.a.cg
 *  c.b.b.a.e.a.e9
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.g9
 *  c.b.b.a.e.a.j9
 *  com.google.android.gms.internal.ads.zzava
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
import c.b.b.a.e.a.cg;
import c.b.b.a.e.a.e9;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.fg;
import c.b.b.a.e.a.g9;
import c.b.b.a.e.a.j9;
import com.google.android.gms.internal.ads.zzava;

public final class i9
extends ec
implements g9 {
    public i9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    public final void D(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(11, parcel);
    }

    public final void F(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(9, parcel);
    }

    public final void a(bf bf2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)bf2);
        this.b(14, parcel);
    }

    public final void a(e9 e92) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)e92);
        this.b(16, parcel);
    }

    public final void a(j9 j92) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)j92);
        this.b(3, parcel);
    }

    public final void a(zzava zzava2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzava2);
        this.b(1, parcel);
    }

    public final void destroy() {
        this.b(8, this.Z0());
    }

    public final boolean e0() {
        Parcel parcel = this.a(20, this.Z0());
        boolean bl = fc.a((Parcel)parcel);
        parcel.recycle();
        return bl;
    }

    public final Bundle getAdMetadata() {
        Parcel parcel = this.a(15, this.Z0());
        Bundle bundle = (Bundle)fc.a((Parcel)parcel, (Parcelable.Creator)Bundle.CREATOR);
        parcel.recycle();
        return bundle;
    }

    public final String getMediationAdapterClassName() {
        Parcel parcel = this.a(12, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final boolean isLoaded() {
        Parcel parcel = this.a(5, this.Z0());
        boolean bl = fc.a((Parcel)parcel);
        parcel.recycle();
        return bl;
    }

    public final cg j() {
        Parcel parcel = this.a(21, this.Z0());
        cg cg2 = fg.a(parcel.readStrongBinder());
        parcel.recycle();
        return cg2;
    }

    public final void l(String string) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        this.b(17, parcel);
    }

    public final void pause() {
        this.b(6, this.Z0());
    }

    public final void q(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(10, parcel);
    }

    public final void resume() {
        this.b(7, this.Z0());
    }

    public final void setCustomData(String string) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        this.b(19, parcel);
    }

    public final void setImmersiveMode(boolean bl) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (boolean)bl);
        this.b(34, parcel);
    }

    public final void setUserId(String string) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        this.b(13, parcel);
    }

    public final void show() {
        this.b(2, this.Z0());
    }

    public final void z(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(18, parcel);
    }
}

