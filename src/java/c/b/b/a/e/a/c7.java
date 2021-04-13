/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  c.b.b.a.e.a.a7
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.a.a7;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import com.google.android.gms.internal.ads.zzvg;

public final class c7
extends ec
implements a7 {
    public c7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    public final void g(zzvg zzvg2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzvg2);
        this.b(3, parcel);
    }

    public final void j(String string) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        this.b(1, parcel);
    }

    public final void onFailure(String string) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        this.b(2, parcel);
    }
}

