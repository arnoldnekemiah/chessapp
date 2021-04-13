/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.f2
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.gg
 *  c.b.b.a.e.a.l1
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.a.b.a.a;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.f2;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.gg;
import c.b.b.a.e.a.l1;
import c.b.b.a.e.a.n1;
import c.b.b.a.e.a.p5;
import java.util.ArrayList;
import java.util.List;

public final class h2
extends ec
implements f2 {
    public h2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public final boolean A0() {
        Parcel parcel = this.a(12, this.Z0());
        boolean bl = fc.a((Parcel)parcel);
        parcel.recycle();
        return bl;
    }

    public final boolean H(c.b.b.a.c.a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        Parcel parcel2 = this.a(10, parcel);
        boolean bl = fc.a((Parcel)parcel2);
        parcel2.recycle();
        return bl;
    }

    public final boolean J() {
        Parcel parcel = this.a(13, this.Z0());
        boolean bl = fc.a((Parcel)parcel);
        parcel.recycle();
        return bl;
    }

    public final c.b.b.a.c.a Q() {
        return a.a(this.a(9, this.Z0()));
    }

    public final void destroy() {
        this.b(8, this.Z0());
    }

    public final l1 e(String string) {
        IInterface iInterface;
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        Parcel parcel2 = this.a(2, parcel);
        IBinder iBinder = parcel2.readStrongBinder();
        Object object = iBinder == null ? null : ((iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage")) instanceof l1 ? (l1)iInterface : new n1(iBinder));
        parcel2.recycle();
        return object;
    }

    public final List<String> getAvailableAssetNames() {
        Parcel parcel = this.a(3, this.Z0());
        ArrayList arrayList = parcel.createStringArrayList();
        parcel.recycle();
        return arrayList;
    }

    public final String getCustomTemplateId() {
        Parcel parcel = this.a(4, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final gg getVideoController() {
        Parcel parcel = this.a(7, this.Z0());
        gg gg2 = p5.a(parcel.readStrongBinder());
        parcel.recycle();
        return gg2;
    }

    public final String o(String string) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        Parcel parcel2 = this.a(1, parcel);
        String string2 = parcel2.readString();
        parcel2.recycle();
        return string2;
    }

    public final void performClick(String string) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        this.b(5, parcel);
    }

    public final void r(c.b.b.a.c.a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(14, parcel);
    }

    public final void r0() {
        this.b(15, this.Z0());
    }

    public final void recordImpression() {
        this.b(6, this.Z0());
    }
}

