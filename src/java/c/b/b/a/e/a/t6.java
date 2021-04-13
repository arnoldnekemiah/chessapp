/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.r6
 *  com.google.android.gms.internal.ads.zzvg
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.r6;
import com.google.android.gms.internal.ads.zzvg;

public final class t6
extends ec
implements r6 {
    public t6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    public final void a(zzvg zzvg2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzvg2);
        this.b(4, parcel);
    }

    public final void a(String string) {
        Parcel parcel = this.Z0();
        parcel.writeString(string);
        this.b(3, parcel);
    }

    public final void y() {
        this.b(2, this.Z0());
    }
}

