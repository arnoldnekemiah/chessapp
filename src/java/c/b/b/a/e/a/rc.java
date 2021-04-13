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
 *  c.b.b.a.e.a.lc
 *  c.b.b.a.e.a.pc
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
import c.b.b.a.e.a.lc;
import c.b.b.a.e.a.pc;
import com.google.android.gms.internal.ads.zzvg;

public final class rc
extends ec
implements pc {
    public rc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public final void a(int n10) {
        Parcel parcel = this.Z0();
        parcel.writeInt(n10);
        this.b(2, parcel);
    }

    public final void a(lc lc2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)lc2);
        this.b(1, parcel);
    }

    public final void c(zzvg zzvg2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzvg2);
        this.b(3, parcel);
    }
}

