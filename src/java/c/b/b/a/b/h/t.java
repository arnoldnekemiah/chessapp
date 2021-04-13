/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  c.b.b.a.c.a
 *  c.b.b.a.e.c.b
 *  java.lang.String
 */
package c.b.b.a.b.h;

import android.os.IBinder;
import android.os.Parcel;
import c.a.b.a.a;
import c.b.b.a.b.h.s;
import c.b.b.a.e.c.b;

public final class t
extends b
implements s {
    public t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override
    public final c.b.b.a.c.a b() {
        return a.a(this.a(1, this.Z0()));
    }

    @Override
    public final int c() {
        Parcel parcel = this.a(2, this.Z0());
        int n10 = parcel.readInt();
        parcel.recycle();
        return n10;
    }
}

