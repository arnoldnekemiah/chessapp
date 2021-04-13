/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  c.b.b.a.e.d.a
 *  c.b.b.a.e.d.bc
 *  java.lang.String
 */
package c.b.b.a.e.d;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.d.a;
import c.b.b.a.e.d.bc;
import c.b.b.a.e.d.o0;

public final class ac
extends a
implements bc {
    public ac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final void a(String string, String string2, Bundle bundle, long l10) {
        Parcel parcel = this.a();
        parcel.writeString(string);
        parcel.writeString(string2);
        o0.a(parcel, (Parcelable)bundle);
        parcel.writeLong(l10);
        this.a(1, parcel);
    }

    public final int p() {
        Parcel parcel = this.b(2, this.a());
        int n10 = parcel.readInt();
        parcel.recycle();
        return n10;
    }
}

