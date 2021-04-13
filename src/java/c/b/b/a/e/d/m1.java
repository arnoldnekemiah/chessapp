/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  c.b.b.a.e.d.a
 *  java.lang.String
 */
package c.b.b.a.e.d;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.a.e.d.a;
import c.b.b.a.e.d.j3;
import c.b.b.a.e.d.o0;

public final class m1
extends a
implements j3 {
    public m1(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override
    public final Bundle d(Bundle bundle) {
        Parcel parcel = this.a();
        o0.a(parcel, (Parcelable)bundle);
        Parcel parcel2 = this.b(1, parcel);
        Bundle bundle2 = (Bundle)o0.a(parcel2, Bundle.CREATOR);
        parcel2.recycle();
        return bundle2;
    }
}

