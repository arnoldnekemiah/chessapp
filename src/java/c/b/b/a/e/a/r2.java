/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.f2
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.p2
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.f2;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.p2;

public final class r2
extends ec
implements p2 {
    public r2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public final void a(f2 f22, String string) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)f22);
        parcel.writeString(string);
        this.b(1, parcel);
    }
}

