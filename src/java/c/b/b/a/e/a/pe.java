/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.ne
 *  com.google.android.gms.internal.ads.zzvl
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.ne;
import com.google.android.gms.internal.ads.zzvl;

public final class pe
extends ec
implements ne {
    public pe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public final String A() {
        Parcel parcel = this.a(4, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final void a(zzvl zzvl2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzvl2);
        this.b(1, parcel);
    }

    public final void a(zzvl zzvl2, int n10) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzvl2);
        parcel.writeInt(n10);
        this.b(5, parcel);
    }

    public final String getMediationAdapterClassName() {
        Parcel parcel = this.a(2, this.Z0());
        String string = parcel.readString();
        parcel.recycle();
        return string;
    }

    public final boolean w() {
        Parcel parcel = this.a(3, this.Z0());
        boolean bl = fc.a((Parcel)parcel);
        parcel.recycle();
        return bl;
    }
}

