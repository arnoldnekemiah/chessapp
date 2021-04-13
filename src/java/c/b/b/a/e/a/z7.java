/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.x7
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.c.a;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.x7;

public final class z7
extends ec
implements x7 {
    public z7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public final void S() {
        this.b(3, this.Z0());
    }

    public final void a(Intent intent) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)intent);
        this.b(1, parcel);
    }

    public final void a(a a6, String string, String string2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)a6);
        parcel.writeString(string);
        parcel.writeString(string2);
        this.b(2, parcel);
    }
}

