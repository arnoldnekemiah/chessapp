/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.cg
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.lc
 *  c.b.b.a.e.a.qc
 *  c.b.b.a.e.a.tc
 *  c.b.b.a.e.a.ve
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.c.a;
import c.b.b.a.e.a.cg;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.fg;
import c.b.b.a.e.a.lc;
import c.b.b.a.e.a.qc;
import c.b.b.a.e.a.tc;
import c.b.b.a.e.a.ve;
import c.b.b.a.e.a.ye;

public final class nc
extends ec
implements lc {
    public nc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public final ve I0() {
        Parcel parcel = this.a(2, this.Z0());
        ve ve2 = ye.a(parcel.readStrongBinder());
        parcel.recycle();
        return ve2;
    }

    public final void a(a a6, tc tc2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        fc.a((Parcel)parcel, (IInterface)tc2);
        this.b(4, parcel);
    }

    public final void a(qc qc2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)qc2);
        this.b(3, parcel);
    }

    public final cg j() {
        Parcel parcel = this.a(5, this.Z0());
        cg cg2 = fg.a(parcel.readStrongBinder());
        parcel.recycle();
        return cg2;
    }

    public final void setImmersiveMode(boolean bl) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (boolean)bl);
        this.b(6, parcel);
    }
}

