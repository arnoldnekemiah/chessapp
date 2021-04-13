/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.of
 *  c.b.b.a.e.a.v4
 *  c.b.b.a.e.a.z3
 *  com.google.android.gms.internal.ads.zzaao
 *  com.google.android.gms.internal.ads.zzajh
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.c.a;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.of;
import c.b.b.a.e.a.v4;
import c.b.b.a.e.a.z3;
import com.google.android.gms.internal.ads.zzaao;
import com.google.android.gms.internal.ads.zzajh;
import java.util.ArrayList;
import java.util.List;

public final class qf
extends ec
implements of {
    public qf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public final void G() {
        this.b(1, this.Z0());
    }

    public final float I() {
        Parcel parcel = this.a(7, this.Z0());
        float f10 = parcel.readFloat();
        parcel.recycle();
        return f10;
    }

    public final String U0() {
        Parcel parcel = this.a(9, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final List<zzajh> Y0() {
        Parcel parcel = this.a(13, this.Z0());
        ArrayList arrayList = parcel.createTypedArrayList(zzajh.CREATOR);
        parcel.recycle();
        return arrayList;
    }

    public final void a(float f10) {
        Parcel parcel = this.Z0();
        parcel.writeFloat(f10);
        this.b(2, parcel);
    }

    public final void a(a a6, String string) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        parcel.writeString(string);
        this.b(5, parcel);
    }

    public final void a(v4 v42) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)v42);
        this.b(11, parcel);
    }

    public final void a(z3 z32) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)z32);
        this.b(12, parcel);
    }

    public final void a(zzaao zzaao2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzaao2);
        this.b(14, parcel);
    }

    public final void b(String string, a a6) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(6, parcel);
    }

    public final void e(boolean bl) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (boolean)bl);
        this.b(4, parcel);
    }

    public final void f(String string) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        this.b(3, parcel);
    }

    public final void k(String string) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        this.b(10, parcel);
    }

    public final void p0() {
        this.b(15, this.Z0());
    }

    public final boolean q0() {
        Parcel parcel = this.a(8, this.Z0());
        boolean bl = fc.a((Parcel)parcel);
        parcel.recycle();
        return bl;
    }
}

