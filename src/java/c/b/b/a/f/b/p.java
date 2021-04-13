/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  com.google.android.gms.measurement.internal.zzaq
 *  java.lang.Object
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzaq;

public final class p
implements Parcelable.Creator<zzaq> {
    public final Object createFromParcel(Parcel parcel) {
        int n2 = a.b(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < n2) {
            int n10 = parcel.readInt();
            if ((65535 & n10) != 2) {
                a.j(parcel, n10);
                continue;
            }
            bundle = a.a(parcel, n10);
        }
        a.d(parcel, n2);
        return new zzaq(bundle);
    }
}

