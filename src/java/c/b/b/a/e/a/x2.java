/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.c.a
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.v2
 *  c.b.b.a.e.a.ve
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.c.a;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.v2;
import c.b.b.a.e.a.ve;

public final class x2
extends ec
implements v2 {
    public x2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public final void a(ve ve2, a a6) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)ve2);
        fc.a((Parcel)parcel, (IInterface)a6);
        this.b(1, parcel);
    }
}

