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
 *  c.b.b.a.e.a.a7
 *  c.b.b.a.e.a.b5
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gg
 *  c.b.b.a.e.a.o6
 *  c.b.b.a.e.a.r6
 *  c.b.b.a.e.a.s6
 *  c.b.b.a.e.a.v6
 *  c.b.b.a.e.a.w6
 *  com.google.android.gms.internal.ads.zzapy
 *  com.google.android.gms.internal.ads.zzvl
 *  com.google.android.gms.internal.ads.zzvs
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.c.a;
import c.b.b.a.e.a.a7;
import c.b.b.a.e.a.b5;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gg;
import c.b.b.a.e.a.o6;
import c.b.b.a.e.a.p5;
import c.b.b.a.e.a.r6;
import c.b.b.a.e.a.s6;
import c.b.b.a.e.a.v6;
import c.b.b.a.e.a.w6;
import com.google.android.gms.internal.ads.zzapy;
import com.google.android.gms.internal.ads.zzvl;
import com.google.android.gms.internal.ads.zzvs;

public final class y6
extends ec
implements w6 {
    public y6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public final zzapy B() {
        Parcel parcel = this.a(3, this.Z0());
        zzapy zzapy2 = (zzapy)fc.a((Parcel)parcel, (Parcelable.Creator)zzapy.CREATOR);
        parcel.recycle();
        return zzapy2;
    }

    public final void a(a a6, String string, Bundle bundle, Bundle bundle2, zzvs zzvs2, a7 a72) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        parcel.writeString(string);
        fc.a((Parcel)parcel, (Parcelable)bundle);
        fc.a((Parcel)parcel, (Parcelable)bundle2);
        fc.a((Parcel)parcel, (Parcelable)zzvs2);
        fc.a((Parcel)parcel, (IInterface)a72);
        this.b(1, parcel);
    }

    public final void a(String string, String string2, zzvl zzvl2, a a6, o6 o62, b5 b52, zzvs zzvs2) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        parcel.writeString(string2);
        fc.a((Parcel)parcel, (Parcelable)zzvl2);
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (IInterface)o62);
        fc.a((Parcel)parcel, (IInterface)b52);
        fc.a((Parcel)parcel, (Parcelable)zzvs2);
        this.b(13, parcel);
    }

    public final void a(String string, String string2, zzvl zzvl2, a a6, r6 r62, b5 b52) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        parcel.writeString(string2);
        fc.a((Parcel)parcel, (Parcelable)zzvl2);
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (IInterface)r62);
        fc.a((Parcel)parcel, (IInterface)b52);
        this.b(14, parcel);
    }

    public final void a(String string, String string2, zzvl zzvl2, a a6, s6 s62, b5 b52) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        parcel.writeString(string2);
        fc.a((Parcel)parcel, (Parcelable)zzvl2);
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (IInterface)s62);
        fc.a((Parcel)parcel, (IInterface)b52);
        this.b(18, parcel);
    }

    public final void a(String string, String string2, zzvl zzvl2, a a6, v6 v62, b5 b52) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        parcel.writeString(string2);
        fc.a((Parcel)parcel, (Parcelable)zzvl2);
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (IInterface)v62);
        fc.a((Parcel)parcel, (IInterface)b52);
        this.b(20, parcel);
    }

    public final void a(String[] arrstring, Bundle[] arrbundle) {
        Parcel parcel = this.Z0();
        parcel.writeStringArray(arrstring);
        parcel.writeTypedArray((Parcelable[])arrbundle, 0);
        this.b(11, parcel);
    }

    public final void b(String string) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        this.b(19, parcel);
    }

    public final void b(String string, String string2, zzvl zzvl2, a a6, v6 v62, b5 b52) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        parcel.writeString(string2);
        fc.a((Parcel)parcel, (Parcelable)zzvl2);
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (IInterface)v62);
        fc.a((Parcel)parcel, (IInterface)b52);
        this.b(16, parcel);
    }

    public final gg getVideoController() {
        Parcel parcel = this.a(5, this.Z0());
        gg gg2 = p5.a(parcel.readStrongBinder());
        parcel.recycle();
        return gg2;
    }

    public final void k(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(10, parcel);
    }

    public final boolean o(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        Parcel parcel2 = this.a(15, parcel);
        boolean bl = fc.a((Parcel)parcel2);
        parcel2.recycle();
        return bl;
    }

    public final boolean w(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        Parcel parcel2 = this.a(17, parcel);
        boolean bl = fc.a((Parcel)parcel2);
        parcel2.recycle();
        return bl;
    }

    public final zzapy x() {
        Parcel parcel = this.a(2, this.Z0());
        zzapy zzapy2 = (zzapy)fc.a((Parcel)parcel, (Parcelable.Creator)zzapy.CREATOR);
        parcel.recycle();
        return zzapy2;
    }
}

