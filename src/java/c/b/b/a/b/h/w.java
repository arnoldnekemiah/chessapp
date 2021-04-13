/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  c.b.b.a.c.a
 *  c.b.b.a.e.c.b
 *  c.b.b.a.e.c.c
 *  com.google.android.gms.common.zzj
 *  java.lang.String
 */
package c.b.b.a.b.h;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.b.h.v;
import c.b.b.a.c.a;
import c.b.b.a.e.c.b;
import c.b.b.a.e.c.c;
import com.google.android.gms.common.zzj;

public final class w
extends b
implements v {
    public w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override
    public final boolean a(zzj zzj2, a a5) {
        Parcel parcel = this.Z0();
        c.a((Parcel)parcel, (Parcelable)zzj2);
        c.a((Parcel)parcel, (IInterface)a5);
        Parcel parcel2 = this.a(5, parcel);
        boolean bl = parcel2.readInt() != 0;
        parcel2.recycle();
        return bl;
    }
}

