/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  c.b.b.a.e.d.a
 *  c.b.b.a.e.d.o0
 *  c.b.b.a.f.b.x2
 *  com.google.android.gms.measurement.internal.zzaa
 *  com.google.android.gms.measurement.internal.zzas
 *  com.google.android.gms.measurement.internal.zzkg
 *  com.google.android.gms.measurement.internal.zzp
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package c.b.b.a.f.b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.d.a;
import c.b.b.a.e.d.o0;
import c.b.b.a.f.b.x2;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzkg;
import com.google.android.gms.measurement.internal.zzp;
import java.util.ArrayList;
import java.util.List;

public final class v2
extends a
implements x2 {
    public v2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final List<zzkg> a(zzp zzp2, boolean bl) {
        Parcel parcel = this.a();
        o0.a((Parcel)parcel, (Parcelable)zzp2);
        parcel.writeInt((int)bl);
        Parcel parcel2 = this.b(7, parcel);
        ArrayList arrayList = parcel2.createTypedArrayList(zzkg.CREATOR);
        parcel2.recycle();
        return arrayList;
    }

    public final List<zzaa> a(String string, String string2, zzp zzp2) {
        Parcel parcel = this.a();
        parcel.writeString(string);
        parcel.writeString(string2);
        o0.a((Parcel)parcel, (Parcelable)zzp2);
        Parcel parcel2 = this.b(16, parcel);
        ArrayList arrayList = parcel2.createTypedArrayList(zzaa.CREATOR);
        parcel2.recycle();
        return arrayList;
    }

    public final List<zzaa> a(String string, String string2, String string3) {
        Parcel parcel = this.a();
        parcel.writeString(null);
        parcel.writeString(string2);
        parcel.writeString(string3);
        Parcel parcel2 = this.b(17, parcel);
        ArrayList arrayList = parcel2.createTypedArrayList(zzaa.CREATOR);
        parcel2.recycle();
        return arrayList;
    }

    public final List<zzkg> a(String string, String string2, String string3, boolean bl) {
        Parcel parcel = this.a();
        parcel.writeString(null);
        parcel.writeString(string2);
        parcel.writeString(string3);
        o0.a((Parcel)parcel, (boolean)bl);
        Parcel parcel2 = this.b(15, parcel);
        ArrayList arrayList = parcel2.createTypedArrayList(zzkg.CREATOR);
        parcel2.recycle();
        return arrayList;
    }

    public final List<zzkg> a(String string, String string2, boolean bl, zzp zzp2) {
        Parcel parcel = this.a();
        parcel.writeString(string);
        parcel.writeString(string2);
        o0.a((Parcel)parcel, (boolean)bl);
        o0.a((Parcel)parcel, (Parcelable)zzp2);
        Parcel parcel2 = this.b(14, parcel);
        ArrayList arrayList = parcel2.createTypedArrayList(zzkg.CREATOR);
        parcel2.recycle();
        return arrayList;
    }

    public final void a(long l6, String string, String string2, String string3) {
        Parcel parcel = this.a();
        parcel.writeLong(l6);
        parcel.writeString(string);
        parcel.writeString(string2);
        parcel.writeString(string3);
        this.a(10, parcel);
    }

    public final void a(Bundle bundle, zzp zzp2) {
        Parcel parcel = this.a();
        o0.a((Parcel)parcel, (Parcelable)bundle);
        o0.a((Parcel)parcel, (Parcelable)zzp2);
        this.a(19, parcel);
    }

    public final void a(zzaa zzaa2) {
        throw null;
    }

    public final void a(zzaa zzaa2, zzp zzp2) {
        Parcel parcel = this.a();
        o0.a((Parcel)parcel, (Parcelable)zzaa2);
        o0.a((Parcel)parcel, (Parcelable)zzp2);
        this.a(12, parcel);
    }

    public final void a(zzas zzas2, zzp zzp2) {
        Parcel parcel = this.a();
        o0.a((Parcel)parcel, (Parcelable)zzas2);
        o0.a((Parcel)parcel, (Parcelable)zzp2);
        this.a(1, parcel);
    }

    public final void a(zzas zzas2, String string, String string2) {
        throw null;
    }

    public final void a(zzkg zzkg2, zzp zzp2) {
        Parcel parcel = this.a();
        o0.a((Parcel)parcel, (Parcelable)zzkg2);
        o0.a((Parcel)parcel, (Parcelable)zzp2);
        this.a(2, parcel);
    }

    public final void a(zzp zzp2) {
        Parcel parcel = this.a();
        o0.a((Parcel)parcel, (Parcelable)zzp2);
        this.a(20, parcel);
    }

    public final byte[] a(zzas zzas2, String string) {
        Parcel parcel = this.a();
        o0.a((Parcel)parcel, (Parcelable)zzas2);
        parcel.writeString(string);
        Parcel parcel2 = this.b(9, parcel);
        byte[] arrby = parcel2.createByteArray();
        parcel2.recycle();
        return arrby;
    }

    public final void b(zzp zzp2) {
        Parcel parcel = this.a();
        o0.a((Parcel)parcel, (Parcelable)zzp2);
        this.a(4, parcel);
    }

    public final void c(zzp zzp2) {
        Parcel parcel = this.a();
        o0.a((Parcel)parcel, (Parcelable)zzp2);
        this.a(6, parcel);
    }

    public final String d(zzp zzp2) {
        Parcel parcel = this.a();
        o0.a((Parcel)parcel, (Parcelable)zzp2);
        Parcel parcel2 = this.b(11, parcel);
        String string = parcel2.readString();
        parcel2.recycle();
        return string;
    }

    public final void e(zzp zzp2) {
        Parcel parcel = this.a();
        o0.a((Parcel)parcel, (Parcelable)zzp2);
        this.a(18, parcel);
    }
}

