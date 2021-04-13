/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  c.b.b.a.e.a.bg
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.fc
 *  com.google.android.gms.internal.ads.zzvu
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.a.bg;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.fc;
import com.google.android.gms.internal.ads.zzvu;

public final class dg
extends ec
implements bg {
    public dg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public final void a(zzvu zzvu2) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (Parcelable)zzvu2);
        this.b(1, parcel);
    }
}

