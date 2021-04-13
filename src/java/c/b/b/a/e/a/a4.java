/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.y3
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.Parcel;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.y3;

public final class a4
extends ec
implements y3 {
    public a4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public final void onInitializationFailed(String string) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        this.b(3, parcel);
    }

    public final void onInitializationSucceeded() {
        this.b(2, this.Z0());
    }
}

