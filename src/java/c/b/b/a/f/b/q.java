/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  com.google.android.gms.measurement.internal.zzaq
 *  com.google.android.gms.measurement.internal.zzas
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzaq;
import com.google.android.gms.measurement.internal.zzas;

public final class q
implements Parcelable.Creator<zzas> {
    public static void a(zzas zzas2, Parcel parcel, int n2) {
        int n10 = a.a(parcel);
        a.a(parcel, 2, zzas2.a, false);
        a.a(parcel, 3, (Parcelable)zzas2.b, n2, false);
        a.a(parcel, 4, zzas2.c, false);
        a.a(parcel, 5, zzas2.d);
        a.l(parcel, n10);
    }

    public final Object createFromParcel(Parcel parcel) {
        int n2 = a.b(parcel);
        String string = null;
        zzaq zzaq2 = null;
        String string2 = null;
        long l2 = 0L;
        while (parcel.dataPosition() < n2) {
            int n10 = parcel.readInt();
            int n11 = 65535 & n10;
            if (n11 != 2) {
                if (n11 != 3) {
                    if (n11 != 4) {
                        if (n11 != 5) {
                            a.j(parcel, n10);
                            continue;
                        }
                        l2 = a.h(parcel, n10);
                        continue;
                    }
                    string2 = a.b(parcel, n10);
                    continue;
                }
                zzaq2 = (zzaq)a.a(parcel, n10, zzaq.CREATOR);
                continue;
            }
            string = a.b(parcel, n10);
        }
        a.d(parcel, n2);
        zzas zzas2 = new zzas(string, zzaq2, string2, l2);
        return zzas2;
    }
}

