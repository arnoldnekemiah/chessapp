/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  com.google.android.gms.common.Feature
 *  com.google.android.gms.common.internal.zzc
 *  java.lang.Object
 */
package c.b.b.a.b.h;

import a.c.a.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.zzc;

public final class k
implements Parcelable.Creator<zzc> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int n2 = a.b(parcel);
        Bundle bundle = null;
        Feature[] arrfeature = null;
        int n3 = 0;
        while (parcel.dataPosition() < n2) {
            int n5 = parcel.readInt();
            int n7 = 65535 & n5;
            if (n7 != 1) {
                if (n7 != 2) {
                    if (n7 != 3) {
                        a.j(parcel, n5);
                        continue;
                    }
                    n3 = a.g(parcel, n5);
                    continue;
                }
                arrfeature = (Feature[])a.b(parcel, n5, Feature.CREATOR);
                continue;
            }
            bundle = a.a(parcel, n5);
        }
        a.d(parcel, n2);
        return new zzc(bundle, arrfeature, n3);
    }

    public final /* synthetic */ Object[] newArray(int n2) {
        return new zzc[n2];
    }
}

