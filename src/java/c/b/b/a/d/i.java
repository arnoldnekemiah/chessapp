/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.c.a
 *  c.b.b.a.d.j
 *  c.b.b.a.e.c.b
 *  c.b.b.a.e.c.c
 *  java.lang.String
 */
package c.b.b.a.d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.a.b.a.a;
import c.b.b.a.d.j;
import c.b.b.a.e.c.b;
import c.b.b.a.e.c.c;

public final class i
extends b
implements j {
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final c.b.b.a.c.a a(c.b.b.a.c.a a5, String string, int n10, c.b.b.a.c.a a6) {
        Parcel parcel = this.Z0();
        c.a((Parcel)parcel, (IInterface)a5);
        parcel.writeString(string);
        parcel.writeInt(n10);
        c.a((Parcel)parcel, (IInterface)a6);
        return a.a(this.a(2, parcel));
    }

    public final c.b.b.a.c.a b(c.b.b.a.c.a a5, String string, int n10, c.b.b.a.c.a a6) {
        Parcel parcel = this.Z0();
        c.a((Parcel)parcel, (IInterface)a5);
        parcel.writeString(string);
        parcel.writeInt(n10);
        c.a((Parcel)parcel, (IInterface)a6);
        return a.a(this.a(3, parcel));
    }
}

