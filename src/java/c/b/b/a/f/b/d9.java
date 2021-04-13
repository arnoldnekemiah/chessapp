/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  com.google.android.gms.measurement.internal.zzkg
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package c.b.b.a.f.b;

import a.c.a.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzkg;

public final class d9
implements Parcelable.Creator<zzkg> {
    public static void a(zzkg zzkg2, Parcel parcel, int n2) {
        int n10 = a.a(parcel);
        a.a(parcel, 1, zzkg2.a);
        a.a(parcel, 2, zzkg2.b, false);
        a.a(parcel, 3, zzkg2.c);
        Long l2 = zzkg2.d;
        if (l2 != null) {
            a.c(parcel, 4, 8);
            parcel.writeLong(l2.longValue());
        }
        a.a(parcel, 6, zzkg2.e, false);
        a.a(parcel, 7, zzkg2.f, false);
        Double d2 = zzkg2.g;
        if (d2 != null) {
            a.c(parcel, 8, 8);
            parcel.writeDouble(d2.doubleValue());
        }
        a.l(parcel, n10);
    }

    public final Object createFromParcel(Parcel parcel) {
        int n2 = a.b(parcel);
        String string = null;
        Long l2 = null;
        Float f2 = null;
        String string2 = null;
        String string3 = null;
        Double d2 = null;
        long l10 = 0L;
        int n10 = 0;
        block10 : while (parcel.dataPosition() < n2) {
            int n11 = parcel.readInt();
            switch (65535 & n11) {
                default: {
                    a.j(parcel, n11);
                    continue block10;
                }
                case 8: {
                    int n12 = a.i(parcel, n11);
                    if (n12 == 0) {
                        d2 = null;
                        continue block10;
                    }
                    a.d(parcel, n12, 8);
                    d2 = parcel.readDouble();
                    continue block10;
                }
                case 7: {
                    string3 = a.b(parcel, n11);
                    continue block10;
                }
                case 6: {
                    string2 = a.b(parcel, n11);
                    continue block10;
                }
                case 5: {
                    int n13 = a.i(parcel, n11);
                    if (n13 == 0) {
                        f2 = null;
                        continue block10;
                    }
                    a.d(parcel, n13, 4);
                    f2 = Float.valueOf((float)parcel.readFloat());
                    continue block10;
                }
                case 4: {
                    int n14 = a.i(parcel, n11);
                    if (n14 == 0) {
                        l2 = null;
                        continue block10;
                    }
                    a.d(parcel, n14, 8);
                    l2 = parcel.readLong();
                    continue block10;
                }
                case 3: {
                    l10 = a.h(parcel, n11);
                    continue block10;
                }
                case 2: {
                    string = a.b(parcel, n11);
                    continue block10;
                }
                case 1: 
            }
            n10 = a.g(parcel, n11);
        }
        a.d(parcel, n2);
        zzkg zzkg2 = new zzkg(n10, string, l10, l2, f2, string2, string3, d2);
        return zzkg2;
    }
}

