/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.j2
 *  c.b.b.a.e.a.y1
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.j2;
import c.b.b.a.e.a.y1;

public final class l2
extends ec
implements j2 {
    public l2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    public final void a(y1 y12) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)y12);
        this.b(1, parcel);
    }
}

