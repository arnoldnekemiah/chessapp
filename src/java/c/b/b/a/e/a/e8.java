/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.c8
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.c.a;
import c.b.b.a.e.a.c8;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;

public final class e8
extends ec
implements c8 {
    public e8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public final void J(a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(13, parcel);
    }

    public final void K0() {
        this.b(3, this.Z0());
    }

    public final void N0() {
        this.b(14, this.Z0());
    }

    public final void Q0() {
        this.b(2, this.Z0());
    }

    public final void a(int n10, int n11, Intent intent) {
        Parcel parcel = this.Z0();
        parcel.writeInt(n10);
        parcel.writeInt(n11);
        fc.a((Parcel)parcel, (Parcelable)intent);
        this.b(12, parcel);
    }

    public final void c0() {
        this.b(10, this.Z0());
    }

    public final void e(Bundle bundle) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)bundle);
        Parcel parcel2 = this.a(6, parcel);
        if (parcel2.readInt() != 0) {
            bundle.readFromParcel(parcel2);
        }
        parcel2.recycle();
    }

    public final void f(Bundle bundle) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)bundle);
        this.b(1, parcel);
    }

    public final void onDestroy() {
        this.b(8, this.Z0());
    }

    public final void onPause() {
        this.b(5, this.Z0());
    }

    public final void onResume() {
        this.b(4, this.Z0());
    }

    public final void t0() {
        this.b(7, this.Z0());
    }

    public final boolean w0() {
        Parcel parcel = this.a(11, this.Z0());
        boolean bl = fc.a((Parcel)parcel);
        parcel.recycle();
        return bl;
    }

    public final void y0() {
        this.b(9, this.Z0());
    }
}

