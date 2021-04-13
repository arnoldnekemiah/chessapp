/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  com.google.android.gms.common.Feature
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.b;

import a.c.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;

public final class m
implements Parcelable.Creator<Feature> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int n2 = a.b(parcel);
        String string = null;
        int n3 = 0;
        long l2 = -1L;
        while (parcel.dataPosition() < n2) {
            int n5 = parcel.readInt();
            int n7 = 65535 & n5;
            if (n7 != 1) {
                if (n7 != 2) {
                    if (n7 != 3) {
                        a.j(parcel, n5);
                        continue;
                    }
                    l2 = a.h(parcel, n5);
                    continue;
                }
                n3 = a.g(parcel, n5);
                continue;
            }
            string = a.b(parcel, n5);
        }
        a.d(parcel, n2);
        return new Feature(string, n3, l2);
    }

    public final /* synthetic */ Object[] newArray(int n2) {
        return new Feature[n2];
    }
}

