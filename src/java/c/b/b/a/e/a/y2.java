/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  c.b.b.a.e.a.ec
 *  c.b.b.a.e.a.f3
 *  c.b.b.a.e.a.fc
 *  c.b.b.a.e.a.w2
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.f3;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.w2;

public final class y2
extends ec
implements w2 {
    public y2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public final void a(f3 f32) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)f32);
        this.b(1, parcel);
    }
}

