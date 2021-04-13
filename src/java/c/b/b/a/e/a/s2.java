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
 *  c.b.b.a.e.a.q2
 *  java.lang.String
 */
package c.b.b.a.e.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.a.e.a.ec;
import c.b.b.a.e.a.f2;
import c.b.b.a.e.a.fc;
import c.b.b.a.e.a.q2;

public final class s2
extends ec
implements q2 {
    public s2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public final void a(f2 f22) {
        Parcel parcel = this.Z0();
        fc.a((Parcel)parcel, (IInterface)f22);
        this.b(1, parcel);
    }
}

