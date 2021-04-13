/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.s9
 *  com.google.android.gms.internal.ads.zzavj
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.c.a;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.s9;
import com.google.android.gms.internal.ads.zzavj;

public final class u9
extends ec
implements s9 {
    public u9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public final void A(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(6, parcel);
    }

    public final void C(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(10, parcel);
    }

    public final void E(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(1, parcel);
    }

    public final void G(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(4, parcel);
    }

    public final void a(a a6, int n10) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        parcel.writeInt(n10);
        this.b(9, parcel);
    }

    public final void a(a a6, zzavj zzavj2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (Parcelable)zzavj2);
        this.b(7, parcel);
    }

    public final void d(a a6, int n10) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        parcel.writeInt(n10);
        this.b(2, parcel);
    }

    public final void j(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(8, parcel);
    }

    public final void l(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(11, parcel);
    }

    public final void m(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(3, parcel);
    }

    public final void p(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(5, parcel);
    }

    public final void zzb(Bundle bundle) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)bundle);
        this.b(12, parcel);
    }
}

