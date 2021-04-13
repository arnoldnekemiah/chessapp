/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.c.a
 *  c.b.b.a.d.h
 *  c.b.b.a.e.c.b
 *  c.b.b.a.e.c.c
 *  java.lang.String
 */
package c.b.b.a.d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.a.b.a.a;
import c.b.b.a.d.h;
import c.b.b.a.e.c.b;
import c.b.b.a.e.c.c;

public final class g
extends b
implements h {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int a(c.b.b.a.c.a a5, String string, boolean bl) {
        Parcel parcel = this.Z0();
        c.a((Parcel)parcel, (IInterface)a5);
        parcel.writeString(string);
        parcel.writeInt((int)bl);
        Parcel parcel2 = this.a(5, parcel);
        int n10 = parcel2.readInt();
        parcel2.recycle();
        return n10;
    }

    public final c.b.b.a.c.a a(c.b.b.a.c.a a5, String string, int n10) {
        Parcel parcel = this.Z0();
        c.a((Parcel)parcel, (IInterface)a5);
        parcel.writeString(string);
        parcel.writeInt(n10);
        return a.a(this.a(2, parcel));
    }

    public final int b() {
        Parcel parcel = this.a(6, this.Z0());
        int n10 = parcel.readInt();
        parcel.recycle();
        return n10;
    }

    public final int b(c.b.b.a.c.a a5, String string, boolean bl) {
        Parcel parcel = this.Z0();
        c.a((Parcel)parcel, (IInterface)a5);
        parcel.writeString(string);
        parcel.writeInt((int)bl);
        Parcel parcel2 = this.a(3, parcel);
        int n10 = parcel2.readInt();
        parcel2.recycle();
        return n10;
    }

    public final c.b.b.a.c.a b(c.b.b.a.c.a a5, String string, int n10) {
        Parcel parcel = this.Z0();
        c.a((Parcel)parcel, (IInterface)a5);
        parcel.writeString(string);
        parcel.writeInt(n10);
        return a.a(this.a(4, parcel));
    }
}

