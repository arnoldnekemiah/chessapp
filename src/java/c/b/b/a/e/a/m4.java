/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.h4
 *  c.b.b.a.e.a.k4
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.h4;
import c.b.b.a.e.a.k4;
import com.google.android.gms.internal.ads.zzvg;

public final class m4
extends ec
implements k4 {
    public m4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    public final void a(h4 h42) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)h42);
        this.b(1, parcel);
    }

    public final void b(int n10) {
        Parcel parcel = this.Z0();
        parcel.writeInt(n10);
        this.b(2, parcel);
    }

    public final void e(zzvg zzvg2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzvg2);
        this.b(3, parcel);
    }
}

