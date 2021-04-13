/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  c.b.b.a.e.a.cf
 *  c.b.b.a.e.a.ec
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.Parcel;
import c.b.b.a.e.a.cf;
import c.b.b.a.e.a.ec;

public final class ef
extends ec
implements cf {
    public ef(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public final void onAppEvent(String string, String string2) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        parcel.writeString(string2);
        this.b(1, parcel);
    }
}

